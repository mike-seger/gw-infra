package com.net128.architecture.gw.infra;

import lombok.Data;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Data
public class Info {
    private String hostname;
    private String address;
    private String contextRoot;
    private String port;

    Info(String contextRoot, String port) throws UnknownHostException {
        this.contextRoot = contextRoot;
        this.port = port;
        InetAddress ip = InetAddress.getLocalHost();
        address = ip.getHostAddress();
        hostname = ip.getHostName();
    }
}
