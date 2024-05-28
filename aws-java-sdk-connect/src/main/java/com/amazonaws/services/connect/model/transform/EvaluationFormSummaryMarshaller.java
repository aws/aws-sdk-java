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
 * EvaluationFormSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EvaluationFormSummaryMarshaller {

    private static final MarshallingInfo<String> EVALUATIONFORMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationFormId").build();
    private static final MarshallingInfo<String> EVALUATIONFORMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationFormArn").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTMODIFIEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedBy").build();
    private static final MarshallingInfo<java.util.Date> LASTACTIVATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastActivatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTACTIVATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastActivatedBy").build();
    private static final MarshallingInfo<Integer> LATESTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestVersion").build();
    private static final MarshallingInfo<Integer> ACTIVEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveVersion").build();

    private static final EvaluationFormSummaryMarshaller instance = new EvaluationFormSummaryMarshaller();

    public static EvaluationFormSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EvaluationFormSummary evaluationFormSummary, ProtocolMarshaller protocolMarshaller) {

        if (evaluationFormSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(evaluationFormSummary.getEvaluationFormId(), EVALUATIONFORMID_BINDING);
            protocolMarshaller.marshall(evaluationFormSummary.getEvaluationFormArn(), EVALUATIONFORMARN_BINDING);
            protocolMarshaller.marshall(evaluationFormSummary.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(evaluationFormSummary.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(evaluationFormSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(evaluationFormSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(evaluationFormSummary.getLastModifiedBy(), LASTMODIFIEDBY_BINDING);
            protocolMarshaller.marshall(evaluationFormSummary.getLastActivatedTime(), LASTACTIVATEDTIME_BINDING);
            protocolMarshaller.marshall(evaluationFormSummary.getLastActivatedBy(), LASTACTIVATEDBY_BINDING);
            protocolMarshaller.marshall(evaluationFormSummary.getLatestVersion(), LATESTVERSION_BINDING);
            protocolMarshaller.marshall(evaluationFormSummary.getActiveVersion(), ACTIVEVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
