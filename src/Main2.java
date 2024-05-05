import javax.swing.*;

public class Main2 {

    //To convert Celsius to Fahrenheit: 𝐹 = 9/5 × 𝐶 + 32
    static void fromCelsius() {
        String input = JOptionPane.showInputDialog("Enter the temp in Celsius: ");
        double celsius;
        while (true) {
            try{
                celsius = Double.parseDouble(input);
                break;
            } catch (Exception e){
                input = JOptionPane.showInputDialog("Invalid Input try again.\n" +
                        "Enter the temp in Celsius: ");
            }
        }

        //𝐹 = 9/5 × 𝐶 + 32
        double fahrenheit = 9.0/5 * celsius + 32;

        JOptionPane.showMessageDialog(null,input + " degrees celsius = " +
                fahrenheit + " degrees fahrenheit");
    }

    //• To convert Fahrenheit to Celsius: 𝐶 = 5/9 × (𝐹 − 32)
    static void fromFahrenheit() {
        String input = JOptionPane.showInputDialog("Enter the temp in Fahrenheit: ");
        double fahrenheit;
        while (true) {
            try{
                fahrenheit = Double.parseDouble(input);
                break;
            } catch (Exception e){
                input = JOptionPane.showInputDialog("Invalid Input try again.\n" +
                        "Enter the temp in Fahrenheit: ");
            }
        }

        //𝐶 = 5/9 × (𝐹 − 32)
        double celsius = 5.0/9 * (fahrenheit - 32);

        JOptionPane.showMessageDialog(null,input + " degrees fahrenheit = " +
                celsius + " degrees celsius");
    }



    public static void main(String[] args) {

        boolean exit = false;
        while (!exit) {
            String input = JOptionPane.showInputDialog("Convert from:\n" +
                    "A - Celsius\n" +
                    "B - Fahrenheit\n" +
                    "E - Exit\n");
            switch (input) {
                case "A","a" : {
                    fromCelsius();
                    break;
                }
                case "B","b" : {
                    fromFahrenheit();
                    break;
                }
                case "E","e" : {
                    exit = true;
                    break;
                }
                default: {
                    input = JOptionPane.showInputDialog("Invalid Input try again.\n" +
                            "Convert from:\n" +
                            "A - Celsius\n" +
                            "B - Fahrenheit\n" +
                            "E - Exit\n");
                }
            }
        }


    }
}
