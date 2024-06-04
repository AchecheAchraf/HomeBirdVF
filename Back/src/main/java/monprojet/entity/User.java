package monprojet.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.NonNull;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    @NonNull
    private String nom;
    @NonNull
    private String prenom;

    @NonNull
    private String email;

    @NonNull
    private String adresse;

    @NonNull
    private String motdepasse;

    @NonNull
    private String urlImageUser;

    @OneToMany(mappedBy="user")
    // Essayer sans "mappedBy" pour voir le schéma relationnel généré
    // @OneToMany
    // Lombok https://www.projectlombok.org/features/ToString
    @ToString.Exclude // On ne veut pas inclure la liste des villes dans le toString
    // Sinon récursivité infinie
    private List<Observation> observations = new ArrayList<>();
}
