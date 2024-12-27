package Composite_Design.Directory;

import Composite_Design.File.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String directory_name;

    List<FileSystem> fileSystemList;

    public Directory(String name)
    {
        this.directory_name=name;
        fileSystemList=new ArrayList<>();
    }

    public void add(FileSystem fileSystemobj)
    {
        fileSystemList.add(fileSystemobj);
    }

    public void ls()
    {
        System.out.println("Directory_name :"+ directory_name);

        for(FileSystem fileSystemobj:fileSystemList)
        {
            fileSystemobj.ls();
        }
    }
}
