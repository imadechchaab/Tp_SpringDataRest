package org.sid.tp_springdata;

import org.sid.tp_springdata.enums.Genre;
import org.sid.tp_springdata.model.Centre;
import org.sid.tp_springdata.model.Etudiant;
import org.sid.tp_springdata.repositories.CentreRepository;
import org.sid.tp_springdata.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TpSpringDataApplication {
    public static void main(String[] args) {SpringApplication.run(TpSpringDataApplication.class, args);}

    @Bean
    CommandLineRunner commandLineRunner(EtudiantRepository etudiantRepository, CentreRepository centreRepository) {
        return args -> {


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

            Centre c1 = Centre.builder()
                    .nomcentre("Centre A")
                    .adresse("123 Rue Principale")
                    .build();
            centreRepository.save(c1);

            Centre c2 = Centre.builder()
                    .nomcentre("Centre B")
                    .adresse("879 Rue Principale")
                    .build();
            centreRepository.save(c2);

        };
    }

    }
