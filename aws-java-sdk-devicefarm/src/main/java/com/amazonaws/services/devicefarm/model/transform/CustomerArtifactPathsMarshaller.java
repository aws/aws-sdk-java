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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CustomerArtifactPathsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomerArtifactPathsMarshaller {

    private static final MarshallingInfo<List> IOSPATHS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("iosPaths").build();
    private static final MarshallingInfo<List> ANDROIDPATHS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("androidPaths").build();
    private static final MarshallingInfo<List> DEVICEHOSTPATHS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceHostPaths").build();

    private static final CustomerArtifactPathsMarshaller instance = new CustomerArtifactPathsMarshaller();

    public static CustomerArtifactPathsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomerArtifactPaths customerArtifactPaths, ProtocolMarshaller protocolMarshaller) {

        if (customerArtifactPaths == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customerArtifactPaths.getIosPaths(), IOSPATHS_BINDING);
            protocolMarshaller.marshall(customerArtifactPaths.getAndroidPaths(), ANDROIDPATHS_BINDING);
            protocolMarshaller.marshall(customerArtifactPaths.getDeviceHostPaths(), DEVICEHOSTPATHS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
