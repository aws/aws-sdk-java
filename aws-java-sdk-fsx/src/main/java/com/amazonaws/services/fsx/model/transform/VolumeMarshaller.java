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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VolumeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VolumeMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FILESYSTEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSystemId").build();
    private static final MarshallingInfo<String> LIFECYCLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Lifecycle").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> ONTAPCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OntapConfiguration").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceARN").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> VOLUMEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VolumeId").build();
    private static final MarshallingInfo<String> VOLUMETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeType").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLETRANSITIONREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LifecycleTransitionReason").build();
    private static final MarshallingInfo<List> ADMINISTRATIVEACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdministrativeActions").build();
    private static final MarshallingInfo<StructuredPojo> OPENZFSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OpenZFSConfiguration").build();

    private static final VolumeMarshaller instance = new VolumeMarshaller();

    public static VolumeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Volume volume, ProtocolMarshaller protocolMarshaller) {

        if (volume == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(volume.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(volume.getFileSystemId(), FILESYSTEMID_BINDING);
            protocolMarshaller.marshall(volume.getLifecycle(), LIFECYCLE_BINDING);
            protocolMarshaller.marshall(volume.getName(), NAME_BINDING);
            protocolMarshaller.marshall(volume.getOntapConfiguration(), ONTAPCONFIGURATION_BINDING);
            protocolMarshaller.marshall(volume.getResourceARN(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(volume.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(volume.getVolumeId(), VOLUMEID_BINDING);
            protocolMarshaller.marshall(volume.getVolumeType(), VOLUMETYPE_BINDING);
            protocolMarshaller.marshall(volume.getLifecycleTransitionReason(), LIFECYCLETRANSITIONREASON_BINDING);
            protocolMarshaller.marshall(volume.getAdministrativeActions(), ADMINISTRATIVEACTIONS_BINDING);
            protocolMarshaller.marshall(volume.getOpenZFSConfiguration(), OPENZFSCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
