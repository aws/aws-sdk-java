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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkflowRunStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkflowRunStatisticsMarshaller {

    private static final MarshallingInfo<Integer> TOTALACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalActions").build();
    private static final MarshallingInfo<Integer> TIMEOUTACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeoutActions").build();
    private static final MarshallingInfo<Integer> FAILEDACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailedActions").build();
    private static final MarshallingInfo<Integer> STOPPEDACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StoppedActions").build();
    private static final MarshallingInfo<Integer> SUCCEEDEDACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SucceededActions").build();
    private static final MarshallingInfo<Integer> RUNNINGACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RunningActions").build();

    private static final WorkflowRunStatisticsMarshaller instance = new WorkflowRunStatisticsMarshaller();

    public static WorkflowRunStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkflowRunStatistics workflowRunStatistics, ProtocolMarshaller protocolMarshaller) {

        if (workflowRunStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workflowRunStatistics.getTotalActions(), TOTALACTIONS_BINDING);
            protocolMarshaller.marshall(workflowRunStatistics.getTimeoutActions(), TIMEOUTACTIONS_BINDING);
            protocolMarshaller.marshall(workflowRunStatistics.getFailedActions(), FAILEDACTIONS_BINDING);
            protocolMarshaller.marshall(workflowRunStatistics.getStoppedActions(), STOPPEDACTIONS_BINDING);
            protocolMarshaller.marshall(workflowRunStatistics.getSucceededActions(), SUCCEEDEDACTIONS_BINDING);
            protocolMarshaller.marshall(workflowRunStatistics.getRunningActions(), RUNNINGACTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
