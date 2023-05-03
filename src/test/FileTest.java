package test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

//文件
public class FileTest {
    //file类
    public static void fileClassTest() throws URISyntaxException, IOException {
        System.out.println("File字段：-------------------------------------------------------");
        System.out.println("pathSeparator(与系统有关的路径分隔符)："+ File.pathSeparator);
        System.out.println("pathSeparatorChar(与系统有关的路径分隔符)："+ File.pathSeparatorChar);
        System.out.println("separator(与系统有关的默认名称分隔符)："+ File.separator);
        System.out.println("separatorChar(与系统有关的默认名称分隔符)："+ File.separatorChar);
        System.out.println("File构造：-------------------------------------------------------");
        File file = new File("D:\\IO\\file.txt");
        System.out.println("File(String pathname)："+ file.toString());
        File file1 = new File("D:\\IO\\", "file1");
        System.out.println("File(String parent, String child)："+ file1.toString());
        File file2 = new File(file1, "file2");
        System.out.println("File(File parent, String child)："+ file2.toString());
        URI uri=new URI("file:///D:/IO/");
        File file3 = new File(uri);
        System.out.println("File(URI uri)："+ file3.toString());
        System.out.println("File类方法：-------------------------------------------------------");
        File.createTempFile("file3",".txt",file1);
        System.out.println("createNewFile(创建空白文件)："+file.createNewFile());
        System.out.println("exists(测试此抽象路径名表示的文件或目录是否存在)："+ file.exists());
        System.out.println("mkdir(创建此抽象路径名指定的目录)："+file1.mkdir());
        System.out.println("mkdirs(创建此抽象路径名指定的目录，包括所有必需但不存在的父目录)："+file2.mkdirs());
        System.out.println("toURI(构造一个表示此抽象路径名的file: URI)："+file2.toURI().toString());
        System.out.println("canExecute(测试应用程序是否可以执行此抽象路径名表示的文件)："+ file.canExecute());
        System.out.println("canRead(测试应用程序是否可以读取此抽象路径名表示的文件)："+ file.canRead());
        System.out.println("canWrite(测试应用程序是否可以修改此抽象路径名表示的文件)："+ file.canWrite());
        System.out.println("compareTo(按字母顺序比较两个抽象路径名)："+ file.compareTo(file1));
        System.out.println("getAbsolutePath(返回此抽象路径名的绝对路径名字符串)："+file.getAbsolutePath());
        System.out.println("getName(返回由此抽象路径名表示的文件或目录的名称)："+file.getName());
        System.out.println("getParent(返回此抽象路径名父目录的路径名字符串)："+file.getParent());
        System.out.println("getPath(将此抽象路径名转换为一个路径名字符串)："+file.getPath());
        System.out.println("isAbsolute(测试此抽象路径名是否为绝对路径名)："+file.isAbsolute());
        System.out.println("isDirectory(测试此抽象路径名表示的文件是否是一个目录)："+file.isDirectory());
        System.out.println("isFile(测试此抽象路径名表示的文件是否是一个标准文件)："+file.isFile());
        System.out.println("isHidden(测试此抽象路径名指定的文件是否是一个隐藏文件)："+file.isHidden());
        System.out.println("lastModified(返回此抽象路径名表示的文件最后一次被修改的时间)："+file.lastModified());
        System.out.println("length(返回由此抽象路径名表示的文件的长度)："+file.length());
        System.out.println("delete(删除此抽象路径名表示的文件或目录)："+ file2.delete());
        file2.deleteOnExit();
        System.out.println("deleteOnExit(在虚拟机终止时，请求删除此抽象路径名表示的文件或目录)：");
    }
    //主类
    public static void main(String[] args) throws URISyntaxException, IOException {
        fileClassTest();
    }
}
