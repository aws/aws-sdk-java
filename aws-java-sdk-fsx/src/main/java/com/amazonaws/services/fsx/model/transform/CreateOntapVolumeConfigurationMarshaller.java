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
 * CreateOntapVolumeConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateOntapVolumeConfigurationMarshaller {

    private static final MarshallingInfo<String> JUNCTIONPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JunctionPath").build();
    private static final MarshallingInfo<String> SECURITYSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityStyle").build();
    private static final MarshallingInfo<Integer> SIZEINMEGABYTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizeInMegabytes").build();
    private static final MarshallingInfo<Boolean> STORAGEEFFICIENCYENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageEfficiencyEnabled").build();
    private static final MarshallingInfo<String> STORAGEVIRTUALMACHINEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageVirtualMachineId").build();
    private static final MarshallingInfo<StructuredPojo> TIERINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TieringPolicy").build();
    private static final MarshallingInfo<String> ONTAPVOLUMETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OntapVolumeType").build();
    private static final MarshallingInfo<String> SNAPSHOTPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotPolicy").build();
    private static final MarshallingInfo<Boolean> COPYTAGSTOBACKUPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTagsToBackups").build();

    private static final CreateOntapVolumeConfigurationMarshaller instance = new CreateOntapVolumeConfigurationMarshaller();

    public static CreateOntapVolumeConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateOntapVolumeConfiguration createOntapVolumeConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (createOntapVolumeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createOntapVolumeConfiguration.getJunctionPath(), JUNCTIONPATH_BINDING);
            protocolMarshaller.marshall(createOntapVolumeConfiguration.getSecurityStyle(), SECURITYSTYLE_BINDING);
            protocolMarshaller.marshall(createOntapVolumeConfiguration.getSizeInMegabytes(), SIZEINMEGABYTES_BINDING);
            protocolMarshaller.marshall(createOntapVolumeConfiguration.getStorageEfficiencyEnabled(), STORAGEEFFICIENCYENABLED_BINDING);
            protocolMarshaller.marshall(createOntapVolumeConfiguration.getStorageVirtualMachineId(), STORAGEVIRTUALMACHINEID_BINDING);
            protocolMarshaller.marshall(createOntapVolumeConfiguration.getTieringPolicy(), TIERINGPOLICY_BINDING);
            protocolMarshaller.marshall(createOntapVolumeConfiguration.getOntapVolumeType(), ONTAPVOLUMETYPE_BINDING);
            protocolMarshaller.marshall(createOntapVolumeConfiguration.getSnapshotPolicy(), SNAPSHOTPOLICY_BINDING);
            protocolMarshaller.marshall(createOntapVolumeConfiguration.getCopyTagsToBackups(), COPYTAGSTOBACKUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
