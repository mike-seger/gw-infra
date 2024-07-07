package com.net128.architecture.gw.infra;

import lombok.Data;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Data
public class Info {
    private String hostname;
    private String address = InetAddress.getLocalHost().getHostName();

    Info() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        address = ip.getHostAddress();
        hostname = ip.getHostName();
    }
}
