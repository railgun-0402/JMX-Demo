package com.example.jmx_demo;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

/**
 * MyBeanインターフェースの実装クラス
 */
@Component
@ManagedResource(objectName = "com.example.jmxdemo:type=My") // クラスのインスタンスを JMX サーバーに登録する
public class My implements MyBean {
    private int value = 0;

    @ManagedAttribute // Bean プロパティを JMX 属性として公開
    @Override
    public int getValue() {
        return value;
    }

    @ManagedAttribute
    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @ManagedOperation
    public String sayHello() {
        return "Hello JMX!!!!";
    }
}
