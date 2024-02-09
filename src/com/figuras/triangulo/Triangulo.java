package com.figuras.triangulo;
public class Triangulo {
    float base;
    float altura;
    public Triangulo() {
    }
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public float calcularArea(){
        return (this.base*this.altura)/2;
    }
    public float calcularPerimetro(){
        return (this.base*this.altura);
    }

    @Override
    public String toString() {
        return "Triangulo " + ", base=" + base + ", altura=" + altura
                + ", El area es: " + calcularArea() + ", El permietro es: "+ calcularPerimetro();
    }
}
