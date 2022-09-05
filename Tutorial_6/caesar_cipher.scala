import scala.io.StdIn
object caesar_cipher extends App{
    var alphabet = List("ABCDEFGHIJKLMNOPQRSTUVWXYZ","abcdefghijklmnopqrstuvwxyz");

    def encryption(character: Char, shift: Int, alphabet: List[String]): Char = {
        if(character == ' '){   //space character
            ' ';
        }
        else{
            if(character.toUpper == character){ //letter case check
                //println(alphabet(0).charAt((alphabet(0).indexOf(character) + shift) % alphabet(0).length()));
                alphabet(0).charAt((alphabet(0).indexOf(character) + shift) % alphabet(0).length());  //uppercase encryption
            }
            else{
                //println(alphabet(1).charAt((alphabet(1).indexOf(character) + shift) % alphabet(1).length()));
                alphabet(1).charAt((alphabet(1).indexOf(character) + shift) % alphabet(1).length());  //lowercase encryption
            }

        }
    }

    def decryption(character: Char, shift: Int, alphabet: List[String]): Char = {
        if(character == ' '){   //space character
            ' ';
        }
        else{
            if(character.toUpper == character){ //letter case check
                //println(((alphabet(0).indexOf(character) - shift) + alphabet(0).length()));
                alphabet(0).charAt(((alphabet(0).indexOf(character) - shift) + alphabet(0).length()) % alphabet(0).length());  //uppercase decryption
            }
            else{
                //println(((alphabet(1).indexOf(character) - shift) + alphabet(1).length()));
                alphabet(1).charAt(((alphabet(1).indexOf(character) - shift) + alphabet(1).length()) % alphabet(1).length());  //lowercase decryption
            }
        }
    }

    val Cipher = (text: String, shift: Int, alphabet: List[String], processing:(Char, Int, List[String]) => Char) => {
        if(text.forall(i =>  (i == ' ' || ((alphabet(0)+alphabet(1)).indexOf(i)) != -1)) == true){  //check for invalid characters and ignore space
            text.map(processing(_, shift, alphabet));
        }
        else{
            println("Invalid Characters");
            "";
        }

    }

    print("Please enter a text: ");
    var userInput = scala.io.StdIn.readLine();

    print("Please enter key value (shift): ");
    var key = scala.io.StdIn.readInt();

    var Encrypted_text = Cipher(userInput, key, alphabet, encryption);
    var Decrypted_text = Cipher(Encrypted_text, key, alphabet, decryption);
    println("\nEncrypted text: " + Encrypted_text);
    println("Decrypted text from the encrypted text: " + Decrypted_text);


}