package com.company;

import com.company.genDecor.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GenSample genAlgoritm=new GenAlgPlus(new ModifiedGenAlgoritm(new GenAlgoritm(22)));
        GenSample modifiedGenAlgoritm=new ModifiedGenAlgoritm( new GenAlgoritm(11));
        GenSample genSample=modifiedGenAlgoritm;

        modifiedGenAlgoritm.getIterationOfEvolution();
        System.out.println(genAlgoritm.krossingover());

    }
}
