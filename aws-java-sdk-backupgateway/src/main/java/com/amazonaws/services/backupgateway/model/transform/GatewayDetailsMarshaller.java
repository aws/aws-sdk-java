/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupgateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backupgateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GatewayDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GatewayDetailsMarshaller {

    private static final MarshallingInfo<String> GATEWAYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayArn").build();
    private static final MarshallingInfo<String> GATEWAYDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayDisplayName").build();
    private static final MarshallingInfo<String> GATEWAYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayType").build();
    private static final MarshallingInfo<String> HYPERVISORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HypervisorId").build();
    private static final MarshallingInfo<java.util.Date> LASTSEENTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSeenTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> MAINTENANCESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaintenanceStartTime").build();
    private static final MarshallingInfo<java.util.Date> NEXTUPDATEAVAILABILITYTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NextUpdateAvailabilityTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> VPCENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcEndpoint").build();

    private static final GatewayDetailsMarshaller instance = new GatewayDetailsMarshaller();

    public static GatewayDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GatewayDetails gatewayDetails, ProtocolMarshaller protocolMarshaller) {

        if (gatewayDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gatewayDetails.getGatewayArn(), GATEWAYARN_BINDING);
            protocolMarshaller.marshall(gatewayDetails.getGatewayDisplayName(), GATEWAYDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(gatewayDetails.getGatewayType(), GATEWAYTYPE_BINDING);
            protocolMarshaller.marshall(gatewayDetails.getHypervisorId(), HYPERVISORID_BINDING);
            protocolMarshaller.marshall(gatewayDetails.getLastSeenTime(), LASTSEENTIME_BINDING);
            protocolMarshaller.marshall(gatewayDetails.getMaintenanceStartTime(), MAINTENANCESTARTTIME_BINDING);
            protocolMarshaller.marshall(gatewayDetails.getNextUpdateAvailabilityTime(), NEXTUPDATEAVAILABILITYTIME_BINDING);
            protocolMarshaller.marshall(gatewayDetails.getVpcEndpoint(), VPCENDPOINT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
