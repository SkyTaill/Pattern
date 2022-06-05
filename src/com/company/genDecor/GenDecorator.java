package com.company.genDecor;

public class GenDecorator implements GenSample{

    GenSample genSample;

    public GenDecorator(GenSample genSample) {
        this.genSample = genSample;
    }

    @Override
    public String krossingover() {
        return genSample.krossingover();
    }

    @Override
    public Integer getIterationOfEvolution() {
        return genSample.getIterationOfEvolution();
    }
    public void startMutation(){
        System.out.println("Mutation");
    }
}
