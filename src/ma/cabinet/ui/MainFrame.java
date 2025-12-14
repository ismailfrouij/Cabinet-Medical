/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.cabinet.ui;

import javax.swing.*;
import java.awt.*; // Nécessaire pour BorderLayout et FlowLayout
import ma.cabinet.model.Utilisateur;
import ma.cabinet.model.Assistant;
import ma.cabinet.model.Medecin;
import ma.cabinet.util.Session;

public class MainFrame extends JFrame {

    public MainFrame() {
        Utilisateur u = Session.getCurrentUser();

        if (u != null) {
            setTitle("Gestion Cabinet Médical - Connecté : " + u.getLogin());
        } else {
            setTitle("Gestion Cabinet Médical");
        }

        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Utilisation explicite du BorderLayout pour la fenêtre principale
        setLayout(new BorderLayout());

        // --- DEBUT MODIFICATION : Bouton Déconnexion ---
        
        // Création d'un panneau en haut (North) pour le bouton
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnLogout = new JButton("Déconnexion");

        // Action du bouton
        btnLogout.addActionListener(e -> {
            // 1. On vide la session
            Session.setCurrentUser(null);
            
            // 2. On ferme la fenêtre actuelle
            this.dispose();
            
            // 3. On réouvre la fenêtre de login
            new LoginFrame().setVisible(true);
        });

        topPanel.add(btnLogout);
        // Ajout du panneau contenant le bouton en haut de la fenêtre
        this.add(topPanel, BorderLayout.NORTH);
        
        // --- FIN MODIFICATION ---

        JTabbedPane tabbedPane = new JTabbedPane();

        // Onglets pour tout le monde
        tabbedPane.addTab("Planning RDV", new PanneauRendezVous());
        tabbedPane.addTab("Bilan mensuel", new PanneauBilanMensuel());

        // Onglets uniquement pour l'Assistant
        if (u instanceof Assistant) {
            tabbedPane.addTab("Consultations", new PanneauConsultation());
            tabbedPane.addTab("Gestion Médecins", new PanneauMedecin());
            
            tabbedPane.insertTab("Gestion Patients", null, new PanneauPatient(), null, 0);
            tabbedPane.insertTab("Paiement/caisse", null, new PanneauPaiement(), null, 2);
            tabbedPane.addTab("Gestion Categorie", new PanneauCategorie());
            tabbedPane.addTab("Gestion Assistant", new PanneauAssistant());
        }

        // Onglet pour le Médecin
        if (u instanceof Medecin) {
            tabbedPane.insertTab("Gestion Patients", null, new PanneauPatient(), null, 0);
        }

        // Ajout des onglets au centre de la fenêtre
        this.add(tabbedPane, BorderLayout.CENTER);
    }
}
