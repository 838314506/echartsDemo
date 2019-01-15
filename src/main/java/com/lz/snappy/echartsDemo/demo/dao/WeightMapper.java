package com.lz.snappy.echartsDemo.demo.dao;

import java.util.List;

import com.lz.snappy.echartsDemo.demo.model.Weight;

public interface WeightMapper {
	
	public List<Weight> findWeights(Integer id);

}
