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
package com.amazonaws.services.glue.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkflowRunMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkflowRunMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> WORKFLOWRUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkflowRunId").build();
    private static final MarshallingInfo<Map> WORKFLOWRUNPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkflowRunProperties").build();
    private static final MarshallingInfo<java.util.Date> STARTEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> STATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Statistics").build();
    private static final MarshallingInfo<StructuredPojo> GRAPH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Graph").build();

    private static final WorkflowRunMarshaller instance = new WorkflowRunMarshaller();

    public static WorkflowRunMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkflowRun workflowRun, ProtocolMarshaller protocolMarshaller) {

        if (workflowRun == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workflowRun.getName(), NAME_BINDING);
            protocolMarshaller.marshall(workflowRun.getWorkflowRunId(), WORKFLOWRUNID_BINDING);
            protocolMarshaller.marshall(workflowRun.getWorkflowRunProperties(), WORKFLOWRUNPROPERTIES_BINDING);
            protocolMarshaller.marshall(workflowRun.getStartedOn(), STARTEDON_BINDING);
            protocolMarshaller.marshall(workflowRun.getCompletedOn(), COMPLETEDON_BINDING);
            protocolMarshaller.marshall(workflowRun.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(workflowRun.getStatistics(), STATISTICS_BINDING);
            protocolMarshaller.marshall(workflowRun.getGraph(), GRAPH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
