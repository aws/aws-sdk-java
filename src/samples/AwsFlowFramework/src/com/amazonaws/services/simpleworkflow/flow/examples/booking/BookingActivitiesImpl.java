/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.examples.booking;

public class BookingActivitiesImpl implements BookingActivities {

	@Override
	public void reserveCar(int requestId) {
        System.out.printf("Reserving car for Request ID: %d...\n", requestId);
	}

	@Override
	public void reserveAirline(int requestId) {
        System.out.printf("Reserving airline for Request ID: %d...\n", requestId);
    }
	
	@Override
	public void sendConfirmationActivity(int customerId){
		System.out.printf("Sending notification to Customer '%d'...\n", customerId);
	}
}
