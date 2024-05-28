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
package com.amazonaws.services.omics.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.omics.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartRunRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartRunRequestMarshaller {

    private static final MarshallingInfo<String> WORKFLOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowId").build();
    private static final MarshallingInfo<String> WORKFLOWTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowType").build();
    private static final MarshallingInfo<String> RUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runId").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> RUNGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runGroupId").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("priority").build();
    private static final MarshallingInfo<Integer> STORAGECAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storageCapacity").build();
    private static final MarshallingInfo<String> OUTPUTURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("outputUri").build();
    private static final MarshallingInfo<String> LOGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("logLevel").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> REQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("requestId").defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> RETENTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("retentionMode").build();
    private static final MarshallingInfo<String> STORAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storageType").build();
    private static final MarshallingInfo<String> WORKFLOWOWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workflowOwnerId").build();

    private static final StartRunRequestMarshaller instance = new StartRunRequestMarshaller();

    public static StartRunRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartRunRequest startRunRequest, ProtocolMarshaller protocolMarshaller) {

        if (startRunRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startRunRequest.getWorkflowId(), WORKFLOWID_BINDING);
            protocolMarshaller.marshall(startRunRequest.getWorkflowType(), WORKFLOWTYPE_BINDING);
            protocolMarshaller.marshall(startRunRequest.getRunId(), RUNID_BINDING);
            protocolMarshaller.marshall(startRunRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(startRunRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(startRunRequest.getRunGroupId(), RUNGROUPID_BINDING);
            protocolMarshaller.marshall(startRunRequest.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(startRunRequest.getStorageCapacity(), STORAGECAPACITY_BINDING);
            protocolMarshaller.marshall(startRunRequest.getOutputUri(), OUTPUTURI_BINDING);
            protocolMarshaller.marshall(startRunRequest.getLogLevel(), LOGLEVEL_BINDING);
            protocolMarshaller.marshall(startRunRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(startRunRequest.getRequestId(), REQUESTID_BINDING);
            protocolMarshaller.marshall(startRunRequest.getRetentionMode(), RETENTIONMODE_BINDING);
            protocolMarshaller.marshall(startRunRequest.getStorageType(), STORAGETYPE_BINDING);
            protocolMarshaller.marshall(startRunRequest.getWorkflowOwnerId(), WORKFLOWOWNERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
