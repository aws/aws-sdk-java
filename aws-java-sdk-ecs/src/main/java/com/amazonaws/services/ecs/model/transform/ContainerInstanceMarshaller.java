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
 * ContainerInstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerInstanceMarshaller {

    private static final MarshallingInfo<String> CONTAINERINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerInstanceArn").build();
    private static final MarshallingInfo<String> EC2INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceId").build();
    private static final MarshallingInfo<Long> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<StructuredPojo> VERSIONINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("versionInfo").build();
    private static final MarshallingInfo<List> REMAININGRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remainingResources").build();
    private static final MarshallingInfo<List> REGISTEREDRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registeredResources").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Boolean> AGENTCONNECTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentConnected").build();
    private static final MarshallingInfo<Integer> RUNNINGTASKSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runningTasksCount").build();
    private static final MarshallingInfo<Integer> PENDINGTASKSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pendingTasksCount").build();
    private static final MarshallingInfo<String> AGENTUPDATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agentUpdateStatus").build();
    private static final MarshallingInfo<List> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attributes").build();
    private static final MarshallingInfo<java.util.Date> REGISTEREDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registeredAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> ATTACHMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attachments").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final ContainerInstanceMarshaller instance = new ContainerInstanceMarshaller();

    public static ContainerInstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerInstance containerInstance, ProtocolMarshaller protocolMarshaller) {

        if (containerInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerInstance.getContainerInstanceArn(), CONTAINERINSTANCEARN_BINDING);
            protocolMarshaller.marshall(containerInstance.getEc2InstanceId(), EC2INSTANCEID_BINDING);
            protocolMarshaller.marshall(containerInstance.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(containerInstance.getVersionInfo(), VERSIONINFO_BINDING);
            protocolMarshaller.marshall(containerInstance.getRemainingResources(), REMAININGRESOURCES_BINDING);
            protocolMarshaller.marshall(containerInstance.getRegisteredResources(), REGISTEREDRESOURCES_BINDING);
            protocolMarshaller.marshall(containerInstance.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(containerInstance.getAgentConnected(), AGENTCONNECTED_BINDING);
            protocolMarshaller.marshall(containerInstance.getRunningTasksCount(), RUNNINGTASKSCOUNT_BINDING);
            protocolMarshaller.marshall(containerInstance.getPendingTasksCount(), PENDINGTASKSCOUNT_BINDING);
            protocolMarshaller.marshall(containerInstance.getAgentUpdateStatus(), AGENTUPDATESTATUS_BINDING);
            protocolMarshaller.marshall(containerInstance.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(containerInstance.getRegisteredAt(), REGISTEREDAT_BINDING);
            protocolMarshaller.marshall(containerInstance.getAttachments(), ATTACHMENTS_BINDING);
            protocolMarshaller.marshall(containerInstance.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
