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
 * ChildWorkflowExecutionCompletedEventAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChildWorkflowExecutionCompletedEventAttributesMarshaller {

    private static final MarshallingInfo<StructuredPojo> WORKFLOWEXECUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowExecution").build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowType").build();
    private static final MarshallingInfo<String> RESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("result").build();
    private static final MarshallingInfo<Long> INITIATEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initiatedEventId").build();
    private static final MarshallingInfo<Long> STARTEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedEventId").build();

    private static final ChildWorkflowExecutionCompletedEventAttributesMarshaller instance = new ChildWorkflowExecutionCompletedEventAttributesMarshaller();

    public static ChildWorkflowExecutionCompletedEventAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ChildWorkflowExecutionCompletedEventAttributes childWorkflowExecutionCompletedEventAttributes, ProtocolMarshaller protocolMarshaller) {

        if (childWorkflowExecutionCompletedEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(childWorkflowExecutionCompletedEventAttributes.getWorkflowExecution(), WORKFLOWEXECUTION_BINDING);
            protocolMarshaller.marshall(childWorkflowExecutionCompletedEventAttributes.getWorkflowType(), WORKFLOWTYPE_BINDING);
            protocolMarshaller.marshall(childWorkflowExecutionCompletedEventAttributes.getResult(), RESULT_BINDING);
            protocolMarshaller.marshall(childWorkflowExecutionCompletedEventAttributes.getInitiatedEventId(), INITIATEDEVENTID_BINDING);
            protocolMarshaller.marshall(childWorkflowExecutionCompletedEventAttributes.getStartedEventId(), STARTEDEVENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
