package Boletin5;

import java.util.Scanner;

public class Consumo {
    Scanner sc = new Scanner(System.in);
    public float kilometros;
    public float litros;
    public float vMed;
    public float pGas;

    public Consumo(){

    }

    public Consumo(float km, float l, float vm, float pg) {
        kilometros = km;
        litros = l;
        vMed = vm;
        pGas = pg;
    }

    public float getTempo() {
        float tempo;
        tempo = kilometros / vMed;
        return tempo;
    }
    public float consumoMedio(){
        float consumoLitros;
        consumoLitros = litros * 100 / kilometros;
        return consumoLitros;
    }
    public float consumoEuros(){
        float gastoEuros;
        gastoEuros = pGas * (litros * 100 / kilometros);
        return gastoEuros;
    }
    public void setKms(float km){
        kilometros = km;
    }
    public void setlitros(float l){
        litros = l;
    }
    public void setvMed(float vm){
        vMed = vm;
    }
    public void setpGas(float pg){
        pGas = pg;
    }
}
