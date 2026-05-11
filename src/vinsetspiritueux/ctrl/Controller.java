package vinsetspiritueux.ctrl;

import vinsetspiritueux.service.ServiceGestionVins;
import vinsetspiritueux.view.View;
import vinsetspiritueux.models.Local;

/**
 * Classe représentant le contrôleur de l'application MVC "VinsEtSpiritueux" du
 * module D400.
 *
 * @author <a href="mailto:paul.friedli@edufr.ch">Paul Friedli</a>
 * @since 08.12.2023
 * @version 1.1.0
 */
public class Controller {

    /**
     * Référence au worker principal de l'application.
     */
    private ServiceGestionVins refService;

    /**
     * Référence à l'ihm principale de l'application.
     */
    private View refView;

    /**
     * Attribut qui va contenir les locaux de l'entreprise.
     */
    private Local[] locaux;

    /**
     * Le constructeur de la classe Ctrl. Au démarrage, la liste de locaux est vide.
     */
    public Controller() {
        this.refService = refService;
        this.refView = refView;
        this.locaux = locaux;
    }

    /**
     * Méthode de démarrage de l'application MVC2. La méthode commence par appeler
     * la méthode ihmStart() de l'ihm afin
     * de la démarrer.
     */
    public void start() {
        refView.viewStart();
    }

    /**
     * Cette méthode est appelée par la vue pour indiquer que l'application est en
     * train de se fermer. Cela permettrait
     * de sauvegarder l'état de l'application, mais ici il n'y a rien à faire..
     */
    public void viewExiting() {

    }

    /**
     * Charge la situation propre à l'entreprise A, c'est-à-dire ses locaux, les
     * armoires présentes dans ces locaux et
     * les bouteilles de vin présentes dans ces armoires. Pour plus de détails,
     * référez-vous à la documentation reçue
     * pour ce projet.
     */
    public void actionChargerEntrepriseA() {
        // VOTRE CODE ICI...
    }

    /**
     * Charge la situation propre à l'entreprise B, c'est-à-dire ses locaux, les
     * armoires présentes dans ces locaux et
     * les bouteilles de vin présentes dans ces armoires. Pour plus de détails,
     * référez-vous à la documentation reçue
     * pour ce projet.
     */
    public void actionChargerEntrepriseB() {
        // VOTRE CODE ICI...
    }

    /**
     * Charge la situation propre à l'entreprise C, c'est-à-dire ses locaux, les
     * armoires présentes dans ces locaux et
     * les bouteilles de vin présentes dans ces armoires. Pour plus de détails,
     * référez-vous à la documentation reçue
     * pour ce projet.
     */
    public void actionChargerEntrepriseC() {
        // VOTRE CODE ICI...
    }

    /**
     * Affiche la valeur du stock de bouteilles présentes dans les locaux de
     * l'entreprise.
     */
    public void actionAfficherValeurStock() {
        // VOTRE CODE ICI...
    }

    /**
     * Affiche tous les détails disponibles pour les locaux de l'entreprise.
     */
    public void actionAfficherTout() {
        // VOTRE CODE ICI...
    }

    /**
     * Affiche des informations statistiques pour chacun des locaux de l'entreprise.
     */
    public void actionAfficherStatistiques() {
        // VOTRE CODE ICI...
    }

    /**
     * Getter de la référence au service GestionVins de l'application.
     *
     * @return la référence au worker de l'application
     */
    public ServiceGestionVins getRefServiceGestionVins() {
        return refService;
    }

    /**
     * Setter de la référence au service GestionVins de l'application.
     *
     * @param service la référence au service GestionVins de l'application
     */
    public void setRefServiceGestionVins(ServiceGestionVins service) {
        this.refService = refService;
    }

    /**
     * Getter de la référence à la vue de l'application.
     *
     * @return la référence à la vue de l'application
     */
    public View getRefView() {
        return refView;
    }

    /**
     * Setter de la référence à la vue de l'application.
     *
     * @param view la référence à la vue de l'application
     */
    public void setRefView(View view) {
        this.refView = refView;
    }

}
