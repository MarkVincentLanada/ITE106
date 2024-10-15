import java.io.*;
/* ang gagamitin natin na CLASSES galing sa PACKAGE na java.io ay
 * File at BufferedReader  
 */

public class TextFileManipulationBufferedReader {
 
    public static void main(String[] args) throws Exception // throws Exception - File handling errors/failures ipa handle na lang natin sa class kasi tamad tayo mag (try-catch)
    {
    	// ung file na 'Pogi Pogi.txt' ay hinahandle na ng 'balut'
        FileReader balut = new FileReader("C:\\Users\\Mark Vincent\\Downloads\\Pogi Pogi.txt");
        /* paltan niyo ung 'Mark Vincent' into -> user name ng pc na gamit niyo
		 * punta lang kayo sa C:\\Users\\'User' para makita user name ng pc
		 * 'C' ung disk, baka ibang letter ang nakalagay sa pc na gamit niyo
		 * User - user name ng computer (account sa computer na gamit)
		 */
    	
        /* ang 'BufferedReader' na CLASS ay ginamit ang 'FileReader' na class which is ung 'balut'
         * dahil bawal ibigay direkta ang file na 'Pogi Pogi.txt' as ARGUMENT sa BufferedReader
         * kaya ginagamit muna ang FileReader para ma convert ung bytes into characters 
         */
        BufferedReader kalbo = new BufferedReader(balut);
        
        /* 'kiwkiw' na variable ay mag ho hold ng line of string from the start hanggang may makitang '\n'
         * ang BufferedReader gamit ang 'readLine' na method sa baba -
         * ay binabasa ang file LINE BY LINE. ang dulo ng line ay pag may '\n'
         */
        String kiwkiw;
        
        /* dito ung 'readLine()' ay method ng FileReader na magbabalik ng line of string
         * then ibibigay ung value na un sa 'kiwkiw' na variable
         * then chicheck kung ung value ng 'kiwkiw' ay hindi equal sa 'null'
         * ang 'null' ay END OF THE FILE
         * in other words. kung wala pa sa dulo ng file ung 'kiwkiw' na variable ay
         * dire-diretso lang ang 'while' loop 
         */
        while ((kiwkiw = kalbo.readLine()) != null)
        	System.out.println(kiwkiw);
    }
}
