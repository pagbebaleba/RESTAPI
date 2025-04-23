package pagbe.example.RESTAPI.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;


public class CalculatorDTO {


    private Double nume1;
    private Double nume2;
    private Double nume3;
    private Double nume4;


    public Double getNume1() {
        return nume1;
    }

    public void setNume1(Double nume1) {
        this.nume1 = nume1;
    }

    public Double getNume2() {
        return nume2;
    }

    public void setNume2(Double nume2) {
        this.nume2 = nume2;
    }

    public Double getNume4() {
        return nume4;
    }

    public void setNume4(Double nume4) {
        this.nume4 = nume4;
    }

    public Double getNume3() {
        return nume3;
    }

    public void setNume3(Double nume3) {
        this.nume3 = nume3;
    }
}
