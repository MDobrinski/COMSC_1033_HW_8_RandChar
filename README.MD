# COMSC_1033_HW_8_RandChar

## Introduction
This is part one of two for homework assignment number 8. This part of the
assignment is to write a program to solve problem 4.16 on page 154 of the
Introduction to JAVA Programming Comprehensive Version 10th Edition, by Y.
Daniel Liang published by Pearson. The problem is to write a program that 
displays a random uppercase letter using the Math.*random()* method.

The program that I wrote generates a number of random uppercase characters and
counts the number of times that each character occurs displaying the totals for
each character at the end of the output along with the total number of
characters generated. The outline for the code solution is below.

## Project Outline
* 	Create the program _class_ and _main_ method
* 	Declare the variables for the program
	* 	Integer array with 27 elements - *letterCount*
	* 	Character variable - *randomChar*
* 	Initialize the array to all zeros
* 	Loop to control the generation of characters
	* 	Generate a random integer between 65 and 90 inclusive
	* 	Cast the integer to a character
	* 	Output the character with a space between each one
	* 	Print a newline character every 40 characters
	* 	Count the occurrence of each character with a switch construct
* 	Output the number of times each letter is generated
* 	Output the total number of letters generated
* 	End program

## References & Literature
*	Reference 1 Book: Introduction to JAVA Programming Comprehensive Version 10th 
Edition, by Y. Daniel Liang published by Pearson.
	*	This is the text book used for the class.
*	Reference 2 Paper: MARKDOWN from packetlife.net by Jeremy Stretch v2.0
	*	This is the sheet given as our reference for using MARKDOWN.

The program uses the *randomNumber(min, max)* method from the MyRandoms class and the
*randomNumber(min, max)* method in turn uses the Math.*random()* method. MyRandoms.
*randomNumber(min, max)* generates an integer value between the integer values *min* and
*max* inclusive. Other methods used in the program are System.*out.print()* methods.

The heart of the program is a for loop that contains the code to get the random integer
between 65 and 90 because the ASCII decimal value for A is 65 and the ASCII decimal 
value for Z is 90. Once the random integer is obtained it is cast to a character
and stored in the character variable _randomChar_. The _randomChar_ variable is
output to the console followed by a space. When the number of characters output
reaches forty (40) then a newline character is output moving the output to the next
line.

A switch case construct is used to determine which element of the _letterCount_ array
is incremented based on the value of _randomChar_. Element number zero [0] corresponds
to the character 'A' and element twenty-five [25] corresponds to the character 'Z'.

When the for loop reaches the programmed number of iterations it exits and a row
of asterisks is printed to separate the characters from the character totals. The
Java code listing for the program is below.

## Java Source Code
``` java
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

		for (int i = 1; i <= 20000000; i++){
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
```

The program was run twice. Once to generate twenty-six (26) characters and once to
generate twenty million (20,000,000) characters. The console output for each run is
included below. Due to the length of the output only a partial listing of the 
output is given on the run of twenty million characters.

## 26 Character Console Output
```
H M I Y M E M D O D U W O O S O C V G R I Q A E H Y 
********************************************************************************
The number of each character that was generated is:
A's = 1	B's = 0	C's = 1	D's = 2	E's = 2	
F's = 0	G's = 1	H's = 2	I's = 2	J's = 0	
K's = 0	L's = 0	M's = 3	N's = 0	O's = 4	
P's = 0	Q's = 1	R's = 1	S's = 1	T's = 0	
U's = 1	V's = 1	W's = 1	X's = 0	Y's = 2	
Z's = 0	
The total number of characters generated is: 26

```

## 20,000,000 Character Console Output
```
W V D S W B K V D O C L Z B W H W L T M K N D Z L A X Q O P I C R V M U S N M P 
F A V N C Z O Z E P V A P E N W Z Q D K P N N O Z L K O O Z C U Y A X E G J V C 
Z Y Z W N G X S P W R Y R H L R C U R J I Z P E L O G L E V A U I B M Z V T L G 
S N L R U H M T X P F I L M H A A D X E B S M G X S R A X P K R Z W C P M G J A 
Z W G W M M G T D A E A F B C R G P P Y R H Z R J U G J X O N P V S X E Z R F Y 
W T G P V T U W B I I T O O O H R O H L S J V I O M T F Q F D L O P X B I C I X 
B O Z J V P W H M K G X L F L Q T D A V N A D X S V R O S N J F W S W E W D W T 
C R Y E A C E M K Y P D X D Z I E P A L I M X U G P Q F F D K V S H K B P H U X 
K G P F X H K X M N Z K R S R O P L D G F M P T B B O D P W T N A R F X W Z Y N 
O K W U S R C H O B Z O O Y V G F R D I B F D K V L L A K M Y W M C H O C L I L 
C M Y J S R A X M S U R D X Z G T C O T J I U E X S Q X E J N M Q S D D M O R D 
T X O O X T N S I F J G K Z L H D A H U Q P K H P O O Q E A V F B V P U L F Z W 
L T E M H R E Q B G T F S H G A B A F U W E U J G O X L F Y N I C E N P E P P W 
W Z M Y W O S A P V W V T Z H S D W R M K T M E L G Q Y I J Y G F F F M E H H X 
U A Q B Z T Y O S L R B Z K T K F Z R D V N N V T Y N I I M Y K L E P M S B R Z 
P O S O O K L M F L R O V Q M P Q W R H A N U T I L K U E S W P Z S Y K U C Y F 
E M K U W J W S M E N I C E G V G E T S I B I P L X P V Z Z B X A F Q W M V W J 
M X X K J H H K E Q J M O L R F K U S Y T M K Q W V O X C H G Q Y G F W O E E P 
R A V R P A C W P G R Z E K F Y Z U P C D C H Q R I B P L B B O S S K A W X B L
.
.
.
.
H K L Z U Y D N T L S O T L D T K H V Q G L O I T T R C E P M T S E W I Z P U C 
L R B F J A Q U E T F W T G T D V J K R N A I Z Y M W F Y Y E D I R A E G Q D X 
B M H S Y G Y G P O S D I K B W Q E I Q P C X H U T P W T T H E Y M I Y A O A S 
H W U F U A H T E M R F X B Z G W X P R I B Y H C I E T C J N N Q D E A E B X J 
H Y R B R R Q S X J S J R I C M E K W M J A V Q M A O S H E R O W X M W E V I C 
J R H X I W U F W K X Y S F A S Y I A G Z J U J C C W I O U W Z A T S H F P O S 
I D Q D J R K U Q G L K Y B A L R Q O U X W D C J H Z S N G W F O M T U Y V B I 
C V D I V M N S O X E C D I T O H R L G B Y D X C N E L Q U W Q T W T V J D W B 
R E Z W Q O A E X S X J O R O U B I C S U U K H T Z M M D V E P B E I R P M H H 
U V V V K M S Y G L O X O Q O A I V O K J R K Z F U X V D E J M H Q Y D M Q V Y 
S Y U Q Y M D R K W R Z T K I Z Q K S I G X I Y G O A S N Z V U K W E Y A W N O 
F X C A B Z I M R G W V F A Q T U Q Y W K W H Q C M I M M Y C A L K V W K O N I 
Q V V D H R D S R A V N V X W G U C O C H E M E J R Z L J J K Z F C B V K H U B 
M B W O I J S J V F G P T Y E A N K H K T F J X U I L E N M J T K H V E J N M K 
A O Y T S Q J Q N P K Y A B T N Q P Q F U H K A A D G S V K F P G T H N B Z I W 
U L P M Y U X J T M X G H L O U P F R L T U U C Y Y M Q O M L B E X O V E J W J 
F T Z K U F A S K W H Z B L M N J W V H P J E B H A V K O E V M W S L L B F J L 
H Q N O Y O R P J E N G S K R O G W W Y G Q F O E J Z E A M L W T J H V G K C H 

********************************************************************************
The number of each character that was generated is:
A's = 769589	B's = 769590	C's = 769370	D's = 769837	E's = 768896	
F's = 768722	G's = 769031	H's = 769137	I's = 768188	J's = 770504	
K's = 769664	L's = 769266	M's = 768400	N's = 768910	O's = 768175	
P's = 768996	Q's = 769545	R's = 769357	S's = 769578	T's = 770016	
U's = 768820	V's = 769244	W's = 770389	X's = 768757	Y's = 769039	
Z's = 768980	
The total number of characters generated is: 20000000
```

The Git-SCM system was used to track development of the project and GitHub was
used as a server for a remote repository for the project. The link to the
remote repository for the project is below: 
(https://github.com/MDobrinski/COMSC_1033_HW_8_RandChar.git)

Git Bash was used as the command line terminal and the listing below is the
command line output showing the git commands used during the project development. 

## Git Bash Command Line Output
```bash
mdobrinski@LT-WEA-0023 MINGW32 ~
$ cd e:

mdobrinski@LT-WEA-0023 MINGW32 /e
$ cd COMSC_1033/Programs/COMSC_1033_HW_8_RandChar

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar
$ cd src

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src
$ git init
Initialized empty Git repository in E:/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src/.git/

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (master)
$git config user.name "Michael Dobrinski"

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (master)
$ git config user.email "michael.git2015@gmail.com"

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (master)
$ git add .

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (master)
$ git status
On branch master

Initial commit

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

        new file:   COMSC_1033_HW_8_RandChar.java
        new file:   MyRandoms.java


mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (master)
$git commit -m"Make initial commit for the HW 8 Project."
[master (root-commit) 69fe9c3] Make initial commit for the HW 8 Project.
 2 files changed, 57 insertions(+)
 create mode 100644 COMSC_1033_HW_8_RandChar.java
 create mode 100644 MyRandoms.java

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (master)
$ git checkout -b development
Switched to a new branch 'development'

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$ git remote add origin https://github.com/MDobrinski/COMSC_1033_HW_8_RandChar.git

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$ git push -u origin master
Username for 'https://github.com': MDobrinski
Password for 'https://MDobrinski@github.com':
Counting objects: 4, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 1.02 KiB | 0 bytes/s, done.
Total 4 (delta 0), reused 0 (delta 0)
To https://github.com/MDobrinski/COMSC_1033_HW_8_RandChar.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$ git push -u origin development
Username for 'https://github.com': MDobrinski
Password for 'https://MDobrinski@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/MDobrinski/COMSC_1033_HW_8_RandChar.git
 * [new branch]      development -> development
Branch development set up to track remote branch development from origin.

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$ git status
On branch development
Your branch is up-to-date with 'origin/development'.
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   COMSC_1033_HW_8_RandChar.java
        modified:   MyRandoms.java

no changes added to commit (use "git add" and/or "git commit -a")

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$ git commit -am"Completed the loop to count occurrence of each letter."
[development 5011519] Completed the loop to count occurrence of each letter.
 2 files changed, 84 insertions(+), 4 deletions(-)

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$ git push
Username for 'https://github.com': MDobrinski
Password for 'https://MDobrinski@github.com':
Counting objects: 4, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 1.06 KiB | 0 bytes/s, done.
Total 4 (delta 1), reused 0 (delta 0)
To https://github.com/MDobrinski/COMSC_1033_HW_8_RandChar.git
   69fe9c3..5011519  development -> development

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$ git commit -am"Completed program with logic error checking in place."
[development dacfc55] Completed program with logic error checking in place.
 1 file changed, 13 insertions(+), 3 deletions(-)

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$ git push
Username for 'https://github.com': MDobrinski
Password for 'https://MDobrinski@github.com':
Counting objects: 3, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 597 bytes | 0 bytes/s, done.
Total 3 (delta 1), reused 0 (delta 0)
To https://github.com/MDobrinski/COMSC_1033_HW_8_RandChar.git
   5011519..dacfc55  development -> development

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$ git status
On branch development
Your branch is up-to-date with 'origin/development'.
nothing to commit, working directory clean

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$ git checkout master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (master)
$ git merge development
Updating 69fe9c3..dacfc55
Fast-forward
 COMSC_1033_HW_8_RandChar.java | 96 +++++++++++++++++++++++++++++++++++++++++--
 MyRandoms.java                |  2 +-
 2 files changed, 94 insertions(+), 4 deletions(-)

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (master)
$ git push
Username for 'https://github.com': MDobrinski
Password for 'https://MDobrinski@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/MDobrinski/COMSC_1033_HW_8_RandChar.git
   69fe9c3..dacfc55  master -> master

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (master)
$ git checkout development
Switched to branch 'development'
Your branch is up-to-date with 'origin/development'.

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$ git commit -am"Remove the statements to test the logic and add comments to the java file."
[development 63b1d45] Remove the statements to test the logic and add comments to the java file.
 1 file changed, 21 insertions(+), 21 deletions(-)

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$ git push
Username for 'https://github.com': MDobrinski
Password for 'https://MDobrinski@github.com':
Counting objects: 3, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 765 bytes | 0 bytes/s, done.
Total 3 (delta 1), reused 0 (delta 0)
To https://github.com/MDobrinski/COMSC_1033_HW_8_RandChar.git
   dacfc55..63b1d45  development -> development

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (development)
$git checkout master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (master)
$ git merge development
Updating dacfc55..63b1d45
Fast-forward
 COMSC_1033_HW_8_RandChar.java | 42 +++++++++++++++++++++---------------------
 1 file changed, 21 insertions(+), 21 deletions(-)

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (master)
$ git push
Username for 'https://github.com': MDobrinski
Password for 'https://MDobrinski@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/MDobrinski/COMSC_1033_HW_8_RandChar.git
   dacfc55..63b1d45  master -> master

mdobrinski@LT-WEA-0023 MINGW32 /e/COMSC_1033/Programs/COMSC_1033_HW_8_RandChar/src (master)
$
```

## Summary

This project allowed for the use of both methods and loops to control the program.
Generating a larger number of random characters and keeping a count of each character
shows that the Java random number method generates a fairly even distribution of characters
generated.












 
