package com.company.genDecor;

public class ModifiedGenAlgoritm extends GenDecorator{


    public ModifiedGenAlgoritm(GenSample genSample) {
        super(genSample);
    }

    public int getAreal(){
        return 4;
    }
    public String krossingoverModified(){
        return "Modified";
    }
    public void startMutationModified(){
        System.out.println("Mutation Modified");
    }

    @Override
    public String krossingover() {
        return super.krossingover()+krossingoverModified();
    }
}
