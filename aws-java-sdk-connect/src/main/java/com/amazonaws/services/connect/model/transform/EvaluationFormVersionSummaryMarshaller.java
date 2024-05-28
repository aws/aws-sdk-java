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
 * EvaluationFormVersionSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EvaluationFormVersionSummaryMarshaller {

    private static final MarshallingInfo<String> EVALUATIONFORMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationFormArn").build();
    private static final MarshallingInfo<String> EVALUATIONFORMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationFormId").build();
    private static final MarshallingInfo<Integer> EVALUATIONFORMVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationFormVersion").build();
    private static final MarshallingInfo<Boolean> LOCKED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Locked").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTMODIFIEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedBy").build();

    private static final EvaluationFormVersionSummaryMarshaller instance = new EvaluationFormVersionSummaryMarshaller();

    public static EvaluationFormVersionSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EvaluationFormVersionSummary evaluationFormVersionSummary, ProtocolMarshaller protocolMarshaller) {

        if (evaluationFormVersionSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(evaluationFormVersionSummary.getEvaluationFormArn(), EVALUATIONFORMARN_BINDING);
            protocolMarshaller.marshall(evaluationFormVersionSummary.getEvaluationFormId(), EVALUATIONFORMID_BINDING);
            protocolMarshaller.marshall(evaluationFormVersionSummary.getEvaluationFormVersion(), EVALUATIONFORMVERSION_BINDING);
            protocolMarshaller.marshall(evaluationFormVersionSummary.getLocked(), LOCKED_BINDING);
            protocolMarshaller.marshall(evaluationFormVersionSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(evaluationFormVersionSummary.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(evaluationFormVersionSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(evaluationFormVersionSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(evaluationFormVersionSummary.getLastModifiedBy(), LASTMODIFIEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
