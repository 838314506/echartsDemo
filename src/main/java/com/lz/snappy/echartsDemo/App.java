package com.lz.snappy.echartsDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.lz.snappy.echartsDemo.demo.dao")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
    
}
