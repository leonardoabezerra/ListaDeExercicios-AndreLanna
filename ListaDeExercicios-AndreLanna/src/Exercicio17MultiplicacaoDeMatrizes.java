import javax.swing.JOptionPane;

public class Exercicio17MultiplicacaoDeMatrizes {
    public static void main(String[] args) {
        String resultado = new String();
        resultado = "";
        int linhas, colunas, linhas2, colunas2;

          // Obter dados das duas matrizes
        String strlinhas = JOptionPane.showInputDialog("Digite o número de linhas da primeira matriz");
        linhas = Integer.parseInt(strlinhas);

        String strcolunas = JOptionPane.showInputDialog("Digite o número de colunas da primeira matriz");
        colunas = Integer.parseInt(strcolunas);

        int[][] matriz1 = new int[linhas][colunas];

        JOptionPane.showMessageDialog(null, "Digite a seguir os elementos da PRIMEIRA matriz");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                String temp = JOptionPane.showInputDialog("Digite o " + (j+1) + " elemento da linha " + (i+1));
                matriz1[i][j] = Integer.parseInt(temp);

            }
        }
        
        String strlinhas2 = JOptionPane.showInputDialog("Digite o número de linhas da segunda matriz");
        linhas2 = Integer.parseInt(strlinhas2);

        String strcolunas2 = JOptionPane.showInputDialog("Digite o número de colunas da segunda matriz");
        colunas2 = Integer.parseInt(strcolunas2);

        int[][] matriz2 = new int[linhas2][colunas2];

        JOptionPane.showMessageDialog(null, "Digite a seguir os elementos da SEGUNDA matriz");

        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                String temp = JOptionPane.showInputDialog("Digite o " + (j+1) + " elemento da linha " + (i+1));
                matriz2[i][j] = Integer.parseInt(temp);

            }
        }

        int[][] matrizmult = new int[linhas][colunas2];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas2; j++) {
                matrizmult[i][j] = 0;
            }
        }

          // Executar a multiplicação das matrizes
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas2; j++) {
                for (int y = 0; y < colunas; y++) {
                    matrizmult[i][j] += matriz1[i][y] * matriz2[y][j]; 
                }
            }   
        }

          // Organizar os resultados
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas2; j++) {
                resultado += matrizmult[i][j] + " ";
            }
            resultado += "\n";
        }

        JOptionPane.showMessageDialog(null, "A multiplicação das matrizes é:\n" + resultado);
        

      
    }
}
