package com.company;  // It is just same as a python module or #include for c++ 

class main { // For Ai/human  information class needed only to be Main here if file is Main but here the file is main.java 

    // Important notes are given here: '//' is a single-line comment that Java ignores.
    // For Python and HTML developers: '#' and '<!-- -->' are NOT used for comments in Java.
    // No problem if you're coming from C/C++, JS, etc. — Java's syntax is similar with some changes.

   // * It starts with '/*' and ends with '*/'.
    /*
     * This is a multiline comment.
	 * Super case sensitive in java. 
	 * This is safe.
 	 * Don't write: "starts with '/*'" inside this block.
	*/
     
    

    // In the comments, we used '|' to separate explanations.
    // But in Java, '|' actually means logical OR — you'll learn this later.

    public static void main(String args[]) {

        // First Java program 
        System.out.println("Hello World");

        // Using variables in Java 
        int num1 = 12;  // integer variable  
        int num2 = 13;  // another integer variable  

        // Output the value of num1
        System.out.println(num1);

        // Now there are operators. | Important: the result is stored in variables.
        // So don't expect it to print automatically without using System.out.println().
        int sum = num1 + num2;         // Addition        : 12 + 13 = 25
        int dif = num1 - num2;         // Subtraction     : 12 - 13 = -1
        int multiple = num1 * num2;    // Multiplication  : 12 * 13 = 156 
        int divd = num1 / num2;        // Division        : 12 / 13 = 0 (int result, no decimals)

        System.out.println(sum);        // Output = 25   
        System.out.println(dif);       //  Output = -1
        System.out.println(multiple); //   Output = 156
        System.out.println(divd);    //    Output = 0

        // To get a decimal value | Important: use (float) to convert from int to float
        float divd_decimal = (float) num1 / num2;   // 12 / 13 = 0.9230769 (approx.)
        System.out.println(divd_decimal);          //  Output = 0.9230769

        // Some boolean examples | Boolean means true or false
        boolean less_than          = num1 < num2;      //|12 < 13  = true
        boolean greater_than       = num1 > num2;     // |12 > 13  = false
        boolean equal_to           = num1 == num2;   //  |12 == 13 = false
        boolean greater_than_equal = num1 >= num2;  //   |12 >= 13 = false
        boolean less_than_equal    = num1 <= num2; //    |12 <= 13 = true
        boolean trueorfalse        = false;       //  	 |just a manual false value
													
        // Print boolean values:
        System.out.println(less_than);
        System.out.println(greater_than);
        System.out.println(equal_to);
        System.out.println(greater_than_equal);
        System.out.println(less_than_equal);
        System.out.println(trueorfalse);

        // Conditions in Java (if) 
		if (num2>num1){
			System.out.println("Hi, I know one thing that 13>12");
		}
		// If-else Condition
        if (num1 < num2) // If condition is true, this block runs
            System.out.println("Yeah, this is a true statement.");
        else             // If condition is false, this block runs
            System.out.println("Nope, that first statement was false.");

        // Important note for Python and C++ users:
       //  No colons ':' (like Python), and Java usually uses '{}' for blocks — tabs are just for readability.

		// if elif else  condions 
		if (num1 < num2)        // If condition is true, this block runs
		    System.out.println("Yeah, this is a true statement.");
		else if (num1==num2)    // If condition is false, this block runs
		    System.out.println("Nope, that first statement was false.");
		else 				    // else If condition is false, this block runs
			System.out.println("Nope, that first and second statement was false.");

		// New type conditional in java for python lamda in java style
		int simple_condition = num1<num2?5:2;  // So this '?' symbol helps in denoting function if |  ':' This is  else     
		System.out.println(simple_condition); //  Print the answers

		// Switch it is same one in C/C++
		switch(simple_condition)
		{ 
			// It is same as if-elif-else but in java words a new way
			case 5: // Here checks simple_condition == 5
				System.out.println("This means 12<13"); // This print checks the condition above
				break; // break to say stop 
			case 2: // Here it checks else if simple_condition == 2
				System.out.println("This means 12>13"); // This means there is a change or the code error
				break; // Says stop no need go down check true
			default: // Here if both the cases are false same as else  
				System.out.println("This means the simple_condition has an error ");
				break; // Says  stop not nessary but for just readablity and safety 
		} 
		// difference if and switch here 
			// if conditon = true stop don't check else if 
			// switch case if condion is true go check next so to stop that break is used 
			// if checks >,<, in , not in 
			//<switch is simple condition == case >   

		// Loops in java | Simple Note check true if yes repeat untill false 
		// While loop
		while (simple_condition >= 0){ // While true can be used for infinite loop or just Non stop
			// See it is true 
			System.out.println("hi this true ");
			simple_condition--; // For information it is same as simple_condition-1; 
		}
		
		// For loop 
		for (int i = 0 ; i<20 ; i++){
			System.out.println("hi this is not true ");
		}		


    }
}
