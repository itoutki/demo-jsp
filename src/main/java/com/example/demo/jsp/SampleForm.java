package com.example.demo.jsp;

import java.io.Serializable;

public class SampleForm implements Serializable {
    private String inputA;
    private String inputB;

    public String getInputA() {
        return inputA;
    }

    public void setInputA(String inputA) {
        this.inputA = inputA;
    }

    public String getInputB() {
        return inputB;
    }

    public void setInputB(String inputB) {
        this.inputB = inputB;
    }
}
