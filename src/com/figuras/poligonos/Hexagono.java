package com.figuras.poligonos;

public class Hexagono {
        float apotema;
        float lado;

        public Hexagono() {
        }

        public Hexagono(float apotema, float lado) {
            this.apotema = apotema;
            this.lado = lado;
        }

        public float calcularPerimetro() {
        return (this.lado)*6 ;
        }

        public float calcularArea() {
            return ((calcularPerimetro()) * apotema)/2;
        }

        @Override
        public String toString() {
            return "Hexagono " + ", apotema=" + apotema + "El area es: " + calcularArea() + ", El permietro es: " + calcularPerimetro();
        }
    }

