package org.sid.tp_springdata.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data @Builder
@Table(name = "centres")
public class Centre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomcentre;
    private String adresse;

    // @OneToMany(mappedBy = "centreId")
    // private List<Etudiant> etudiants;
}
