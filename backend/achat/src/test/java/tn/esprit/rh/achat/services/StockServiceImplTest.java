package tn.esprit.rh.achat.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Stock;
import tn.esprit.rh.achat.repositories.StockRepository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class StockServiceImplTest {

    @Autowired
    StockRepository stockRepository;
    @Autowired
    StockServiceImpl stockService;

    @BeforeEach
    void setUp() {
        // Clear the database before each test
        stockRepository.deleteAll();
    }
    @Test
    void retrieveAllStocks() {
        Stock stock1 = new Stock("Stock1", 100, 50);
        Stock stock2 = new Stock("Stock2", 200, 75);
        stockRepository.save(stock1);
        stockRepository.save(stock2);

        // Retrieve the data
        List<Stock> result = stockRepository.findAll();

        // Log the results for debugging
        for (Stock stock : result) {
            System.out.println("Stock: " + stock.getLibelleStock() + ", Qte: " + stock.getQte() + ", Qte Min: " + stock.getQteMin());
        }

        // Assertions
        assertNotNull(result);

    }



    @Test
    void addStock() {  // Arrange: Prepare data and dependencies


        Stock stockToAdd = new Stock("NewStock", 50, 25); // Replace with your actual Stock data

        // Act: Call the addStock method
        Stock addedStock = stockService.addStock(stockToAdd);

        // Assert: Check the result and any expected behavior
        assertNotNull(addedStock); // Check that a stock was added
        assertEquals("NewStock", addedStock.getLibelleStock()); // Replace with the expected values
        assertEquals(50, addedStock.getQte());
        assertEquals(25, addedStock.getQteMin());
    }


    @Test
    void deleteStock() {
        // Add a stock item to the database for deletion
        Stock stockToDelete = new Stock("StockToDelete", 100, 50);
        // Replace with your actual Stock data
        Stock addedStock = stockRepository.save(stockToDelete);

        // Act: Call the deleteStock method
        stockService.deleteStock(addedStock.getIdStock());

        // Assert: Check the result and any expected behavior
       assertNull(stockRepository.findById(addedStock.getIdStock()).orElse(null));
    }


    @Test
    void updateStock() {
        // Arrange: Prepare data and dependencies


        // Add a stock item to the database for updating
        Stock stockToUpdate = new Stock("StockToUpdate", 100, 50); // Replace with your actual Stock data
        Stock addedStock = stockRepository.save(stockToUpdate);

        // Modify the stock item data
        addedStock.setLibelleStock("UpdatedStock"); // Replace with the updated values
        addedStock.setQte(75);
        addedStock.setQteMin(40);

        // Act: Call the updateStock method
        Stock updatedStock = stockService.updateStock(addedStock);

        // Assert: Check the result and any expected behavior
        assertNotNull(updatedStock); // Check that a stock was updated
        assertEquals("UpdatedStock", updatedStock.getLibelleStock()); // Replace with the expected values
        assertEquals(75, updatedStock.getQte());
        assertEquals(40, updatedStock.getQteMin());
    }

    @Test
    void retrieveStock() {
        // Arrange: Prepare data and dependencies
        Stock stockToAdd = new Stock("StockToRetrieve", 180, 60); // Replace with your actual Stock data
        Stock addedStock = stockService.addStock(stockToAdd);

        // Act: Call the retrieveStock method
        Stock retrievedStock = stockService.retrieveStock(addedStock.getIdStock());

        // Assert: Check the result and any expected behavior
        assertNotNull(retrievedStock); // Check that a stock was retrieved
        assertEquals("StockToRetrieve", retrievedStock.getLibelleStock()); // Replace with the expected values
        assertEquals(180, retrievedStock.getQte());
        assertEquals(60, retrievedStock.getQteMin());
    }

    @Test
    void retrieveStatusStock() {
        // Arrange: Add stocks with quantity less than minimum
        Stock stock1 = new Stock("Stock1", 30, 50);
        Stock stock2 = new Stock("Stock2", 60, 75);
        stockRepository.save(stock1);
        stockRepository.save(stock2);

        // Act: Call the retrieveStatusStock method
        String statusMessage = stockService.retrieveStatusStock();

        // Assert: Check if the status message contains expected data
        assertNotNull(statusMessage);
        assertTrue(statusMessage.contains("Stock1"));
        assertTrue(statusMessage.contains("Stock2"));

    }}
