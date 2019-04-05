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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkflowExecutionSignaledEventAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkflowExecutionSignaledEventAttributesMarshaller {

    private static final MarshallingInfo<String> SIGNALNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signalName").build();
    private static final MarshallingInfo<String> INPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("input").build();
    private static final MarshallingInfo<StructuredPojo> EXTERNALWORKFLOWEXECUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalWorkflowExecution").build();
    private static final MarshallingInfo<Long> EXTERNALINITIATEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalInitiatedEventId").build();

    private static final WorkflowExecutionSignaledEventAttributesMarshaller instance = new WorkflowExecutionSignaledEventAttributesMarshaller();

    public static WorkflowExecutionSignaledEventAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkflowExecutionSignaledEventAttributes workflowExecutionSignaledEventAttributes, ProtocolMarshaller protocolMarshaller) {

        if (workflowExecutionSignaledEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workflowExecutionSignaledEventAttributes.getSignalName(), SIGNALNAME_BINDING);
            protocolMarshaller.marshall(workflowExecutionSignaledEventAttributes.getInput(), INPUT_BINDING);
            protocolMarshaller.marshall(workflowExecutionSignaledEventAttributes.getExternalWorkflowExecution(), EXTERNALWORKFLOWEXECUTION_BINDING);
            protocolMarshaller.marshall(workflowExecutionSignaledEventAttributes.getExternalInitiatedEventId(), EXTERNALINITIATEDEVENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
