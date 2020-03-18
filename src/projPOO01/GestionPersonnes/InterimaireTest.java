package projPOO01.GestionPersonnes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;

public class InterimaireTest {

	private Interimaire interimaire;
	/** initialisation du nom de l'intérimaire */
	private final String onom = "Personne";
	/** initialisation du prenom de l'intérimaire */
	private final String oprenom = "Test";
	/** initialisation de la ville de l'intérimaire */
	private final String oville = "Lyon";
	/** initialisation de l'adresse de l'intérimaire */
	private final String oadresse = "Rue";
	/** initialisation du code postal de l'intérimaire */
	private final String ocodepostal = "69000";
	/** initialisation du secu de l'intérimaire */
	private final String osecu = "oopp";
	/** initialisation du salaire a 0 */
	private final Long osalaire = 0L;
	/** initialisation du n°secu de l'intérimaire */
	private final String setsecu = "";
	/** initialisation du salaire de l'intérimaire */
	private final Long setsalaire = 12L;
	/** initialisation du nom de l'agence de l'intérimaire */
	private final String nomAgence = "AgenceNom";
	/** initialisation de la durée de contrat de l'intérimaire */
	private final int duree = 2;
	private final DecimalFormat df = new DecimalFormat("0.00");
	private final String ts = "Salarie [nom=" + onom + ", prenom=" + oprenom + ", adresse=" + oadresse + ", ville="
			+ oville + ", codepostal=" + ocodepostal + "]" + " [secu=" + osecu + ", salaire=" + df.format(osalaire)
			+ "]";;

	@Before
	public void init() {
		interimaire = new Interimaire(onom, oprenom, oadresse, oville, ocodepostal, osecu, osalaire, nomAgence, duree);
	}

	@Test
	public void testInterimaire() {
		assertNotNull(interimaire);
	}

	/**
	 * Essai du toString
	 */
	@Test
	public void testToString() {
		assertEquals(ts, interimaire.toString());
	}

	@Test
	public void testGetSecu() {
		assertEquals(osecu, interimaire.getSecu());
	}

	@Test
	public void testSetSecu() {
		interimaire.setSecu(setsecu);
		assertEquals(setsecu, interimaire.getSecu());
	}

	@Test
	public void testGetSalaire() {
		assertEquals(df.format(osalaire), df.format(interimaire.getSalaire()));
	}

	@Test
	public void testSetSalaire() {
		interimaire.setSalaire(setsalaire);
		assertEquals(df.format(setsalaire), df.format(interimaire.getSalaire()));
	}

	// pas fini
//	/**
//	 * Test duree 2 mois
//	 */
//	@Test
//	public void testSetDuree() {
//		try {
//			assertEquals(2, duree);
//		} catch (Exception e) {
//			fail();
//		}
//	}
//
//	/**
//	 * Cas periode < 1 mois
//	 * 
//	 * @throws Exception
//	 */
//	@Test(expected = Exception.class)
//	public void testSetDureeErreur() throws Exception {
//		assertEquals(1, duree);
//	}

}
