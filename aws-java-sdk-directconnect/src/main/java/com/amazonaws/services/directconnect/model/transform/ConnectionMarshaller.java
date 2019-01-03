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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectionMarshaller {

    private static final MarshallingInfo<String> OWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ownerAccount").build();
    private static final MarshallingInfo<String> CONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionId").build();
    private static final MarshallingInfo<String> CONNECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionName").build();
    private static final MarshallingInfo<String> CONNECTIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionState").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("location").build();
    private static final MarshallingInfo<String> BANDWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bandwidth").build();
    private static final MarshallingInfo<Integer> VLAN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vlan").build();
    private static final MarshallingInfo<String> PARTNERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("partnerName").build();
    private static final MarshallingInfo<java.util.Date> LOAISSUETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loaIssueTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LAGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lagId").build();
    private static final MarshallingInfo<String> AWSDEVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("awsDevice").build();
    private static final MarshallingInfo<Boolean> JUMBOFRAMECAPABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jumboFrameCapable").build();
    private static final MarshallingInfo<String> AWSDEVICEV2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsDeviceV2").build();
    private static final MarshallingInfo<String> HASLOGICALREDUNDANCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hasLogicalRedundancy").build();

    private static final ConnectionMarshaller instance = new ConnectionMarshaller();

    public static ConnectionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Connection connection, ProtocolMarshaller protocolMarshaller) {

        if (connection == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connection.getOwnerAccount(), OWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(connection.getConnectionId(), CONNECTIONID_BINDING);
            protocolMarshaller.marshall(connection.getConnectionName(), CONNECTIONNAME_BINDING);
            protocolMarshaller.marshall(connection.getConnectionState(), CONNECTIONSTATE_BINDING);
            protocolMarshaller.marshall(connection.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(connection.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(connection.getBandwidth(), BANDWIDTH_BINDING);
            protocolMarshaller.marshall(connection.getVlan(), VLAN_BINDING);
            protocolMarshaller.marshall(connection.getPartnerName(), PARTNERNAME_BINDING);
            protocolMarshaller.marshall(connection.getLoaIssueTime(), LOAISSUETIME_BINDING);
            protocolMarshaller.marshall(connection.getLagId(), LAGID_BINDING);
            protocolMarshaller.marshall(connection.getAwsDevice(), AWSDEVICE_BINDING);
            protocolMarshaller.marshall(connection.getJumboFrameCapable(), JUMBOFRAMECAPABLE_BINDING);
            protocolMarshaller.marshall(connection.getAwsDeviceV2(), AWSDEVICEV2_BINDING);
            protocolMarshaller.marshall(connection.getHasLogicalRedundancy(), HASLOGICALREDUNDANCY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
