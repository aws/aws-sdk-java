/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateJobRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amz-Client-Token")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> FARMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("farmId").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> LIFECYCLESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lifecycleStatus").build();
    private static final MarshallingInfo<Integer> MAXFAILEDTASKSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxFailedTasksCount").build();
    private static final MarshallingInfo<Integer> MAXRETRIESPERTASK_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxRetriesPerTask").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("priority").build();
    private static final MarshallingInfo<String> QUEUEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("queueId").build();
    private static final MarshallingInfo<String> TARGETTASKRUNSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetTaskRunStatus").build();

    private static final UpdateJobRequestMarshaller instance = new UpdateJobRequestMarshaller();

    public static UpdateJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateJobRequest updateJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateJobRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateJobRequest.getFarmId(), FARMID_BINDING);
            protocolMarshaller.marshall(updateJobRequest.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(updateJobRequest.getLifecycleStatus(), LIFECYCLESTATUS_BINDING);
            protocolMarshaller.marshall(updateJobRequest.getMaxFailedTasksCount(), MAXFAILEDTASKSCOUNT_BINDING);
            protocolMarshaller.marshall(updateJobRequest.getMaxRetriesPerTask(), MAXRETRIESPERTASK_BINDING);
            protocolMarshaller.marshall(updateJobRequest.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(updateJobRequest.getQueueId(), QUEUEID_BINDING);
            protocolMarshaller.marshall(updateJobRequest.getTargetTaskRunStatus(), TARGETTASKRUNSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
