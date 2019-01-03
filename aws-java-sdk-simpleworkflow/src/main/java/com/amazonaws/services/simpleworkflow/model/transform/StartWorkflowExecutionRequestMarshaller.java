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
package com.amazonaws.services.simpleworkflow.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartWorkflowExecutionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartWorkflowExecutionRequestMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("domain").build();
    private static final MarshallingInfo<String> WORKFLOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowId").build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowType").build();
    private static final MarshallingInfo<StructuredPojo> TASKLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskList").build();
    private static final MarshallingInfo<String> TASKPRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskPriority").build();
    private static final MarshallingInfo<String> INPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("input").build();
    private static final MarshallingInfo<String> EXECUTIONSTARTTOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionStartToCloseTimeout").build();
    private static final MarshallingInfo<List> TAGLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tagList").build();
    private static final MarshallingInfo<String> TASKSTARTTOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskStartToCloseTimeout").build();
    private static final MarshallingInfo<String> CHILDPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("childPolicy").build();
    private static final MarshallingInfo<String> LAMBDAROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaRole").build();

    private static final StartWorkflowExecutionRequestMarshaller instance = new StartWorkflowExecutionRequestMarshaller();

    public static StartWorkflowExecutionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartWorkflowExecutionRequest startWorkflowExecutionRequest, ProtocolMarshaller protocolMarshaller) {

        if (startWorkflowExecutionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startWorkflowExecutionRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(startWorkflowExecutionRequest.getWorkflowId(), WORKFLOWID_BINDING);
            protocolMarshaller.marshall(startWorkflowExecutionRequest.getWorkflowType(), WORKFLOWTYPE_BINDING);
            protocolMarshaller.marshall(startWorkflowExecutionRequest.getTaskList(), TASKLIST_BINDING);
            protocolMarshaller.marshall(startWorkflowExecutionRequest.getTaskPriority(), TASKPRIORITY_BINDING);
            protocolMarshaller.marshall(startWorkflowExecutionRequest.getInput(), INPUT_BINDING);
            protocolMarshaller.marshall(startWorkflowExecutionRequest.getExecutionStartToCloseTimeout(), EXECUTIONSTARTTOCLOSETIMEOUT_BINDING);
            protocolMarshaller.marshall(startWorkflowExecutionRequest.getTagList(), TAGLIST_BINDING);
            protocolMarshaller.marshall(startWorkflowExecutionRequest.getTaskStartToCloseTimeout(), TASKSTARTTOCLOSETIMEOUT_BINDING);
            protocolMarshaller.marshall(startWorkflowExecutionRequest.getChildPolicy(), CHILDPOLICY_BINDING);
            protocolMarshaller.marshall(startWorkflowExecutionRequest.getLambdaRole(), LAMBDAROLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
