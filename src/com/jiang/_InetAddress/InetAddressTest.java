package com.jiang._InetAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        InetAddress ip1= InetAddress.getLocalHost();
        System.out.println(ip1);
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        InetAddress ip2= InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.isReachable(5000));
    }
}
