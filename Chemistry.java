
package recursion;
//WAP to represent a string as a chemical elements in a periodic table if possible, else print cannot find
import java.util.Scanner;

public class Chemistry {
  public static void main(String args[]) {
    String[] elements = { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl",
        "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr",
        "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs",
        "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W",
        "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np",
        "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg",
        "Cn" };

    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String inputWord = myScanner.next();
    String chemWord = spellWord(inputWord, elements);
    if((chemWord.contains("*"))||(chemWord.compareTo("")==0))
    {
      System.out.println("Cannot find");
    }
    else{
    System.out.println(chemWord);
    }
    myScanner.close();
  }

  /**
   * @param word the word that we want to re-spell using abbrevications of elements in the periodic table
   * @param elements an array that contains the abbreviations of elements in the periodic table
   * 
   * @return word re-spelled using abbreviations of elements in the periodic table
   * 
   * The spellWord function will take in two parameters, word and elements.
   * 1. Word represents the word that we want to re-spell using abbreviation of the elements from
   * the periodic table.
   * 2. Elements represents possible element abbreviations that you can use to re-spell the word
   * 
   * The function needs to return a String representing the word that you have re-sprelled
   * using abbreviations of the elements in the periodic table.
   * 
   */
  public static String spellWord(String word, String[] elements) {
    // write your code here to spell word with element abbreviations
    if(word.length() ==0 ){
      return "";
    }
    int l= word.length();
    String singleWord = "*";
    String doubleWord = "*";
    singleWord = word.substring(l-1, l);
    if(l>1)
    doubleWord = word.substring(l-2, l);
    String s1 = "*"; String s2 = "*";

    s1 = scanHelper(singleWord, elements);
   // System.out.println(s1);
    if(l>1)
    s2 = scanHelper(doubleWord, elements);

    String word1 = "*";
    String word2 = "*";
    if(s2.compareTo("*")!=0){
      word2 = spellWord(word.substring(0, l-2), elements) + s2;
    }
    if(s1.compareTo("*")!=0){
      word1 = spellWord(word.substring(0, l-1), elements) + s1;
    }
    if(!word1.contains("*")){
      return word1;
    }
    if(!word2.contains("*")){
      return word2;
    }
    return "*";
  }

  public static String scanHelper(String str,String[] elements ){

    int pos= -1;
    for(int i=0;i<elements.length;i++){
      if(elements[i].compareToIgnoreCase(str)==0){
        pos=i;
        break;
      }
    
    }
    if(pos > 0){
      return elements[pos];
    }
    return "*";
  }

  // feel free to write additional helper functions below
}