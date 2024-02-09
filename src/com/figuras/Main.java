package com.figuras;

import com.figuras.cuadrilateros.Cuadrado;
import com.figuras.poligonos.Hexagono;
import com.figuras.triangulo.Triangulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Triangulo objTri =new Triangulo(10f, 20f);
        JOptionPane.showMessageDialog(null, objTri.toString());

        Cuadrado objCuad =new Cuadrado(20f);
        JOptionPane.showMessageDialog(null, objCuad.toString());

        Hexagono objHex =new Hexagono(10f, 10f);
        JOptionPane.showMessageDialog(null, objHex.toString());

    }
}
