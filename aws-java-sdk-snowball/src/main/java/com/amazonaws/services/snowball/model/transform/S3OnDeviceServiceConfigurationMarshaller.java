/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3OnDeviceServiceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3OnDeviceServiceConfigurationMarshaller {

    private static final MarshallingInfo<Double> STORAGELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageLimit").build();
    private static final MarshallingInfo<String> STORAGEUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageUnit").build();
    private static final MarshallingInfo<Integer> SERVICESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceSize").build();
    private static final MarshallingInfo<Integer> FAULTTOLERANCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FaultTolerance").build();

    private static final S3OnDeviceServiceConfigurationMarshaller instance = new S3OnDeviceServiceConfigurationMarshaller();

    public static S3OnDeviceServiceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3OnDeviceServiceConfiguration s3OnDeviceServiceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (s3OnDeviceServiceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3OnDeviceServiceConfiguration.getStorageLimit(), STORAGELIMIT_BINDING);
            protocolMarshaller.marshall(s3OnDeviceServiceConfiguration.getStorageUnit(), STORAGEUNIT_BINDING);
            protocolMarshaller.marshall(s3OnDeviceServiceConfiguration.getServiceSize(), SERVICESIZE_BINDING);
            protocolMarshaller.marshall(s3OnDeviceServiceConfiguration.getFaultTolerance(), FAULTTOLERANCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
