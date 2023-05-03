package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
IO流：
    一个流可以理解为一个数据的序列。
    输入流表示从一个源读取数据。
    输出流表示向一个目标写数据。
*/
public class IOTest {
    //字符流
    public static void characterStreamTest() throws IOException {
        System.out.println("字符流：---------------------------------------------------------------");
        System.out.println("---输出流(Writer：抽象基类)：------------------------------------------------------------");
        System.out.println("------文件流(FileWriter)：");
        System.out.println("------数组流(CharArrayWriter)：");
        System.out.println("------缓冲流(BufferedWriter)：");
        System.out.println("------管道流(PipedWriter)：");
        System.out.println("------过滤流(FilterWriter抽象类)：");
        System.out.println("------转换流(OutputStreamWriter)：");
        System.out.println("------字符串流(StringWriter)：");
        System.out.println("------打印流(PrintWriter)：");
        System.out.println("---输入流(Reader：抽象基类)：------------------------------------------------------------");
        System.out.println("------文件流(FileReader)：");
        System.out.println("------数组流(CharArrayReader)：");
        System.out.println("------缓冲流(BufferedReader)：");
        System.out.println("------管道流(PipedReader)：");
        System.out.println("------过滤流(FilterReader抽象类)：");
        System.out.println("------转换流(InputStreamReader)：");
        System.out.println("------字符串流(StringReader)：");
        System.out.println("------推回输入流(PushbackReader)：");
    }
    //字节流：字节流的缺点解决不了中文的问题，因为字节流是一个一个读取的
    public static void byteStreamTest() throws IOException {
        System.out.println("字节流：---------------------------------------------------------------");
        System.out.println("---输出流(OutputStream：抽象基类)：------------------------------------------------------------");
        System.out.println("------文件流(FileOutputStream)：");
        System.out.println("------数组流(ByteArrayOutputStream)：");
        System.out.println("------缓冲流(BufferedOutputStream)：");
        System.out.println("------管道流(PipedOutputStream)：");
        System.out.println("------过滤流(FilterOutputStream)：");
        System.out.println("------对象流(ObjectOutputStream)：");
        System.out.println("------特殊数据流(DataOutputStream)：");
        System.out.println("------打印流(PrintStream)：");
        System.out.println("---输入流(InputStream：抽象基类)：------------------------------------------------------------");
        System.out.println("------文件流(FileInputStream)：");
        System.out.println("------数组流(ByteArrayInputStream)：");
        System.out.println("------缓冲流(BufferedInputStream)：");
        System.out.println("------管道流(PipedInputStream)：");
        System.out.println("------过滤流(FilterInputStream的protected构造)：");
        System.out.println("------对象流(ObjectInputStream)：");
        System.out.println("------特殊数据流(DataInputStream)：");
        System.out.println("------推回输入流(PushbackInputStream)：");
    }
    //文件字符流
    public static void fileCharStreamTest() throws IOException {
        System.out.println("文件字符输出流：------------------------------------------------------------");
        FileWriter fileWriter = new FileWriter("D:\\IO\\IOTest.txt");
        System.out.println("FileWriter的getEncoding(返回此流使用的字符编码的名称):"+fileWriter.getEncoding());
        fileWriter.write("1、FileWriter字符输出流");
        System.out.println("FileWriter的write(写入内容，将覆盖全部):");
        fileWriter.append("。");
        System.out.println("FileWriter的append(添加内容，在原有内容尾部添加):");
        fileWriter.flush();
        System.out.println("FileWriter的flush(刷新该流的缓冲,即写入预期目标):");
        fileWriter.close();
        System.out.println("FileWriter的close(关闭此流，但要先刷新它):");
        System.out.println("文件字符输入流：------------------------------------------------------------");
        FileReader fileReader=new FileReader("D:\\IO\\IOTest.txt");
        System.out.println("FileReader的getEncoding(返回此流使用的字符编码的名称):"+fileReader.getEncoding());
        System.out.println("FileReader的ready(判断此流是否已经准备好用于读取):"+fileReader.ready());
        int content=fileReader.read();
        StringBuffer sb=new StringBuffer();
        while(content!=-1){
            sb.append((char)content);
            content=fileReader.read();
        }
        System.out.println("FileReader的read(读取内容):"+sb.toString());
        fileReader.close();
        System.out.println("FileReader的close(关闭该流并释放与之关联的所有资源):");
    }
    //数组字符流
    public static void arrayCharStreamTest() throws IOException {
        System.out.println("数组字符输出流：------------------------------------------------------------");
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        System.out.println("CharArrayWriter的size(返回缓冲区的当前大小):"+charArrayWriter.size());
        charArrayWriter.write("2、CharArrayWriter字符输出流");
        System.out.println("CharArrayWriter的write(写入内容，将覆盖全部):");
        charArrayWriter.append("。");
        System.out.println("CharArrayWriter的append(添加内容，在原有内容尾部添加):");
        char[] charArrays=charArrayWriter.toCharArray();
        System.out.println("CharArrayWriter的toCharArray(添加内容，在原有内容尾部添加):"+ Arrays.toString(charArrays));
        System.out.println("CharArrayWriter的toString(将输入数据转换为字符串):"+charArrayWriter.toString());
        charArrayWriter.reset();
        System.out.println("CharArrayWriter的reset(重置该缓冲区，以便再次使用它而无需丢弃已分配的缓冲区):"+Arrays.toString(charArrayWriter.toCharArray()));
        charArrayWriter.flush();
        System.out.println("CharArrayWriter的flush(刷新该流的缓冲,即写入预期目标):");
        charArrayWriter.close();
        System.out.println("CharArrayWriter的close(关闭此流，但要先刷新它):");
        System.out.println("数组字符输入流：------------------------------------------------------------");
        CharArrayReader charArrayReader=new CharArrayReader(charArrays);
        System.out.println("CharArrayReader的ready(判断此流是否已经准备好用于读取):"+charArrayReader.ready());
        int content=charArrayReader.read();
        StringBuffer sb=new StringBuffer();
        int count=40;
        while(count>0){
            if(content!=-1){
                sb.append((char)content);
            }else{
                charArrayReader.reset();
            }
            count--;
            content=charArrayReader.read();
        }
        System.out.println("CharArrayReader的reset(将该流重置为最新的标记，如果从未标记过，则将其重置到开头):");
        System.out.println("CharArrayReader的read(读取内容):"+sb.toString());
        charArrayReader.close();
        System.out.println("CharArrayReader的close(关闭该流并释放与之关联的所有资源):");
    }
    //缓存字符流
    public static void bufferCharStreamTest() throws IOException {
        System.out.println("缓冲字符输出流：------------------------------------------------------------");
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("D:\\IO\\IOTest.txt"));
        bufferedWriter.write("3、BufferedWriter字符输出流");
        System.out.println("BufferedWriter的write(写入内容，将覆盖全部):");
        bufferedWriter.append("。");
        System.out.println("BufferedWriter的append(添加内容，在原有内容尾部添加):");
        bufferedWriter.newLine();
        System.out.println("BufferedWriter的newLine(写入一个行分隔符):");
        bufferedWriter.flush();
        System.out.println("BufferedWriter的flush(刷新该流的缓冲,即写入预期目标):");
        bufferedWriter.close();
        System.out.println("BufferedWriter的close(关闭此流，但要先刷新它):");
        System.out.println("缓冲字符输入流：------------------------------------------------------------");
        BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\IO\\IOTest.txt"));
        System.out.println("BufferedReader的ready(判断此流是否已经准备好用于读取):"+bufferedReader.ready());
        int content=bufferedReader.read();
        StringBuffer sb=new StringBuffer();
        while(content!=-1){
            sb.append((char)content);
            content=bufferedReader.read();
        }
        System.out.println("BufferedReader的read(读取内容):"+sb.toString());
        System.out.println("BufferedReader的readLine(读取一个文本行):"+bufferedReader.readLine());
        bufferedReader.close();
        System.out.println("BufferedReader的close(关闭该流并释放与之关联的所有资源):");
    }
    //转换字符流
    public static void convertCharStreamTest() throws IOException {
        System.out.println("转换字符输出流：------------------------------------------------------------");
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("D:\\IO\\IOTest.txt"));
        System.out.println("OutputStreamWriter的getEncoding(返回此流使用的字符编码的名称):"+outputStreamWriter.getEncoding());
        outputStreamWriter.write("4、OutputStreamWriter字符输出流");
        System.out.println("OutputStreamWriter的write(写入内容，将覆盖全部):");
        outputStreamWriter.append("。");
        System.out.println("OutputStreamWriter的append(添加内容，在原有内容尾部添加):");
        outputStreamWriter.flush();
        System.out.println("OutputStreamWriter的flush(刷新该流的缓冲,即写入预期目标):");
        outputStreamWriter.close();
        System.out.println("OutputStreamWriter的close(关闭此流，但要先刷新它):");
        System.out.println("转换字符输入流：------------------------------------------------------------");
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("D:\\IO\\IOTest.txt"));
        System.out.println("InputStreamReader的getEncoding(返回此流使用的字符编码的名称):"+inputStreamReader.getEncoding());
        System.out.println("InputStreamReader的ready(判断此流是否已经准备好用于读取):"+inputStreamReader.ready());
        int content=inputStreamReader.read();
        StringBuffer sb=new StringBuffer();
        while(content!=-1){
            sb.append((char)content);
            content=inputStreamReader.read();
        }
        System.out.println("InputStreamReader的read(读取内容):"+sb.toString());
        inputStreamReader.close();
        System.out.println("InputStreamReader的close(关闭该流并释放与之关联的所有资源):");
    }
    //字符串字符流
    public static void stringCharStreamTest() throws IOException {
        System.out.println("字符串字符输出流：------------------------------------------------------------");
        StringWriter stringWriter=new StringWriter();
        stringWriter.write("5、StringWriter字符输出流");
        System.out.println("StringWriter的write(写入内容，将覆盖全部):");
        stringWriter.append("。");
        System.out.println("StringWriter的append(添加内容，在原有内容尾部添加):");
        String str=stringWriter.toString();
        System.out.println("StringWriter的toString(以字符串的形式返回该缓冲区的当前值):"+str);
        System.out.println("StringWriter的getBuffer(返回该字符串缓冲区本身):"+stringWriter.getBuffer());
        stringWriter.flush();
        System.out.println("StringWriter的flush(刷新该流的缓冲,即写入预期目标):");
        stringWriter.close();
        System.out.println("StringWriter的close(关闭此流，但要先刷新它):");
        System.out.println("字符串字符输入流：------------------------------------------------------------");
        StringReader stringReader=new StringReader(str);
        System.out.println("StringReader的ready(判断此流是否已经准备好用于读取):"+stringReader.ready());
        int content=stringReader.read();
        StringBuffer sb=new StringBuffer();
        int count=40;
        while(count>0){
            if(content!=-1){
                sb.append((char)content);
            }else{
                stringReader.reset();
            }
            count--;
            content=stringReader.read();
        }
        System.out.println("StringReader的reset(将该流重置为最新的标记，如果从未标记过，则将其重置到该字符串的开头):");
        System.out.println("StringReader的read(读取内容):"+sb.toString());
        stringReader.close();
        System.out.println("StringReader的close(关闭该流并释放与之关联的所有资源):");
    }
    //打印字符流
    public static void printCharStreamTest() throws IOException {
        System.out.println("打印字符输出流：------------------------------------------------------------");
        PrintWriter printWriter=new PrintWriter("D:\\IO\\IOTest.txt");
        printWriter.write("6、PrintWriter字符输出流");
        System.out.println("PrintWriter的write(写入内容，将覆盖全部):");
        printWriter.append("。");
        System.out.println("PrintWriter的append(添加内容，在原有内容尾部添加):");
        printWriter.println("------");
        System.out.println("PrintWriter的println(添加内容，在原有内容尾部添加):");
        printWriter.print("||||||");
        System.out.println("PrintWriter的print(添加内容，然后终止该行，在原有内容尾部添加):");
        printWriter.flush();
        System.out.println("PrintWriter的flush(刷新该流的缓冲,即写入预期目标):");
        printWriter.close();
        System.out.println("PrintWriter的close(关闭此流，但要先刷新它):");
    }
    //推回字符流
    public static void pushBackCharStreamTest() throws IOException {
        System.out.println("推回字符输入流：------------------------------------------------------------");
        PushbackReader pushbackReader = new PushbackReader(new FileReader("D:\\IO\\IOTest.txt"));
        System.out.println("PushbackReader的ready(判断此流是否已经准备好用于读取):"+pushbackReader.ready());
        pushbackReader.unread(1);
        System.out.println("PushbackReader的unread(推回内容，方法是将其复制到推回缓冲区前面):");
        int content=pushbackReader.read();
        StringBuffer sb=new StringBuffer();
        while(content!=-1){
            sb.append((char)content);
            content=pushbackReader.read();
        }
        System.out.println("PushbackReader的read(读取内容):"+sb.toString());
        pushbackReader.close();
        System.out.println("PushbackReader的close(关闭该流并释放与之关联的所有资源):");
    }
    //文件字节流
    public static void fileByteStreamTest() throws IOException {
        System.out.println("文件字节输出流：------------------------------------------------------------");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\IO\\IOTest.txt");
        String str="1、FileOutputStream字节输出流.";
        byte[] bytes=str.getBytes();
        System.out.println("str:"+Arrays.toString(bytes));
        fileOutputStream.write(bytes);
        System.out.println("FileOutputStream的write(将指定byte数组写入此文件输出流中):");
        fileOutputStream.flush();
        System.out.println("FileOutputStream的flush(刷新此输出流并强制写出所有缓冲的输出字节):");
        fileOutputStream.close();
        System.out.println("FileOutputStream的close(关闭此文件输出流并释放与此流有关的所有系统资源):");
        System.out.println("文件字节输入流：------------------------------------------------------------");
        FileInputStream fileInputStream=new FileInputStream("D:\\IO\\IOTest.txt");
        System.out.println("FileInputStream的available(返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取（或跳过）的估计剩余字节数):"+fileInputStream.available());
        int content=fileInputStream.read();
       byte[] sb=new byte[100];
        int i=0;
        while(content!=-1){
            sb[i]=(byte)content;
            i++;
            content=fileInputStream.read();
        }
        System.out.println("FileInputStream的read(从此输入流中读取数据字节):"+new String(sb));
        fileInputStream.close();
        System.out.println("FileInputStream的close(关闭此文件输入流并释放与此流有关的所有系统资源):");
    }
    //数组字节流
    public static void arrayByteStreamTest() throws IOException {
        System.out.println("数组字节输出流：------------------------------------------------------------");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str="1、ByteArrayOutputStream字节输出流.";
        byte[] bytes=str.getBytes();
        byteArrayOutputStream.write(bytes);
        System.out.println("ByteArrayOutputStream的write(将指定的字节写入此byte数组输出流):");
        System.out.println("ByteArrayOutputStream的size(返回缓冲区的当前大小):"+byteArrayOutputStream.size());
        System.out.println("ByteArrayOutputStream的toString(使用平台默认的字符集，通过解码字节将缓冲区内容转换为字符串):"+byteArrayOutputStream.toString());
        System.out.println("ByteArrayOutputStream的toByteArray(创建一个新分配的byte数组):"+Arrays.toString(byteArrayOutputStream.toByteArray()));
        byteArrayOutputStream.flush();
        System.out.println("ByteArrayOutputStream的flush(刷新此输出流并强制写出所有缓冲的输出字节):");
        byteArrayOutputStream.close();
        System.out.println("ByteArrayOutputStream的close(关闭此文件输出流并释放与此流有关的所有系统资源):");
        System.out.println("数组字节输入流：------------------------------------------------------------");
        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(bytes);
        System.out.println("ByteArrayInputStream的available(返回可从此输入流读取（或跳过）的剩余字节数):"+byteArrayInputStream.available());
        int content=byteArrayInputStream.read();
        byte[] sb=new byte[100];
        int i=0;
        while(i<100){
            if(content!=-1){
                sb[i]=(byte)content;
            }else{
                byteArrayInputStream.reset();
            }
            i++;
            content=byteArrayInputStream.read();
        }
        System.out.println("ByteArrayInputStream的reset(将缓冲区的位置重置为标记位置):");
        System.out.println("ByteArrayInputStream的read(从此输入流中读取数据字节):"+new String(sb));
        byteArrayInputStream.close();
        System.out.println("ByteArrayInputStream的close(关闭此文件输入流并释放与此流有关的所有系统资源):");
    }
    //缓存字节流
    public static void bufferByteStreamTest() throws IOException {
        System.out.println("缓冲字节输出流：------------------------------------------------------------");
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("D:\\IO\\IOTest.txt"));
        String str="3、BufferedOutputStream字节输出流";
        byte[] bytes=str.getBytes();
        bufferedOutputStream.write(bytes);
        System.out.println("BufferedOutputStream的write(将指定的字节写入此缓冲的输出流):");
        bufferedOutputStream.flush();
        System.out.println("BufferedOutputStream的flush(刷新此缓冲的输出流):");
        bufferedOutputStream.close();
        System.out.println("BufferedOutputStream的close(关闭此流，但要先刷新它):");
        System.out.println("缓冲字节输入流：------------------------------------------------------------");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream("D:\\IO\\IOTest.txt"));
        System.out.println("BufferedInputStream的available(返回可从此输入流读取（或跳过）的剩余字节数):"+bufferedInputStream.available());
        int content=bufferedInputStream.read();
        byte[] sb=new byte[100];
        int i=0;
        while(content!=-1){
            sb[i]=(byte)content;
            i++;
            content=bufferedInputStream.read();
        }
        System.out.println("BufferedInputStream的read(从此输入流中读取数据字节):"+new String(sb));
        bufferedInputStream.close();
        System.out.println("BufferedInputStream的close(关闭此文件输入流并释放与此流有关的所有系统资源):");
    }
    //对象字节流
    public static void objectByteStreamTest() throws IOException {
        System.out.println("对象字节输出流：------------------------------------------------------------");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("D:\\IO\\IOTest.txt"));
        String str="4、ObjectOutputStream字节输出流";
        byte[] bytes=str.getBytes();
        objectOutputStream.write(bytes);
        objectOutputStream.writeBytes("4、ObjectOutputStream字节输出流。");
        System.out.println("ObjectOutputStream的write*(将指定的字节写入此缓冲的输出流):");
        objectOutputStream.flush();
        System.out.println("ObjectOutputStream的flush(刷新此缓冲的输出流):");
        objectOutputStream.close();
        System.out.println("ObjectOutputStream的close(关闭此流，但要先刷新它):");
        System.out.println("对象字节输入流：------------------------------------------------------------");
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("D:\\IO\\IOTest.txt"));
        System.out.println("ObjectInputStream的available(返回可从此输入流读取（或跳过）的剩余字节数):"+objectInputStream.available());
        int content=objectInputStream.read();
        byte[] sb=new byte[100];
        int i=0;
        while(content!=-1){
            sb[i]=(byte)content;
            i++;
            content=objectInputStream.read();
        }
        System.out.println("ObjectInputStream的read*(从此输入流中读取数据字节):"+new String(sb));
        objectInputStream.close();
        System.out.println("ObjectInputStream的close(关闭此文件输入流并释放与此流有关的所有系统资源):");
    }
    //特殊数据字节流
    public static void dataByteStreamTest() throws IOException {
        System.out.println("特殊数据字节输出流：------------------------------------------------------------");
        DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("D:\\IO\\IOTest.txt"));
        String str="5、DataOutputStream字节输出流";
        byte[] bytes=str.getBytes();
        dataOutputStream.write(bytes);
        dataOutputStream.writeBytes("5、DataOutputStream字节输出流。");
        System.out.println("DataOutputStream的write*(将指定的字节写入此缓冲的输出流):");
        System.out.println("DataOutputStream的size(返回计数器written的当前值，即到目前为止写入此数据输出流的字节数):"+dataOutputStream.size());
        dataOutputStream.flush();
        System.out.println("DataOutputStream的flush(刷新此缓冲的输出流):");
        dataOutputStream.close();
        System.out.println("DataOutputStream的close(关闭此流，但要先刷新它):");
        System.out.println("特殊数据字节输入流：------------------------------------------------------------");
        DataInputStream dataInputStream=new DataInputStream(new FileInputStream("D:\\IO\\IOTest.txt"));
        System.out.println("DataInputStream的available(返回可从此输入流读取（或跳过）的剩余字节数):"+dataInputStream.available());
        int content=dataInputStream.read();
        byte[] sb=new byte[100];
        int i=0;
        while(content!=-1){
            sb[i]=(byte)content;
            i++;
            content=dataInputStream.read();
        }
        System.out.println("DataInputStream的read*(从此输入流中读取数据字节):"+new String(sb));
        dataInputStream.close();
        System.out.println("DataInputStream的close(关闭此文件输入流并释放与此流有关的所有系统资源):");
    }
    //打印字节流
    public static void printByteStreamTest() throws IOException {
        System.out.println("打印字节输出流：------------------------------------------------------------");
        PrintStream printStream=new PrintStream("D:\\IO\\IOTest.txt");
        String str="6、PrintStream字节输出流";
        printStream.write(str.getBytes());
        System.out.println("PrintStream的write(将指定的字节写入此流):");
        printStream.append("。");
        System.out.println("PrintStream的append(将指定字符添加到此输出流):");
        printStream.println("------");
        System.out.println("PrintStream的println(添加内容，在原有内容尾部添加):");
        printStream.print("||||||");
        System.out.println("PrintStream的print(添加内容，然后终止该行，在原有内容尾部添加):");
        printStream.flush();
        System.out.println("PrintStream的flush(刷新该流的缓冲,即写入预期目标):");
        printStream.close();
        System.out.println("PrintStream的close(关闭此流，但要先刷新它):");
    }
    //推回字节流
    public static void pushBackByteStreamTest() throws IOException {
        System.out.println("推回字节输入流：------------------------------------------------------------");
        PushbackInputStream pushbackInputStream = new PushbackInputStream(new FileInputStream("D:\\IO\\IOTest.txt"));
        System.out.println("PushbackInputStream的available(返回可以不受下一次调用此输入流的方法阻塞地从此输入流读取（或跳过）的估计字节数):"+pushbackInputStream.available());
        pushbackInputStream.unread(1);
        System.out.println("PushbackInputStream的unread(推回内容，方法是将其复制到推回缓冲区前面):");
        int content=pushbackInputStream.read();
        byte[] sb=new byte[100];
        int i=0;
        while(content!=-1){
            sb[i]=(byte)content;
            i++;
            content=pushbackInputStream.read();
        }
        System.out.println("PushbackInputStream的read(读取内容):"+new String(sb));
        pushbackInputStream.close();
        System.out.println("PushbackInputStream的close(关闭该流并释放与之关联的所有资源):");
    }
    //主类
    public static void main(String[] args) throws IOException {
        characterStreamTest();
        byteStreamTest();

        fileCharStreamTest();
        arrayCharStreamTest();
        bufferCharStreamTest();
        convertCharStreamTest();
        stringCharStreamTest();
        printCharStreamTest();
        pushBackCharStreamTest();

        fileByteStreamTest();
        arrayByteStreamTest();
        bufferByteStreamTest();
        objectByteStreamTest();
        dataByteStreamTest();
        printByteStreamTest();
        pushBackByteStreamTest();
    }
}
