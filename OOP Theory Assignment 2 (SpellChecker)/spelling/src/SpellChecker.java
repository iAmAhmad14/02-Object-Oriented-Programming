// Muhammad Ahmad 0208-BSCS-22 (OOP SpellChecker Assignment) Due: August 16, 2023
// Words.txt changed to dictionary.txt due to cmd error

import java.util.ArrayList;
import java.util.Arrays;


// THE SpellChecker CLASS

public class SpellChecker {

    private ArrayList<String> dictionary;


    // To use the DictReader class.
    public SpellChecker(String dictionaryFileName) {
        DictReader dictReader = new DictReader(dictionaryFileName);
        dictionary = dictReader.getDictionary();
    }



    // BASIC TASKS (LEVEL 1)
    // Here we have the following methods:
    // numberOfWords()
    // isKnownWord()
    // allKnown()



    public int numberOfWords() { // Returns the number of words in the dictionary
        return dictionary.size();
    }

    public boolean isKnownWord(String word) {
        return dictionary.contains(word);
    }

    public boolean allKnown(ArrayList<String> words) {
        return dictionary.containsAll(words);
    }



    // BASIC TASKS (LEVEL 2)
    // Here we have the following methods:
    // wordsStartingWith()
    // wordsContaining()



    public ArrayList<String> wordsStartingWith(String prefix) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : dictionary) {
            if (word.toLowerCase().startsWith(prefix.toLowerCase())) {
                result.add(word);
            }
        }
        return result;
    }

    public ArrayList<String> wordsContaining(String text) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : dictionary) {
            if (word.toLowerCase().contains(text.toLowerCase())) {
                result.add(word);
            }
        }
        return result;
    }



    // BASIC TASKS (LEVEL 3)
    // Here we have the following methods:
    // insert()
    // remove()
    // save()



    public void insert(String newWord) {
        if (!isKnownWord(newWord)) {
            int index = 0;
            while (index < dictionary.size() && newWord.compareToIgnoreCase(dictionary.get(index)) > 0) {
                index++;
            }
            dictionary.add(index, newWord);
        }
    }

    public boolean remove(String word) {
        String lowerCaseWord = word.toLowerCase();
        return dictionary.remove(lowerCaseWord);
    }

    public void save() {  // From DictReader class.
        DictReader dictReader = new DictReader("dictionary.txt");
        dictReader.save(dictionary);
    }



    // CHALLENGE TASKS
    // Here we have the following methods:
    // isPalindrome()
    // anagrams()
    // difference()



    public boolean isPalindrome(String word) {
        String lowerCaseWord = word.toLowerCase();
        return isKnownWord(lowerCaseWord) && lowerCaseWord.equals(new StringBuilder(lowerCaseWord).reverse().toString());
    }

    public ArrayList<String> anagrams(String word) {
        ArrayList<String> result = new ArrayList<>();
        String lowerCaseWord = word.toLowerCase();
        char[] wordChars = lowerCaseWord.toCharArray();
        Arrays.sort(wordChars);

        for (String dictWord : dictionary) {
            if (!lowerCaseWord.equals(dictWord)) {
                char[] dictWordChars = dictWord.toLowerCase().toCharArray();
                Arrays.sort(dictWordChars);
                if (Arrays.equals(wordChars, dictWordChars)) {
                    result.add(dictWord);
                }
            }
        }

        return result;
    }

    public ArrayList<String> difference(ArrayList<String> otherDictionary) { // Optional.
        ArrayList<String> result = new ArrayList<>();
        for (String word : dictionary) {
            if (!otherDictionary.contains(word)) {
                result.add(word);
            }
        }
        return result;
    }

    // THE MAIN METHOD (FOR CHECKING ALL THE CASES)

    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker("dictionary.txt"); // Instance of SpellChecker class.



        // ALL THE CASES ARE TO BE TESTED BELOW



        // TEST CASE BELOW: RETURNS NUMBER OF TOTAL WORDS.

         System.out.println("Number of words in the dictionary: " + spellChecker.numberOfWords());



        // TEST CASE BELOW: RETURNS TRUE WHEN ASKED FOR "OOP" & FALSE IN CASE OF "OOP" (SUBJECTED TO THE STRING).

         System.out.println("Checking if the word is valid >> " + spellChecker.isKnownWord("OOP"));



        // TEST CASE BELOW: RETURNS TRUE IF GIVEN WORDS ARE IN THE DICTIONARY.TXT OTHERWISE FALSE.

         ArrayList<String> testWords = new ArrayList<>();
         testWords.add("oop");
         testWords.add("aam");
         testWords.add("Aam");
         System.out.println("Are all test words known? >> " + spellChecker.allKnown(testWords));



        // TEST CASE BELOW: RETURNS ALL THE WORDS IN DICTIONARY.TXT WITH THE GIVEN PREFIX IN STRING.

         ArrayList<String> wordsStartingWithPrefix = spellChecker.wordsStartingWith("photo");
         System.out.println("ArrayList with " + wordsStartingWithPrefix.size() + " elements.");
         System.out.println("Last element at index " + (wordsStartingWithPrefix.size() - 1) + " is \"" + wordsStartingWithPrefix.get(wordsStartingWithPrefix.size() - 1) + "\"");



        // TEST CASE BELOW: RETURNS ALL THE WORDS IN DICTIONARY.TXT THAT INCLUDE THE GIVEN SUBSTRING.

         String text = "photo";
         ArrayList<String> wordsContainingText = spellChecker.wordsContaining(text);
         System.out.println("ArrayList with " + wordsContainingText.size() + " elements.");
         System.out.println("First element [0] is \"" + wordsContainingText.get(0) + "\"");
         System.out.println("Last element " + (wordsContainingText.size() - 1) + " is \"" + wordsContainingText.get(wordsContainingText.size() - 1) + "\"");



        // TEST CASE BELOW: SAVES WORD IN DICTIONARY.TXT.

         spellChecker.insert("aan");
         spellChecker.save();



        // TEST CASE BELOW: REMOVES WORD FROM DICTIONARY.TXT, RETURNS FALSE IF THE WORD ALREADY DOESN'T EXIST.

         boolean removed = spellChecker.remove("Ahmad");
         System.out.println("Removing word and checking if the output is T or F >> " + removed);
         spellChecker.save();



        // TEST CASE BELOW: CHECKS IF GIVEN WORD IS A PALINDROME OR NOT.

         System.out.println("Is my word a palindrome? >> " + spellChecker.isPalindrome("navan"));



        // TEST CASE BELOW: RETURNS ANAGRAMS OF THE GIVEN WORD, [ ] IN CASE OF WORD NOT EXISTING.

         String input = "ooop";
         ArrayList<String> anagrams = spellChecker.anagrams(input);
         System.out.println("Input word: \"" + input + "\"");
         System.out.println("Anagrams: " + anagrams);



    } // END OF MAIN METHOD.

} // END OF SpellChecker CLASS.



