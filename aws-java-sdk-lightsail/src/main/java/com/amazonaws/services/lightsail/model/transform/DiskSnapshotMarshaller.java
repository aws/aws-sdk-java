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
package com.amazonaws.services.lightsail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DiskSnapshotMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DiskSnapshotMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> SUPPORTCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportCode").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("location").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<Integer> SIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sizeInGb").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> PROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("progress").build();
    private static final MarshallingInfo<String> FROMDISKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromDiskName").build();
    private static final MarshallingInfo<String> FROMDISKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromDiskArn").build();
    private static final MarshallingInfo<String> FROMINSTANCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromInstanceName").build();
    private static final MarshallingInfo<String> FROMINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromInstanceArn").build();

    private static final DiskSnapshotMarshaller instance = new DiskSnapshotMarshaller();

    public static DiskSnapshotMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DiskSnapshot diskSnapshot, ProtocolMarshaller protocolMarshaller) {

        if (diskSnapshot == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(diskSnapshot.getName(), NAME_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getSupportCode(), SUPPORTCODE_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getSizeInGb(), SIZEINGB_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getState(), STATE_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getProgress(), PROGRESS_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getFromDiskName(), FROMDISKNAME_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getFromDiskArn(), FROMDISKARN_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getFromInstanceName(), FROMINSTANCENAME_BINDING);
            protocolMarshaller.marshall(diskSnapshot.getFromInstanceArn(), FROMINSTANCEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
