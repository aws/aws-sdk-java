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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateInstancesFromSnapshotRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateInstancesFromSnapshotRequestMarshaller {

    private static final MarshallingInfo<List> INSTANCENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("instanceNames").build();
    private static final MarshallingInfo<Map> ATTACHEDDISKMAPPING_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attachedDiskMapping").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZone").build();
    private static final MarshallingInfo<String> INSTANCESNAPSHOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceSnapshotName").build();
    private static final MarshallingInfo<String> BUNDLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bundleId").build();
    private static final MarshallingInfo<String> USERDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userData").build();
    private static final MarshallingInfo<String> KEYPAIRNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("keyPairName").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateInstancesFromSnapshotRequestMarshaller instance = new CreateInstancesFromSnapshotRequestMarshaller();

    public static CreateInstancesFromSnapshotRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest, ProtocolMarshaller protocolMarshaller) {

        if (createInstancesFromSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createInstancesFromSnapshotRequest.getInstanceNames(), INSTANCENAMES_BINDING);
            protocolMarshaller.marshall(createInstancesFromSnapshotRequest.getAttachedDiskMapping(), ATTACHEDDISKMAPPING_BINDING);
            protocolMarshaller.marshall(createInstancesFromSnapshotRequest.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(createInstancesFromSnapshotRequest.getInstanceSnapshotName(), INSTANCESNAPSHOTNAME_BINDING);
            protocolMarshaller.marshall(createInstancesFromSnapshotRequest.getBundleId(), BUNDLEID_BINDING);
            protocolMarshaller.marshall(createInstancesFromSnapshotRequest.getUserData(), USERDATA_BINDING);
            protocolMarshaller.marshall(createInstancesFromSnapshotRequest.getKeyPairName(), KEYPAIRNAME_BINDING);
            protocolMarshaller.marshall(createInstancesFromSnapshotRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
