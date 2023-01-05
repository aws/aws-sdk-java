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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEcsTaskDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsTaskDetailsMarshaller {

    private static final MarshallingInfo<String> CLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterArn").build();
    private static final MarshallingInfo<String> TASKDEFINITIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskDefinitionArn").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();
    private static final MarshallingInfo<String> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedAt").build();
    private static final MarshallingInfo<String> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StartedAt").build();
    private static final MarshallingInfo<String> STARTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StartedBy").build();
    private static final MarshallingInfo<String> GROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Group").build();
    private static final MarshallingInfo<List> VOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Volumes").build();
    private static final MarshallingInfo<List> CONTAINERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Containers").build();

    private static final AwsEcsTaskDetailsMarshaller instance = new AwsEcsTaskDetailsMarshaller();

    public static AwsEcsTaskDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcsTaskDetails awsEcsTaskDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEcsTaskDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsTaskDetails.getClusterArn(), CLUSTERARN_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDetails.getTaskDefinitionArn(), TASKDEFINITIONARN_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDetails.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDetails.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDetails.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDetails.getStartedBy(), STARTEDBY_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDetails.getGroup(), GROUP_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDetails.getVolumes(), VOLUMES_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDetails.getContainers(), CONTAINERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
