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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.internetmonitor.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateMonitorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMonitorRequestMarshaller {

    private static final MarshallingInfo<String> MONITORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("MonitorName").build();
    private static final MarshallingInfo<List> RESOURCESTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourcesToAdd").build();
    private static final MarshallingInfo<List> RESOURCESTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourcesToRemove").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<Integer> MAXCITYNETWORKSTOMONITOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxCityNetworksToMonitor").build();
    private static final MarshallingInfo<StructuredPojo> INTERNETMEASUREMENTSLOGDELIVERY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InternetMeasurementsLogDelivery").build();
    private static final MarshallingInfo<Integer> TRAFFICPERCENTAGETOMONITOR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrafficPercentageToMonitor").build();
    private static final MarshallingInfo<StructuredPojo> HEALTHEVENTSCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthEventsConfig").build();

    private static final UpdateMonitorRequestMarshaller instance = new UpdateMonitorRequestMarshaller();

    public static UpdateMonitorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMonitorRequest updateMonitorRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMonitorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMonitorRequest.getMonitorName(), MONITORNAME_BINDING);
            protocolMarshaller.marshall(updateMonitorRequest.getResourcesToAdd(), RESOURCESTOADD_BINDING);
            protocolMarshaller.marshall(updateMonitorRequest.getResourcesToRemove(), RESOURCESTOREMOVE_BINDING);
            protocolMarshaller.marshall(updateMonitorRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(updateMonitorRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateMonitorRequest.getMaxCityNetworksToMonitor(), MAXCITYNETWORKSTOMONITOR_BINDING);
            protocolMarshaller.marshall(updateMonitorRequest.getInternetMeasurementsLogDelivery(), INTERNETMEASUREMENTSLOGDELIVERY_BINDING);
            protocolMarshaller.marshall(updateMonitorRequest.getTrafficPercentageToMonitor(), TRAFFICPERCENTAGETOMONITOR_BINDING);
            protocolMarshaller.marshall(updateMonitorRequest.getHealthEventsConfig(), HEALTHEVENTSCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
