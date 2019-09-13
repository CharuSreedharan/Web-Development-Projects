package com.pitt.dbmsproject.api.controller;

import com.pitt.dbmsproject.api.model.DistanceVO;

public interface DistanceCalculatorControllerInterface {
	
	public DistanceVO getDistanceBetweenTwoZipCodes(int zipCode1, int zipCode2);

}
