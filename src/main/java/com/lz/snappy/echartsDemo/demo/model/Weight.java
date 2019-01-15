package com.lz.snappy.echartsDemo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weight {

	private Integer id;
	private double weight;
	private String wdate;
	private String info;
}
