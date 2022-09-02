//Name: AMAL JOHNSON
//ID: 21263175
import java.io.*;
import java.util.*;
public class Dictionary
{
    private ArrayList<String>words;
    private int shortest;
    private int longest;
    public Dictionary(String filepath, int shortest, int longest){
        this.words = new ArrayList<>();
        this.shortest = shortest;
        this.longest = longest;
        try {
            File fileHandle = new File(filepath);
            Scanner dataSource = new Scanner(fileHandle);
            while (dataSource.hasNextLine()){
                String[] split = dataSource.nextLine().split(",");
                for(String word : split){
                    String spacesRemoved = word.trim();
                    if(spacesRemoved.length() >= shortest && spacesRemoved.length() <= longest){
                        if(!words.contains(word.toUpperCase())){
                            words.add(word.toUpperCase());
                        }
                    }
                }
            }
            Collections.sort(words);
        }

        catch(IOException e){
            System.out.println("Not found.");
        }
    }

    public boolean add(String word){
        //this.words=words;
        String spacesRemoved = word.trim();
        if(spacesRemoved.length() >= shortest && spacesRemoved.length() <= longest){
            if(!words.contains(word.toUpperCase())){
                words.add(word.toUpperCase());
                Collections.sort(words);
                return true;
            }
        }
        return false;
    }
    
    public String nextWord(){
        //this.words=words;
        if(words.size()==0){
            return ("");
        }else return words.get((int)(Math.random()*words.size()));
        
    }
    
    public boolean inDictionary(String word){
        //this.words=words;
        if(words.contains(word.toUpperCase())){
            return true;
        }else return false;
        
    }
}
