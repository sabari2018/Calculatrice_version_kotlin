package com.example.calculatrice_version_kotlin

object Operateur{

         fun addition(valOne: Int, valTwo: Int) = valOne + valTwo
         fun substration(valOne: Int, valTwo: Int) = valOne - valTwo
         fun multiply(valOne: Int, valTwo: Int) = valOne * valTwo
         @Throws(ArithmeticException::class) fun division(valOne: Int, valTwo: Int) = valOne / valTwo
         @Throws(ArithmeticException::class) fun modulo(valOne: Int, valTwo: Int) = valOne % valTwo

        fun calcule(operator: String, valOne: Int, valTwo: Int): Int {

            var result:Int = 0;

            when (operator){
                "+" -> result = addition(valOne,valTwo)
                "-" -> result = substration(valOne,valTwo)
                "*" -> result = multiply(valOne,valTwo)
                "÷" -> result = division(valOne,valTwo)
                "%" -> result = modulo(valOne, valTwo)
            }
            return result;
        }

}