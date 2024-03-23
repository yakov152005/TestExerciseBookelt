import java.awt.*;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Main{

	//------------------------------------------------------------------------------
	public static void func16A(){
		System.out.println("Enter number: ");
		int num = s.nextInt();
		System.out.println("Enter digit: ");
		int digit = s.nextInt();
		indexDigitOfNumber(num,digit);
	}
	public static void indexDigitOfNumber(int num, int digit) {
		String number = String.valueOf(num);
		String oneDigit = String.valueOf(digit);

		int index = 1;
		for (int i = number.length() - 1; i > 0; i--) {
			if (oneDigit.equals(number.charAt(i) + "")) {
					System.out.print(index + " ");
			}
			index++;
		}
	}
	//------------------------------------------------------------------------------

	public static void func30A() {
		int num = 1232333;
		int digit = 3;
		int result = digitAppearInNumber(num, digit);
		System.out.println(result);
	}
	public static int digitAppearInNumber(int num, int digit){
		int countAppear = 0 ;
		String strNum = String.valueOf(num);
		String  strDigit = String.valueOf(digit);
		for (int i = 0; i < strNum.length(); i++) {
			if (strDigit.equals(strNum.charAt(i)+"")){
				countAppear++;
			}
		}
		return countAppear;
	}
	public static void func30B(){
		int[] arr = new int[3];
		int[] newArr = crateArr(arr);
		int[] result = arr(newArr);
		printArr(result);
	}
	public static void printArr(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}
	public static int[] crateArr(int[] arr){
		System.out.print("Enter " + arr.length + " numbers for arr: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int[] arr (int[] arr){
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int digit = i;
			int result = digitAppearInNumber(num,digit);
			newArr[i] = result;
		}
		return newArr;
	}
	//------------------------------------------------------------------------------
	public static void func31(){
		int [] arr = {1,4,1,7,9,3,2,9};
		int n = 5;
		int result = sumPairsEqualDigit(arr, n);
		System.out.println(result);
	}
	public static int sumPairsEqualDigit(int[] arr, int n){
		int count = 0;
		for (int i = 0; i < arr.length-1 ; i++) {
			if (arr[i] + arr[i+1] == n){
				count++;
			}
		}
		return count;
	}
	//------------------------------------------------------------------------------
	public static void func34(){
		String str = "Rivka AVI MOTI VERes SHkomo";
		int result = someWordsContainCapitalLetters(str);
		System.out.println("Number of words containing more uppercase letters than lowercase letters: " + result);
	}
	public static int someWordsContainCapitalLetters(String str) {
		int count = 0;
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int upperCaseCount = 0;
			int lowerCaseCount = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) >= 'a' && arr[i].charAt(j) <= 'z') {
					lowerCaseCount++;
				} else if (arr[i].charAt(j) >= 'A' && arr[i].charAt(j) <= 'Z') {
					upperCaseCount++;
				}
			}
			if (upperCaseCount > lowerCaseCount) {
				count++;
			}
		}
		return count;
	}
	//------------------------------------------------------------------------------
	public static void func38(){
		String str = "ayccybaxyc";
		int[] abc = abcCheck(str);
		System.out.println("a-" +abc[0] + " b-" +abc[1] + " c-" +abc[2]);
	}
	public static int[] abcCheck(String str){
		int a = 0;
		int b = 0;
		int c = 0;
		int[] abc = new int[3];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				a++;
			}
			if (str.charAt(i) == 'b') {
				b++;
			}
			if (str.charAt(i) == 'c') {
				c++;
			}
		}
			abc[0] = a;
			abc[1] = b;
			abc[2] = c;

			return abc;
	}
	//------------------------------------------------------------------------------
	public static void func39(){
		int[] arr = new int[10];
		crateArr(arr);
		int[] oddArr = oddArr(arr);
		int[] evenArr = evenArr(arr);
		System.out.println("Odd number: ");
		printArr(oddArr);
		System.out.println();
		System.out.println("Even number: ");
		printArr(evenArr);

	}
	public static int[] oddArr(int[] arr){
		int counterOdd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0){
				counterOdd ++;
			}
		}
		int[] oddArr = new int[counterOdd];
		int index = 0;
		for (int i = 0; i < arr.length  ; i++) {
			if (arr[i] % 2 == 0){
				oddArr[index] = arr[i];
				index++;
			}
		}
		return oddArr;
	}
	public static int[] evenArr(int[] arr){
		int counterEven = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1){
				counterEven ++;
			}
		}
		int[] evenArr = new int[counterEven];
		int index = 0;
		for (int i = 0; i < arr.length -1 ; i++) {
			if (arr[i] % 2 == 1){
				evenArr[index] = arr[i];
				index++;
			}
		}
		return evenArr;
	}
	//------------------------------------------------------------------------------
	public static void func40(){
		String line = "cat Dragon horse tiger dog dolphin mouse dinosaur";
		char letter = 'd';
		print_words(line,letter);
	}
	public static void print_words(String line, char letter){
		String[] str = line.split(" ");
		for (int i = 0; i <str.length; i++) {
			if (str[i].startsWith(letter +"")){
				System.out.println(str[i]);
			}
		}
	}
    //------------------------------------------------------------------------------
	public static void func41(){
		String str = "house";
		printStrTriangle(str);
	}
	public static void printStrTriangle(String str){
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i));
		}
	}
	//------------------------------------------------------------------------------
	public static void func0(){
		String str= "abcde aaabk ggggd";
		printStringWithOutCbAndReplaceCdToG(str);

	}
	public static void printStringWithOutCbAndReplaceCdToG(String str){
		String[] res = str.split(" ");
		for (int i = 0; i < res.length; i++) {
			if (!(res[i].contains('c' +"") || res[i].contains('b' +""))){
					//res[i].replaceAll(res[i], "g");
				System.out.println(res[i]);
				}
			}
		}
	//------------------------------------------------------------------------------
	public static void func21(){
		int[] grades = new int[10];
		for (int i = 0; i < grades.length; i++) {
			grades[i] = s.nextInt();
		}
		printGradesArrayOfCounters(grades);
	}
	public static void printGradesArrayOfCounters(int[] grades){
		int[] countStudent = new int[101];
		for (int i = 0; i < grades.length; i++) {
			countStudent[grades[i]]++;
			}
		for (int i = 0; i < grades.length; i++) {
			System.out.println(i + " " + grades[i]);
		}
	}
    //------------------------------------------------------------------------------
	public static void func25A() {
		System.out.println("Enter 3 numbers: ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int sum = sumOf3Numbers(num1, num2, num3);
		System.out.println(sum);
	}
	public static int sumOf3Numbers(int num1,int num2,int num3){
		return  num1+num2+num3;
	}
	public static void func25B(){
		int[] arr = {2,10,4,1,2,3};
		if(threeGoesUpSum(arr)){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	public static boolean threeGoesUpSum(int[] arr){
		boolean res = true;
		for (int i = 0; i < arr.length-5; i+=3) {
			int sum1 = arr[i] +arr[i+1] + arr[i+2];
			int sum2 = arr[i +3] + arr[i+4] +arr[i +5];
			if (!(sum2 > sum1)){
				res =false;
			}
		}
		return res;
	}
	//------------------------------------------------------------------------------
	public static void func42(){
		int[] A = {2,1,8,6,4,8,8,16,24,8};
		int x = 8;
		ifArrAContainsNumXCreatNewArrAndPrint(A,x);
	}
	public static void ifArrAContainsNumXCreatNewArrAndPrint(int[] A,int x){
		int countXInTheArrA = 0;
		String numberX = String.valueOf(x);
		for (int i = 0; i < A.length; i++) {
			String str = String.valueOf(A[i]);
			if (str.equals(numberX)){
				countXInTheArrA++;
			}
		}
		if (countXInTheArrA ==0){
			System.out.print("The number X does not exist in the array A.");
		}else {
			int[] B = new int[countXInTheArrA];
			int index = 0;
			for (int i = 0; i < A.length; i++) {
				String str = String.valueOf(A[i]);
				if (str.equals(numberX)) {
					B[index] = i;
					index++;
				}
			}
			System.out.print("In the array the positions of the element " + x + " are: ");
			for (int i = 0; i < B.length; i++) {
				System.out.print(B[i] + " ");
			}
		}
	}
	//------------------------------------------------------------------------------
	public static void func24(){
		int[] arr = new int[10];
		crateArr(arr);
		if (isItACrossoverArray(arr)){
			System.out.println("true ");
		}else {
			System.out.println("false");
		}
	}//לבדוק
	public static boolean isItACrossoverArray(int[] arr){
		boolean res = false;
		for (int i = 0; i < arr.length - 2; i+=2) {
			if (arr[i] < arr[i + 2]) {
				if (arr[i + 1] > arr[i + 3]) {
					res = true;
				}
			}
		}

		return res;
	}
	//------------------------------------------------------------------------------
	public static void func37(){
		String str = "xxxabbbcdddcxxxyyz";
		String newStr = removeIf2CharsOrMoresEquals(str);
		System.out.println(newStr);
	}
	public static String removeIf2CharsOrMoresEquals(String str) {
		String res = "";
		if (str == null || str.isEmpty()) {
			return str;
		} else {
			for (int i = 0; i < str.length(); i++) {
				char currentChar = str.charAt(i);
				if (i == 0 || currentChar != str.charAt(i - 1)) {
					if (i == str.length() - 1 || currentChar != str.charAt(i + 1)) {
						res += currentChar;
					}
				}
			}
		}
		return res;
	}
	//------------------------------------------------------------------------------
	public static void func36(){
		int[] arr = {3,4,5,8,4,7,4,6,45,12,4,13,8};
		int number = 4;
		ifArrContainsNumber(arr,number);

	}//לחזור
	public static void ifArrContainsNumber(int[] arr, int number){

		for (int i = 0; i < arr.length; i++) {

		}
	}
//------------------------------------------------------------------------------
	public static void func35(){
		int[] arr ={10,3,5,7,3,5,7,9,4,2,4,3,5,7,9,0,7,6,11,1};
		int x = 3;
		printAFirstAppearXInTheArrRange(arr,x);

	}
	public static void printAFirstAppearXInTheArrRange(int[] arr, int x){
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x){
				startIndex = i+1;
				break;
			}
		}
		for (int i = arr.length -1 ; i > 0 ; i--) {
			if (arr[i] == x){
				endIndex = i;
				break;
			}
		}
		for (int i = startIndex ; i < endIndex ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	//------------------------------------------------------------------------------
	public static void func33(){
		int[] arr = {1,2,3,4,5,6,7,8};
		sumCurrentCellAndCellAfterItInTheArr(arr);
	}
	public static void sumCurrentCellAndCellAfterItInTheArr(int [] arr){
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length-1 ; i++) {
			int sum = arr[i] + arr[i+1];
			newArr[i] = sum;
			if (i == arr.length -2){
				newArr[arr.length -1] = arr[arr.length -1] + arr[0];
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] +" ");
		}

	}
	//------------------------------------------------------------------------------
	public static void func32(){
		int[] a = {1,3,5,6,9};
		int[] b = {3,2,7,3,2};
		float[] c = avgBetweenTwoArraysAAndB(a,b);
		for(float number : c){
			System.out.print(number + " ");
		}
	}
	public static float[] avgBetweenTwoArraysAAndB(int[] a, int[] b){
		float[] c = new float[a.length];
		for (int i = 0; i < a.length; i++) {
			float avg =(float) (a[i]+b[i]) /2;
			c[i] = avg;
		}
		return c;
	}
	//------------------------------------------------------------------------------
	public static void func28A(){
		int num = 24;
		int sum = sumOfNumberDigit(num);
		System.out.println(sum);

	}
	public static int sumOfNumberDigit(int num){
		int sum = 0;
		int temp = num;
		while (temp > 0){
			sum += temp % 10;
			temp /= 10;
		}

		return sum;
	}
	public static void func28B(){
		int num = 24;
		int countDividers = evenDividers(num);
		System.out.println(countDividers);
	}
	public static int evenDividers(int num){
		int countEvenDividers = 0;
		for (int i = 2; i <= num; i++) {
			if ((num % i) == 0 && i % 2 == 0){
				countEvenDividers++;
			}
		}
		/*
		int[] evenDiv = new int[countEvenDividers];
		int index = 0;
		for (int i = 2; i <= num ; i++) {
			if (num % i == 0 && i % 2 == 0){
				evenDiv[index] = i;
				index++;
			}
		} */
		return countEvenDividers;
	}
	public static void func28C(){
		int[] arr = {24,32,36};
		boolean res = ifIsANiceArr(arr);
		if (res){
			System.out.println("Its a nice arr :)");
		}else {
			System.out.print("Its NOT");
		}
	}
	public static boolean ifIsANiceArr(int[] arr){
		boolean res = false;
		int countNiceArr = 0;
		int countNotNiceArr = 0;
		for (int i = 0; i < arr.length; i++) {
			int sumOfDigit = sumOfNumberDigit(arr[i]);
			int evenDiv = evenDividers(arr[i]);
			if (sumOfDigit == evenDiv){
				countNiceArr++;
			}else {
				countNotNiceArr++;
			}
		}
		if (countNiceArr > countNotNiceArr){
			res = true;
		}

		return res;
	}
	//------------------------------------------------------------------------------
	public static void func29(){
		int[] arr = {4,4,4,2,2,2,1,1,1,4,4,4};
		boolean res = itsATripleFormation(arr);
		if(res){
			System.out.println("Its a triple formation Arr");
		}else {
			System.out.println("Its NOT");
		}
	}
	public static boolean itsATripleFormation(int[] arr){
		boolean res = true;
		for (int i = 0; i < arr.length ; i+= 3) {
			if (arr[i] != arr[i+1]|| arr[i+1] != arr[i+2]){
				res = false;
			}
		}
		return res;
	}
	//------------------------------------------------------------------------------
	public static void func26(){
		int[] arr = {3,4,2,9,1,1,4,7};
		oddSumInConsecutivePlaces(arr);
	}
	public static void oddSumInConsecutivePlaces(int[] arr){
		for (int i = 0; i < arr.length -1 ; i++) {
			if ((arr[i] + arr[i+1]) %2 != 0){
				System.out.print(arr[i] +"," +arr[i+1] +" ");
			}
		}
	}
	//------------------------------------------------------------------------------
	public static void func27(){
		int[] arr = {4,9,2,3,8,11,12};
		if (checkEvenArr(arr) && checkOddArr(arr)){
			System.out.println("True ");
		}else {
			System.out.println("False ");
		}
	}
	public static boolean checkEvenArr(int[] arr){
		boolean res = true;
		for (int i = 0; i < arr.length ; i+=2) {
			if (arr[i] % 2 != 0){
				res = false;
			}
		}
		return  res;
	}
	public static boolean checkOddArr(int[] arr){
		boolean res = true;
		for (int i = 1; i < arr.length ; i+=2) {
			if (arr[i] % 2 != 1){
				res = false;
			}
		}
		return res;
	}
	//------------------------------------------------------------------------------
	public static void func23(){
		int[] arr ={2,8,1,5,7,3,9,4,5,1,7,3,-1};
		coupleHighestAvgInTheArr(arr);
	}
	public static void coupleHighestAvgInTheArr(int[] arr){
		float sum = 0;
		float highestSum = arr[0] + arr[1];
		for (int i = 1; i < arr.length -1; i++) {
			sum = arr[i] + arr[i+1];
			if (sum > highestSum){
				highestSum = sum;
			}
		}
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] + arr[i+1] == highestSum ){
				System.out.println("The pair of numbers whose average is the highest is: " +arr[i]+","+arr[i+1]);
			}
		}
	}
	//------------------------------------------------------------------------------
	public static void func22(){
		int[] arr = {1,2,-4,-2,-10,22,32,5};
		arrayContainsOnlyPositiveNumbers(arr);
	}
	public static void arrayContainsOnlyPositiveNumbers(int[] arr){
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0){
				counter++;
			}
		}
		int[] newArr = new int[counter];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 ){
				newArr[j] = arr[i];
				j++;
			}
		}

		System.out.print("The new arr: ");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
		System.out.println();
		System.out.println("Length of new arr: " + newArr.length);

	}
	//------------------------------------------------------------------------------
	public static void func15A(){
		int number = 232;
		int sum = sumOfNumber(number);
		System.out.println(sum);
	}
	public static int sumOfNumber(int num){
		int sum = 0;
		while (num > 0){
			sum += num %10;
			num /= 10;
		}
		return sum;
	}
	public static void func15B(){
		int num = 35;
		int sum = sumOfNumber(num);
		int counter = 0;
		for (int i = 0; i < num; i++) {
			if (sumOfNumber(i) == sum){
				System.out.print(i +" ");
				counter++;
			}
		}
		System.out.println("The amount of numbers found is: " +counter);
	}
	//------------------------------------------------------------------------------
	public static void func14(){
		calculatorMenu();
		while (true){
			int num = s.nextInt();
			if(num == 5)
				break;
			switch (num){
				case 1:{
					multiplication();
					break;
				}
				case 2:{
					div();
					break;
				}
				case 3:{
					mod();
					break;
				}
				case 4:{
					power();
					break;
				}
				default:{
					System.out.println("Wrong number selection, try again");
					break;
				}
			}
			calculatorMenu();
		}
		System.out.println("|GOOD BYE|");
	}
	public static void calculatorMenu(){
		System.out.println("|Welcome to menu|");
		System.out.println("press your choose number -- >");
		System.out.println("1. Multiplication\n2. Division\n3. Mod\n4. Power\n5. Exit");
	}
	public static int getInput(){
		System.out.println("Enter number: ");
		return s.nextInt();
	}
	public static void multiplication(){
		int num1 = getInput();
		int num2 = getInput();
		int sum = 0;
		for (int i = 1; i <= num2; i++) {
			sum += num1;
		}
		System.out.println(num1 +"*" + num2 +"= " + sum);
	}
	public static void div(){
		int num1 = getInput();//20
		int num2 = getInput();//5
		int temp = num1;
		int div = 1;
		while (temp - num2 > 0){
			div++;
			temp -= num2;
		}

		System.out.println(num1 + "/" + num2 +" = " +div);
	}
	public static void mod(){
		int num1 = getInput();
		int num2 = getInput();
		int temp = num1;
		while (num1 - num2 >= 0){
			 num1 -= num2;
		}
		System.out.println(temp +" % "+ num2 +" = " + num1);
	}
	public static void power(){
		int num1 = getInput();
		int num2 = getInput();
		int pow = num1;
		int sum = 0;
		for (int i = 0; i < (num2 -1); i++) {
			for (int j = 0; j < num1; j++) {
				sum += pow;
			}
		}
		pow = sum;
		if (num2 == 0){
			pow =1 ;
		}
		System.out.println(num1 +"^"+ num2+ "=" + pow);
	}
	//------------------------------------------------------------------------------
	public static void func17(){
		System.out.println("The number ? % 7 == 0 --- >");
		for (int i = 1; i <= 50; i++) {
			if (i % 7 == 0){
				System.out.print(i +" ");
			}
		}
	}
	//------------------------------------------------------------------------------





	public static void main(String[] args) {

	}
	public static Scanner s = new Scanner(System.in);
}