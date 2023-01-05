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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CoreNetworkChangeValuesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CoreNetworkChangeValuesMarshaller {

    private static final MarshallingInfo<String> SEGMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentName").build();
    private static final MarshallingInfo<List> EDGELOCATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EdgeLocations").build();
    private static final MarshallingInfo<Long> ASN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Asn").build();
    private static final MarshallingInfo<String> CIDR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Cidr").build();
    private static final MarshallingInfo<String> DESTINATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationIdentifier").build();
    private static final MarshallingInfo<List> INSIDECIDRBLOCKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InsideCidrBlocks").build();
    private static final MarshallingInfo<List> SHAREDSEGMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SharedSegments").build();

    private static final CoreNetworkChangeValuesMarshaller instance = new CoreNetworkChangeValuesMarshaller();

    public static CoreNetworkChangeValuesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CoreNetworkChangeValues coreNetworkChangeValues, ProtocolMarshaller protocolMarshaller) {

        if (coreNetworkChangeValues == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(coreNetworkChangeValues.getSegmentName(), SEGMENTNAME_BINDING);
            protocolMarshaller.marshall(coreNetworkChangeValues.getEdgeLocations(), EDGELOCATIONS_BINDING);
            protocolMarshaller.marshall(coreNetworkChangeValues.getAsn(), ASN_BINDING);
            protocolMarshaller.marshall(coreNetworkChangeValues.getCidr(), CIDR_BINDING);
            protocolMarshaller.marshall(coreNetworkChangeValues.getDestinationIdentifier(), DESTINATIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(coreNetworkChangeValues.getInsideCidrBlocks(), INSIDECIDRBLOCKS_BINDING);
            protocolMarshaller.marshall(coreNetworkChangeValues.getSharedSegments(), SHAREDSEGMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
