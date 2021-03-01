package App;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Crie um programa que imprima todos os números entre 10 e 215 que sejam divisíveis por 3 ou por 7");

        for (int i = 10; 10 < 215; i++) {

            if (i >= 10 && i < 250 && i % 3 ==0 && i% 7 ==0){
                System.out.println(i);
            }

        }

    }
}