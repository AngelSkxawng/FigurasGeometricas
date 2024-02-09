package com.figuras.cuadrilateros;
public class Cuadrado {
    float lado;

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    public float calcularArea(){
        return (this.lado*this.lado);
    }
    public float calcularPerimetro(){
        return (this.lado)*4;
    }

    @Override
    public String toString() {
        return "Cuadrado " + ", lado=" + lado + "El area es: " + calcularArea() + ", El permietro es: "+ calcularPerimetro();
    }
}
