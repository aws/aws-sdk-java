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
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExecutionRecordMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExecutionRecordMarshaller {

    private static final MarshallingInfo<String> EXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionId").build();
    private static final MarshallingInfo<String> EXECUTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionStatus").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionResult").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DATAPULLSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataPullStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DATAPULLENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataPullEndTime").timestampFormat("unixTimestamp").build();

    private static final ExecutionRecordMarshaller instance = new ExecutionRecordMarshaller();

    public static ExecutionRecordMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExecutionRecord executionRecord, ProtocolMarshaller protocolMarshaller) {

        if (executionRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(executionRecord.getExecutionId(), EXECUTIONID_BINDING);
            protocolMarshaller.marshall(executionRecord.getExecutionStatus(), EXECUTIONSTATUS_BINDING);
            protocolMarshaller.marshall(executionRecord.getExecutionResult(), EXECUTIONRESULT_BINDING);
            protocolMarshaller.marshall(executionRecord.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(executionRecord.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(executionRecord.getDataPullStartTime(), DATAPULLSTARTTIME_BINDING);
            protocolMarshaller.marshall(executionRecord.getDataPullEndTime(), DATAPULLENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
