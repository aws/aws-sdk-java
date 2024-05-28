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
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TaskManagedEBSVolumeConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaskManagedEBSVolumeConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> ENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encrypted").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<String> VOLUMETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeType").build();
    private static final MarshallingInfo<Integer> SIZEINGIB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sizeInGiB").build();
    private static final MarshallingInfo<String> SNAPSHOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotId").build();
    private static final MarshallingInfo<Integer> IOPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("iops").build();
    private static final MarshallingInfo<Integer> THROUGHPUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("throughput").build();
    private static final MarshallingInfo<List> TAGSPECIFICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tagSpecifications").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<StructuredPojo> TERMINATIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("terminationPolicy").build();
    private static final MarshallingInfo<String> FILESYSTEMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filesystemType").build();

    private static final TaskManagedEBSVolumeConfigurationMarshaller instance = new TaskManagedEBSVolumeConfigurationMarshaller();

    public static TaskManagedEBSVolumeConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TaskManagedEBSVolumeConfiguration taskManagedEBSVolumeConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (taskManagedEBSVolumeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(taskManagedEBSVolumeConfiguration.getEncrypted(), ENCRYPTED_BINDING);
            protocolMarshaller.marshall(taskManagedEBSVolumeConfiguration.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(taskManagedEBSVolumeConfiguration.getVolumeType(), VOLUMETYPE_BINDING);
            protocolMarshaller.marshall(taskManagedEBSVolumeConfiguration.getSizeInGiB(), SIZEINGIB_BINDING);
            protocolMarshaller.marshall(taskManagedEBSVolumeConfiguration.getSnapshotId(), SNAPSHOTID_BINDING);
            protocolMarshaller.marshall(taskManagedEBSVolumeConfiguration.getIops(), IOPS_BINDING);
            protocolMarshaller.marshall(taskManagedEBSVolumeConfiguration.getThroughput(), THROUGHPUT_BINDING);
            protocolMarshaller.marshall(taskManagedEBSVolumeConfiguration.getTagSpecifications(), TAGSPECIFICATIONS_BINDING);
            protocolMarshaller.marshall(taskManagedEBSVolumeConfiguration.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(taskManagedEBSVolumeConfiguration.getTerminationPolicy(), TERMINATIONPOLICY_BINDING);
            protocolMarshaller.marshall(taskManagedEBSVolumeConfiguration.getFilesystemType(), FILESYSTEMTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
