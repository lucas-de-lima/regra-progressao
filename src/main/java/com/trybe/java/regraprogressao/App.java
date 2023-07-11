package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
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

      totalScore += activityScore * activityWeight;
      totalWeight += activityWeight;
    }
    double finalScore = (double) totalScore / totalWeight;

    if (finalScore >= 85) {
      System.out.print("Parabéns! Você alcançou " + finalScore + "%! E temos o prazer "
          + "de informar que você obteve aprovação!");
    } else {
      System.out.print("Lamentamos informar que, "
          + "com base na sua pontuação alcançada neste período, "
          + finalScore + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }

  }
}