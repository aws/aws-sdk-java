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
 * AppflowIntegrationWorkflowMetricsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AppflowIntegrationWorkflowMetricsMarshaller {

    private static final MarshallingInfo<Long> RECORDSPROCESSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordsProcessed").build();
    private static final MarshallingInfo<Long> STEPSCOMPLETED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StepsCompleted").build();
    private static final MarshallingInfo<Long> TOTALSTEPS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TotalSteps").build();

    private static final AppflowIntegrationWorkflowMetricsMarshaller instance = new AppflowIntegrationWorkflowMetricsMarshaller();

    public static AppflowIntegrationWorkflowMetricsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AppflowIntegrationWorkflowMetrics appflowIntegrationWorkflowMetrics, ProtocolMarshaller protocolMarshaller) {

        if (appflowIntegrationWorkflowMetrics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(appflowIntegrationWorkflowMetrics.getRecordsProcessed(), RECORDSPROCESSED_BINDING);
            protocolMarshaller.marshall(appflowIntegrationWorkflowMetrics.getStepsCompleted(), STEPSCOMPLETED_BINDING);
            protocolMarshaller.marshall(appflowIntegrationWorkflowMetrics.getTotalSteps(), TOTALSTEPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
