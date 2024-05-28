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
package com.amazonaws.services.codedeploy.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ZonalConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ZonalConfigMarshaller {

    private static final MarshallingInfo<Long> FIRSTZONEMONITORDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firstZoneMonitorDurationInSeconds").build();
    private static final MarshallingInfo<Long> MONITORDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("monitorDurationInSeconds").build();
    private static final MarshallingInfo<StructuredPojo> MINIMUMHEALTHYHOSTSPERZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minimumHealthyHostsPerZone").build();

    private static final ZonalConfigMarshaller instance = new ZonalConfigMarshaller();

    public static ZonalConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ZonalConfig zonalConfig, ProtocolMarshaller protocolMarshaller) {

        if (zonalConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(zonalConfig.getFirstZoneMonitorDurationInSeconds(), FIRSTZONEMONITORDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(zonalConfig.getMonitorDurationInSeconds(), MONITORDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(zonalConfig.getMinimumHealthyHostsPerZone(), MINIMUMHEALTHYHOSTSPERZONE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
