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
 * CompilationJobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CompilationJobSummaryMarshaller {

    private static final MarshallingInfo<String> COMPILATIONJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompilationJobName").build();
    private static final MarshallingInfo<String> COMPILATIONJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompilationJobArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPILATIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompilationStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPILATIONENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompilationEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> COMPILATIONTARGETDEVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompilationTargetDevice").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> COMPILATIONJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompilationJobStatus").build();

    private static final CompilationJobSummaryMarshaller instance = new CompilationJobSummaryMarshaller();

    public static CompilationJobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CompilationJobSummary compilationJobSummary, ProtocolMarshaller protocolMarshaller) {

        if (compilationJobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(compilationJobSummary.getCompilationJobName(), COMPILATIONJOBNAME_BINDING);
            protocolMarshaller.marshall(compilationJobSummary.getCompilationJobArn(), COMPILATIONJOBARN_BINDING);
            protocolMarshaller.marshall(compilationJobSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(compilationJobSummary.getCompilationStartTime(), COMPILATIONSTARTTIME_BINDING);
            protocolMarshaller.marshall(compilationJobSummary.getCompilationEndTime(), COMPILATIONENDTIME_BINDING);
            protocolMarshaller.marshall(compilationJobSummary.getCompilationTargetDevice(), COMPILATIONTARGETDEVICE_BINDING);
            protocolMarshaller.marshall(compilationJobSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(compilationJobSummary.getCompilationJobStatus(), COMPILATIONJOBSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
