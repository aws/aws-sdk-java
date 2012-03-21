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

import com.amazonaws.services.simpleworkflow.flow.core.Promise;

public class BookingWorkflowImpl implements BookingWorkflow {

    private final BookingActivitiesClient client = new BookingActivitiesClientImpl();

    @Override
    public void makeBooking(int requestID, int customerID, boolean reserveAir, boolean reserveCar) {
        Promise<Void> carReservation = null;
        if (reserveCar) {
            carReservation = client.reserveCar(requestID);
        }
        Promise<Void> airReservation = null;
        if (reserveAir) {
            airReservation = client.reserveAirline(requestID);
        }
        // Relies on null Promise parameter considered immediately ready
        client.sendConfirmationActivity(customerID, carReservation, airReservation);
    }
    
}
