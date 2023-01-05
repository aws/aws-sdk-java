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
package com.amazonaws.services.migrationhuborchestrator.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhuborchestrator.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateWorkflowStepRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateWorkflowStepRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> STEPGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stepGroupId").build();
    private static final MarshallingInfo<String> WORKFLOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowId").build();
    private static final MarshallingInfo<String> STEPACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stepActionType").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWSTEPAUTOMATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowStepAutomationConfiguration").build();
    private static final MarshallingInfo<List> STEPTARGET_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stepTarget").build();
    private static final MarshallingInfo<List> OUTPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("outputs").build();
    private static final MarshallingInfo<List> PREVIOUS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("previous").build();
    private static final MarshallingInfo<List> NEXT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("next").build();

    private static final CreateWorkflowStepRequestMarshaller instance = new CreateWorkflowStepRequestMarshaller();

    public static CreateWorkflowStepRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateWorkflowStepRequest createWorkflowStepRequest, ProtocolMarshaller protocolMarshaller) {

        if (createWorkflowStepRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createWorkflowStepRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createWorkflowStepRequest.getStepGroupId(), STEPGROUPID_BINDING);
            protocolMarshaller.marshall(createWorkflowStepRequest.getWorkflowId(), WORKFLOWID_BINDING);
            protocolMarshaller.marshall(createWorkflowStepRequest.getStepActionType(), STEPACTIONTYPE_BINDING);
            protocolMarshaller.marshall(createWorkflowStepRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createWorkflowStepRequest.getWorkflowStepAutomationConfiguration(), WORKFLOWSTEPAUTOMATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createWorkflowStepRequest.getStepTarget(), STEPTARGET_BINDING);
            protocolMarshaller.marshall(createWorkflowStepRequest.getOutputs(), OUTPUTS_BINDING);
            protocolMarshaller.marshall(createWorkflowStepRequest.getPrevious(), PREVIOUS_BINDING);
            protocolMarshaller.marshall(createWorkflowStepRequest.getNext(), NEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
