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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScheduleActionStartSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScheduleActionStartSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIXEDMODESCHEDULEACTIONSTARTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fixedModeScheduleActionStartSettings").build();
    private static final MarshallingInfo<StructuredPojo> FOLLOWMODESCHEDULEACTIONSTARTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("followModeScheduleActionStartSettings").build();

    private static final ScheduleActionStartSettingsMarshaller instance = new ScheduleActionStartSettingsMarshaller();

    public static ScheduleActionStartSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScheduleActionStartSettings scheduleActionStartSettings, ProtocolMarshaller protocolMarshaller) {

        if (scheduleActionStartSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scheduleActionStartSettings.getFixedModeScheduleActionStartSettings(), FIXEDMODESCHEDULEACTIONSTARTSETTINGS_BINDING);
            protocolMarshaller.marshall(scheduleActionStartSettings.getFollowModeScheduleActionStartSettings(), FOLLOWMODESCHEDULEACTIONSTARTSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
