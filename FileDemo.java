//Program to copy content of one file to another

import java.io.*;
import java.util.*;

public class FileDemo
 {
   public static void main(String args[])
     {
         String srcfile,dstfile;
         Scanner sc=new Scanner(System.in);
         System.out.println("\n Program to copy content of one file into another file:");
         System.out.println("\n Enter Source File name(with extension .txt):");
         srcfile=sc.nextLine();
         System.out.println("\n Enter Destination file name(with extension .txt)");
         dstfile=sc.nextLine();
    
          InputStream in=null;
          OutputStream out=null;

          try
           {
              File file1=new File(srcfile);
              File file2=new File(dstfile);
                
              in=new FileInputStream(file1);
               out=new FileOutputStream(file2);
               byte[] buffer=new byte[1024];

              int length;
              
          while((length=in.read(buffer))>0)
            {
                   out.write(buffer,0,length);
            }


         if(in!=null)
          in.close();
         if(out!=null)
          out.close();
         System.out.println("\n File Copied Successfully..");
 }
 
         catch(IOException e)
           {
                e.printStackTrace();
           }
    }
  }
