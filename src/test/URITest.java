package test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

/*
URI(统一资源标识符):标识互联网上的某个网络资源，标识方式如 名称，位置等；由 URL + URN（统一资源名称）组成
    1.URI采用特定语法标识网络资源，URI 是一个标识资源的字符串而已；
    2.URI标识语法 模式:模式特定部分；
        模式包括（可以理解为资源协议）：data、file、ftp、http、telnet
        模式特定部分采用一种层次结构，如 //authority/path?k1=v1&k2=v2#anchor ；
        其中 authority 表示授权机构，如 www.baidu.com 即服务器域名；
        path 表示资源路径；
        ? k1=v1&k2=v2 表示查询字符串；
        #anchor 锚点，表示html页面的某个元素；
*/
public class URITest {
    //URI类
    public static void uriClassTest() throws URISyntaxException, MalformedURLException {
        URI uri=new URI("file:///D:/IO/");
        System.out.println("URI类方法：-------------------------------------------------------");
        System.out.println("create(通过解析给定的字符串创建URI)："+ URI.create("file:///D:/IO/").toString());
        System.out.println("compareTo(将此URI与另一个对象（也必须是 URI）进行比较)："+ uri.compareTo(URI.create("file:///D:/IO/")));
        System.out.println("equals(测试此URI与另一对象的相等性)："+ uri.equals(URI.create("file:///D:/IO/")));
        System.out.println("getAuthority(返回此URI的已解码的授权组成部分)："+ uri.getAuthority());
        System.out.println("getFragment(返回此URI的已解码的片段组成部分)："+ uri.getFragment());
        System.out.println("getHost(返回此URI的主机组成部分)："+ uri.getHost());
        System.out.println("getPath(返回此URI的已解码的路径组成部分)："+ uri.getPath());
        System.out.println("getPort(返回此URI的端口号)："+ uri.getPort());
        System.out.println("getQuery(返回此URI的已解码的查询组成部分)："+ uri.getQuery());
        System.out.println("getRawAuthority(返回此URI的原始授权组成部分)："+ uri.getRawAuthority());
        System.out.println("getRawFragment(返回此URI的原始片段组成部分)："+ uri.getRawFragment());
        System.out.println("getRawPath(返回此URI的原始路径组成部分)："+ uri.getRawPath());
        System.out.println("getRawQuery(返回此URI的原始查询组成部分)："+ uri.getRawQuery());
        System.out.println("getRawSchemeSpecificPart(返回此URI原始的、特定于方案的部分)："+ uri.getRawSchemeSpecificPart());
        System.out.println("getRawUserInfo(返回此URI的原始用户信息组成部分)："+ uri.getRawUserInfo());
        System.out.println("getScheme(返回此URI的方案组成部分)："+ uri.getScheme());
        System.out.println("getSchemeSpecificPart(返回此URI的特定于方案的解码部分)："+ uri.getSchemeSpecificPart());
        System.out.println("getUserInfo(返回此URI的已解码的用户信息组成部分)："+ uri.getUserInfo());
        System.out.println("isAbsolute(判断此URI是否为绝对的)："+ uri.isAbsolute());
        System.out.println("isOpaque(判断此URI是否为不透明的)："+ uri.isOpaque());
        System.out.println("toString(以字符串形式返回此URI的内容)："+ uri.toString());
        System.out.println("toASCIIString(以US-ASCII字符串形式返回此URI的内容)："+ uri.toASCIIString());
        System.out.println("parseServerAuthority(尝试将此 URI 的授权组成部分（如果已定义）解析为用户信息、主机和端口组成部分)："+ uri.parseServerAuthority().toString());
        System.out.println("normalize(规范化此URI的路径)："+ uri.normalize());
        System.out.println("toURL(根据此URI构造一个URL)："+ uri.toURL().toString());
    }
    //主类
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        uriClassTest();
    }
}
