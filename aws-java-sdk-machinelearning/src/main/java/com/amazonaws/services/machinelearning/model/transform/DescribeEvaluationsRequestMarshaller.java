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
package com.amazonaws.services.machinelearning.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeEvaluationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeEvaluationsRequestMarshaller {

    private static final MarshallingInfo<String> FILTERVARIABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterVariable").build();
    private static final MarshallingInfo<String> EQ_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EQ").build();
    private static final MarshallingInfo<String> GT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GT").build();
    private static final MarshallingInfo<String> LT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LT").build();
    private static final MarshallingInfo<String> GE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GE").build();
    private static final MarshallingInfo<String> LE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LE").build();
    private static final MarshallingInfo<String> NE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NE").build();
    private static final MarshallingInfo<String> PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Prefix").build();
    private static final MarshallingInfo<String> SORTORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortOrder").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Limit").build();

    private static final DescribeEvaluationsRequestMarshaller instance = new DescribeEvaluationsRequestMarshaller();

    public static DescribeEvaluationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeEvaluationsRequest describeEvaluationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeEvaluationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeEvaluationsRequest.getFilterVariable(), FILTERVARIABLE_BINDING);
            protocolMarshaller.marshall(describeEvaluationsRequest.getEQ(), EQ_BINDING);
            protocolMarshaller.marshall(describeEvaluationsRequest.getGT(), GT_BINDING);
            protocolMarshaller.marshall(describeEvaluationsRequest.getLT(), LT_BINDING);
            protocolMarshaller.marshall(describeEvaluationsRequest.getGE(), GE_BINDING);
            protocolMarshaller.marshall(describeEvaluationsRequest.getLE(), LE_BINDING);
            protocolMarshaller.marshall(describeEvaluationsRequest.getNE(), NE_BINDING);
            protocolMarshaller.marshall(describeEvaluationsRequest.getPrefix(), PREFIX_BINDING);
            protocolMarshaller.marshall(describeEvaluationsRequest.getSortOrder(), SORTORDER_BINDING);
            protocolMarshaller.marshall(describeEvaluationsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(describeEvaluationsRequest.getLimit(), LIMIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
