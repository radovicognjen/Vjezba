package com.company.InterfaceConcepts;

public class Klasa_Intefejs implements Test_Interface, Development, Jos_Jedan {
    //jedna klasa moze implementirati vise interfejsa


    @Override
    public void paycreditcard() {
        System.out.println("Pay Credit");

    }

    @Override
    public void transferbalance() {
        System.out.println("Transfer");

    }

    @Override
    public void invest() {
        System.out.println("invest");
    }

    @Override
    public void checkoutbalance() {
        System.out.println("Check");
    }

    @Override
    public void rent() {
        System.out.println("Klasa za rentiranje");
    }

    public void Nema_Interfejsa()
    {
        System.out.println("Ove nema tamo");
    }

    @Override
    public void odrzavanje() {
        System.out.println("odrzavanje metoda");
    }

    @Override
    public void KostaRika() {
        System.out.println("Kosta Rika je izgubila mec");
    }

    @Override
    public void Srbija() {
        System.out.println("Srbija je pobijedila");

    }
}
