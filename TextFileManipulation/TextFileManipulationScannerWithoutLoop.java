/* Pag read ng file gamit lang ang 'File' at 'Scanner' na class
 * ang 'File' na class ay ginamit sa pag OPEN ng file
 * ang 'Scanner' ay binabasa ang contents ng file LINE BY LINE
 */

import java.util.Scanner; // ginagamit for INPUTS
//pero instead of input galing sa user, ang input ay galing sa file

import java.io.File; // ginamit paggawa ng bagong object na hotdogFile
import java.io.FileNotFoundException; // para sa pag handle ng IOExceptions

public class TextFileManipulationScannerWithoutLoop
{
	public static void main(String[]args) throws FileNotFoundException // throws FileNotFoundException - File handling errors/failures ipa handle na lang natin sa class kasi tamad tayo mag (try-catch)
	{
		
		// ung file na 'Pogi Pogi.txt' ay hinahandle na ng hotdogFile
		File hotdogFile = new File("C:\\Users\\Mark Vincent\\Downloads\\Pogi Pogi.txt");
		/* paltan niyo ung 'Mark Vincent' into -> user name ng pc na gamit niyo
		 * punta lang kayo sa C:\\Users\\'User'
		 * C ung disk, baka ibang letter ang nakalagay sa pc na gamit niyo
		 * User - user name ng computer (account sa computer na gamit)
		 */
		
		/* ung 'hotdogFile' ay pinasa as ARGUMENT ng Scanner
		 * kung maalala niyo dati 'Scanner(System.in)' ang gamit natin para kunin ang input ng user
		 * ngayon instead of 'System.in', ung 'hotdogFile' na ang gamit
		 */
		Scanner sc = new Scanner(hotdogFile);
		
		/* ang 'useDelimiter' ay METHOD ng SCANNER na inaccess natin gamit ang 'sc' na object 
		 * \\z binabasa ang contents ng file as a CONTINUOUS STRING
		 * "parang ganto,\nparang ganto.\nparang ganto?\nparang ganto\nparang ganto,.\nparang ganto.\nhotdog"
		 * dun sa 'Pogi Pogi.txt' na file, may separate lines. meron sila sa dulo na '\n' di niyo lang kita un.
		 * so ganto itsura nung contents ng file pag nasa 'sc' na variable na
		 * Hi pogi.wampepti\nthis is a new line.\nSomething something, the period is read as new line.\nHotdog hotdog cheesedog.
		 */
		sc.useDelimiter("\\z");
		
		/* next ang gagamitin
		 * hindi nextLine
		 * kasi ang nextLine ma stop pag naka read ng \n.
		 */
		System.out.println(sc.next());
	}		
}
