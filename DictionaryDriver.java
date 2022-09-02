//Name: AMAL JOHNSON
//ID: 21263175
public class DictionaryDriver
{
    public static void main(String[]args){
        //args = new String[]args= {"C:\\Users\\amalj\\Downloads\\Sample.CSV", "3", "10"};
        
        if(args.length<3){
            if(args.length==0){
                System.out.println("No arguments passed.");
            }else System.out.println("Please make sure to pass three arguments: filepath, shortest, longest.");
            return;
        }
        
        Dictionary words = new Dictionary(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        
        String word1 = "Amal";
        String word2 = "happy";
        
        System.out.println(words.inDictionary(word1));
        System.out.println(words.nextWord());
        System.out.println(words.add(word1));
        System.out.println(words.inDictionary(word1));
        System.out.println("");
        System.out.println(words.inDictionary(word2));
        System.out.println(words.nextWord());
        System.out.println(words.add(word1));
        System.out.println(words.inDictionary(word2));
    }
}
