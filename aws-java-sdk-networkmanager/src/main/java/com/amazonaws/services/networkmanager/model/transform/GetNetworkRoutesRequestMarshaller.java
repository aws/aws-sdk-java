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
package com.amazonaws.services.networkmanager.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetNetworkRoutesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetNetworkRoutesRequestMarshaller {

    private static final MarshallingInfo<String> GLOBALNETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("globalNetworkId").build();
    private static final MarshallingInfo<StructuredPojo> ROUTETABLEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RouteTableIdentifier").build();
    private static final MarshallingInfo<List> EXACTCIDRMATCHES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExactCidrMatches").build();
    private static final MarshallingInfo<List> LONGESTPREFIXMATCHES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LongestPrefixMatches").build();
    private static final MarshallingInfo<List> SUBNETOFMATCHES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetOfMatches").build();
    private static final MarshallingInfo<List> SUPERNETOFMATCHES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupernetOfMatches").build();
    private static final MarshallingInfo<List> PREFIXLISTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PrefixListIds").build();
    private static final MarshallingInfo<List> STATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("States").build();
    private static final MarshallingInfo<List> TYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Types").build();
    private static final MarshallingInfo<Map> DESTINATIONFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationFilters").build();

    private static final GetNetworkRoutesRequestMarshaller instance = new GetNetworkRoutesRequestMarshaller();

    public static GetNetworkRoutesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetNetworkRoutesRequest getNetworkRoutesRequest, ProtocolMarshaller protocolMarshaller) {

        if (getNetworkRoutesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getNetworkRoutesRequest.getGlobalNetworkId(), GLOBALNETWORKID_BINDING);
            protocolMarshaller.marshall(getNetworkRoutesRequest.getRouteTableIdentifier(), ROUTETABLEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(getNetworkRoutesRequest.getExactCidrMatches(), EXACTCIDRMATCHES_BINDING);
            protocolMarshaller.marshall(getNetworkRoutesRequest.getLongestPrefixMatches(), LONGESTPREFIXMATCHES_BINDING);
            protocolMarshaller.marshall(getNetworkRoutesRequest.getSubnetOfMatches(), SUBNETOFMATCHES_BINDING);
            protocolMarshaller.marshall(getNetworkRoutesRequest.getSupernetOfMatches(), SUPERNETOFMATCHES_BINDING);
            protocolMarshaller.marshall(getNetworkRoutesRequest.getPrefixListIds(), PREFIXLISTIDS_BINDING);
            protocolMarshaller.marshall(getNetworkRoutesRequest.getStates(), STATES_BINDING);
            protocolMarshaller.marshall(getNetworkRoutesRequest.getTypes(), TYPES_BINDING);
            protocolMarshaller.marshall(getNetworkRoutesRequest.getDestinationFilters(), DESTINATIONFILTERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
