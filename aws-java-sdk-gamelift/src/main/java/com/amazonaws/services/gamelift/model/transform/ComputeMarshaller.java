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
package com.amazonaws.services.gamelift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComputeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComputeMarshaller {

    private static final MarshallingInfo<String> FLEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetId").build();
    private static final MarshallingInfo<String> FLEETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetArn").build();
    private static final MarshallingInfo<String> COMPUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputeName").build();
    private static final MarshallingInfo<String> COMPUTEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputeArn").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpAddress").build();
    private static final MarshallingInfo<String> DNSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DnsName").build();
    private static final MarshallingInfo<String> COMPUTESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputeStatus").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Location").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> OPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperatingSystem").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> GAMELIFTSERVICESDKENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GameLiftServiceSdkEndpoint").build();

    private static final ComputeMarshaller instance = new ComputeMarshaller();

    public static ComputeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Compute compute, ProtocolMarshaller protocolMarshaller) {

        if (compute == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(compute.getFleetId(), FLEETID_BINDING);
            protocolMarshaller.marshall(compute.getFleetArn(), FLEETARN_BINDING);
            protocolMarshaller.marshall(compute.getComputeName(), COMPUTENAME_BINDING);
            protocolMarshaller.marshall(compute.getComputeArn(), COMPUTEARN_BINDING);
            protocolMarshaller.marshall(compute.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(compute.getDnsName(), DNSNAME_BINDING);
            protocolMarshaller.marshall(compute.getComputeStatus(), COMPUTESTATUS_BINDING);
            protocolMarshaller.marshall(compute.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(compute.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(compute.getOperatingSystem(), OPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(compute.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(compute.getGameLiftServiceSdkEndpoint(), GAMELIFTSERVICESDKENDPOINT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
