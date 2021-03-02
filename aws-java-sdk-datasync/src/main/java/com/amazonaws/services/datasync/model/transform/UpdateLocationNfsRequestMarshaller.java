/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateLocationNfsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLocationNfsRequestMarshaller {

    private static final MarshallingInfo<String> LOCATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocationArn").build();
    private static final MarshallingInfo<String> SUBDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Subdirectory").build();
    private static final MarshallingInfo<StructuredPojo> ONPREMCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnPremConfig").build();
    private static final MarshallingInfo<StructuredPojo> MOUNTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MountOptions").build();

    private static final UpdateLocationNfsRequestMarshaller instance = new UpdateLocationNfsRequestMarshaller();

    public static UpdateLocationNfsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLocationNfsRequest updateLocationNfsRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLocationNfsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLocationNfsRequest.getLocationArn(), LOCATIONARN_BINDING);
            protocolMarshaller.marshall(updateLocationNfsRequest.getSubdirectory(), SUBDIRECTORY_BINDING);
            protocolMarshaller.marshall(updateLocationNfsRequest.getOnPremConfig(), ONPREMCONFIG_BINDING);
            protocolMarshaller.marshall(updateLocationNfsRequest.getMountOptions(), MOUNTOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
