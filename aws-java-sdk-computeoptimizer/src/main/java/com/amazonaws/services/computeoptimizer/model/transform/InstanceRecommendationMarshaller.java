/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * InstanceRecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceRecommendationMarshaller {

    private static final MarshallingInfo<String> INSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceArn").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> INSTANCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceName").build();
    private static final MarshallingInfo<String> CURRENTINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentInstanceType").build();
    private static final MarshallingInfo<String> FINDING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("finding").build();
    private static final MarshallingInfo<List> UTILIZATIONMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("utilizationMetrics").build();
    private static final MarshallingInfo<Double> LOOKBACKPERIODINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lookBackPeriodInDays").build();
    private static final MarshallingInfo<List> RECOMMENDATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationOptions").build();
    private static final MarshallingInfo<List> RECOMMENDATIONSOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationSources").build();
    private static final MarshallingInfo<java.util.Date> LASTREFRESHTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastRefreshTimestamp").timestampFormat("unixTimestamp").build();

    private static final InstanceRecommendationMarshaller instance = new InstanceRecommendationMarshaller();

    public static InstanceRecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceRecommendation instanceRecommendation, ProtocolMarshaller protocolMarshaller) {

        if (instanceRecommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceRecommendation.getInstanceArn(), INSTANCEARN_BINDING);
            protocolMarshaller.marshall(instanceRecommendation.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(instanceRecommendation.getInstanceName(), INSTANCENAME_BINDING);
            protocolMarshaller.marshall(instanceRecommendation.getCurrentInstanceType(), CURRENTINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(instanceRecommendation.getFinding(), FINDING_BINDING);
            protocolMarshaller.marshall(instanceRecommendation.getUtilizationMetrics(), UTILIZATIONMETRICS_BINDING);
            protocolMarshaller.marshall(instanceRecommendation.getLookBackPeriodInDays(), LOOKBACKPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(instanceRecommendation.getRecommendationOptions(), RECOMMENDATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(instanceRecommendation.getRecommendationSources(), RECOMMENDATIONSOURCES_BINDING);
            protocolMarshaller.marshall(instanceRecommendation.getLastRefreshTimestamp(), LASTREFRESHTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
