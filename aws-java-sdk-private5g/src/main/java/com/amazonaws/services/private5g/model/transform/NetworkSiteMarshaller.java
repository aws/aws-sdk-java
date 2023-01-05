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
package com.amazonaws.services.private5g.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.private5g.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkSiteMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkSiteMarshaller {

    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZone").build();
    private static final MarshallingInfo<String> AVAILABILITYZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZoneId").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTPLAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentPlan").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> NETWORKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkArn").build();
    private static final MarshallingInfo<String> NETWORKSITEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkSiteArn").build();
    private static final MarshallingInfo<String> NETWORKSITENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkSiteName").build();
    private static final MarshallingInfo<StructuredPojo> PENDINGPLAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pendingPlan").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusReason").build();

    private static final NetworkSiteMarshaller instance = new NetworkSiteMarshaller();

    public static NetworkSiteMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkSite networkSite, ProtocolMarshaller protocolMarshaller) {

        if (networkSite == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkSite.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(networkSite.getAvailabilityZoneId(), AVAILABILITYZONEID_BINDING);
            protocolMarshaller.marshall(networkSite.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(networkSite.getCurrentPlan(), CURRENTPLAN_BINDING);
            protocolMarshaller.marshall(networkSite.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(networkSite.getNetworkArn(), NETWORKARN_BINDING);
            protocolMarshaller.marshall(networkSite.getNetworkSiteArn(), NETWORKSITEARN_BINDING);
            protocolMarshaller.marshall(networkSite.getNetworkSiteName(), NETWORKSITENAME_BINDING);
            protocolMarshaller.marshall(networkSite.getPendingPlan(), PENDINGPLAN_BINDING);
            protocolMarshaller.marshall(networkSite.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(networkSite.getStatusReason(), STATUSREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
