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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VolumeDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VolumeDetailMarshaller {

    private static final MarshallingInfo<String> VOLUMEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("volumeArn").build();
    private static final MarshallingInfo<String> VOLUMETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeType").build();
    private static final MarshallingInfo<String> DEVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceName").build();
    private static final MarshallingInfo<Integer> VOLUMESIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeSizeInGB").build();
    private static final MarshallingInfo<String> ENCRYPTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionType").build();
    private static final MarshallingInfo<String> SNAPSHOTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotArn").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyArn").build();

    private static final VolumeDetailMarshaller instance = new VolumeDetailMarshaller();

    public static VolumeDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VolumeDetail volumeDetail, ProtocolMarshaller protocolMarshaller) {

        if (volumeDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(volumeDetail.getVolumeArn(), VOLUMEARN_BINDING);
            protocolMarshaller.marshall(volumeDetail.getVolumeType(), VOLUMETYPE_BINDING);
            protocolMarshaller.marshall(volumeDetail.getDeviceName(), DEVICENAME_BINDING);
            protocolMarshaller.marshall(volumeDetail.getVolumeSizeInGB(), VOLUMESIZEINGB_BINDING);
            protocolMarshaller.marshall(volumeDetail.getEncryptionType(), ENCRYPTIONTYPE_BINDING);
            protocolMarshaller.marshall(volumeDetail.getSnapshotArn(), SNAPSHOTARN_BINDING);
            protocolMarshaller.marshall(volumeDetail.getKmsKeyArn(), KMSKEYARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
