/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_examen1_nombreapellido;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
class FiguraCompuesta extends Figura {
    private ArrayList<Figura> figuras = new ArrayList<>();
    
    public void agregarFigura(Figura f){
        figuras.add(f);
    }

    @Override
    public double calcularArea(){
        double resp = 0;
        for (int i = 0; i < figuras.size(); i++) {
            resp += figuras.get(i).calcularArea();
        }
        return resp;
        
    }

    @Override
    public String toString() {
        return "FiguraCompuesta{" + "figuras=" + figuras + '}';
    }
    
}
