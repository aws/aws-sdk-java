/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApplicationMaintenanceConfigurationDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationMaintenanceConfigurationDescriptionMarshaller {

    private static final MarshallingInfo<String> APPLICATIONMAINTENANCEWINDOWSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationMaintenanceWindowStartTime").build();
    private static final MarshallingInfo<String> APPLICATIONMAINTENANCEWINDOWENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationMaintenanceWindowEndTime").build();

    private static final ApplicationMaintenanceConfigurationDescriptionMarshaller instance = new ApplicationMaintenanceConfigurationDescriptionMarshaller();

    public static ApplicationMaintenanceConfigurationDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApplicationMaintenanceConfigurationDescription applicationMaintenanceConfigurationDescription, ProtocolMarshaller protocolMarshaller) {

        if (applicationMaintenanceConfigurationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(applicationMaintenanceConfigurationDescription.getApplicationMaintenanceWindowStartTime(),
                    APPLICATIONMAINTENANCEWINDOWSTARTTIME_BINDING);
            protocolMarshaller.marshall(applicationMaintenanceConfigurationDescription.getApplicationMaintenanceWindowEndTime(),
                    APPLICATIONMAINTENANCEWINDOWENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
