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
package com.amazonaws.services.codecommit.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EvaluationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EvaluationMarshaller {

    private static final MarshallingInfo<Boolean> APPROVED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approved").build();
    private static final MarshallingInfo<Boolean> OVERRIDDEN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("overridden").build();
    private static final MarshallingInfo<List> APPROVALRULESSATISFIED_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approvalRulesSatisfied").build();
    private static final MarshallingInfo<List> APPROVALRULESNOTSATISFIED_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approvalRulesNotSatisfied").build();

    private static final EvaluationMarshaller instance = new EvaluationMarshaller();

    public static EvaluationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Evaluation evaluation, ProtocolMarshaller protocolMarshaller) {

        if (evaluation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(evaluation.getApproved(), APPROVED_BINDING);
            protocolMarshaller.marshall(evaluation.getOverridden(), OVERRIDDEN_BINDING);
            protocolMarshaller.marshall(evaluation.getApprovalRulesSatisfied(), APPROVALRULESSATISFIED_BINDING);
            protocolMarshaller.marshall(evaluation.getApprovalRulesNotSatisfied(), APPROVALRULESNOTSATISFIED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
