package com.cncpc;

public class MysqlDriver implements DataBaseDriver {
    @Override
    public String buildConnect(String host) {
        return "mysql驱动启动:" + host;
    }
}
