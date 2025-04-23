package pagbe.example.RESTAPI.controller;


import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;
import pagbe.example.RESTAPI.model.dto.CalculatorDTO;


@RestController
@RequestMapping("/api/v1/calculator")

public class CaculatorController {



        @GetMapping("/add")
        public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2 ){

            return num2+num1;


        }

        @GetMapping("/mult")
        public Double mult(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2){

            return num2*num1;


        }

        @GetMapping("/newmult")
        public Double newmult(@RequestHeader("num1") Double num1, @RequestHeader("num2") Double num2){

         return num2*num1;

        }

        @PostMapping("/olsMult")
        public Double olsMult(@RequestBody @NotNull CalculatorDTO   calculatorDTO){
            Double result;
            result = calculatorDTO.getNume1()*calculatorDTO.getNume2()*calculatorDTO.getNume3()*calculatorDTO.getNume4();
            return result;

        }


        @GetMapping("/subs/{num1}/{num2}")
        public Double subs(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
            Double result;

           if (num1 > num2) {
              result = num1 - num2;
          } else {
               result = num2 - num1;
           }

        return result;
    }
}
