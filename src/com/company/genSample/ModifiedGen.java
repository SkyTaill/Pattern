package com.company.genSample;

public class ModifiedGen implements GenSample{
    private int iterationOfEvolution;
    private int areal;

    public ModifiedGen(int iterationOfEvolution, int areal) {
        this.iterationOfEvolution = iterationOfEvolution;
        this.areal = areal;
    }

    @Override
    public String krossingover() {
        return "Modified Gen";
    }

    @Override
    public Integer getIterationOfEvolution() {
        System.out.println("Modifie "+iterationOfEvolution);
        return iterationOfEvolution;
    }
    public void generateAreal(){
        areal=areal*iterationOfEvolution;
    }

    public int getAreal() {
        return areal;
    }
}
