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
package com.amazonaws.services.internetmonitor.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.internetmonitor.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateMonitorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMonitorRequestMarshaller {

    private static final MarshallingInfo<String> MONITORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitorName").build();
    private static final MarshallingInfo<List> RESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Resources").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<Integer> MAXCITYNETWORKSTOMONITOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxCityNetworksToMonitor").build();
    private static final MarshallingInfo<StructuredPojo> INTERNETMEASUREMENTSLOGDELIVERY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InternetMeasurementsLogDelivery").build();
    private static final MarshallingInfo<Integer> TRAFFICPERCENTAGETOMONITOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrafficPercentageToMonitor").build();
    private static final MarshallingInfo<StructuredPojo> HEALTHEVENTSCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthEventsConfig").build();

    private static final CreateMonitorRequestMarshaller instance = new CreateMonitorRequestMarshaller();

    public static CreateMonitorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMonitorRequest createMonitorRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMonitorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMonitorRequest.getMonitorName(), MONITORNAME_BINDING);
            protocolMarshaller.marshall(createMonitorRequest.getResources(), RESOURCES_BINDING);
            protocolMarshaller.marshall(createMonitorRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createMonitorRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createMonitorRequest.getMaxCityNetworksToMonitor(), MAXCITYNETWORKSTOMONITOR_BINDING);
            protocolMarshaller.marshall(createMonitorRequest.getInternetMeasurementsLogDelivery(), INTERNETMEASUREMENTSLOGDELIVERY_BINDING);
            protocolMarshaller.marshall(createMonitorRequest.getTrafficPercentageToMonitor(), TRAFFICPERCENTAGETOMONITOR_BINDING);
            protocolMarshaller.marshall(createMonitorRequest.getHealthEventsConfig(), HEALTHEVENTSCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
