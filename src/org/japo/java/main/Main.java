/* 
 * Copyright 2019 Andrés Cosín Zamareño - Cousin183@gmail.com ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double dineroInicial = 2.00;
        final double precioPelicula = 1.30;
        final double precioPalomita = 0.90;
        final double partePalomitas;
        final double gastoTotalPersona;
        final double restante;
        
        // Operaciones
        partePalomitas = precioPalomita / 2;
        
        gastoTotalPersona = precioPelicula + partePalomitas;
        
        restante = dineroInicial - gastoTotalPersona;
        
        
        // Cabecera
        System.out.println("Secuencia de Kung-Fu");
        System.out.println("====================");
               
        // Salida consola
        System.out.printf("Dinero inicial......: %1.2f € %n", dineroInicial);
        System.out.println("---");
        System.out.printf("Precio pelicula.....: %1.2f € %n", precioPelicula);
        System.out.printf("Parte palomitas.....: %1.2f € %n", partePalomitas);
        System.out.println("---");
        System.out.printf("Gastos por persona..: %1.2f € %n", gastoTotalPersona);       
        System.out.println("---");
        System.out.printf("Dinero restante.....: %1.2f € %n", restante);     
    }
    
}
