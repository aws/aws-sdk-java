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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LambdaFunctionAggregationResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LambdaFunctionAggregationResponseMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> FUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("functionName").build();
    private static final MarshallingInfo<Map> LAMBDATAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lambdaTags").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceId").build();
    private static final MarshallingInfo<String> RUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runtime").build();
    private static final MarshallingInfo<StructuredPojo> SEVERITYCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("severityCounts").build();

    private static final LambdaFunctionAggregationResponseMarshaller instance = new LambdaFunctionAggregationResponseMarshaller();

    public static LambdaFunctionAggregationResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LambdaFunctionAggregationResponse lambdaFunctionAggregationResponse, ProtocolMarshaller protocolMarshaller) {

        if (lambdaFunctionAggregationResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lambdaFunctionAggregationResponse.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(lambdaFunctionAggregationResponse.getFunctionName(), FUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(lambdaFunctionAggregationResponse.getLambdaTags(), LAMBDATAGS_BINDING);
            protocolMarshaller.marshall(lambdaFunctionAggregationResponse.getLastModifiedAt(), LASTMODIFIEDAT_BINDING);
            protocolMarshaller.marshall(lambdaFunctionAggregationResponse.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(lambdaFunctionAggregationResponse.getRuntime(), RUNTIME_BINDING);
            protocolMarshaller.marshall(lambdaFunctionAggregationResponse.getSeverityCounts(), SEVERITYCOUNTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
