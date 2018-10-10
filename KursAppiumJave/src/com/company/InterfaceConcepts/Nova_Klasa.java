package com.company.InterfaceConcepts;

public class Nova_Klasa implements Jos_Jedan {


    @Override
    public void KostaRika() {
        System.out.println("Brojevi od 0 do 21:");
        for (int i=0;i<22;i++)
            System.out.println(i);
    }

    @Override
    public void Srbija() {
        System.out.println("Brojevi od 0 do 55 umanjeni za 21");
        for(int j=0;j<56;j++)
            System.out.println(j-21);

    }
}
