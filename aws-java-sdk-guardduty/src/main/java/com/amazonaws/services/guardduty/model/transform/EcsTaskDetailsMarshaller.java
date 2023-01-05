/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EcsTaskDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EcsTaskDetailsMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> DEFINITIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("definitionArn").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<java.util.Date> TASKCREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STARTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startedBy").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<List> VOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("volumes").build();
    private static final MarshallingInfo<List> CONTAINERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("containers").build();
    private static final MarshallingInfo<String> GROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("group").build();

    private static final EcsTaskDetailsMarshaller instance = new EcsTaskDetailsMarshaller();

    public static EcsTaskDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EcsTaskDetails ecsTaskDetails, ProtocolMarshaller protocolMarshaller) {

        if (ecsTaskDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ecsTaskDetails.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(ecsTaskDetails.getDefinitionArn(), DEFINITIONARN_BINDING);
            protocolMarshaller.marshall(ecsTaskDetails.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(ecsTaskDetails.getTaskCreatedAt(), TASKCREATEDAT_BINDING);
            protocolMarshaller.marshall(ecsTaskDetails.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(ecsTaskDetails.getStartedBy(), STARTEDBY_BINDING);
            protocolMarshaller.marshall(ecsTaskDetails.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(ecsTaskDetails.getVolumes(), VOLUMES_BINDING);
            protocolMarshaller.marshall(ecsTaskDetails.getContainers(), CONTAINERS_BINDING);
            protocolMarshaller.marshall(ecsTaskDetails.getGroup(), GROUP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
