package com.company.observ;

public class Model {
    private String genInfo;

    public Model(String genInfo,Gen gen) {
        this.genInfo = genInfo;
        gen.addModel(this);
    }
    public void update(String modelInf){
        genInfo=genInfo+"..."+modelInf;
        System.out.println(genInfo);
    }
}
