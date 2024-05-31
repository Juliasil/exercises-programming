package Matriz.java;

public class ExeSomaArray {
  public static void main(String[] args) {
    int[][] allNumbers = {
        {1, 2, 3, 4, 5},    
        {-1, 1, 0, 5, -5}   
    };

    for (int[] numbers : allNumbers) {
        int sum = soma(numbers);
        System.out.println("Sum: " + sum);
    }
  }

  private static int soma(int[] numbers) {
    int soma = 0;
    for (int number : numbers) {
        soma += number;
    }
    return soma;
  }
}





