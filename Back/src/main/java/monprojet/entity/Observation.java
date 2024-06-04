package monprojet.entity;
import jakarta.persistence.*;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.ManyToOne;







public class Observation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idObservation;

    @NonNull
    private String couleur;

    //customDateTime = LocalDateTime.of(2012, Month.JULY, 12, 13, 30);
    @NonNull
    private LocalDateTime dateArrive;

    @NonNull
    private LocalDateTime dateDepart;

    @NonNull
    private String notes;

    @NonNull
    private Boolean presence;

    @NonNull
    @ManyToOne(optional = false) // obligatoire, la clé étrangère ne doit pas être nulle
    User user;


    @ManyToMany(mappedBy = "especes")
    private Set<Espece> especes = new HashSet<>();


}



