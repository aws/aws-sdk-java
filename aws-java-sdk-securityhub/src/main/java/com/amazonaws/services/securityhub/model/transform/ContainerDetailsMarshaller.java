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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerDetailsMarshaller {

    private static final MarshallingInfo<String> CONTAINERRUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerRuntime").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> IMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageId").build();
    private static final MarshallingInfo<String> IMAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageName").build();
    private static final MarshallingInfo<String> LAUNCHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchedAt").build();
    private static final MarshallingInfo<List> VOLUMEMOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VolumeMounts").build();
    private static final MarshallingInfo<Boolean> PRIVILEGED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Privileged").build();

    private static final ContainerDetailsMarshaller instance = new ContainerDetailsMarshaller();

    public static ContainerDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerDetails containerDetails, ProtocolMarshaller protocolMarshaller) {

        if (containerDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerDetails.getContainerRuntime(), CONTAINERRUNTIME_BINDING);
            protocolMarshaller.marshall(containerDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(containerDetails.getImageId(), IMAGEID_BINDING);
            protocolMarshaller.marshall(containerDetails.getImageName(), IMAGENAME_BINDING);
            protocolMarshaller.marshall(containerDetails.getLaunchedAt(), LAUNCHEDAT_BINDING);
            protocolMarshaller.marshall(containerDetails.getVolumeMounts(), VOLUMEMOUNTS_BINDING);
            protocolMarshaller.marshall(containerDetails.getPrivileged(), PRIVILEGED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
