/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * LabelingJobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LabelingJobSummaryMarshaller {

    private static final MarshallingInfo<String> LABELINGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelingJobName").build();
    private static final MarshallingInfo<String> LABELINGJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelingJobArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LABELINGJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelingJobStatus").build();
    private static final MarshallingInfo<StructuredPojo> LABELCOUNTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelCounters").build();
    private static final MarshallingInfo<String> WORKTEAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkteamArn").build();
    private static final MarshallingInfo<String> PREHUMANTASKLAMBDAARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreHumanTaskLambdaArn").build();
    private static final MarshallingInfo<String> ANNOTATIONCONSOLIDATIONLAMBDAARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnnotationConsolidationLambdaArn").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<StructuredPojo> LABELINGJOBOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelingJobOutput").build();
    private static final MarshallingInfo<StructuredPojo> INPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputConfig").build();

    private static final LabelingJobSummaryMarshaller instance = new LabelingJobSummaryMarshaller();

    public static LabelingJobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LabelingJobSummary labelingJobSummary, ProtocolMarshaller protocolMarshaller) {

        if (labelingJobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(labelingJobSummary.getLabelingJobName(), LABELINGJOBNAME_BINDING);
            protocolMarshaller.marshall(labelingJobSummary.getLabelingJobArn(), LABELINGJOBARN_BINDING);
            protocolMarshaller.marshall(labelingJobSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(labelingJobSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(labelingJobSummary.getLabelingJobStatus(), LABELINGJOBSTATUS_BINDING);
            protocolMarshaller.marshall(labelingJobSummary.getLabelCounters(), LABELCOUNTERS_BINDING);
            protocolMarshaller.marshall(labelingJobSummary.getWorkteamArn(), WORKTEAMARN_BINDING);
            protocolMarshaller.marshall(labelingJobSummary.getPreHumanTaskLambdaArn(), PREHUMANTASKLAMBDAARN_BINDING);
            protocolMarshaller.marshall(labelingJobSummary.getAnnotationConsolidationLambdaArn(), ANNOTATIONCONSOLIDATIONLAMBDAARN_BINDING);
            protocolMarshaller.marshall(labelingJobSummary.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(labelingJobSummary.getLabelingJobOutput(), LABELINGJOBOUTPUT_BINDING);
            protocolMarshaller.marshall(labelingJobSummary.getInputConfig(), INPUTCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
