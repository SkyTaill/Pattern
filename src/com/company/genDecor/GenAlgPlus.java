package com.company.genDecor;

public class GenAlgPlus extends GenDecorator{
    public GenAlgPlus(GenSample genSample) {
        super(genSample);
    }
    public String getPlus(){
        return " PlusAlg";
    }

    @Override
    public String krossingover() {
        return super.krossingover() +getPlus();
    }


}
