package com.lz.snappy.echartsDemo.demo.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	private Integer id;
	private String userName;
	private String pwd;
	private List<Weight> weights;
	

}
