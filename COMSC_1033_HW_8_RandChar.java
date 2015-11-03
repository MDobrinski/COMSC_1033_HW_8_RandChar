/** @author Michael Dobrinski - michael.git2015@gmail.com
 * COMSC 1033 Section 1411
 * Instructor: Dr. Evert
 * 03 November 2015
 */

public class COMSC_1033_HW_8_RandChar {

	public static void main(String[] args) {
		int[] letterCount = new int[29];	// array to count the occurrences
																			// of each letter. index 0 - 28
		letterCount[27]=0;	// set total of low errors to 0
		letterCount[28]=0;	// set total of high errors to 0
		for (int k = 0; k<=26; k++){
			letterCount[k]=0;
		}
		char randomChar;

		for (int i = 1; i <= 2000000; i++){
			letterCount[26]++;
			randomChar = (char)MyRandoms.randomNumber(65, 90);
			if ( randomChar >='A' && randomChar <='Z'){
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
				}
			}
			else if (randomChar < 'A'){
				letterCount[27]++;		// increment low error count
			}
			else {
				letterCount[28]++;		// increment high error count
			}
		} // end of for loop



	} //***************** END OF MAIN **********************

} // ********** End of COMSC_1033_HW_8_RandChar class **********
