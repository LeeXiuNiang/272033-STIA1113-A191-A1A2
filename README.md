# Student Info
Matric: 272033  
Name: Lee Xiu Niang

# Introduction
In this assignment, I am going to investigate a car loan then make a JAVA code to discover the monthly repayment that should be made and the amount of principal, interest, and balance of each year.  A car loan is an amount of money taken from a lending provider to purchase a new or used car.  An algorithm such as pseudocode and flow chart should be done before solving the problems by coding after identifying the problem.  To make analysis, car price, down payment, loan period and interest rate are required to be known.  By using the data given under certain specific conditions, the data would be processed, and analysis may be done then the payment schedule can be shown.  This assignment tests me about my understanding of the application (loop, if statements, array…...) in coding and programming.

# Pseudocode

    Start
	    Output "Car Price (RM): "
	    Input car price
	    Loop the input of car price if car price is less than RM30,000
	    Output "Down Payment (RM): "
	    Input down payment
	    Loop the input of down payment if down payment is negative number
	    Output "Loan Period (Years): "
	    Input loan period
	    Loop the input of loan period if loan period is 0 and below or not in the range of 5 to 9
	    Output "Interest rate (%): "
	    Input interest rate
	    Loop the input of interest rate if interest rate is 0 and below or not in the range of 3 to 7
        Calculate total interest = (car price - down payment) * interest rate / 100 * loan period
        Calculate monthly repayment = (car price - down payment + total interest) / (loan period * 12)
        Output monthly repayment
	    Loop depending on loan period
           Calculate years = n th year
           Calculate principal = monthly repayment * 12 * n th year
           Calculate interest = total interest/loan period * n th year
           Calculate balance = monthly repayment * 12 * (loan period - n th year)  
           years, principal, interest, balance is stored in array respectively  
           Output years, principal, interest, balance  
     End


# Flow chart
![Flow_chart](/Flow_Chart.png)

# Screenshot of the output
![Outout](/Output.png)
