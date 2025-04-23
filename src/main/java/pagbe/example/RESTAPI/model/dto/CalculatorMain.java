package pagbe.example.RESTAPI.model.dto;

import pagbe.example.RESTAPI.controller.CaculatorController;

public class CalculatorMain {

    public static void main(String[] args) {
        CaculatorController cc = new CaculatorController();
        Double result = cc.add(11.0, 13.5);
        System.out.println(result);
    }

}
