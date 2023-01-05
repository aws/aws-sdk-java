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
 * UpdateWorkflowStepRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateWorkflowStepRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> STEPGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stepGroupId").build();
    private static final MarshallingInfo<String> WORKFLOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> STEPACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stepActionType").build();
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
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final UpdateWorkflowStepRequestMarshaller instance = new UpdateWorkflowStepRequestMarshaller();

    public static UpdateWorkflowStepRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateWorkflowStepRequest updateWorkflowStepRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateWorkflowStepRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateWorkflowStepRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(updateWorkflowStepRequest.getStepGroupId(), STEPGROUPID_BINDING);
            protocolMarshaller.marshall(updateWorkflowStepRequest.getWorkflowId(), WORKFLOWID_BINDING);
            protocolMarshaller.marshall(updateWorkflowStepRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateWorkflowStepRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateWorkflowStepRequest.getStepActionType(), STEPACTIONTYPE_BINDING);
            protocolMarshaller.marshall(updateWorkflowStepRequest.getWorkflowStepAutomationConfiguration(), WORKFLOWSTEPAUTOMATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateWorkflowStepRequest.getStepTarget(), STEPTARGET_BINDING);
            protocolMarshaller.marshall(updateWorkflowStepRequest.getOutputs(), OUTPUTS_BINDING);
            protocolMarshaller.marshall(updateWorkflowStepRequest.getPrevious(), PREVIOUS_BINDING);
            protocolMarshaller.marshall(updateWorkflowStepRequest.getNext(), NEXT_BINDING);
            protocolMarshaller.marshall(updateWorkflowStepRequest.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
