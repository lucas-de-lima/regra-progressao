package com.trybe.java.regraprogressao;

/**
 * App.
 */
public class App {

  /**
   * Metodo main. opa
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a quantidade de atividades para cadastrar: ");
    int activityCount = Integer.parseInt(scanner.nextLine());

    int totalScore = 0;
    int totalWeight = 0;

    for (int i = 1; i <= activityCount; i++) {
      System.out.print("Digite o nome da atividade " + i + ": ");
      String activityName = scanner.nextLine();

      System.out.print("Digite o peso da atividade " + i + ": ");
      int activityWeight = Integer.parseInt(scanner.nextLine());

      System.out.print("Digite a nota obtida para " + activityName + ": ");
      int activityScore = Integer.parseInt(scanner.nextLine());
    }
    }
  }
}