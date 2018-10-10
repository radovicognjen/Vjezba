package com.company;

import Inheritance.Grandson;
import Inheritance.Son;
import com.company.InterfaceConcepts.*;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("ko je to");



        String s="Znak dolara $ je uvijek takav";
        System.out.println(s.charAt(12));//ispisuje karakter koji se nalazi na poziciji 12, zapravo 13 jer brojanje krece od 0
        System.out.println(s.indexOf("$"));//vraca vrijednost indeksa koji sadrzi znak dolara
        System.out.println(s.substring(s.indexOf("$"))); //Ispisuje sting od znaka definisanog indeksom
        Klasa_Intefejs d=new Klasa_Intefejs();
        d.checkoutbalance();
        d.paycreditcard();
        d.transferbalance();

        Probna_Klasa e=new Probna_Klasa();
        e.Pisi();

        d.Nema_Interfejsa(); //ovo je pozivanje metode koja nije definisana u interfejsu, ali jeste u samoj klasi,
        // iako nije bila predmet ugovora sa interfejsom

        Test_Interface f=new Klasa_Intefejs(); //ovako definisan objekat bi trebao samo da sadrzi metode koje su definisane interfejsom
        ((Klasa_Intefejs) f).Nema_Interfejsa(); //ipak InteliJ ovo nekako ipak prevodi kako treba
        f.checkoutbalance();
        f.invest();
        Klasa_Intefejs pisanje = new Klasa_Intefejs();
        pisanje.rent();
        d.odrzavanje();

        Development TestiranjeDevelopment=new Klasa_Intefejs();
        TestiranjeDevelopment.odrzavanje();

        Son Mirko = new Son();
        Mirko.city(); //Objekat Son je naslijedio stvari od GrandFather i zato je mogao koristiti metode koje su definisane kod parent klase
        Mirko.country();
        Mirko.sonactivities();

        Grandson Unuk = new Grandson();
        Unuk.sonactivities();
        Unuk.country();
        Unuk.city();
        System.out.println(Unuk.konstanta);

        d.Srbija();
        d.KostaRika();

        Nova_Klasa Mundijal = new Nova_Klasa();
        Mundijal.KostaRika();
        Mundijal.Srbija();





    }
}
