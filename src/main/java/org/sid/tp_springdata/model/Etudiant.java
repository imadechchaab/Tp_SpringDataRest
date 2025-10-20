package org.sid.tp_springdata.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.tp_springdata.enums.Genre;
@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
@Table (name = "students")
public class Etudiant {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Long id;
        @Column(name="nom_etudiant", nullable=false)
        String nom;
        @Column(name="prenom_etudiant" ,nullable=false)
        String prenom;
        @Enumerated(EnumType.STRING)
        Genre genre;
    }

