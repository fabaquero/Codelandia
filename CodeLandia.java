import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CodeLandia {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CodeLandia");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JLabel sloganLabel = new JLabel("Dónde la diversión y el aprendizaje se unen");
        sloganLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(sloganLabel, BorderLayout.CENTER);

        JButton startButton = new JButton("Empezar ahora");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String playerName = JOptionPane.showInputDialog(frame, "Ingresa tu nombre:");
                String playerAgeStr;
                int playerAge = 0;

                while (true) {
                    playerAgeStr = JOptionPane.showInputDialog(frame, "Ingresa tu edad:");
                    try {
                        playerAge = Integer.parseInt(playerAgeStr);
                        break;
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "La edad debe ser un valor numérico válido. Inténtalo de nuevo.");
                    }
                }

                JOptionPane.showMessageDialog(frame, "¡Gracias por unirte a nuestro juego de matemáticas!"
                        + "\n¡Diviértete y aprende mientras juegas!");

                // Mostrar opciones de juego
                String[] options = {
                        "Números Mayores o Menores",
                        "Juego de sumas",
                        "Juego de restas",
                        "Juego con figuras geométricas",
                        "Juego de multiplicar",
                        "Juego de dividir"
                };

                int selectedOption = JOptionPane.showOptionDialog(frame, "Elige un juego:", "Opciones de juego",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

                // Realizar acciones según la opción seleccionada
                switch (selectedOption) {
                    case 0:
                        jugarNumerosMayoresMenores();
                        break;
                    case 1:
                        jugarJuegoDeSumas();
                        break;
                    case 2:
                        jugarJuegoDeRestas();
                        break;
                    case 3:
                        jugarJuegoDeFigurasGeometricas();
                        break;
                    case 4:
                        jugarJuegoDeMultiplicar();
                        break;
                    case 5:
                        jugarJuegoDeDividir();
                        break;
                    default:
                        break;
                }
            }
        });
        frame.add(startButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void jugarNumerosMayoresMenores() {
        Random random = new Random();
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        int number3 = random.nextInt(100);

        String question = "¿El número " + number1 + " es mayor o menor que los números " + number2 + " y " + number3 + "?";

        int correctAnswer;
        if (number1 > number2 && number1 > number3) {
            correctAnswer = 0; // Mayor
        } else {
            correctAnswer = 1; // Menor
        }

        String[] options = {"Mayor", "Menor"};

        int selectedOption = JOptionPane.showOptionDialog(null, question,
                "Números Mayores o Menores",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);

        String resultMessage;
        if (selectedOption == correctAnswer) {
            resultMessage = "¡Respuesta correcta!";
        } else {
            resultMessage = "Respuesta incorrecta. El número " + number1 + " no es " + options[correctAnswer] + " que los números " + number2 + " y " + number3 + ".";
        }

        JOptionPane.showMessageDialog(null, resultMessage);

        // Volver al menú de selección de juegos
        String[] menuOptions = {
                "Números Mayores o Menores",
                "Juego de sumas",
                "Juego de restas",
                "Juego con figuras geométricas",
                "Juego de multiplicar",
                "Juego de dividir"
        };

        int selectedMenuOption = JOptionPane.showOptionDialog(null, "Elige un juego:", "Opciones de juego",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOptions, menuOptions[0]);

        // Realizar acciones según la opción seleccionada
        switch (selectedMenuOption) {
            case 0:
                jugarNumerosMayoresMenores();
                break;
            case 1:
                jugarJuegoDeSumas();
                break;
            case 2:
                jugarJuegoDeRestas();
                break;
            case 3:
                jugarJuegoDeFigurasGeometricas();
                break;
            case 4:
                jugarJuegoDeMultiplicar();
                break;
            case 5:
                jugarJuegoDeDividir();
                break;
            default:
                break;
        }
    }

    public static void jugarJuegoDeSumas() {
        Random random = new Random();
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);

        int playerAnswer;
        String playerAnswerStr;

        do {
            playerAnswerStr = JOptionPane.showInputDialog(null, "¿Cuánto es " + number1 + " + " + number2 + "?");
            try {
                playerAnswer = Integer.parseInt(playerAnswerStr);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Respuesta no válida. Inténtalo de nuevo.");
            }
        } while (true);

        int correctAnswer = number1 + number2;

        if (playerAnswer == correctAnswer) {
            JOptionPane.showMessageDialog(null, "¡Respuesta correcta!");
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta. La respuesta correcta es " + correctAnswer + ".");
        }

        // Volver al menú de selección de juegos
        String[] menuOptions = {
                "Números Mayores o Menores",
                "Juego de sumas",
                "Juego de restas",
                "Juego con figuras geométricas",
                "Juego de multiplicar",
                "Juego de dividir"
        };

        int selectedMenuOption = JOptionPane.showOptionDialog(null, "Elige un juego:", "Opciones de juego",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOptions, menuOptions[0]);

        // Realizar acciones según la opción seleccionada
        switch (selectedMenuOption) {
            case 0:
                jugarNumerosMayoresMenores();
                break;
            case 1:
                jugarJuegoDeSumas();
                break;
            case 2:
                jugarJuegoDeRestas();
                break;
            case 3:
                jugarJuegoDeFigurasGeometricas();
                break;
            case 4:
                jugarJuegoDeMultiplicar();
                break;
            case 5:
                jugarJuegoDeDividir();
                break;
            default:
                break;
        }
    }

    public static void jugarJuegoDeRestas() {
        Random random = new Random();
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);

        int playerAnswer;
        String playerAnswerStr;

        do {
            playerAnswerStr = JOptionPane.showInputDialog(null, "¿Cuánto es " + number1 + " - " + number2 + "?");
            try {
                playerAnswer = Integer.parseInt(playerAnswerStr);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Respuesta no válida. Inténtalo de nuevo.");
            }
        } while (true);

        int correctAnswer = number1 - number2;

        if (playerAnswer == correctAnswer) {
            JOptionPane.showMessageDialog(null, "¡Respuesta correcta!");
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta. La respuesta correcta es " + correctAnswer + ".");
        }

        // Volver al menú de selección de juegos
        String[] menuOptions = {
                "Números Mayores o Menores",
                "Juego de sumas",
                "Juego de restas",
                "Juego con figuras geométricas",
                "Juego de multiplicar",
                "Juego de dividir"
        };

        int selectedMenuOption = JOptionPane.showOptionDialog(null, "Elige un juego:", "Opciones de juego",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOptions, menuOptions[0]);

        // Realizar acciones según la opción seleccionada
        switch (selectedMenuOption) {
            case 0:
                jugarNumerosMayoresMenores();
                break;
            case 1:
                jugarJuegoDeSumas();
                break;
            case 2:
                jugarJuegoDeRestas();
                break;
            case 3:
                jugarJuegoDeFigurasGeometricas();
                break;
            case 4:
                jugarJuegoDeMultiplicar();
                break;
            case 5:
                jugarJuegoDeDividir();
                break;
            default:
                break;
        }
    }

    public static void jugarJuegoDeFigurasGeometricas() {
        String[] shapes = {"Triángulo", "Cuadrado", "Rectángulo", "Círculo"};
        Random random = new Random();
        int randomIndex = random.nextInt(shapes.length);
        String selectedShape = shapes[randomIndex];

        int correctAnswer = 0;

        switch (selectedShape) {
            case "Triángulo":
                int numSides = 3;
                correctAnswer = numSides;
                break;
            case "Cuadrado":
                numSides = 4;
                correctAnswer = numSides;
                break;
            case "Rectángulo":
                numSides = 4;
                correctAnswer = numSides;
                break;
            case "Círculo":
                int numArcs = 0;
                correctAnswer = numArcs;
                break;
            default:
                break;
        }

        int playerAnswer;
        String playerAnswerStr;

        do {
            playerAnswerStr = JOptionPane.showInputDialog(null, "¿Cuántos lados tiene un(a) " + selectedShape + "?");
            try {
                playerAnswer = Integer.parseInt(playerAnswerStr);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Respuesta no válida. Inténtalo de nuevo.");
            }
        } while (true);

        String resultMessage;
        if (playerAnswer == correctAnswer) {
            resultMessage = "¡Respuesta correcta!";
        } else {
            resultMessage = "Respuesta incorrecta. Un(a) " + selectedShape + " tiene " + correctAnswer + " lados.";
        }

        JOptionPane.showMessageDialog(null, resultMessage);

        // Volver al menú de selección de juegos
        String[] menuOptions = {
                "Números Mayores o Menores",
                "Juego de sumas",
                "Juego de restas",
                "Juego con figuras geométricas",
                "Juego de multiplicar",
                "Juego de dividir"
        };

        int selectedMenuOption = JOptionPane.showOptionDialog(null, "Elige un juego:", "Opciones de juego",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOptions, menuOptions[0]);

        // Realizar acciones según la opción seleccionada
        switch (selectedMenuOption) {
            case 0:
                jugarNumerosMayoresMenores();
                break;
            case 1:
                jugarJuegoDeSumas();
                break;
            case 2:
                jugarJuegoDeRestas();
                break;
            case 3:
                jugarJuegoDeFigurasGeometricas();
                break;
            case 4:
                jugarJuegoDeMultiplicar();
                break;
            case 5:
                jugarJuegoDeDividir();
                break;
            default:
                break;
        }
    }

    public static void jugarJuegoDeMultiplicar() {
        Random random = new Random();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);

        int playerAnswer;
        String playerAnswerStr;

        do {
            playerAnswerStr = JOptionPane.showInputDialog(null, "¿Cuánto es " + number1 + " x " + number2 + "?");
            try {
                playerAnswer = Integer.parseInt(playerAnswerStr);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Respuesta no válida. Inténtalo de nuevo.");
            }
        } while (true);

        int correctAnswer = number1 * number2;

        if (playerAnswer == correctAnswer) {
            JOptionPane.showMessageDialog(null, "¡Respuesta correcta!");
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta. La respuesta correcta es " + correctAnswer + ".");
        }

        // Volver al menú de selección de juegos
        String[] menuOptions = {
                "Números Mayores o Menores",
                "Juego de sumas",
                "Juego de restas",
                "Juego con figuras geométricas",
                "Juego de multiplicar",
                "Juego de dividir"
        };

        int selectedMenuOption = JOptionPane.showOptionDialog(null, "Elige un juego:", "Opciones de juego",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOptions, menuOptions[0]);

        // Realizar acciones según la opción seleccionada
        switch (selectedMenuOption) {
            case 0:
                jugarNumerosMayoresMenores();
                break;
            case 1:
                jugarJuegoDeSumas();
                break;
            case 2:
                jugarJuegoDeRestas();
                break;
            case 3:
                jugarJuegoDeFigurasGeometricas();
                break;
            case 4:
                jugarJuegoDeMultiplicar();
                break;
            case 5:
                jugarJuegoDeDividir();
                break;
            default:
                break;
        }
    }

    public static void jugarJuegoDeDividir() {
        Random random = new Random();
        int number1= random.nextInt(10);
        int number2 = random.nextInt(10);

        int playerAnswer;
        String playerAnswerStr;

        do {
            playerAnswerStr = JOptionPane.showInputDialog(null, "¿Cuánto es " + number1 + " ÷ " + number2 + "?");
            try {
                playerAnswer = Integer.parseInt(playerAnswerStr);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Respuesta no válida. Inténtalo de nuevo.");
            }
        } while (true);

        int correctAnswer = number1 / number2;

        if (playerAnswer == correctAnswer) {
            JOptionPane.showMessageDialog(null, "¡Respuesta correcta!");
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta. La respuesta correcta es " + correctAnswer + ".");
        }

        // Volver al menú de selección de juegos
        String[] menuOptions = {
                "Números Mayores o Menores",
                "Juego de sumas",
                "Juego de restas",
                "Juego con figuras geométricas",
                "Juego de multiplicar",
                "Juego de dividir"
        };

        int selectedMenuOption = JOptionPane.showOptionDialog(null, "Elige un juego:", "Opciones de juego",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOptions, menuOptions[0]);

        // Realizar acciones según la opción seleccionada
        switch (selectedMenuOption) {
            case 0:
                jugarNumerosMayoresMenores();
                break;
            case 1:
                jugarJuegoDeSumas();
                break;
            case 2:
                jugarJuegoDeRestas();
                break;
            case 3:
                jugarJuegoDeFigurasGeometricas();
                break;
            case 4:
                jugarJuegoDeMultiplicar();
                break;
            case 5:
                jugarJuegoDeDividir();
                break;
            default:
                break;
        }
    }
}

