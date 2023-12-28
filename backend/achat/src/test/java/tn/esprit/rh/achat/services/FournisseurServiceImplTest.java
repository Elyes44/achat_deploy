package tn.esprit.rh.achat.services;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import tn.esprit.rh.achat.entities.DetailFournisseur;
import tn.esprit.rh.achat.entities.Fournisseur;
import tn.esprit.rh.achat.entities.SecteurActivite;
import tn.esprit.rh.achat.repositories.DetailFournisseurRepository;
import tn.esprit.rh.achat.repositories.FournisseurRepository;
import tn.esprit.rh.achat.repositories.ProduitRepository;
import tn.esprit.rh.achat.repositories.SecteurActiviteRepository;

//@SpringBootTest
public class FournisseurServiceImplTest {
/*
    @InjectMocks
    private FournisseurServiceImpl fournisseurService;

    @Mock
    private FournisseurRepository fournisseurRepository;

    @Mock
    private DetailFournisseurRepository detailFournisseurRepository;

    @Mock
    private ProduitRepository produitRepository;

    @Mock
    private SecteurActiviteRepository secteurActiviteRepository;

    @Test
    public void retrieveAllFournisseurs() {
        // Créez une liste fictive de fournisseurs
        List<Fournisseur> fournisseursFictifs = new ArrayList<>();
        // Remplacez cette liste fictive par des données réelles si nécessaire

        Mockito.when(fournisseurRepository.findAll()).thenReturn(fournisseursFictifs);

        List<Fournisseur> result = fournisseurService.retrieveAllFournisseurs();

        assertEquals(fournisseursFictifs, result);
    }


    @Test
    public void deleteFournisseur() {
        fournisseurService.deleteFournisseur(1L);

        Mockito.verify(fournisseurRepository, times(1)).deleteById(1L);
    }

    @Test
    public void retrieveFournisseur() {
        Fournisseur fournisseurFictif = new Fournisseur();
        Mockito.when(fournisseurRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(fournisseurFictif));

        Fournisseur result = fournisseurService.retrieveFournisseur(1L);

        assertEquals(fournisseurFictif, result);
    }*/
}
