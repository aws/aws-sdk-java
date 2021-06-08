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
 * EdgePackagingJobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EdgePackagingJobSummaryMarshaller {

    private static final MarshallingInfo<String> EDGEPACKAGINGJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgePackagingJobArn").build();
    private static final MarshallingInfo<String> EDGEPACKAGINGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgePackagingJobName").build();
    private static final MarshallingInfo<String> EDGEPACKAGINGJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgePackagingJobStatus").build();
    private static final MarshallingInfo<String> COMPILATIONJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompilationJobName").build();
    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<String> MODELVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelVersion").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();

    private static final EdgePackagingJobSummaryMarshaller instance = new EdgePackagingJobSummaryMarshaller();

    public static EdgePackagingJobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EdgePackagingJobSummary edgePackagingJobSummary, ProtocolMarshaller protocolMarshaller) {

        if (edgePackagingJobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(edgePackagingJobSummary.getEdgePackagingJobArn(), EDGEPACKAGINGJOBARN_BINDING);
            protocolMarshaller.marshall(edgePackagingJobSummary.getEdgePackagingJobName(), EDGEPACKAGINGJOBNAME_BINDING);
            protocolMarshaller.marshall(edgePackagingJobSummary.getEdgePackagingJobStatus(), EDGEPACKAGINGJOBSTATUS_BINDING);
            protocolMarshaller.marshall(edgePackagingJobSummary.getCompilationJobName(), COMPILATIONJOBNAME_BINDING);
            protocolMarshaller.marshall(edgePackagingJobSummary.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(edgePackagingJobSummary.getModelVersion(), MODELVERSION_BINDING);
            protocolMarshaller.marshall(edgePackagingJobSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(edgePackagingJobSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
