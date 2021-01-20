package com.virak.graphqldemo.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.virak.graphqldemo.graphql.service.VehicleService;
import com.virak.graphqldemo.model.Vehicle;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

	@Autowired
	private VehicleService vehicleService;

	public Vehicle createVehicle(final String type, final String modelCode, final String brandName,
			final String launchDate) {
		return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
	}
}