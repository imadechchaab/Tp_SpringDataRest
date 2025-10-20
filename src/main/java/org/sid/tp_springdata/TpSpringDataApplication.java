package org.sid.tp_springdata;

import org.sid.tp_springdata.enums.Genre;
import org.sid.tp_springdata.model.Etudiant;
import org.sid.tp_springdata.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpSpringDataApplication implements CommandLineRunner {
    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public void run(String... args) throws Exception {
        Etudiant et1 = Etudiant.builder()
                .nom("echchaab")
                .prenom("imad")
                .genre(Genre.Homme)
                .build();
        Etudiant et2 = Etudiant.builder()
                .nom("boulif")
                .prenom("badr")
                .genre(Genre.Homme)
                .build();
        Etudiant et3 = Etudiant.builder()
                .nom("tanji")
                .prenom("othmane")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et1);
        etudiantRepository.save(et2);
        etudiantRepository.save(et3);

    }

    public static void main(String[] args) {
        SpringApplication.run(TpSpringDataApplication.class, args);
    }

}
