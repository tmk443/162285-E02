package com.company;
import java.io.File;
import java.io.FileFilter;
import java.util.*;
import java.util.stream.Collectors;

public class Zad3 {
    public static List<File> returnDirectoriesMethod (File initial){
        return Arrays.stream(initial.listFiles()).filter(File -> File.isDirectory()).collect(Collectors.toList());
    }
    public static List<File> returnDirecotoriesAnonymous (File initial){
        return List.of(initial.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        }));
    }
    public static void main(String[] args){
        for(File f : returnDirectoriesMethod(new File("C:\\Users\\tmast\\IdeaProjects\\test"))){
            System.out.println(f);
        }
        for(File f : returnDirecotoriesAnonymous (new File("C:\\Users\\tmast\\IdeaProjects\\test"))){
            System.out.println(f);
        }
    }
}
