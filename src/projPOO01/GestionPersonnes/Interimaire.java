package projPOO01.GestionPersonnes;

/**
 * @author 20-100
 *
 *         Classe Interimaire qui hérite de salarie
 */
public class Interimaire extends Salarie {

	/*
	 * 
	 * ContratAgence String (5 caractères mini) Duree en mois type Integer : (>1
	 * mois)
	 */
	private String contratAgence;
	private int duree;

	/**
	 * Constructeur
	 * 
	 * @param nom        du salarie
	 * @param prenom     du salarie
	 * @param adresse    du salarie
	 * @param ville      du salarie
	 * @param codepostal du salarie
	 * @param secu       du salarie
	 * @param salaire    du salarie
	 */
	public Interimaire() {
		super("", "", "", "", "", "", 0);
	}

	public Interimaire(String nom, String prenom, String adresse, String ville, String codepostal, String secu,
			double salaire, String contratAgence, int duree) {
		// recupere parametres de la classe mere salarie
		super(nom, prenom, adresse, ville, codepostal, secu, salaire);
		this.contratAgence = contratAgence;
		this.duree = duree;

	}

	/**
	 * Getter
	 * 
	 * @return the contratAgence
	 */
	public String getContratAgence() {
		return contratAgence;
	}

	/**
	 * Setter
	 * 
	 * @param contratAgence the contratAgence to set
	 * @throws Exception
	 */
	public void setContratAgence(String contratAgence) throws Exception {
		if (contratAgence.length() < 5) {
			throw new Exception("Nombre caracteres doit être superieur à 5");
		} else {
			this.contratAgence = contratAgence;
		}
	}

	/**
	 * Getter
	 * 
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}

	/**
	 * Setter
	 * 
	 * @param duree the duree to set
	 * @throws Exception
	 */
	public void setDuree(int duree) throws Exception {
		if (duree < 1) {
			throw new Exception("Durée doit être superieure à 1 mois");
		} else {
			this.duree = duree;
		}
	}

}
