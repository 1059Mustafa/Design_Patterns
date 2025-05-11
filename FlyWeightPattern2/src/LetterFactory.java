import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

    private static Map<Character,ILetter> characterCache=new HashMap<>();

    public static ILetter createLetter(char charaterValue)
    {
        if(characterCache.containsKey(charaterValue))
        {
            return characterCache.get(charaterValue);
        }
        else {
            DocumentCharacter obj=new DocumentCharacter(charaterValue,"Arial",10);
            characterCache.put(charaterValue,obj);
            return obj;
        }
    }
}
