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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LambdaFunctionRecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LambdaFunctionRecommendationMarshaller {

    private static final MarshallingInfo<String> FUNCTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("functionArn").build();
    private static final MarshallingInfo<String> FUNCTIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("functionVersion").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<Integer> CURRENTMEMORYSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentMemorySize").build();
    private static final MarshallingInfo<Long> NUMBEROFINVOCATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfInvocations").build();
    private static final MarshallingInfo<List> UTILIZATIONMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("utilizationMetrics").build();
    private static final MarshallingInfo<Double> LOOKBACKPERIODINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lookbackPeriodInDays").build();
    private static final MarshallingInfo<java.util.Date> LASTREFRESHTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastRefreshTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FINDING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("finding").build();
    private static final MarshallingInfo<List> FINDINGREASONCODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingReasonCodes").build();
    private static final MarshallingInfo<List> MEMORYSIZERECOMMENDATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("memorySizeRecommendationOptions").build();

    private static final LambdaFunctionRecommendationMarshaller instance = new LambdaFunctionRecommendationMarshaller();

    public static LambdaFunctionRecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LambdaFunctionRecommendation lambdaFunctionRecommendation, ProtocolMarshaller protocolMarshaller) {

        if (lambdaFunctionRecommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lambdaFunctionRecommendation.getFunctionArn(), FUNCTIONARN_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecommendation.getFunctionVersion(), FUNCTIONVERSION_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecommendation.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecommendation.getCurrentMemorySize(), CURRENTMEMORYSIZE_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecommendation.getNumberOfInvocations(), NUMBEROFINVOCATIONS_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecommendation.getUtilizationMetrics(), UTILIZATIONMETRICS_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecommendation.getLookbackPeriodInDays(), LOOKBACKPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecommendation.getLastRefreshTimestamp(), LASTREFRESHTIMESTAMP_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecommendation.getFinding(), FINDING_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecommendation.getFindingReasonCodes(), FINDINGREASONCODES_BINDING);
            protocolMarshaller.marshall(lambdaFunctionRecommendation.getMemorySizeRecommendationOptions(), MEMORYSIZERECOMMENDATIONOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
