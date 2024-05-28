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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EvaluationFormQuestionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EvaluationFormQuestionMarshaller {

    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> INSTRUCTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Instructions").build();
    private static final MarshallingInfo<String> REFID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RefId").build();
    private static final MarshallingInfo<Boolean> NOTAPPLICABLEENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotApplicableEnabled").build();
    private static final MarshallingInfo<String> QUESTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionType").build();
    private static final MarshallingInfo<StructuredPojo> QUESTIONTYPEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionTypeProperties").build();
    private static final MarshallingInfo<Double> WEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Weight").build();

    private static final EvaluationFormQuestionMarshaller instance = new EvaluationFormQuestionMarshaller();

    public static EvaluationFormQuestionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EvaluationFormQuestion evaluationFormQuestion, ProtocolMarshaller protocolMarshaller) {

        if (evaluationFormQuestion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(evaluationFormQuestion.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(evaluationFormQuestion.getInstructions(), INSTRUCTIONS_BINDING);
            protocolMarshaller.marshall(evaluationFormQuestion.getRefId(), REFID_BINDING);
            protocolMarshaller.marshall(evaluationFormQuestion.getNotApplicableEnabled(), NOTAPPLICABLEENABLED_BINDING);
            protocolMarshaller.marshall(evaluationFormQuestion.getQuestionType(), QUESTIONTYPE_BINDING);
            protocolMarshaller.marshall(evaluationFormQuestion.getQuestionTypeProperties(), QUESTIONTYPEPROPERTIES_BINDING);
            protocolMarshaller.marshall(evaluationFormQuestion.getWeight(), WEIGHT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
