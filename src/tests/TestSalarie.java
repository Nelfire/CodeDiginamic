package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;

import projPOO01.GestionPersonnes.Salarie;

public class TestSalarie {

	private Salarie s;
	/** initialisation du nom du salarié */
	private final String onom = "Personne";
	/** initialisation du prenom du salarié */
	private final String oprenom = "Test";
	/** initialisation de la ville du salarié */
	private final String oville = "Lyon";
	/** initialisation de l'adresse du salarié */
	private final String oadresse = "Rue";
	/** initialisation du code postal du salarié */
	private final String ocodepostal = "69000";
	/** initialisation du secu du salarié */
	private final String osecu = "oopp";
	/** initialisation du salaire a 0 */
	private final Long osalaire = 0L;
	/** initialisation du n°secu du salarié */
	private final String setsecu = "";
	/** initialisation du salaire du salarié */
	private final Long setsalaire = 12L;
	private final DecimalFormat df = new DecimalFormat("0.00");
	private final String ts = "Salarie [nom=" + onom + ", prenom=" + oprenom + ", adresse=" + oadresse + ", ville="
			+ oville + ", codepostal=" + ocodepostal + "]" + " [secu=" + osecu + ", salaire=" + df.format(osalaire)
			+ "]";;

	@Before
	public void init() {
		s = new Salarie(onom, oprenom, oadresse, oville, ocodepostal, osecu, osalaire);
	}

	@Test
	public void testToString() {
		assertEquals(ts, s.toString());
	}

	@Test
	public void testSalarie() {
		assertNotNull(s);
	}

	@Test
	public void testAchete() {
//		fail("Not yet implemented");
	}

	@Test
	public void testPaie() {
		assertTrue(s.paie());
	}

	@Test
	public void testIsClient() {
		assertFalse(s.isClient());
	}

	@Test
	public void testGetSecu() {
		assertEquals(osecu, s.getSecu());
	}

	@Test
	public void testSetSecu() {
		s.setSecu(setsecu);
		assertEquals(setsecu, s.getSecu());
	}

	@Test
	public void testGetSalaire() {
		assertEquals(df.format(osalaire), df.format(s.getSalaire()));
	}

	@Test
	public void testSetSalaire() {
		s.setSalaire(setsalaire);
		assertEquals(df.format(setsalaire), df.format(s.getSalaire()));
	}

}
