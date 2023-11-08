package tn.esprit.rh.achat;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.rh.achat.entities.SecteurActivite;
import tn.esprit.rh.achat.repositories.SecteurActiviteRepository;
import tn.esprit.rh.achat.services.SecteurActiviteServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;
public class SecteuractiviteTest {/*
    @InjectMocks
    private SecteurActiviteServiceImpl secteurActiviteService;

    @Mock
    private SecteurActiviteRepository secteurActiviteRepository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddSecteurActivite() {
        SecteurActivite secteurActivite = new SecteurActivite();
        when(secteurActiviteRepository.save(secteurActivite)).thenReturn(secteurActivite);

        SecteurActivite addedSecteurActivite = secteurActiviteService.addSecteurActivite(secteurActivite);

        verify(secteurActiviteRepository, times(1)).save(secteurActivite);
        assertNotNull(addedSecteurActivite);
    }

     @Test
    public void testDeleteSecteurActivite() {
        Long id = 1L;
        doNothing().when(secteurActiviteRepository).deleteById(id);

        secteurActiviteService.deleteSecteurActivite(id);

        verify(secteurActiviteRepository, times(1)).deleteById(id);
    }

    @Test
    public void testUpdateSecteurActivite() {
        SecteurActivite secteurActivite = new SecteurActivite();
        when(secteurActiviteRepository.save(secteurActivite)).thenReturn(secteurActivite);

        SecteurActivite updatedSecteurActivite = secteurActiviteService.updateSecteurActivite(secteurActivite);

        verify(secteurActiviteRepository, times(1)).save(secteurActivite);
        assertNotNull(updatedSecteurActivite);
    }

    @Test
    public void testRetrieveSecteurActivite() {
        Long id = 1L;
        SecteurActivite secteurActivite = new SecteurActivite();
        when(secteurActiviteRepository.findById(id)).thenReturn(Optional.of(secteurActivite));

        SecteurActivite retrievedSecteurActivite = secteurActiviteService.retrieveSecteurActivite(id);

        verify(secteurActiviteRepository, times(1)).findById(id);
        assertNotNull(retrievedSecteurActivite);
    }

    @Test
    public void testRetrieveAllSecteurActivite() {
        List<SecteurActivite> secteurActiviteList = new ArrayList<>();
        when(secteurActiviteRepository.findAll()).thenReturn(secteurActiviteList);

        List<SecteurActivite> retrievedList = secteurActiviteService.retrieveAllSecteurActivite();

        verify(secteurActiviteRepository, times(1)).findAll();
        assertNotNull(retrievedList);
    }*/
}
