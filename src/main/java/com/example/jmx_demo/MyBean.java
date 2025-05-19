package com.example.jmx_demo;

/**
 * MBeanインターフェースを作成
 * JMXで公開するプロパティとメソッドを定義
 */
public interface MyBean {
    int getValue();
    void setValue(int value);
}
