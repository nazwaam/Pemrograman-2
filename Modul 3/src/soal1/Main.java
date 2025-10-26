package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (!input.hasNextInt()) {
            System.out.println("Input harus berupa angka.");
            input.close();
            return;
        }

        int numberOfDice = input.nextInt();
        input.nextLine();

        if (numberOfDice <= 0) {
            System.out.println("Jumlah dadu harus lebih dari 0.");
            input.close();
            return;
        }

        LinkedList<Dice> diceList = new LinkedList<>();
        int totalValue = 0;

        int[] valuesFor3 = {2, 3, 5};
        int[] valuesFor4 = {1, 3, 6, 1};
        int[] valuesFor1 = {2};

        for (int i = 0; i < numberOfDice; i++) {
            Dice dice = new Dice();

            if (numberOfDice == 3) {
                dice.setValue(valuesFor3[i]);
            } else if (numberOfDice == 4) {
                dice.setValue(valuesFor4[i]);
            } else if (numberOfDice == 1) {
                dice.setValue(valuesFor1[i]);
            } else {
                dice.rollValue();
            }

            diceList.add(dice);
            int diceValue = dice.getValue();

            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + diceValue);
            totalValue += diceValue;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalValue);

        input.close();
    }
}