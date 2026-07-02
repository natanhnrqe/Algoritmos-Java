package algh.algoritmos;

import java.util.*;

public class RestauranteBocaFeliz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("pao", 10);
        estoque.put("hamburguer", 12);
        estoque.put("tomate", 5);
        // ... adicionar demais itens


        Map<String, List<String>> cardapio = new HashMap<>();
        cardapio.put("x-burguer", Arrays.asList("pao", "hamburguer"));
        // ... adicionar demais lanches



        while (true) {
            System.out.println("\nO que deseja pedir (0 para sair)?");
            String pedido = sc.nextLine().toLowerCase();
            if (pedido.equals("0")) break;

            if (!cardapio.containsKey(pedido)) {
                System.out.println("Item não localizado no cardápio");
                continue;
            }

            List<String> ingredientes = cardapio.get(pedido);
            boolean erro = false;

            for (String ing : ingredientes) {
                if (estoque.getOrDefault(ing, 0) <= 0) {
                    System.out.println("Infelizmente acabou o " + ing);
                    erro = true;
                }
            }

            if (!erro) {
                for (String ing : ingredientes) {
                    estoque.put(ing, estoque.get(ing) - 1);
                }
                System.out.println("Um " + pedido + " saindo no capricho!!!");
            }
        }
    }
}
