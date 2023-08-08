public class Triangulo {
    
    public static void Triangulo(int lado1, int lado2, int lado3){
        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Equilátero");
        } else if ((lado1 == lado2 && lado2 != lado3) ||
                (lado2 == lado3 && lado3 != lado1) ||
                (lado3 == lado1 && lado3 != lado2)){
            System.out.println("Isósceles");
        } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
            
        }
    }
}