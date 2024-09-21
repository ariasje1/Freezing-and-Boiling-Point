# Freezing and Boiling Point Checker

## Description
This Java program allows users to input a temperature in Fahrenheit and checks whether various substances (ethyl alcohol, mercury, oxygen, water) will freeze, boil, or remain unchanged at that temperature. It uses a graphical user interface (`JOptionPane`) for easy interaction and provides results for multiple temperature inputs.

## Features
- Takes user input through a dialog box.
- Checks the state (freeze, boil, no change) of four substances at the entered temperature.
- Loops to allow multiple temperature checks until the user chooses to exit.

## Substances and Temperature Ranges
| Substance      | Freezing Point (°F) | Boiling Point (°F) |
| -------------- | ------------------- | ------------------ |
| Ethyl Alcohol  | -173                | 172                |
| Mercury        | -38                 | 676                |
| Oxygen         | -362                | -306               |
| Water          | 32                  | 212                |

## How It Works
1. The user is prompted to enter a temperature in Fahrenheit.
2. The program evaluates whether each substance freezes, boils, or remains unchanged at that temperature.
3. Results are displayed via a graphical message dialog.
4. The user can choose to check another temperature or exit the program.
