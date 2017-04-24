package ir.ac.aut.ceit.utility;

import java.util.Date;

public class Utility {

    //its recommended to get this path by args
    private static final String DIRECTORY_PATH = "/Users/mac/IdeaProjects/CommonProb/";

    private Utility() {
    }


    public static String getNewPath() {
        //unix system allow ":" in file name, if throw exception fix it yourself...
        return DIRECTORY_PATH + new Date(System.currentTimeMillis()).toString() + ".txt";
    }
}
