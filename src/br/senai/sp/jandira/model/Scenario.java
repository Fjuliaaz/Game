package br.senai.sp.jandira.model;

public class Scenario {

    public  String Scenario(int optionScenario){

        String Scenario = "Senai Jandira";

      switch (optionScenario){
          case 1:
              Scenario = "Torre Eiffel";
              break;
          case 2:
            Scenario = "Arabia - [Junto com o Ney]";
            break;
          case 3:
            Scenario ="Turquia";
              break;
      }
        return Scenario;
    }
}
