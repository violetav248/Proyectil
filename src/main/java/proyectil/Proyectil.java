/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectil;

/**
 *
 * @author juanfel
 */
public class Proyectil {
    
    protected double velocidadInicial;
    protected double xInicial, yInicial, zInicial;
    protected final double gravedad = 9.8;
    protected double tiempo;
    protected double masa;
    protected double tetha;
    protected double phi;
    

protected double asignarVelocidadInicial() {
    do {
        velocidadInicial = IO.leerReal("Ingresa la velocidad inicial (debe ser mayor o igual a 0): ");
        if (velocidadInicial < 0) {
            IO.mostrar("Valor inválido. Intente de nuevo.\n");
        }
    } while (velocidadInicial < 0); 
    return velocidadInicial;
}    

protected double asignarAnguloElevacionSobrePlanoHorizontal() {
    do {
        tetha = IO.leerReal("Ingresa el angulo de elevación sobre el plano horizontal (debe ser mayor o igual a 0): ");
        if (tetha < 0) {
            IO.mostrar("Valor inválido. Intente de nuevo.\n");
        }
    } while (tetha < 0); 
    return tetha;
}

protected double asignarAnguloElevacionPlanoHorizontal() {
    do {
        phi = IO.leerReal("Ingresa el angulo de elevación del plano horizontal (debe ser mayor o igual a 0): ");
        if (phi < 0) {
            IO.mostrar("Valor inválido. Intente de nuevo.\n");
        }
    } while (phi < 0); 
    return phi;
}    

protected double calcularVelocidadInicialX(){
    asignarVelocidadInicial();
    asignarAnguloElevacionSobrePlanoHorizontal();
    asignarAnguloElevacionPlanoHorizontal();
    xInicial = (velocidadInicial * Math.cos(tetha) * Math.cos(phi) );
  return xInicial;  
}

protected double calcularVelocidadInicialY(){
    asignarVelocidadInicial();
    asignarAnguloElevacionSobrePlanoHorizontal();
    asignarAnguloElevacionPlanoHorizontal();
    yInicial = (velocidadInicial * Math.cos(tetha) * Math.sin(phi) );
  return yInicial;  
}

protected double calcularVelocidadInicialz(){
    asignarVelocidadInicial();
    asignarAnguloElevacionSobrePlanoHorizontal();
    asignarAnguloElevacionPlanoHorizontal();
    zInicial = (velocidadInicial * Math.cos(phi) );
  return zInicial;  
}
}
