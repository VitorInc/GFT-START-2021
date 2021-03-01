package App;

import Entities.Eletronico;
import Entities.Movel;
import Entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<Produto>();
        System.out.println("Digite o número de produtos: ");
        int n = sc.nextInt();
        for(int i = 0; i<n ; i ++ ){
            System.out.println("Digite os dados do Item #"+ i );
            System.out.print("Móvel ou Eletrônico (m/e) :");
            char type = sc.next().charAt(0);
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Quantiade: ");
            Integer quantity = sc.nextInt();
            System.out.println("Value of : R$");
            Double value = sc.nextDouble();
            if(type == 'e'){
                Eletronico eletronico = new Eletronico(name,value,quantity);
                list.add(eletronico);
            }
            else if (type == 'm') {

                Movel movel = new Movel(name,value, quantity);
                list.add(movel);

            }

        }

        System.out.println();
        System.out.println("Lista de produtos");

        for(Produto prod: list){
            System.out.println(prod.getName() + ", quantity:" + prod.getQuantity() + ", $" +String.format("%.2f", prod.finalValue()) );
        }
        System.out.println();
        double sum = 0.0;
        for (Produto prod : list) {
            sum += prod.finalValue();
        }
        System.out.println("TOTAL Value: $ " + String.format("%.2f", sum));
        sc.close();
    }
}
