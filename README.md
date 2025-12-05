🏥 Cabinet Médical – Gestion de consultations (Java Swing & MySQL)

Ce projet est une application Desktop développée en Java Swing, permettant de gérer un cabinet médical :
patients, médecins, consultations, paiements, rendez-vous, ainsi que les bilans journaliers et mensuels.

🚀 Fonctionnalités principales
👤 Gestion des patients

Ajouter, modifier, supprimer un patient

Consulter la liste des patients

Recherche dynamique

🩺 Gestion des médecins

Ajouter un médecin

Modification et suppression

Interface dédiée (MedecinFrame)

📅 Gestion des rendez-vous

Création de rendez-vous

Association patient → médecin

Planning par jour / par médecin

💳 Gestion des paiements

Ajout d’un paiement lié à une consultation

Affichage de l’historique des paiements

🔍 Bilans

Bilan journalier

Bilan mensuel

Statistiques sur les consultations et revenus

🔐 Authentification

Écran de login (LoginFrame)

Gestion des utilisateurs (secrétaire / médecin)

📂 Structure du projet
src/
 └── ma/cabinet
     ├── dao/        → Accès aux données (PatientDAO, MedecinDAO, …)
     ├── model/      → Classes métier (Patient, Consultation, Paiement…)
     ├── ui/         → Interfaces graphiques (Swing)
     └── util/       → Connexion DB & gestion de session

🛠️ Technologies utilisées

Java 8+

Java Swing

MySQL

JDBC

NetBeans IDE

⚙️ Configuration de la base de données

Créer une base MySQL :

CREATE DATABASE cabinet_medical;


Mettre vos identifiants dans :

src/ma/cabinet/util/DBConnection.java


Exemple :

String url = "jdbc:mysql://localhost:3306/cabinet_medical";
String user = "root";
String password = "";


Importer le script SQL fourni (si tu veux, je te génère un script complet).

▶️ Exécution

Depuis NetBeans :
Run Project

ou via terminal :

javac -d bin src/ma/cabinet/**/*.java
java -cp bin ma.cabinet.Main

👤 Auteur

Ismail (bandlynx)
Projet académique — Application Java Swing pour gestion de cabinet médical.

📄 Licence

Ce projet est fourni à but éducatif.
