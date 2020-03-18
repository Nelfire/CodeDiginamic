package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import projPOO01.GestionAchat.commande;
import projPOO01.GestionPersonnes.Fournisseur;

public class TestFournisseur {

	/** initialisation d'un fournisseur */
	private Fournisseur f;
	/** initialisation d'une commande */
	private commande c;
	/** ointitule */
	private final String ointitule = "intitule";
	/** oqte */
	private final Integer oqte = new Integer(10);
	/** initialisation du nom du patron */
	private final Date od = new Date();
	/** initialisation du nom du patron */
	private final String onom = "Personne";
	/** initialisation du nom du patron */
	private final String oprenom = "Test";
	/** initialisation du nom du patron */
	private final String oville = "Lyon";
	/** initialisation du nom du patron */
	private final String oadresse = "Rue";
	/** initialisation du nom du patron */
	private final String ocodepostal = "69000";
	/** initialisation du nom du patron */
	private final int oidfournisseur = 1;
	/** initialisation du nom du patron */
	private final int setidfournisseur = 10;
	private List<commande> commandes = new ArrayList<commande>();
	private final String ts = "Fournisseur [nom=" + onom + ", prenom=" + oprenom + ", adresse=" + oadresse + ", ville="
			+ oville + ", codepostal=" + ocodepostal + "]" + "[idfournisseur=" + oidfournisseur + ", commandes="
			+ commandes.toString() + "]";

	@Before
	public void init() {
		f = new Fournisseur(onom, oprenom, oadresse, oville, ocodepostal, oidfournisseur);
		c = new commande(od, ointitule, oqte);
		commandes.add(c);
	}

	@Test
	public void testToString() {
		assertEquals(ts, f.toString());
	}

	@Test
	public void testFournisseurStringStringStringStringStringInt() {
		assertNotNull(f);
	}

	@Test
	public void testGetIdfournisseur() {
		assertEquals(oidfournisseur, f.getIdfournisseur());
	}

	@Test
	public void testSetIdfournisseur() {
		f.setIdfournisseur(setidfournisseur);
		assertEquals(setidfournisseur, f.getIdfournisseur());
	}

	@Test
	public void testGetCommandes() {
		this.testCommande();
		assertEquals(commandes, f.getCommandes());
	}

	@Test
	public void testAchete() {
//		fail("Not yet implemented");
	}

	@Test
	public void testPaie() {
//		fail("Not yet implemented");
	}

	@Test
	public void testLivre() {
		assertTrue(f.livre());
	}

	@Test
	public void testCommande() {
		f.commande(commandes);
		assertEquals(commandes, f.getCommandes());
	}

	@Test
	public void testIsClient() {
		assertFalse(f.isClient());
	}

	@Test
	public void testIsFournisseur() {
		assertTrue(f.isFournisseur());
	}

}
