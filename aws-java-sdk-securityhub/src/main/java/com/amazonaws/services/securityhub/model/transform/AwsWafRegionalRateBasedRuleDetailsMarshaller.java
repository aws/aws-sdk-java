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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsWafRegionalRateBasedRuleDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsWafRegionalRateBasedRuleDetailsMarshaller {

    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> RATEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RateKey").build();
    private static final MarshallingInfo<Long> RATELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RateLimit").build();
    private static final MarshallingInfo<String> RULEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleId").build();
    private static final MarshallingInfo<List> MATCHPREDICATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MatchPredicates").build();

    private static final AwsWafRegionalRateBasedRuleDetailsMarshaller instance = new AwsWafRegionalRateBasedRuleDetailsMarshaller();

    public static AwsWafRegionalRateBasedRuleDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsWafRegionalRateBasedRuleDetails awsWafRegionalRateBasedRuleDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsWafRegionalRateBasedRuleDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsWafRegionalRateBasedRuleDetails.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(awsWafRegionalRateBasedRuleDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(awsWafRegionalRateBasedRuleDetails.getRateKey(), RATEKEY_BINDING);
            protocolMarshaller.marshall(awsWafRegionalRateBasedRuleDetails.getRateLimit(), RATELIMIT_BINDING);
            protocolMarshaller.marshall(awsWafRegionalRateBasedRuleDetails.getRuleId(), RULEID_BINDING);
            protocolMarshaller.marshall(awsWafRegionalRateBasedRuleDetails.getMatchPredicates(), MATCHPREDICATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
