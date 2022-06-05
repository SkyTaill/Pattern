package com.company.genSample;

public class ClassicGenPlus implements GenSample {
    private int iterationOfEvolution;

    public ClassicGenPlus(int iterationOfEvolution) {
        this.iterationOfEvolution = iterationOfEvolution+2;
    }

    @Override
    public String krossingover() {
        return null;
    }

    @Override
    public Integer getIterationOfEvolution() {
        System.out.println("ClassicPlus "+iterationOfEvolution);
        return iterationOfEvolution;
    }

}
