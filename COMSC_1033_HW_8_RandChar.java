/** @author Michael Dobrinski - michael.git2015@gmail.com
 * COMSC 1033 Section 1411
 * Instructor: Dr. Evert
 * 03 November 2015
 */

public class COMSC_1033_HW_8_RandChar {

	public static void main(String[] args) {
		int[] letterCount = new int[27];	// array to count the occurrences
                                      // of each letter. index 0 - 26

		for (int k = 0; k<=26; k++){ // Fill the array with zeros just in case.
			letterCount[k]=0;
		}
		char randomChar; // Hold the randomly generated character
/*
 * This for loop generates a number of random characters and counts the number
 * of times each character is generated storing the count in the array
 * letterCount. The total number of generated characters is stored in
 * array element 26 (the last element in the array).
 */

		for (int i = 1; i <= 26; i++){
			letterCount[26]++;								// Total character count
			randomChar = (char)MyRandoms.randomNumber(65, 90);
				System.out.print(randomChar + " ");
				if (i%40 == 0){
					System.out.println();
				}
				switch (randomChar){
					case 'A': letterCount[0]++;
						break;
					case 'B': letterCount[1]++;
						break;
					case 'C': letterCount[2]++;
						break;
					case 'D': letterCount[3]++;
						break;
					case 'E': letterCount[4]++;
						break;
					case 'F': letterCount[5]++;
						break;
					case 'G': letterCount[6]++;
						break;
					case 'H': letterCount[7]++;
						break;
					case 'I': letterCount[8]++;
						break;
					case 'J': letterCount[9]++;
						break;
					case 'K': letterCount[10]++;
						break;
					case 'L': letterCount[11]++;
						break;
					case 'M': letterCount[12]++;
						break;
					case 'N': letterCount[13]++;
						break;
					case 'O': letterCount[14]++;
						break;
					case 'P': letterCount[15]++;
						break;
					case 'Q': letterCount[16]++;
						break;
					case 'R': letterCount[17]++;
						break;
					case 'S': letterCount[18]++;
						break;
					case 'T': letterCount[19]++;
						break;
					case 'U': letterCount[20]++;
						break;
					case 'V': letterCount[21]++;
						break;
					case 'W': letterCount[22]++;
						break;
					case 'X': letterCount[23]++;
						break;
					case 'Y': letterCount[24]++;
						break;
					case 'Z': letterCount[25]++;
						break;
				} // End of switch

		} // End of for loop

		System.out.print("\n*************************************************"
				+ "*******************************\n");
		System.out.println("The number of each character that was generated is:");
/*
 * This for loop outputs the array containing the character totals.
 */
		for (int k=1; k<=26; k++){
			System.out.print((char)(k+64)+"'s = "+letterCount[k-1]+"\t");
			if(k%5==0){
				System.out.println();
			}
		}
		System.out.print("\nThe total number of characters generated is: "
				+ letterCount[26]); // Output the total number of characters
	} //***************** END OF MAIN **********************

} // ********** End of COMSC_1033_HW_8_RandChar class **********
