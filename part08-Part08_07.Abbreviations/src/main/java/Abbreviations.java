
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aayus
 */
public class Abbreviations {
    private HashMap<String, String> abbreviation;
    public Abbreviations(){
        this.abbreviation=new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        String cleanabbreviations=standardizeText(abbreviation);
        String cleanexplanation=standardizeText(explanation);
        this.abbreviation.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        String cleanabbreviations=standardizeText(abbreviation);
        if(this.abbreviation.containsKey(cleanabbreviations)){
            return true;
        }else{
            return false;
        }
    }
    public String findExplanationFor(String abbreviation){
        String cleanabbreviations=standardizeText(abbreviation);
        
        return this.abbreviation.get(cleanabbreviations);
    }
     public String standardizeText(String givenString) {
        if (givenString == null) {
            return "";
        }
        
        return givenString.toLowerCase().trim();  
    }
}
