package com.kgc.springmvc.test;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class TomcatServer
{
    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);
        //第一个参数 访问路径  docBase:日志文件路径
        tomcat.addWebapp("/","D:\\kgcc\\");
       try {
            tomcat.start();
            //让线程等待
            tomcat.getServer().await();
       } catch (LifecycleException e) {
            e.printStackTrace();
       }
    }
}
