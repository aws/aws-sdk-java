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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DebugRuleEvaluationStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DebugRuleEvaluationStatusMarshaller {

    private static final MarshallingInfo<String> RULECONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleConfigurationName").build();
    private static final MarshallingInfo<String> RULEEVALUATIONJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleEvaluationJobArn").build();
    private static final MarshallingInfo<String> RULEEVALUATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleEvaluationStatus").build();
    private static final MarshallingInfo<String> STATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusDetails").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();

    private static final DebugRuleEvaluationStatusMarshaller instance = new DebugRuleEvaluationStatusMarshaller();

    public static DebugRuleEvaluationStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DebugRuleEvaluationStatus debugRuleEvaluationStatus, ProtocolMarshaller protocolMarshaller) {

        if (debugRuleEvaluationStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(debugRuleEvaluationStatus.getRuleConfigurationName(), RULECONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(debugRuleEvaluationStatus.getRuleEvaluationJobArn(), RULEEVALUATIONJOBARN_BINDING);
            protocolMarshaller.marshall(debugRuleEvaluationStatus.getRuleEvaluationStatus(), RULEEVALUATIONSTATUS_BINDING);
            protocolMarshaller.marshall(debugRuleEvaluationStatus.getStatusDetails(), STATUSDETAILS_BINDING);
            protocolMarshaller.marshall(debugRuleEvaluationStatus.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
