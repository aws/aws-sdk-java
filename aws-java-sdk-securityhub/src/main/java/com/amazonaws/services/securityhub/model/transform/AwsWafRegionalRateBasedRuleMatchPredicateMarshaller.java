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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsWafRegionalRateBasedRuleMatchPredicateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsWafRegionalRateBasedRuleMatchPredicateMarshaller {

    private static final MarshallingInfo<String> DATAID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataId").build();
    private static final MarshallingInfo<Boolean> NEGATED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Negated").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();

    private static final AwsWafRegionalRateBasedRuleMatchPredicateMarshaller instance = new AwsWafRegionalRateBasedRuleMatchPredicateMarshaller();

    public static AwsWafRegionalRateBasedRuleMatchPredicateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsWafRegionalRateBasedRuleMatchPredicate awsWafRegionalRateBasedRuleMatchPredicate, ProtocolMarshaller protocolMarshaller) {

        if (awsWafRegionalRateBasedRuleMatchPredicate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsWafRegionalRateBasedRuleMatchPredicate.getDataId(), DATAID_BINDING);
            protocolMarshaller.marshall(awsWafRegionalRateBasedRuleMatchPredicate.getNegated(), NEGATED_BINDING);
            protocolMarshaller.marshall(awsWafRegionalRateBasedRuleMatchPredicate.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
