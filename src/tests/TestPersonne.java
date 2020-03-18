package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import projPOO01.GestionPersonnes.Personne;

public class TestPersonne {

	/** p */
	private Personne p;
	/** initialisation du nom de la personne */
	private final String onom = "Personne";
	/** initialisation du prenom de la personne */
	private final String oprenom = "Test";
	/** initialisation de la ville de la personne */
	private final String oville = "Lyon";
	/** initialisation de l'adresse de la personne */
	private final String oadresse = "Rue";
	/** initialisation du code postal de la personne */
	private final String ocodepostal = "69000";
	/** initialisation du nom de la personne à vide */
	private final String setnom = "";
	/** initialisation du prenom de la personne à vide */
	private final String setprenom = "";
	/** initialisation de ville de la personne à vide */
	private final String setville = "";
	/** initialisation de adresse de la personne à vide */
	private final String setadresse = "";
	/** initialisation de cp de la personne à vide */
	private final String setcodepostal = "";

	private final String ts = "Personne [nom=" + onom + ", prenom=" + oprenom + ", adresse=" + oadresse + ", ville="
			+ oville + ", codepostal=" + ocodepostal + "]";

	@Before
	public void init() {
		p = new Personne(onom, oprenom, oadresse, oville, ocodepostal);
	}

	@Test
	public void testPersonne() {
		assertNotNull(p);
	}

	/**
	 * Classe personne, méthode de test sur le toString
	 */
	@Test
	public void testToString() {
		assertEquals(ts, p.toString());
	}

	/**
	 * Classe personne, méthode de test sur le getNom
	 */
	@Test
	public void testGetNom() {
		assertEquals(onom, p.getNom());
	}

	/**
	 * Classe personne, méthode de test sur le setNom
	 */
	@Test
	public void testSetNom() {
		p.setNom(setnom);
		assertEquals(setnom, p.getNom());
	}

	/**
	 * Classe personne, méthode de test sur le getPrenom
	 */
	@Test
	public void testGetPrenom() {
		assertEquals(oprenom, p.getPrenom());
	}

	/**
	 * Classe personne, méthode de test sur le setPrenom
	 */
	@Test
	public void testSetPrenom() {
		p.setPrenom(setprenom);
		assertEquals(setprenom, p.getPrenom());
	}

	/**
	 * Classe personne, méthode de test sur le getAdresse
	 */
	@Test
	public void testGetAdresse() {
		assertEquals(oadresse, p.getAdresse());
	}

	/**
	 * Classe personne, méthode de test sur le setAdresse
	 */
	@Test
	public void testSetAdresse() {
		p.setAdresse(setadresse);
		assertEquals(setadresse, p.getAdresse());
	}

	/**
	 * Classe personne, méthode de test sur le getVille
	 */
	@Test
	public void testGetVille() {
		assertEquals(oville, p.getVille());
	}

	/**
	 * Classe personne, méthode de test sur le setVille
	 */
	@Test
	public void testSetVille() {
		p.setVille(setville);
		assertEquals(setville, p.getVille());
	}

	/**
	 * Classe personne, méthode de test sur le getCodePostal
	 */
	@Test
	public void testGetCodepostal() {
		assertEquals(ocodepostal, p.getCodepostal());
	}

	/**
	 * Classe personne, méthode de test sur le setCodePostal
	 */
	@Test
	public void testSetCodepostal() {
		p.setCodepostal(setcodepostal);
		assertEquals(setcodepostal, p.getCodepostal());
	}

}
