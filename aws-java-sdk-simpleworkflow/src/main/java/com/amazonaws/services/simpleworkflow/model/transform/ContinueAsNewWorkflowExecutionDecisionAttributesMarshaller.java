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
 * ContinueAsNewWorkflowExecutionDecisionAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContinueAsNewWorkflowExecutionDecisionAttributesMarshaller {

    private static final MarshallingInfo<String> INPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("input").build();
    private static final MarshallingInfo<String> EXECUTIONSTARTTOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionStartToCloseTimeout").build();
    private static final MarshallingInfo<StructuredPojo> TASKLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskList").build();
    private static final MarshallingInfo<String> TASKPRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskPriority").build();
    private static final MarshallingInfo<String> TASKSTARTTOCLOSETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskStartToCloseTimeout").build();
    private static final MarshallingInfo<String> CHILDPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("childPolicy").build();
    private static final MarshallingInfo<List> TAGLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tagList").build();
    private static final MarshallingInfo<String> WORKFLOWTYPEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowTypeVersion").build();
    private static final MarshallingInfo<String> LAMBDAROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaRole").build();

    private static final ContinueAsNewWorkflowExecutionDecisionAttributesMarshaller instance = new ContinueAsNewWorkflowExecutionDecisionAttributesMarshaller();

    public static ContinueAsNewWorkflowExecutionDecisionAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributes,
            ProtocolMarshaller protocolMarshaller) {

        if (continueAsNewWorkflowExecutionDecisionAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(continueAsNewWorkflowExecutionDecisionAttributes.getInput(), INPUT_BINDING);
            protocolMarshaller.marshall(continueAsNewWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout(),
                    EXECUTIONSTARTTOCLOSETIMEOUT_BINDING);
            protocolMarshaller.marshall(continueAsNewWorkflowExecutionDecisionAttributes.getTaskList(), TASKLIST_BINDING);
            protocolMarshaller.marshall(continueAsNewWorkflowExecutionDecisionAttributes.getTaskPriority(), TASKPRIORITY_BINDING);
            protocolMarshaller.marshall(continueAsNewWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout(), TASKSTARTTOCLOSETIMEOUT_BINDING);
            protocolMarshaller.marshall(continueAsNewWorkflowExecutionDecisionAttributes.getChildPolicy(), CHILDPOLICY_BINDING);
            protocolMarshaller.marshall(continueAsNewWorkflowExecutionDecisionAttributes.getTagList(), TAGLIST_BINDING);
            protocolMarshaller.marshall(continueAsNewWorkflowExecutionDecisionAttributes.getWorkflowTypeVersion(), WORKFLOWTYPEVERSION_BINDING);
            protocolMarshaller.marshall(continueAsNewWorkflowExecutionDecisionAttributes.getLambdaRole(), LAMBDAROLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
