package tn.esprit.rh.achat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.SecteurActivite;
import tn.esprit.rh.achat.repositories.SecteurActiviteRepository;
import tn.esprit.rh.achat.services.SecteurActiviteServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class SecteuractiviteTest {

    @Autowired
    private SecteurActiviteRepository secteurActiviteRepository;

    @Autowired
    private SecteurActiviteServiceImpl secteurActiviteService;




    @Test
    public void testAddSecteurActivite() {
        SecteurActivite secteurActivite = new SecteurActivite();
        secteurActivite.setCodeSecteurActivite("S001");
        secteurActivite.setLibelleSecteurActivite("Sec001");

        SecteurActivite addedSecteurActivite = secteurActiviteService.addSecteurActivite(secteurActivite);

        assertNotNull(addedSecteurActivite.getIdSecteurActivite());
        assertEquals("S001", addedSecteurActivite.getCodeSecteurActivite());
        assertEquals("Sec001", addedSecteurActivite.getLibelleSecteurActivite());
    }
    @Test
    public void testUpdateSecteurActivite() {
        SecteurActivite secteurActivite = new SecteurActivite();
        secteurActivite.setIdSecteurActivite(1L); // Assuming an SecteurActivite with ID 1 exists in the database
        secteurActivite.setLibelleSecteurActivite("updated");

        SecteurActivite updatedSecteurActivite = secteurActiviteService.updateSecteurActivite(secteurActivite);

        assertEquals("updated", updatedSecteurActivite.getLibelleSecteurActivite());
    }
    @Test
    public void testRetrieveSecteurActivite() {
        // Assuming an SecteurActivite with ID 1 exists in the database
        Long id = 1L;

        SecteurActivite secteurActivite = secteurActiviteService.retrieveSecteurActivite(id);
    }
  /*  @Test
    public void testDeleteSecteurActivite() {
        // Assuming an SecteurActivite with ID 1 exists in the database
        Long id = 5L;

        secteurActiviteService.deleteSecteurActivite(id);

        // Verify that the SecteurActivite is deleted (you can use Mockito to verify the delete method was called)
    }*/
}

// Write similar test methods for other service operations

