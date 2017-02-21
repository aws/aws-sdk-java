/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * TaskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaskMarshaller {

    private static final MarshallingInfo<String> TASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("taskArn").build();
    private static final MarshallingInfo<String> CLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterArn").build();
    private static final MarshallingInfo<String> TASKDEFINITIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskDefinitionArn").build();
    private static final MarshallingInfo<String> CONTAINERINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerInstanceArn").build();
    private static final MarshallingInfo<StructuredPojo> OVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("overrides").build();
    private static final MarshallingInfo<String> LASTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastStatus").build();
    private static final MarshallingInfo<String> DESIREDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredStatus").build();
    private static final MarshallingInfo<List> CONTAINERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("containers").build();
    private static final MarshallingInfo<String> STARTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startedBy").build();
    private static final MarshallingInfo<Long> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> STOPPEDREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stoppedReason").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedAt").build();
    private static final MarshallingInfo<java.util.Date> STOPPEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stoppedAt").build();
    private static final MarshallingInfo<String> GROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("group").build();

    private static final TaskMarshaller instance = new TaskMarshaller();

    public static TaskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Task task, ProtocolMarshaller protocolMarshaller) {

        if (task == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(task.getTaskArn(), TASKARN_BINDING);
            protocolMarshaller.marshall(task.getClusterArn(), CLUSTERARN_BINDING);
            protocolMarshaller.marshall(task.getTaskDefinitionArn(), TASKDEFINITIONARN_BINDING);
            protocolMarshaller.marshall(task.getContainerInstanceArn(), CONTAINERINSTANCEARN_BINDING);
            protocolMarshaller.marshall(task.getOverrides(), OVERRIDES_BINDING);
            protocolMarshaller.marshall(task.getLastStatus(), LASTSTATUS_BINDING);
            protocolMarshaller.marshall(task.getDesiredStatus(), DESIREDSTATUS_BINDING);
            protocolMarshaller.marshall(task.getContainers(), CONTAINERS_BINDING);
            protocolMarshaller.marshall(task.getStartedBy(), STARTEDBY_BINDING);
            protocolMarshaller.marshall(task.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(task.getStoppedReason(), STOPPEDREASON_BINDING);
            protocolMarshaller.marshall(task.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(task.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(task.getStoppedAt(), STOPPEDAT_BINDING);
            protocolMarshaller.marshall(task.getGroup(), GROUP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
