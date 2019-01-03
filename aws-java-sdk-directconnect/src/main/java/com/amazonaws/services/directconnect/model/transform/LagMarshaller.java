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
package com.amazonaws.services.directconnect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LagMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LagMarshaller {

    private static final MarshallingInfo<String> CONNECTIONSBANDWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionsBandwidth").build();
    private static final MarshallingInfo<Integer> NUMBEROFCONNECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfConnections").build();
    private static final MarshallingInfo<String> LAGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lagId").build();
    private static final MarshallingInfo<String> OWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ownerAccount").build();
    private static final MarshallingInfo<String> LAGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lagName").build();
    private static final MarshallingInfo<String> LAGSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lagState").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("location").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<Integer> MINIMUMLINKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minimumLinks").build();
    private static final MarshallingInfo<String> AWSDEVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("awsDevice").build();
    private static final MarshallingInfo<String> AWSDEVICEV2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsDeviceV2").build();
    private static final MarshallingInfo<List> CONNECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("connections").build();
    private static final MarshallingInfo<Boolean> ALLOWSHOSTEDCONNECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowsHostedConnections").build();
    private static final MarshallingInfo<Boolean> JUMBOFRAMECAPABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jumboFrameCapable").build();
    private static final MarshallingInfo<String> HASLOGICALREDUNDANCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hasLogicalRedundancy").build();

    private static final LagMarshaller instance = new LagMarshaller();

    public static LagMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Lag lag, ProtocolMarshaller protocolMarshaller) {

        if (lag == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lag.getConnectionsBandwidth(), CONNECTIONSBANDWIDTH_BINDING);
            protocolMarshaller.marshall(lag.getNumberOfConnections(), NUMBEROFCONNECTIONS_BINDING);
            protocolMarshaller.marshall(lag.getLagId(), LAGID_BINDING);
            protocolMarshaller.marshall(lag.getOwnerAccount(), OWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(lag.getLagName(), LAGNAME_BINDING);
            protocolMarshaller.marshall(lag.getLagState(), LAGSTATE_BINDING);
            protocolMarshaller.marshall(lag.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(lag.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(lag.getMinimumLinks(), MINIMUMLINKS_BINDING);
            protocolMarshaller.marshall(lag.getAwsDevice(), AWSDEVICE_BINDING);
            protocolMarshaller.marshall(lag.getAwsDeviceV2(), AWSDEVICEV2_BINDING);
            protocolMarshaller.marshall(lag.getConnections(), CONNECTIONS_BINDING);
            protocolMarshaller.marshall(lag.getAllowsHostedConnections(), ALLOWSHOSTEDCONNECTIONS_BINDING);
            protocolMarshaller.marshall(lag.getJumboFrameCapable(), JUMBOFRAMECAPABLE_BINDING);
            protocolMarshaller.marshall(lag.getHasLogicalRedundancy(), HASLOGICALREDUNDANCY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
