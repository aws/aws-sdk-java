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
package com.amazonaws.services.mwaa.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mwaa.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LoggingConfigurationInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoggingConfigurationInputMarshaller {

    private static final MarshallingInfo<StructuredPojo> DAGPROCESSINGLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DagProcessingLogs").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULERLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchedulerLogs").build();
    private static final MarshallingInfo<StructuredPojo> TASKLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskLogs").build();
    private static final MarshallingInfo<StructuredPojo> WEBSERVERLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WebserverLogs").build();
    private static final MarshallingInfo<StructuredPojo> WORKERLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkerLogs").build();

    private static final LoggingConfigurationInputMarshaller instance = new LoggingConfigurationInputMarshaller();

    public static LoggingConfigurationInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoggingConfigurationInput loggingConfigurationInput, ProtocolMarshaller protocolMarshaller) {

        if (loggingConfigurationInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loggingConfigurationInput.getDagProcessingLogs(), DAGPROCESSINGLOGS_BINDING);
            protocolMarshaller.marshall(loggingConfigurationInput.getSchedulerLogs(), SCHEDULERLOGS_BINDING);
            protocolMarshaller.marshall(loggingConfigurationInput.getTaskLogs(), TASKLOGS_BINDING);
            protocolMarshaller.marshall(loggingConfigurationInput.getWebserverLogs(), WEBSERVERLOGS_BINDING);
            protocolMarshaller.marshall(loggingConfigurationInput.getWorkerLogs(), WORKERLOGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
