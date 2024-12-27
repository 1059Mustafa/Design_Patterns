package Composite_Design.File;

public class File implements FileSystem{

    String filename;

    public File(String name)
    {
        this.filename=name;
    }

    public void ls()
    {
        System.out.println("File name is :" + filename);
    }
}
