# 🏥 Cabinet Médical — Application Java

Application Desktop développée en **Java Swing** avec une base de données **MySQL**.  
Elle permet de gérer les opérations essentielles d’un cabinet médical : **patients, médecins, consultations, paiements et rendez-vous**.

---

## 📌 Fonctionnalités

### 👨‍⚕️ Gestion du personnel et des patients
- Ajout / modification / suppression des **patients**
- Ajout / modification / suppression des **médecins**

### 📋 Gestion médicale
- Enregistrement des **consultations**
- Planification des **rendez-vous**

### 💰 Gestion financière
- Saisie et enregistrement des **paiements**
- Génération des **bilans journaliers**
- Génération des **bilans mensuels**

### 🔐 Authentification
- Écran de connexion  
- Sessions utilisateur (médecin / assistant)

---

## 🗂️ Structure du projet
```
CabinetMedical/
├── src/ma/cabinet/
│ ├── dao/ → Accès BD (DAO : PatientDAO, MedecinDAO, ConsultationDAO…)
│ ├── model/ → Classes métiers (Patient, Medecin, Consultation…)
│ ├── ui/ → Interfaces graphiques (Swing)
│ └── util/ → DBConnection, Session
│
├── build/ → Fichiers compilés (générés automatiquement)
├── nbproject/ → Config NetBeans
├── build.xml → Build script
├── manifest.mf → Manifest du projet
└── README.md
```

---

## 🛠️ Technologies utilisées

- **Java (Swing)**
- **MySQL**
- **JDBC**
- **NetBeans**

---

## 🔧 Configuration requise

Modifier les identifiants MySQL dans :
src/ma/cabinet/util/DBConnection.java
Exemple :
```java
String url = "jdbc:mysql://localhost:3306/cabinet_medical";
String user = "root";
String password = "";
```

▶️ Exécution
Depuis NetBeans :

1. Ouvrir le projet

2. Vérifier DBConnection.java

3. Cliquer sur Run Project



👤 Auteur

Projet réalisé par Ismail Frouij
Université Internationale de Rabat — Cycle Ingénieur Informatique




