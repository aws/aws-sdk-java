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
package com.amazonaws.services.inspector2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LambdaLayerAggregationResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LambdaLayerAggregationResponseMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> FUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("functionName").build();
    private static final MarshallingInfo<String> LAYERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("layerArn").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceId").build();
    private static final MarshallingInfo<StructuredPojo> SEVERITYCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("severityCounts").build();

    private static final LambdaLayerAggregationResponseMarshaller instance = new LambdaLayerAggregationResponseMarshaller();

    public static LambdaLayerAggregationResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LambdaLayerAggregationResponse lambdaLayerAggregationResponse, ProtocolMarshaller protocolMarshaller) {

        if (lambdaLayerAggregationResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lambdaLayerAggregationResponse.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(lambdaLayerAggregationResponse.getFunctionName(), FUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(lambdaLayerAggregationResponse.getLayerArn(), LAYERARN_BINDING);
            protocolMarshaller.marshall(lambdaLayerAggregationResponse.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(lambdaLayerAggregationResponse.getSeverityCounts(), SEVERITYCOUNTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
