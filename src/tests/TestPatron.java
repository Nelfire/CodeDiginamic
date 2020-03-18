package tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import projPOO01.GestionPersonnes.Patron;

public class TestPatron {

	/** p */
	private Patron p, p1;
	/** initialisation du nom du patron */
	private final String onom = "Personne";
	/** initialisation du prenom du patron */
	private final String oprenom = "Test";
	/** initialisation de la ville du patron */
	private final String oville = "Lyon";
	/** initialisation de l'adresse du patron */
	private final String oadresse = "Rue";
	/** initialisation du cp du patron */
	private final String ocodepostal = "69000";
	/** initialisation du n°secu du patron */
	private final String osecu = "oopp";
	/** initialisation du salaire du patron */
	private final long osalaire = 0L;

	/**
	 * On initialise un nouveau patron
	 */
	@Before
	public void init() {
		p = new Patron(onom, oprenom, oadresse, oville, ocodepostal, osecu, osalaire);
		p1 = new Patron();
	}

	/**
	 * On test le patron créé
	 */
	@Test
	public void testPatron() {
		assertNotNull(p1);
	}

	@Test
	public void testPatronStringStringStringStringStringStringDouble() {
		assertNotNull(p);
	}

	@Test
	public void testEmbauche() {
//		fail("Not yet implemented");
	}

	@Test
	public void testLicencie() {
//		fail("Not yet implemented");
	}

	@Test
	public void testPaieSalarie() {
//		fail("Not yet implemented");
	}

}
