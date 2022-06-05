package com.company.genFabric;

import com.company.genSample.*;

public class GenSampleFabric {

    public <T> T createGenSampleFabric(GenType genType, int iterationOfEvolution) {
        switch (genType) {
            case ClassicGen:
                return  (T) new ClassicGen(iterationOfEvolution);
            case ClassicGenPlus:
                return (T) new ClassicGenPlus(iterationOfEvolution);
            default:
                return null;
        }

    }

    public <T> T createGenSampleFabric(GenType genType, int iterationOfEvolution, int areal) {
        return (T) new ModifiedGen(iterationOfEvolution, areal);
    }

    private static GenSampleFabric genSampleFabric = new GenSampleFabric();

    public static GenSampleFabric getInstance() {
        return genSampleFabric;
    }

    public GenSampleFabric() {
    }
}
