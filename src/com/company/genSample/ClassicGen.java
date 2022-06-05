package com.company.genSample;

public class ClassicGen implements GenSample{
    private int iterationOfEvolution;

    public ClassicGen(int iterationOfEvolution) {
        this.iterationOfEvolution = iterationOfEvolution;
    }

    @Override
    public String krossingover() {
        return "Classic Gen";
    }

    @Override
    public Integer getIterationOfEvolution() {
        System.out.println("Classic "+iterationOfEvolution);
        return iterationOfEvolution;
    }


}
