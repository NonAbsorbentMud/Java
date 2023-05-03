package test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/*
URL(统一资源定位符):唯一标识一个资源在internet上的位置（仅靠位置来标识）；所以URL是URI标识网络资源的一种方式；即URI可标识的资源范围比URL大；
    1.URL 是一种URI， 除了标识一个网络资源，还提供资源的网络位置，以便查找； 客户端可以用它获取资源
    2.资源的网络位置包括 协议如http，服务器主机域名，端口，路径（查询参数，锚点或有）；
    3.URL语法如下：协议://userInfo@host:port/path?query#fragment
        用户信息， 主机host，port端口合并在一起构成了权威机构；
        路径是指向服务器上的一个特定目录或文件，类似于unix的文件系统路径；
        查询字符串，向服务器提供了附加参数；
        片段， 指向远程资源的某个特定部分；
*/
public class URLTest {
    //URL类
    public static void urlClassTest() throws IOException, URISyntaxException {
        URL url=new URL("http://www.baidu.com");
        System.out.println("URL类方法：-------------------------------------------------------");
        System.out.println("toString(构造此URL的字符串表示形式)："+ url.toString());
        System.out.println("toURI(返回与此URL等效的URI)："+ url.toURI().toString());
        System.out.println("toExternalForm(构造此URL的字符串表示形式)："+ url.toExternalForm());
        System.out.println("equals(比较此URL是否等于另一个对象)："+ url.equals(new URL("http://www.baidu.com")));
        System.out.println("sameFile(比较两个URL，不包括片段部分)："+ url.sameFile(new URL("http://www.baidu.com")));
        InputStream inputStream = url.openStream();
        byte[] bytes=new byte[10000];
        int content=inputStream.read();
        int i=0;
        while(content!=-1){
            bytes[i]=(byte)content;
            i++;
            content=inputStream.read();
        }
        System.out.println("openStream(打开到此URL的连接并返回一个用于从该连接读入的InputStream)："+ new String(bytes));
        System.out.println("openConnection(返回一个URLConnection对象，它表示到URL所引用的远程对象的连接)："+ url.openConnection().toString());
        System.out.println("getUserInfo(获取此URL的userInfo部分)："+ url.getUserInfo());
        System.out.println("getRef(获取此URL的锚点（也称为“引用”）)："+ url.getRef());
        System.out.println("getQuery(获取此URL的查询部分)："+ url.getQuery());
        System.out.println("getProtocol(获取此URL的协议名称)："+ url.getProtocol());
        System.out.println("getPort(获取此URL的端口号)："+ url.getPort());
        System.out.println("getPath(获取此URL的路径部分)："+ url.getPath());
        System.out.println("getHost(获取此URL的主机名（如果适用）)："+ url.getHost());
        System.out.println("getFile(获取此URL的文件名)："+ url.getFile());
        System.out.println("getDefaultPort(获取与此URL关联协议的默认端口号)："+ url.getDefaultPort());
        System.out.println("getContent(获取此URL的内容)："+ url.getContent().toString());
        System.out.println("getAuthority(获取此URL的授权部分)："+ url.getAuthority());
    }
    //主类
    public static void main(String[] args) throws IOException, URISyntaxException {
        urlClassTest();
    }
}
