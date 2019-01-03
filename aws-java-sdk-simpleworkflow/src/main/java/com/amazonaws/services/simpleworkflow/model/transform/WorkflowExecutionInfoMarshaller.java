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
 * WorkflowExecutionInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkflowExecutionInfoMarshaller {

    private static final MarshallingInfo<StructuredPojo> EXECUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("execution").build();
    private static final MarshallingInfo<StructuredPojo> WORKFLOWTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowType").build();
    private static final MarshallingInfo<java.util.Date> STARTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CLOSETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("closeTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> EXECUTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionStatus").build();
    private static final MarshallingInfo<String> CLOSESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("closeStatus").build();
    private static final MarshallingInfo<StructuredPojo> PARENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parent").build();
    private static final MarshallingInfo<List> TAGLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tagList").build();
    private static final MarshallingInfo<Boolean> CANCELREQUESTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cancelRequested").build();

    private static final WorkflowExecutionInfoMarshaller instance = new WorkflowExecutionInfoMarshaller();

    public static WorkflowExecutionInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkflowExecutionInfo workflowExecutionInfo, ProtocolMarshaller protocolMarshaller) {

        if (workflowExecutionInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workflowExecutionInfo.getExecution(), EXECUTION_BINDING);
            protocolMarshaller.marshall(workflowExecutionInfo.getWorkflowType(), WORKFLOWTYPE_BINDING);
            protocolMarshaller.marshall(workflowExecutionInfo.getStartTimestamp(), STARTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(workflowExecutionInfo.getCloseTimestamp(), CLOSETIMESTAMP_BINDING);
            protocolMarshaller.marshall(workflowExecutionInfo.getExecutionStatus(), EXECUTIONSTATUS_BINDING);
            protocolMarshaller.marshall(workflowExecutionInfo.getCloseStatus(), CLOSESTATUS_BINDING);
            protocolMarshaller.marshall(workflowExecutionInfo.getParent(), PARENT_BINDING);
            protocolMarshaller.marshall(workflowExecutionInfo.getTagList(), TAGLIST_BINDING);
            protocolMarshaller.marshall(workflowExecutionInfo.getCancelRequested(), CANCELREQUESTED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
