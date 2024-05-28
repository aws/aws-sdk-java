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
 * EvaluationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EvaluationSummaryMarshaller {

    private static final MarshallingInfo<String> EVALUATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationId").build();
    private static final MarshallingInfo<String> EVALUATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationArn").build();
    private static final MarshallingInfo<String> EVALUATIONFORMTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationFormTitle").build();
    private static final MarshallingInfo<String> EVALUATIONFORMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationFormId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> EVALUATORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluatorArn").build();
    private static final MarshallingInfo<StructuredPojo> SCORE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Score").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();

    private static final EvaluationSummaryMarshaller instance = new EvaluationSummaryMarshaller();

    public static EvaluationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EvaluationSummary evaluationSummary, ProtocolMarshaller protocolMarshaller) {

        if (evaluationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(evaluationSummary.getEvaluationId(), EVALUATIONID_BINDING);
            protocolMarshaller.marshall(evaluationSummary.getEvaluationArn(), EVALUATIONARN_BINDING);
            protocolMarshaller.marshall(evaluationSummary.getEvaluationFormTitle(), EVALUATIONFORMTITLE_BINDING);
            protocolMarshaller.marshall(evaluationSummary.getEvaluationFormId(), EVALUATIONFORMID_BINDING);
            protocolMarshaller.marshall(evaluationSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(evaluationSummary.getEvaluatorArn(), EVALUATORARN_BINDING);
            protocolMarshaller.marshall(evaluationSummary.getScore(), SCORE_BINDING);
            protocolMarshaller.marshall(evaluationSummary.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(evaluationSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
