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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ECSServiceRecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ECSServiceRecommendationMarshaller {

    private static final MarshallingInfo<String> SERVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceArn").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTSERVICECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentServiceConfiguration").build();
    private static final MarshallingInfo<List> UTILIZATIONMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("utilizationMetrics").build();
    private static final MarshallingInfo<Double> LOOKBACKPERIODINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lookbackPeriodInDays").build();
    private static final MarshallingInfo<String> LAUNCHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchType").build();
    private static final MarshallingInfo<java.util.Date> LASTREFRESHTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastRefreshTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FINDING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("finding").build();
    private static final MarshallingInfo<List> FINDINGREASONCODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingReasonCodes").build();
    private static final MarshallingInfo<List> SERVICERECOMMENDATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceRecommendationOptions").build();
    private static final MarshallingInfo<String> CURRENTPERFORMANCERISK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentPerformanceRisk").build();

    private static final ECSServiceRecommendationMarshaller instance = new ECSServiceRecommendationMarshaller();

    public static ECSServiceRecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ECSServiceRecommendation eCSServiceRecommendation, ProtocolMarshaller protocolMarshaller) {

        if (eCSServiceRecommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eCSServiceRecommendation.getServiceArn(), SERVICEARN_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendation.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendation.getCurrentServiceConfiguration(), CURRENTSERVICECONFIGURATION_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendation.getUtilizationMetrics(), UTILIZATIONMETRICS_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendation.getLookbackPeriodInDays(), LOOKBACKPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendation.getLaunchType(), LAUNCHTYPE_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendation.getLastRefreshTimestamp(), LASTREFRESHTIMESTAMP_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendation.getFinding(), FINDING_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendation.getFindingReasonCodes(), FINDINGREASONCODES_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendation.getServiceRecommendationOptions(), SERVICERECOMMENDATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendation.getCurrentPerformanceRisk(), CURRENTPERFORMANCERISK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
