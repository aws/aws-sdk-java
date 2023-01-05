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
package com.amazonaws.services.fsx.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateOntapVolumeConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateOntapVolumeConfigurationMarshaller {

    private static final MarshallingInfo<String> JUNCTIONPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JunctionPath").build();
    private static final MarshallingInfo<String> SECURITYSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityStyle").build();
    private static final MarshallingInfo<Integer> SIZEINMEGABYTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizeInMegabytes").build();
    private static final MarshallingInfo<Boolean> STORAGEEFFICIENCYENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageEfficiencyEnabled").build();
    private static final MarshallingInfo<StructuredPojo> TIERINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TieringPolicy").build();
    private static final MarshallingInfo<String> SNAPSHOTPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotPolicy").build();
    private static final MarshallingInfo<Boolean> COPYTAGSTOBACKUPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTagsToBackups").build();

    private static final UpdateOntapVolumeConfigurationMarshaller instance = new UpdateOntapVolumeConfigurationMarshaller();

    public static UpdateOntapVolumeConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateOntapVolumeConfiguration updateOntapVolumeConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (updateOntapVolumeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateOntapVolumeConfiguration.getJunctionPath(), JUNCTIONPATH_BINDING);
            protocolMarshaller.marshall(updateOntapVolumeConfiguration.getSecurityStyle(), SECURITYSTYLE_BINDING);
            protocolMarshaller.marshall(updateOntapVolumeConfiguration.getSizeInMegabytes(), SIZEINMEGABYTES_BINDING);
            protocolMarshaller.marshall(updateOntapVolumeConfiguration.getStorageEfficiencyEnabled(), STORAGEEFFICIENCYENABLED_BINDING);
            protocolMarshaller.marshall(updateOntapVolumeConfiguration.getTieringPolicy(), TIERINGPOLICY_BINDING);
            protocolMarshaller.marshall(updateOntapVolumeConfiguration.getSnapshotPolicy(), SNAPSHOTPOLICY_BINDING);
            protocolMarshaller.marshall(updateOntapVolumeConfiguration.getCopyTagsToBackups(), COPYTAGSTOBACKUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
