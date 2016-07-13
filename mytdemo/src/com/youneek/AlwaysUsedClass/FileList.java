package com.youneek.AlwaysUsedClass;

import java.io.File;

/**
 * Created by Administrator on 2016/5/4.
 */
public class FileList {
    public static void main(String[] args) {
        File f =new File("F:/IdeaProjects/mytdemo");
        tree(f,0);
        System.out.println("");
    }

    //封装
    private static  void  tree (File f,int level) {
        //缩进
        String prestr = "";//开始为空串
        for (int i=0;i<level;i++) {
            prestr+="----";
        }

    //递归，调用自身
        File [] childs = f.listFiles();
        for (int i = 0;i<childs.length;i++) {
            System.out.println(prestr + childs[i].getName());
            if (childs[i].isDirectory()) {
                tree(childs[i],level+1);
            }
        }
    //循环，调用


    }
}
