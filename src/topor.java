import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class topor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        JOptionPane.showMessageDialog(null, "Игра 'УГАДАЙ ТОПОР 9'");
        JOptionPane.showMessageDialog(null, "Ваша цель, угадать топор три " +
                "\nраза подряд, если этого не произойдёт, то смэрть");

        int prav = 0;
        int popytka = 10;

        while (prav < 3) {


            int x = rand.nextInt(2)+1;
            int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Количество попыток: "+ popytka +"\n  _,-,     _,-,      _,-,\nT_ 1|   T_ 2|   T_ 3|\n||`-'    ||`-'    ||`-'\n||         ||        ||\n||         ||        ||"));

            if (y == x) {
                prav+=1;
                JOptionPane.showMessageDialog(null, "Вы выбрали верный топор! Осталось ещё " + (3 - prav));

            } else {
                JOptionPane.showMessageDialog(null, "Вы выбрали не верный топор! Количество правильных топоров сброшено");
                prav = 0;
                popytka-=1;
            }
            if (popytka == 0) {
                JOptionPane.showMessageDialog(null, "Попыток больше не осталось! Вы проиграли в топор!");
                break;
            }
            if (prav == 3) {
                JOptionPane.showMessageDialog(null, "Поздровляем! Вы выиграли в топор!");
            }
        }


    }
}
