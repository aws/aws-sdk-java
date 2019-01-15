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
package com.amazonaws.services.storagegateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CachediSCSIVolumeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CachediSCSIVolumeMarshaller {

    private static final MarshallingInfo<String> VOLUMEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VolumeARN").build();
    private static final MarshallingInfo<String> VOLUMEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VolumeId").build();
    private static final MarshallingInfo<String> VOLUMETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeType").build();
    private static final MarshallingInfo<String> VOLUMESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeStatus").build();
    private static final MarshallingInfo<String> VOLUMEATTACHMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeAttachmentStatus").build();
    private static final MarshallingInfo<Long> VOLUMESIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeSizeInBytes").build();
    private static final MarshallingInfo<Double> VOLUMEPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeProgress").build();
    private static final MarshallingInfo<String> SOURCESNAPSHOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceSnapshotId").build();
    private static final MarshallingInfo<StructuredPojo> VOLUMEISCSIATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeiSCSIAttributes").build();
    private static final MarshallingInfo<java.util.Date> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> VOLUMEUSEDINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeUsedInBytes").build();
    private static final MarshallingInfo<String> KMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KMSKey").build();
    private static final MarshallingInfo<String> TARGETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetName").build();

    private static final CachediSCSIVolumeMarshaller instance = new CachediSCSIVolumeMarshaller();

    public static CachediSCSIVolumeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CachediSCSIVolume cachediSCSIVolume, ProtocolMarshaller protocolMarshaller) {

        if (cachediSCSIVolume == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cachediSCSIVolume.getVolumeARN(), VOLUMEARN_BINDING);
            protocolMarshaller.marshall(cachediSCSIVolume.getVolumeId(), VOLUMEID_BINDING);
            protocolMarshaller.marshall(cachediSCSIVolume.getVolumeType(), VOLUMETYPE_BINDING);
            protocolMarshaller.marshall(cachediSCSIVolume.getVolumeStatus(), VOLUMESTATUS_BINDING);
            protocolMarshaller.marshall(cachediSCSIVolume.getVolumeAttachmentStatus(), VOLUMEATTACHMENTSTATUS_BINDING);
            protocolMarshaller.marshall(cachediSCSIVolume.getVolumeSizeInBytes(), VOLUMESIZEINBYTES_BINDING);
            protocolMarshaller.marshall(cachediSCSIVolume.getVolumeProgress(), VOLUMEPROGRESS_BINDING);
            protocolMarshaller.marshall(cachediSCSIVolume.getSourceSnapshotId(), SOURCESNAPSHOTID_BINDING);
            protocolMarshaller.marshall(cachediSCSIVolume.getVolumeiSCSIAttributes(), VOLUMEISCSIATTRIBUTES_BINDING);
            protocolMarshaller.marshall(cachediSCSIVolume.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(cachediSCSIVolume.getVolumeUsedInBytes(), VOLUMEUSEDINBYTES_BINDING);
            protocolMarshaller.marshall(cachediSCSIVolume.getKMSKey(), KMSKEY_BINDING);
            protocolMarshaller.marshall(cachediSCSIVolume.getTargetName(), TARGETNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
