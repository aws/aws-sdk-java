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
 * AutoScalingGroupRecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoScalingGroupRecommendationMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> AUTOSCALINGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingGroupArn").build();
    private static final MarshallingInfo<String> AUTOSCALINGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingGroupName").build();
    private static final MarshallingInfo<String> FINDING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("finding").build();
    private static final MarshallingInfo<List> UTILIZATIONMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("utilizationMetrics").build();
    private static final MarshallingInfo<Double> LOOKBACKPERIODINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lookBackPeriodInDays").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentConfiguration").build();
    private static final MarshallingInfo<List> RECOMMENDATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationOptions").build();
    private static final MarshallingInfo<java.util.Date> LASTREFRESHTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastRefreshTimestamp").timestampFormat("unixTimestamp").build();

    private static final AutoScalingGroupRecommendationMarshaller instance = new AutoScalingGroupRecommendationMarshaller();

    public static AutoScalingGroupRecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoScalingGroupRecommendation autoScalingGroupRecommendation, ProtocolMarshaller protocolMarshaller) {

        if (autoScalingGroupRecommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoScalingGroupRecommendation.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(autoScalingGroupRecommendation.getAutoScalingGroupArn(), AUTOSCALINGGROUPARN_BINDING);
            protocolMarshaller.marshall(autoScalingGroupRecommendation.getAutoScalingGroupName(), AUTOSCALINGGROUPNAME_BINDING);
            protocolMarshaller.marshall(autoScalingGroupRecommendation.getFinding(), FINDING_BINDING);
            protocolMarshaller.marshall(autoScalingGroupRecommendation.getUtilizationMetrics(), UTILIZATIONMETRICS_BINDING);
            protocolMarshaller.marshall(autoScalingGroupRecommendation.getLookBackPeriodInDays(), LOOKBACKPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(autoScalingGroupRecommendation.getCurrentConfiguration(), CURRENTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(autoScalingGroupRecommendation.getRecommendationOptions(), RECOMMENDATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(autoScalingGroupRecommendation.getLastRefreshTimestamp(), LASTREFRESHTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
