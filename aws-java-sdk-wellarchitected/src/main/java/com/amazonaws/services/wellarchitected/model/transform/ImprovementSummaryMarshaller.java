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
package com.amazonaws.services.wellarchitected.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImprovementSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImprovementSummaryMarshaller {

    private static final MarshallingInfo<String> QUESTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionId").build();
    private static final MarshallingInfo<String> PILLARID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PillarId").build();
    private static final MarshallingInfo<String> QUESTIONTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionTitle").build();
    private static final MarshallingInfo<String> RISK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Risk").build();
    private static final MarshallingInfo<String> IMPROVEMENTPLANURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImprovementPlanUrl").build();

    private static final ImprovementSummaryMarshaller instance = new ImprovementSummaryMarshaller();

    public static ImprovementSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImprovementSummary improvementSummary, ProtocolMarshaller protocolMarshaller) {

        if (improvementSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(improvementSummary.getQuestionId(), QUESTIONID_BINDING);
            protocolMarshaller.marshall(improvementSummary.getPillarId(), PILLARID_BINDING);
            protocolMarshaller.marshall(improvementSummary.getQuestionTitle(), QUESTIONTITLE_BINDING);
            protocolMarshaller.marshall(improvementSummary.getRisk(), RISK_BINDING);
            protocolMarshaller.marshall(improvementSummary.getImprovementPlanUrl(), IMPROVEMENTPLANURL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
