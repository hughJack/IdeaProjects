package com.youneek.AlwaysUsedClass;
//

import java.io.*;
import java.io.IOException;

/**
 * Created by Administrator on 2016/5/4.
 */
public class TestFile {
    public static void main(String[] args) {
        String separator = File.separator;

        //getPath();

        String filename = "myfile.txt";
        String directory = "mydir1" + separator + "mydir2" ;
        //replaceSeparator(directory);
        System.out.println(directory);

        File f1 = new File(directory,filename);//目前只是内存当中的对象
        if (f1.exists()) {
            System.out.println("路径+文件名 = " + f1.getAbsolutePath());
            System.out.println("文件大小 = " + f1.length());
        }else {
            f1.getParentFile().mkdirs();
            try {
                f1.createNewFile();
            }catch(IOException e)  {
                e.printStackTrace();
            }
        }
    }

    public static void getPath() {
        File f = new File("");
        System.out.println(f.getAbsolutePath());

        try {
            System.out.println(f.getCanonicalPath());
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void replaceSeparator (String s) {
        s.replace( "\\" , "/" );
    }

 }
