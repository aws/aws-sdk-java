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
package com.amazonaws.services.imagebuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkflowExecutionMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkflowExecutionMetadataMarshaller {

    private static final MarshallingInfo<String> WORKFLOWBUILDVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowBuildVersionArn").build();
    private static final MarshallingInfo<String> WORKFLOWEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowExecutionId").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("message").build();
    private static final MarshallingInfo<Integer> TOTALSTEPCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalStepCount").build();
    private static final MarshallingInfo<Integer> TOTALSTEPSSUCCEEDED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalStepsSucceeded").build();
    private static final MarshallingInfo<Integer> TOTALSTEPSFAILED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalStepsFailed").build();
    private static final MarshallingInfo<Integer> TOTALSTEPSSKIPPED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalStepsSkipped").build();
    private static final MarshallingInfo<String> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startTime").build();
    private static final MarshallingInfo<String> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("endTime").build();
    private static final MarshallingInfo<String> PARALLELGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parallelGroup").build();

    private static final WorkflowExecutionMetadataMarshaller instance = new WorkflowExecutionMetadataMarshaller();

    public static WorkflowExecutionMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkflowExecutionMetadata workflowExecutionMetadata, ProtocolMarshaller protocolMarshaller) {

        if (workflowExecutionMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workflowExecutionMetadata.getWorkflowBuildVersionArn(), WORKFLOWBUILDVERSIONARN_BINDING);
            protocolMarshaller.marshall(workflowExecutionMetadata.getWorkflowExecutionId(), WORKFLOWEXECUTIONID_BINDING);
            protocolMarshaller.marshall(workflowExecutionMetadata.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(workflowExecutionMetadata.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(workflowExecutionMetadata.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(workflowExecutionMetadata.getTotalStepCount(), TOTALSTEPCOUNT_BINDING);
            protocolMarshaller.marshall(workflowExecutionMetadata.getTotalStepsSucceeded(), TOTALSTEPSSUCCEEDED_BINDING);
            protocolMarshaller.marshall(workflowExecutionMetadata.getTotalStepsFailed(), TOTALSTEPSFAILED_BINDING);
            protocolMarshaller.marshall(workflowExecutionMetadata.getTotalStepsSkipped(), TOTALSTEPSSKIPPED_BINDING);
            protocolMarshaller.marshall(workflowExecutionMetadata.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(workflowExecutionMetadata.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(workflowExecutionMetadata.getParallelGroup(), PARALLELGROUP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
