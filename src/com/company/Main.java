package com.company;

import com.company.genBuilder.Employee;
import com.company.genBuilder.Gen;
import com.company.genFabric.GenSampleFabric;
import com.company.genSample.ClassicGen;
import com.company.genSample.ClassicGenPlus;
import com.company.genSample.GenType;
import com.company.genSample.ModifiedGen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClassicGen classicGen= GenSampleFabric.getInstance().createGenSampleFabric(GenType.ClassicGen,12);
        ClassicGenPlus classicGenPlus=GenSampleFabric.getInstance().createGenSampleFabric(GenType.ClassicGenPlus,22);
        ModifiedGen modifiedGen=GenSampleFabric.getInstance().createGenSampleFabric(GenType.ModifiedGen,11,11);

        classicGen.getIterationOfEvolution();
        classicGenPlus.getIterationOfEvolution();
        modifiedGen.getIterationOfEvolution();


        Gen gen=new Gen.GenBuilder(23).setMutation("dd").build();
        System.out.println(gen.toString());
    }
}
