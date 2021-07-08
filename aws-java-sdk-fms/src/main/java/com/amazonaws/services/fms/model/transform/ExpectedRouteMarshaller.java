/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExpectedRouteMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExpectedRouteMarshaller {

    private static final MarshallingInfo<String> IPV4CIDR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpV4Cidr").build();
    private static final MarshallingInfo<String> PREFIXLISTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrefixListId").build();
    private static final MarshallingInfo<String> IPV6CIDR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpV6Cidr").build();
    private static final MarshallingInfo<List> CONTRIBUTINGSUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContributingSubnets").build();
    private static final MarshallingInfo<List> ALLOWEDTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedTargets").build();
    private static final MarshallingInfo<String> ROUTETABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RouteTableId").build();

    private static final ExpectedRouteMarshaller instance = new ExpectedRouteMarshaller();

    public static ExpectedRouteMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExpectedRoute expectedRoute, ProtocolMarshaller protocolMarshaller) {

        if (expectedRoute == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(expectedRoute.getIpV4Cidr(), IPV4CIDR_BINDING);
            protocolMarshaller.marshall(expectedRoute.getPrefixListId(), PREFIXLISTID_BINDING);
            protocolMarshaller.marshall(expectedRoute.getIpV6Cidr(), IPV6CIDR_BINDING);
            protocolMarshaller.marshall(expectedRoute.getContributingSubnets(), CONTRIBUTINGSUBNETS_BINDING);
            protocolMarshaller.marshall(expectedRoute.getAllowedTargets(), ALLOWEDTARGETS_BINDING);
            protocolMarshaller.marshall(expectedRoute.getRouteTableId(), ROUTETABLEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
