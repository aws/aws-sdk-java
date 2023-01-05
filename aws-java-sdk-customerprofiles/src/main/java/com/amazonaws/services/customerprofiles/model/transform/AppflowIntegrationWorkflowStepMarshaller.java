/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AppflowIntegrationWorkflowStepMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AppflowIntegrationWorkflowStepMarshaller {

    private static final MarshallingInfo<String> FLOWNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FlowName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> EXECUTIONMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionMessage").build();
    private static final MarshallingInfo<Long> RECORDSPROCESSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordsProcessed").build();
    private static final MarshallingInfo<String> BATCHRECORDSSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchRecordsStartTime").build();
    private static final MarshallingInfo<String> BATCHRECORDSENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchRecordsEndTime").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedAt").timestampFormat("unixTimestamp").build();

    private static final AppflowIntegrationWorkflowStepMarshaller instance = new AppflowIntegrationWorkflowStepMarshaller();

    public static AppflowIntegrationWorkflowStepMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AppflowIntegrationWorkflowStep appflowIntegrationWorkflowStep, ProtocolMarshaller protocolMarshaller) {

        if (appflowIntegrationWorkflowStep == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(appflowIntegrationWorkflowStep.getFlowName(), FLOWNAME_BINDING);
            protocolMarshaller.marshall(appflowIntegrationWorkflowStep.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(appflowIntegrationWorkflowStep.getExecutionMessage(), EXECUTIONMESSAGE_BINDING);
            protocolMarshaller.marshall(appflowIntegrationWorkflowStep.getRecordsProcessed(), RECORDSPROCESSED_BINDING);
            protocolMarshaller.marshall(appflowIntegrationWorkflowStep.getBatchRecordsStartTime(), BATCHRECORDSSTARTTIME_BINDING);
            protocolMarshaller.marshall(appflowIntegrationWorkflowStep.getBatchRecordsEndTime(), BATCHRECORDSENDTIME_BINDING);
            protocolMarshaller.marshall(appflowIntegrationWorkflowStep.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(appflowIntegrationWorkflowStep.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
