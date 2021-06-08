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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipelineSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipelineSummaryMarshaller {

    private static final MarshallingInfo<String> PIPELINEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PipelineArn").build();
    private static final MarshallingInfo<String> PIPELINENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PipelineName").build();
    private static final MarshallingInfo<String> PIPELINEDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PipelineDisplayName").build();
    private static final MarshallingInfo<String> PIPELINEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PipelineDescription").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTEXECUTIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastExecutionTime").timestampFormat("unixTimestamp").build();

    private static final PipelineSummaryMarshaller instance = new PipelineSummaryMarshaller();

    public static PipelineSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipelineSummary pipelineSummary, ProtocolMarshaller protocolMarshaller) {

        if (pipelineSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipelineSummary.getPipelineArn(), PIPELINEARN_BINDING);
            protocolMarshaller.marshall(pipelineSummary.getPipelineName(), PIPELINENAME_BINDING);
            protocolMarshaller.marshall(pipelineSummary.getPipelineDisplayName(), PIPELINEDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(pipelineSummary.getPipelineDescription(), PIPELINEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(pipelineSummary.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(pipelineSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(pipelineSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(pipelineSummary.getLastExecutionTime(), LASTEXECUTIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
