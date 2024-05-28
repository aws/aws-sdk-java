/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RealTimeAlertRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RealTimeAlertRuleMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> KEYWORDMATCHCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeywordMatchConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SENTIMENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SentimentConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> ISSUEDETECTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IssueDetectionConfiguration").build();

    private static final RealTimeAlertRuleMarshaller instance = new RealTimeAlertRuleMarshaller();

    public static RealTimeAlertRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RealTimeAlertRule realTimeAlertRule, ProtocolMarshaller protocolMarshaller) {

        if (realTimeAlertRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(realTimeAlertRule.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(realTimeAlertRule.getKeywordMatchConfiguration(), KEYWORDMATCHCONFIGURATION_BINDING);
            protocolMarshaller.marshall(realTimeAlertRule.getSentimentConfiguration(), SENTIMENTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(realTimeAlertRule.getIssueDetectionConfiguration(), ISSUEDETECTIONCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
