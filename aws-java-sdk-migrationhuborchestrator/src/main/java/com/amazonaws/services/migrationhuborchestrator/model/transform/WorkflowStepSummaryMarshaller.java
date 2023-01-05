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
 * WorkflowStepSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkflowStepSummaryMarshaller {

    private static final MarshallingInfo<String> STEPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stepId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> STEPACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stepActionType").build();
    private static final MarshallingInfo<String> OWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("owner").build();
    private static final MarshallingInfo<List> PREVIOUS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("previous").build();
    private static final MarshallingInfo<List> NEXT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("next").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<Integer> NOOFSRVCOMPLETED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("noOfSrvCompleted").build();
    private static final MarshallingInfo<Integer> NOOFSRVFAILED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("noOfSrvFailed").build();
    private static final MarshallingInfo<Integer> TOTALNOOFSRV_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalNoOfSrv").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> SCRIPTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scriptLocation").build();

    private static final WorkflowStepSummaryMarshaller instance = new WorkflowStepSummaryMarshaller();

    public static WorkflowStepSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkflowStepSummary workflowStepSummary, ProtocolMarshaller protocolMarshaller) {

        if (workflowStepSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workflowStepSummary.getStepId(), STEPID_BINDING);
            protocolMarshaller.marshall(workflowStepSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(workflowStepSummary.getStepActionType(), STEPACTIONTYPE_BINDING);
            protocolMarshaller.marshall(workflowStepSummary.getOwner(), OWNER_BINDING);
            protocolMarshaller.marshall(workflowStepSummary.getPrevious(), PREVIOUS_BINDING);
            protocolMarshaller.marshall(workflowStepSummary.getNext(), NEXT_BINDING);
            protocolMarshaller.marshall(workflowStepSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(workflowStepSummary.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(workflowStepSummary.getNoOfSrvCompleted(), NOOFSRVCOMPLETED_BINDING);
            protocolMarshaller.marshall(workflowStepSummary.getNoOfSrvFailed(), NOOFSRVFAILED_BINDING);
            protocolMarshaller.marshall(workflowStepSummary.getTotalNoOfSrv(), TOTALNOOFSRV_BINDING);
            protocolMarshaller.marshall(workflowStepSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(workflowStepSummary.getScriptLocation(), SCRIPTLOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
