package utils;

import org.apache.commons.lang3.StringUtils;
import java.text.Normalizer;

public class Util {

    public static String formatCode(String text, String with, int length, boolean left){

        length -= text.length();
        if (left){
            for (int i = 0; i < length; ++i)
            {
                text = with + text;
            }
        }
        else
        {
            for (int i = 0; i < length; ++i)
            {
                text += with;
            }
        }
        return text;
    }

    public static String formatCode(String text, String with, int length)
    {
        return formatCode(text, with, length, false);
    }

    public static String formatCode(String text, int length){
        return StringUtils.leftPad(text, length, "0");
    }

    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public static String nullToEmpty(String param){
        if(param==null)
            return "";
        else return  param;
    }
}
