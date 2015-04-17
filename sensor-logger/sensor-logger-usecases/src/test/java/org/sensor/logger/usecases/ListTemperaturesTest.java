package org.sensor.logger.usecases;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.sensor.logger.contracts.SensorRepository;
import org.sensor.logger.model.Temperature;

@RunWith(MockitoJUnitRunner.class)
public class ListTemperaturesTest {

	private ListTemperatures temps = new ListTemperatures();
	
	@Mock
	private SensorRepository sensorRepository;
	
	
    @Before
    public void before() throws Exception {
    	temps.setSensorRepository(sensorRepository);
    }

    @Test
    public void testListOrders() throws Exception {
        when(sensorRepository.findTemperatures()).thenReturn(Arrays.asList(new Temperature()));

        List<Temperature> result = temps.listTemperatures();
        
        assertEquals(1, result.size());

    }
	
	
}
