package com.ibm.train.service;

import java.util.Collection;

import com.ibm.train.entity.Train;
import com.ibm.train.exception.InvalidTrainException;

public interface TrainService {
	
	int addTrain(Train t);
	
	Train getTrain(int tcode) throws InvalidTrainException;
	
	Collection<Train> getAll();
	
	void deleteTrain(int tcode);
	
	void updateTrain(Train t);
}
