package Composite_Design.Main;

import Composite_Design.Directory.Directory;
import Composite_Design.File.File;
import Composite_Design.File.FileSystem;

public class Main {
    public static void main(String args[])
    {
        Directory movieDirectory=new Directory("Movie");
        FileSystem border=new File("Border");

        movieDirectory.add(border);
        Directory ComedyMovies=new Directory("Comedy_Movies");

        File hulchul=new File("Hulchul");
        ComedyMovies.add(hulchul);
        movieDirectory.add(ComedyMovies);
        movieDirectory.ls();
    }
}
