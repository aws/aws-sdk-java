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
 * InstanceSnapshotMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceSnapshotMarshaller {

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
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> PROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("progress").build();
    private static final MarshallingInfo<List> FROMATTACHEDDISKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromAttachedDisks").build();
    private static final MarshallingInfo<String> FROMINSTANCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromInstanceName").build();
    private static final MarshallingInfo<String> FROMINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromInstanceArn").build();
    private static final MarshallingInfo<String> FROMBLUEPRINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromBlueprintId").build();
    private static final MarshallingInfo<String> FROMBUNDLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromBundleId").build();
    private static final MarshallingInfo<Integer> SIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sizeInGb").build();

    private static final InstanceSnapshotMarshaller instance = new InstanceSnapshotMarshaller();

    public static InstanceSnapshotMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceSnapshot instanceSnapshot, ProtocolMarshaller protocolMarshaller) {

        if (instanceSnapshot == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceSnapshot.getName(), NAME_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getSupportCode(), SUPPORTCODE_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getState(), STATE_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getProgress(), PROGRESS_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getFromAttachedDisks(), FROMATTACHEDDISKS_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getFromInstanceName(), FROMINSTANCENAME_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getFromInstanceArn(), FROMINSTANCEARN_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getFromBlueprintId(), FROMBLUEPRINTID_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getFromBundleId(), FROMBUNDLEID_BINDING);
            protocolMarshaller.marshall(instanceSnapshot.getSizeInGb(), SIZEINGB_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
