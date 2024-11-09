/* Pag read ng file gamit lang ang 'File' at 'Scanner' na class
 * ang 'File' na class ay ginamit sa pag OPEN ng file
 * ang 'Scanner' ay binabasa ang contents ng file LINE BY LINE
 */

import java.util.Scanner; // ginagamit for INPUTS
//pero instead of input galing sa user, ang input ay galing sa file
import java.io.File; // ginamit paggawa ng bagong object na betlogFile

public class TextFileManipulationScannerLoop 
{
    public static void main(String[] args) throws Exception // throws Exception - File handling errors/failures ipa handle na lang natin sa class kasi tamad tayo mag (try-catch)
    {
    	// ung file na 'Pogi Pogi.txt' ay hinahandle na ng betlogFile
    	File betlogFile = new File("C:\\Users\\Mark Vincent\\Downloads\\Pogi Pogi.txt");
    	/* paltan niyo ung 'Mark Vincent' into -> user name ng pc na gamit niyo
		 * punta lang kayo sa C:\\Users\\'User' para makita user name ng pc
		 * 'C' ung disk, baka ibang letter ang nakalagay sa pc na gamit niyo
		 * User - user name ng computer (account sa computer na gamit)
		 */
    	
    	/* ung 'betlogFile' ay pinasa as ARGUMENT ng Scanner
		 * kung maalala niyo dati 'Scanner(System.in)' ang gamit natin para kunin ang input ng user
		 * ngayon instead of 'System.in', ung 'betlogFile' na ang gamit
		 */
        Scanner omsim = new Scanner(betlogFile);
        
        /* 'hasNextLine' ay METHOD ng SCANNER na inaccess natin gamit ang variable na 'omsim'
         * returns true kung may line pa sa file na babasahin
         * returns false kung wala nang line na babasahin
         * so ang >> while(omsim.hasNextLline()) <<
         * pwede ring basahin na >> while(true) <<
         * kung saan dire-diretso lang ang loop hanggat may lines pa sa file na babasahin
         */
        while(omsim.hasNextLine())
        	/* nextLine na ang gamit dito para mag stop after ng '\n' (invisible ang '\n' sa file)
        	 * ang '\n' ay new line lang
        	 * pero dahil may loop, hanggat may babasahin pa, uulitin niya ung process hanggang makarating ulit sa '\n' or sa dulo ng file
        	 */
        	System.out.println(omsim.nextLine());
    }
}
