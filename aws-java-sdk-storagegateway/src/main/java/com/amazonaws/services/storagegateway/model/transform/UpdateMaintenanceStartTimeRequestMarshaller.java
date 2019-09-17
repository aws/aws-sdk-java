/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateMaintenanceStartTimeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMaintenanceStartTimeRequestMarshaller {

    private static final MarshallingInfo<String> GATEWAYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayARN").build();
    private static final MarshallingInfo<Integer> HOUROFDAY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HourOfDay").build();
    private static final MarshallingInfo<Integer> MINUTEOFHOUR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinuteOfHour").build();
    private static final MarshallingInfo<Integer> DAYOFWEEK_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DayOfWeek").build();
    private static final MarshallingInfo<Integer> DAYOFMONTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DayOfMonth").build();

    private static final UpdateMaintenanceStartTimeRequestMarshaller instance = new UpdateMaintenanceStartTimeRequestMarshaller();

    public static UpdateMaintenanceStartTimeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMaintenanceStartTimeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMaintenanceStartTimeRequest.getGatewayARN(), GATEWAYARN_BINDING);
            protocolMarshaller.marshall(updateMaintenanceStartTimeRequest.getHourOfDay(), HOUROFDAY_BINDING);
            protocolMarshaller.marshall(updateMaintenanceStartTimeRequest.getMinuteOfHour(), MINUTEOFHOUR_BINDING);
            protocolMarshaller.marshall(updateMaintenanceStartTimeRequest.getDayOfWeek(), DAYOFWEEK_BINDING);
            protocolMarshaller.marshall(updateMaintenanceStartTimeRequest.getDayOfMonth(), DAYOFMONTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
