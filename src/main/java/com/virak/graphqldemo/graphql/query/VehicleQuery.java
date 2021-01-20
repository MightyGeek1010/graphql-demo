package com.virak.graphqldemo.graphql.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.virak.graphqldemo.graphql.service.VehicleService;
import com.virak.graphqldemo.model.Vehicle;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

	@Autowired
	private VehicleService vehicleService;

	public List<Vehicle> getVehicles(final int count) {
		return this.vehicleService.getAllVehicles(count);
	}

	public Optional<Vehicle> getVehicle(final int id) {
		return this.vehicleService.getVehicle(id);
	}
}
