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
package com.amazonaws.services.frauddetector.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EvaluatedRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EvaluatedRuleMarshaller {

    private static final MarshallingInfo<String> RULEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ruleId").build();
    private static final MarshallingInfo<String> RULEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ruleVersion").build();
    private static final MarshallingInfo<String> EXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expression").build();
    private static final MarshallingInfo<String> EXPRESSIONWITHVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expressionWithValues").build();
    private static final MarshallingInfo<List> OUTCOMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("outcomes").build();
    private static final MarshallingInfo<Boolean> EVALUATED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluated").build();
    private static final MarshallingInfo<Boolean> MATCHED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("matched").build();

    private static final EvaluatedRuleMarshaller instance = new EvaluatedRuleMarshaller();

    public static EvaluatedRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EvaluatedRule evaluatedRule, ProtocolMarshaller protocolMarshaller) {

        if (evaluatedRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(evaluatedRule.getRuleId(), RULEID_BINDING);
            protocolMarshaller.marshall(evaluatedRule.getRuleVersion(), RULEVERSION_BINDING);
            protocolMarshaller.marshall(evaluatedRule.getExpression(), EXPRESSION_BINDING);
            protocolMarshaller.marshall(evaluatedRule.getExpressionWithValues(), EXPRESSIONWITHVALUES_BINDING);
            protocolMarshaller.marshall(evaluatedRule.getOutcomes(), OUTCOMES_BINDING);
            protocolMarshaller.marshall(evaluatedRule.getEvaluated(), EVALUATED_BINDING);
            protocolMarshaller.marshall(evaluatedRule.getMatched(), MATCHED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
