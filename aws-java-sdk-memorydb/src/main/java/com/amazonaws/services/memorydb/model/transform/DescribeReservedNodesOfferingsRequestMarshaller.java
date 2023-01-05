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
package com.amazonaws.services.memorydb.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.memorydb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeReservedNodesOfferingsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeReservedNodesOfferingsRequestMarshaller {

    private static final MarshallingInfo<String> RESERVEDNODESOFFERINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservedNodesOfferingId").build();
    private static final MarshallingInfo<String> NODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeType").build();
    private static final MarshallingInfo<String> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Duration").build();
    private static final MarshallingInfo<String> OFFERINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OfferingType").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final DescribeReservedNodesOfferingsRequestMarshaller instance = new DescribeReservedNodesOfferingsRequestMarshaller();

    public static DescribeReservedNodesOfferingsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeReservedNodesOfferingsRequest describeReservedNodesOfferingsRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeReservedNodesOfferingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeReservedNodesOfferingsRequest.getReservedNodesOfferingId(), RESERVEDNODESOFFERINGID_BINDING);
            protocolMarshaller.marshall(describeReservedNodesOfferingsRequest.getNodeType(), NODETYPE_BINDING);
            protocolMarshaller.marshall(describeReservedNodesOfferingsRequest.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(describeReservedNodesOfferingsRequest.getOfferingType(), OFFERINGTYPE_BINDING);
            protocolMarshaller.marshall(describeReservedNodesOfferingsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(describeReservedNodesOfferingsRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
