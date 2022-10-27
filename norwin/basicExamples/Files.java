package exam;

import java.io.File;
import java.io.FilenameFilter;

class OnlyExt implements FilenameFilter
{
    String ext;
    
        public OnlyExt(String ext)
        {
            this.ext = "." + ext;
        }
    
        public boolean accept(File dir, String name)
        {
            return name.endsWith(ext);
        }
}

public class Files
{
    public static void main(String[] args)
    {
        String dirname = "C:\\Users\\harsh\\OneDrive\\Desktop"; 
        File f1 = new File(dirname);
        String[] allFiles = f1.list(); 

        System.out.println("Printing all files in the directory.");
        for(int i = 0; i < allFiles.length; i++)
        {
            System.out.println(allFiles[i]);
        }
        System.out.println("---------------PDF Filter-------------");

        FilenameFilter pdfFilter = new OnlyExt("pdf"); 
        String pdf[] = f1.list(pdfFilter); 
        for(int i = 0; i < pdf.length; i++)
        {
            System.out.println(pdf[i]);
        }
        System.out.println("---------------Text Filter-------------");
        FilenameFilter txtFilter = new OnlyExt("txt"); 
        String txt[] = f1.list(txtFilter); 
        for(int i = 0; i < txt.length; i++)
        {
            System.out.println(txt[i]);
        }
        System.out.println("---------------Link Filter-------------");
        FilenameFilter lnkFilter = new OnlyExt("lnk"); 
        String lnk[] = f1.list(lnkFilter); 
        for(int i = 0; i < lnk.length; i++)
        {
            System.out.println(lnk[i]);
        }
    }

}