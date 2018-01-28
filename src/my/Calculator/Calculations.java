/*
 * Copyright (C) 2018 Shubhzz96
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package my.Calculator;

/**
 *
 * @author Shubhzz96
 */
class Calculations{
    private double firstNumber;
    private double secondNumber;
    private double result;

    public Calculations() {
        firstNumber = 0.0;
        secondNumber = 0.0;
        result = 0.0;
    }
    
    void getFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    
    void getSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    
    void reset(double firstNumber, double secondNumber, double result){
        this.firstNumber = 0.0;
        this.secondNumber = 0.0;
        this.result = 0.0;
    }
    
    double calculate(String operator){
        switch(operator){
            case "+": result = firstNumber + secondNumber;
                break;
            
            case "-": result = firstNumber - secondNumber;
                break;
            
            case "*": result = firstNumber * secondNumber;
                break;
            
            case "/": try {
                    result = firstNumber / secondNumber;
                } catch (ArithmeticException e) {
                    System.out.println("Can't divide integer by 0");
                }
                break;
        }
        
        return result;
    }
}
