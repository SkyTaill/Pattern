package com.company;

import com.company.observ.GenAlgoritm;
import com.company.observ.Model;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GenAlgoritm genAlgoritm=new GenAlgoritm();
        new Model("update1",genAlgoritm);
        new Model("update2",genAlgoritm);

        genAlgoritm.setModelInfo("33");
        genAlgoritm.setModelInfo("LAST_UPDATE1");
        genAlgoritm.setModelInfo("LAST_UPDATE2");

    }
}
