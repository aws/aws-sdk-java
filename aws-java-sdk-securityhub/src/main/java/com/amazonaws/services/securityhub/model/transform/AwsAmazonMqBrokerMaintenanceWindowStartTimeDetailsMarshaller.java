/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsAmazonMqBrokerMaintenanceWindowStartTimeDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsAmazonMqBrokerMaintenanceWindowStartTimeDetailsMarshaller {

    private static final MarshallingInfo<String> DAYOFWEEK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DayOfWeek").build();
    private static final MarshallingInfo<String> TIMEOFDAY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TimeOfDay").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TimeZone").build();

    private static final AwsAmazonMqBrokerMaintenanceWindowStartTimeDetailsMarshaller instance = new AwsAmazonMqBrokerMaintenanceWindowStartTimeDetailsMarshaller();

    public static AwsAmazonMqBrokerMaintenanceWindowStartTimeDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails awsAmazonMqBrokerMaintenanceWindowStartTimeDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsAmazonMqBrokerMaintenanceWindowStartTimeDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsAmazonMqBrokerMaintenanceWindowStartTimeDetails.getDayOfWeek(), DAYOFWEEK_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerMaintenanceWindowStartTimeDetails.getTimeOfDay(), TIMEOFDAY_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerMaintenanceWindowStartTimeDetails.getTimeZone(), TIMEZONE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
