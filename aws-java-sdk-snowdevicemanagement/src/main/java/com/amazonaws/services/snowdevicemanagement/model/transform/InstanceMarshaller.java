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
package com.amazonaws.services.snowdevicemanagement.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowdevicemanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceMarshaller {

    private static final MarshallingInfo<Integer> AMILAUNCHINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("amiLaunchIndex").build();
    private static final MarshallingInfo<List> BLOCKDEVICEMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blockDeviceMappings").build();
    private static final MarshallingInfo<StructuredPojo> CPUOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cpuOptions").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> IMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imageId").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceId").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<String> PRIVATEIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateIpAddress").build();
    private static final MarshallingInfo<String> PUBLICIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publicIpAddress").build();
    private static final MarshallingInfo<String> ROOTDEVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rootDeviceName").build();
    private static final MarshallingInfo<List> SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroups").build();
    private static final MarshallingInfo<StructuredPojo> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("state").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();

    private static final InstanceMarshaller instance = new InstanceMarshaller();

    public static InstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Instance instance, ProtocolMarshaller protocolMarshaller) {

        if (instance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instance.getAmiLaunchIndex(), AMILAUNCHINDEX_BINDING);
            protocolMarshaller.marshall(instance.getBlockDeviceMappings(), BLOCKDEVICEMAPPINGS_BINDING);
            protocolMarshaller.marshall(instance.getCpuOptions(), CPUOPTIONS_BINDING);
            protocolMarshaller.marshall(instance.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(instance.getImageId(), IMAGEID_BINDING);
            protocolMarshaller.marshall(instance.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(instance.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(instance.getPrivateIpAddress(), PRIVATEIPADDRESS_BINDING);
            protocolMarshaller.marshall(instance.getPublicIpAddress(), PUBLICIPADDRESS_BINDING);
            protocolMarshaller.marshall(instance.getRootDeviceName(), ROOTDEVICENAME_BINDING);
            protocolMarshaller.marshall(instance.getSecurityGroups(), SECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(instance.getState(), STATE_BINDING);
            protocolMarshaller.marshall(instance.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
