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
 * EC2DeleteRouteActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EC2DeleteRouteActionMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> DESTINATIONCIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationCidrBlock").build();
    private static final MarshallingInfo<String> DESTINATIONPREFIXLISTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationPrefixListId").build();
    private static final MarshallingInfo<String> DESTINATIONIPV6CIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationIpv6CidrBlock").build();
    private static final MarshallingInfo<StructuredPojo> ROUTETABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RouteTableId").build();

    private static final EC2DeleteRouteActionMarshaller instance = new EC2DeleteRouteActionMarshaller();

    public static EC2DeleteRouteActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EC2DeleteRouteAction eC2DeleteRouteAction, ProtocolMarshaller protocolMarshaller) {

        if (eC2DeleteRouteAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eC2DeleteRouteAction.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(eC2DeleteRouteAction.getDestinationCidrBlock(), DESTINATIONCIDRBLOCK_BINDING);
            protocolMarshaller.marshall(eC2DeleteRouteAction.getDestinationPrefixListId(), DESTINATIONPREFIXLISTID_BINDING);
            protocolMarshaller.marshall(eC2DeleteRouteAction.getDestinationIpv6CidrBlock(), DESTINATIONIPV6CIDRBLOCK_BINDING);
            protocolMarshaller.marshall(eC2DeleteRouteAction.getRouteTableId(), ROUTETABLEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
