package tn.esprit.rh.achat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Operateur;
import tn.esprit.rh.achat.repositories.OperateurRepository;
import tn.esprit.rh.achat.services.OperateurServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OperateurServiceImplTest {

    @Autowired
    private OperateurRepository operateurRepository;

    @Autowired
    private OperateurServiceImpl operateurService;

    


    @Test
    public void testAddOperateur() {
        Operateur operateur = new Operateur();
        operateur.setNom("John");
        operateur.setPrenom("Doe");
        operateur.setPassword("password");

        Operateur addedOperateur = operateurService.addOperateur(operateur);

        assertNotNull(addedOperateur.getIdOperateur());
        assertEquals("John", addedOperateur.getNom());
        assertEquals("Doe", addedOperateur.getPrenom());
        assertEquals("password", addedOperateur.getPassword());
      }

    }
