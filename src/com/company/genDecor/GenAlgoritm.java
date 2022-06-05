package com.company.genDecor;

public class GenAlgoritm implements GenSample{
    private int iterationOfEvolution;

    public GenAlgoritm(int iterationOfEvolution) {
        this.iterationOfEvolution = iterationOfEvolution;
    }

    @Override
    public String krossingover() {

        return "Crosingover Gen Algoritm";
    }

    @Override
    public Integer getIterationOfEvolution() {
        return iterationOfEvolution;
    }
    public void genAlgoritmStatus(){
        System.out.println("status");
    }
}
