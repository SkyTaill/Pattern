package com.company.observ;

import java.util.ArrayList;
import java.util.List;

public class GenAlgoritm implements Gen {
    private List<Model> models;
    private String modelInf;

    public GenAlgoritm() {
        this.models = new ArrayList<>();
    }

    public void setModelInfo(String modelInf) {
        this.modelInf = modelInf;
        notifyModel();

    }

    @Override
    public void addModel(Model model) {
    models.add(model);
    }

    @Override
    public void removeModel(Model model) {
    models.remove(model);
    }

    @Override
    public void notifyModel() {
        for(Model model:models){
            model.update(modelInf);
        }
    }
}
