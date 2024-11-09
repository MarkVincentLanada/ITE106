import java.io.*;
/* Filereader na CLASS lang ang kailangan, pwedeng 'java.io.FileReader' na lang
 * ang >> * << gamit para ma access lahat ng CLASSES sa java.io na PACKAGE  
 */

public class TextFileManipulationFileReader {
 
    public static void main(String[] args) throws Exception // throws Exception - File handling errors/failures ipa handle na lang natin sa class kasi tamad tayo mag (try-catch)
    {
    	// ung file na 'Pogi Pogi.txt' ay hinahandle na ng 'magbabasa'
        FileReader magbabasa = new FileReader("C:\\Users\\Mark Vincent\\Downloads\\Pogi Pogi.txt");
        /* paltan niyo ung 'Mark Vincent' into -> user name ng pc na gamit niyo
		 * punta lang kayo sa C:\\Users\\'User' para makita user name ng pc
		 * 'C' ung disk, baka ibang letter ang nakalagay sa pc na gamit niyo
		 * User - user name ng computer (account sa computer na gamit)
		 */
    	
        /* 'i' variable ay mag ho hold ng ASCII value ng CHARACTER na binasa sa file
         * ang FileReader ay binabasa ang file CHARACTER BY CHARACTER - hindi by line - hindi by word
         */
        int i;
        
        /* dito ung 'read()' ay method ng FileReader na magbabalik ng ASCII value based sa CHARACTER na binasa niya sa file
         * then ibibigay ung value na un sa 'i' na variable
         * then chicheck kung ung value ng 'i' ay hindi equal sa '-1'
         * ang '-1' ay END OF THE FILE
         * in other words. kung wala pa sa dulo ng file ung 'i' na variable ay
         * dire-diretso lang ang 'while' loop 
         */
        while ((i = magbabasa.read()) != -1)
        	
        	/* ang '(char)' sa 'print' method ay TYPE CASTING
        	 * ang value ng 'i' tulad ng binaggit sa taas ay ASCII value
        	 * ko convert ang ASCII value into CHAR kaya may >> (char)i <<
        	 */
            System.out.print((char)i);
    }
}
