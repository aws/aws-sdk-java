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
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SubmitTaskStateChangeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubmitTaskStateChangeRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cluster").build();
    private static final MarshallingInfo<String> TASK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("task").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reason").build();
    private static final MarshallingInfo<List> CONTAINERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("containers").build();
    private static final MarshallingInfo<List> ATTACHMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attachments").build();
    private static final MarshallingInfo<java.util.Date> PULLSTARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pullStartedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> PULLSTOPPEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pullStoppedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EXECUTIONSTOPPEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionStoppedAt").timestampFormat("unixTimestamp").build();

    private static final SubmitTaskStateChangeRequestMarshaller instance = new SubmitTaskStateChangeRequestMarshaller();

    public static SubmitTaskStateChangeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubmitTaskStateChangeRequest submitTaskStateChangeRequest, ProtocolMarshaller protocolMarshaller) {

        if (submitTaskStateChangeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(submitTaskStateChangeRequest.getCluster(), CLUSTER_BINDING);
            protocolMarshaller.marshall(submitTaskStateChangeRequest.getTask(), TASK_BINDING);
            protocolMarshaller.marshall(submitTaskStateChangeRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(submitTaskStateChangeRequest.getReason(), REASON_BINDING);
            protocolMarshaller.marshall(submitTaskStateChangeRequest.getContainers(), CONTAINERS_BINDING);
            protocolMarshaller.marshall(submitTaskStateChangeRequest.getAttachments(), ATTACHMENTS_BINDING);
            protocolMarshaller.marshall(submitTaskStateChangeRequest.getPullStartedAt(), PULLSTARTEDAT_BINDING);
            protocolMarshaller.marshall(submitTaskStateChangeRequest.getPullStoppedAt(), PULLSTOPPEDAT_BINDING);
            protocolMarshaller.marshall(submitTaskStateChangeRequest.getExecutionStoppedAt(), EXECUTIONSTOPPEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
