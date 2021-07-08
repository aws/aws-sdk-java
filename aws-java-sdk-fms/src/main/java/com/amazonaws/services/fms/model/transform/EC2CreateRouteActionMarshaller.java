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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EC2CreateRouteActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EC2CreateRouteActionMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> DESTINATIONCIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationCidrBlock").build();
    private static final MarshallingInfo<String> DESTINATIONPREFIXLISTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationPrefixListId").build();
    private static final MarshallingInfo<String> DESTINATIONIPV6CIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationIpv6CidrBlock").build();
    private static final MarshallingInfo<StructuredPojo> VPCENDPOINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcEndpointId").build();
    private static final MarshallingInfo<StructuredPojo> GATEWAYID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayId").build();
    private static final MarshallingInfo<StructuredPojo> ROUTETABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RouteTableId").build();

    private static final EC2CreateRouteActionMarshaller instance = new EC2CreateRouteActionMarshaller();

    public static EC2CreateRouteActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EC2CreateRouteAction eC2CreateRouteAction, ProtocolMarshaller protocolMarshaller) {

        if (eC2CreateRouteAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eC2CreateRouteAction.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(eC2CreateRouteAction.getDestinationCidrBlock(), DESTINATIONCIDRBLOCK_BINDING);
            protocolMarshaller.marshall(eC2CreateRouteAction.getDestinationPrefixListId(), DESTINATIONPREFIXLISTID_BINDING);
            protocolMarshaller.marshall(eC2CreateRouteAction.getDestinationIpv6CidrBlock(), DESTINATIONIPV6CIDRBLOCK_BINDING);
            protocolMarshaller.marshall(eC2CreateRouteAction.getVpcEndpointId(), VPCENDPOINTID_BINDING);
            protocolMarshaller.marshall(eC2CreateRouteAction.getGatewayId(), GATEWAYID_BINDING);
            protocolMarshaller.marshall(eC2CreateRouteAction.getRouteTableId(), ROUTETABLEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
