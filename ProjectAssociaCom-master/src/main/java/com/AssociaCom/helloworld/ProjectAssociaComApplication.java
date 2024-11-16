package com.AssociaCom.helloworld;

import com.AssociaCom.helloworld.service.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProjectAssociaComApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProjectAssociaComApplication.class, args);
    }

    @Autowired
    AssociationService associationService;
    @Override
    public void run(String... args){


      /*  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = "16/08/2016";
        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        President president = President.builder()
                .phone("1245632")
                .birthday(localDate)
                .email("ayassine@gmial.com")
                .firstName("yassin")
                .lastName("lamqawed")
                .build();
        presidentService.save(president);
        Optional<President> presidentFounded = presidentService.find(president);

        if(presidentFounded.isPresent())
            System.out.println("founded");
        else{
            System.out.println("not found");
        }
*/


       /* Authentication authentication =Authentication.builder()
                .email("Soukaina@gmail.com")
                .password("2020199")
                .build();
        Optional<Authentication> authenticationSucceed = authenticationService.singIn(authentication);
        if(authenticationSucceed.isPresent())
            System.out.println("Succeed");
        else{
            System.out.println("Nop");
        }*/


      /*  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = "16/08/2016";
        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        Association association= Association.builder()
                .name("Titrit")
                .type("Sport")
                .phone("0655839265")
                .email("SOUKAINA@GMAIL.COM")
                .dateDeCreation(localDate)
                .build();


        /*
          associationService.save(association);
        Authentication authentication = Authentication.builder()
                .email("Soukaina@gmail.com")
                .password("2020199")
                .build();
        String newEmail="amrir@gmail.com";
        Optional<Authentication> authenticationSucceed =associationService.changerEmail(authentication,newEmail);
        if(authenticationSucceed.isPresent())
            System.out.println("Succeed");
        else{
            System.out.println("Nop");
        }

         */
        /*
        List<Association> allAssociation= associationService.viewAllAssociations();
        if (allAssociation.isEmpty())
        {
            System.out.println("Empty");
        }
        else
            System.out.println(allAssociation.stream().map(t->t.getEmail()).toList());
       */



   /*

        DateTimeFormatter formatte = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dat = "16/08/2016";
        //convert String to LocalDate
        LocalDate localDat = LocalDate.parse(dat, formatte);
        Association association= Association.builder()
                .name("kora")
                .type("Sport")
                .phone("0655839265")
                .email("SOUKAINA@GMAIL.COM")
                .dateDeCreation(localDat)
                .etat("Valide")
                .build();
        associationService.save(association);
        List<Association> associationsValid=associationService.viewAllAssociationsValid();
        List<Association> associationsNonValid=associationService.viewAllAssociationsNonValid();
        System.out.println("Association Valide:");
        System.out.println(associationsValid.stream().map(t->t.getName()).toList());
        System.out.println("Association NonValide:");
        System.out.println(associationsNonValid.stream().map(t->t.getName()).toList());

    */


        /*
        List<Activity> activity1= activityService.activityofAssociation(association);
        if (activity1.isEmpty())
        {
            System.out.println("empty");
        }
        else
            System.out.println(activity1.stream().map(t->t.getName()).toList());

          */
        /*
        ContactUs contactUs =ContactUs.builder()
                .email("Soukai@GMAIL.com")
                .name("Titrit")
                .subject("raja")
                .message("azeryjhhgvjkbljjghvklnl;jjh")
                .build();
        contactUsService.save(contactUs);

         *

         */
/*

       Optional<Association> association= associationService.informationAssociation("amriry9@gmail.com");

       if (association.isPresent())
       {
           System.out.println(association.toString());
           System.out.println("NoEmpty");
       }
       else
           System.out.println("Empty");

 */


        //Optional<AssociationEntity> associationEntity= associationService.associationNonValid(association);

        /*
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = "16/08/2016";
        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        Association association = new Association();
        association.setName("Titrit");
        association.setEmail("ajhbdcjhbz");
        association.setDescription("jhvshxbdchbizjdbcikjzdcijzdjcnkezdcbkdjbckz");
        association.setDateDeCreation(localDate);
        association.setPhone("0655635670");
        association.setType("sport");
        associationController.create(association);


         */


    }



}
