package com.youneek.DemoException;

/**
 * Created by Administrator on 2016/4/24.
 */
import java.io.*;
public class ExceptionTest {


    public static void main(String[] args) {
        try {
            ExceptionTest out =  new ExceptionTest ();//.f2();
            out.f2();
        }catch(IOException e){
            e.printStackTrace();
        }


       /* int[] arr = {1, 2, 3};
        System.out.println(arr[2]);//java会自动检查数组是否越界，越界则抛异常；
        try{
        System.out.println(2/0);
        }catch (ArithmeticException ae) {//抛出算数异常，ae是我们定义的异常对象的名字，在系统产生错误（exception）的时候会自动进行初始化。
            System.out.println("系统维护中，请稍后再试，请于MS联系。");
            ae.printStackTrace();//打印错误的堆栈信息
        }*/


        /*ExceptionTest te = new ExceptionTest();
        te.m(0);
        */

        FileInputStream in = null;
        try {
            in = new FileInputStream("myfile.txt");
            int b;
            b = in.read();
            while (b != -1) {
                System.out.println((char) b);
                b = in.read();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {//一般进行资源的清除工作。
            try {
                in.close();//关闭
        }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


    void  m(int i) throws ArithmeticException  {
        if(i==0){
            throw new ArithmeticException ("被除数为0，请重新输入。");
        }
    }


    void f() throws FileNotFoundException,IOException {
        FileInputStream in = new FileInputStream("myfile.txt");
            int b;
            b = in.read();
            while (b != -1) {
                System.out.println((char) b);
                b = in.read();
            }
    }
    void f2() throws IOException{
        //try {f();}{catch{FileNotFoundException e}
    f();
    }
}

