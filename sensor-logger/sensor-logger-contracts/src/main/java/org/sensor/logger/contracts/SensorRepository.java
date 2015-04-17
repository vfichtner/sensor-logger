package org.sensor.logger.contracts;

import java.util.List;

import org.sensor.logger.model.Temperature;

public interface SensorRepository {

	public List<Temperature> findTemperatures();
	
	
}
