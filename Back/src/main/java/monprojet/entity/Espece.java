package monprojet.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.NonNull;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Espece {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idType;

    @NonNull
    private String nomType;

    //customDateTime = LocalDateTime.of(2012, Month.JULY, 12, 13, 30);
    @NonNull
    private String famille;

    @NonNull
    private String genre;

    @NonNull
    private Integer longevite;

    @NonNull
    private String urlImageEspece;

    @OneToMany(mappedBy="espece")
    // Essayer sans "mappedBy" pour voir le schéma relationnel généré
    // @OneToMany
    // Lombok https://www.projectlombok.org/features/ToString
    @ToString.Exclude // On ne veut pas inclure la liste des villes dans le toString
    // Sinon récursivité infinie
    private List<Observation> oiseaux = new ArrayList<>();
}
