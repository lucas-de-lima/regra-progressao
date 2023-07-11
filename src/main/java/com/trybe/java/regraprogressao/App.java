package com.trybe.java.regraprogressao;

import java.util.Scanner;

// SUGESTÃO DE USO DO SLF4J
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

/**
 * App.
 */
public class App {
  // SUGESTÃO DE USO DO SLF4J (é melhor usar um logger do que o System.out.println()
  // private static final Logger logger = LoggerFactory.getLogger(App.class);


  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Digite a quantidade de atividades para cadastrar: ");
      int activityCount = Integer.parseInt(scanner.nextLine());

      int totalScore = 0;
      int totalWeight = 0;

      for (int i = 1; i <= activityCount; i++) {
        System.out.print("Digite o nome da atividade " + i + ": "); 
        // o ideal seria = logger.info("Digite o nome da atividade {}: ", i);
        // Em vez de usar a concatenação de strings com o operador +,
        // é recomendado usar especificadores
        // de formato para construir a string. Essa abordagem é mais legível 
        // e ajuda a evitar erros de formatação.
        String activityName = scanner.nextLine();

        System.out.print("Digite o peso da atividade " + i + ": "); 
        int activityWeight = Integer.parseInt(scanner.nextLine());  
        
        System.out.print("Digite a nota obtida para " + activityName + ": ");
        int activityScore = Integer.parseInt(scanner.nextLine());

        totalScore += activityScore * activityWeight;
        totalWeight += activityWeight;
      }
      double finalScore;
      if (totalWeight != 0) {
        finalScore = (double) totalScore / totalWeight;
      } else {
        System.out.print("A pontuação final não pode ser calculada, pois o peso total é zero.");
        finalScore = 0; // Ou outra ação adequada
      }

      if (finalScore >= 85) {
        System.out.print("Parabéns! Você alcançou " + finalScore + "%! E temos o prazer "
            + "de informar que você obteve aprovação!");
      } else {
        System.out.print("Lamentamos informar que, "
            + "com base na sua pontuação alcançada neste período, "
            + finalScore + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
      }
    } catch (NumberFormatException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Fim do programa.");
    }

  }
}