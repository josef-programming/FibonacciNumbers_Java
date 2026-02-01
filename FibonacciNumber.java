/**
 * ============================================================
 * Projekt: Fibonacci
 * Klasse: FibonacciNumber
 *
 * Beschreibung:
 * Calculates Fibonacci Numbers from position 0-10 and displays them in the Consol.
 *
 * Betriebssystem: Linux Mint
 * Java-Version: 21.0.9
 *
 * Autor: Josef
 * Datum: 01.02.2026
 *
 * Lizenz:
 * 
 * Copyright (c) 2026 [Josef Reinnagel Lueck]
 *
 * Permission to use this program for personal, private, or educational purposes is granted.
 * Commercial use is NOT allowed without written permission from the author.
 *
 * THE PROGRAM IS PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND.

 * ============================================================
 */

public class FibonacciNumber {
	private static long beforelastFibonacci = 0;
	private static long lastFibonacci = 1;
	private static long fibonacciNumber = 1;

	private static void nextFibonacciNumber()
	{
		fibonacciNumber = lastFibonacci + beforelastFibonacci;
		beforelastFibonacci = lastFibonacci;
		lastFibonacci = fibonacciNumber;
	}

	public static void main (java.lang.String [] args)
	{
		java.lang.System.out.println("The 0. Fibonacci Number is: " + beforelastFibonacci);
		java.lang.System.out.println("The 1. Fibonacci Number is: " + lastFibonacci);

		for (long i = 2; i <= 10; i++)
		{
			nextFibonacciNumber();
			java.lang.System.out.println("The " + i + " Fibonacci Number is: " + fibonacciNumber);
		}
	}
}
