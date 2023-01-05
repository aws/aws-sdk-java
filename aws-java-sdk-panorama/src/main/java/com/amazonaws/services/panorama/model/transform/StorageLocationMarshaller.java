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
package com.amazonaws.services.panorama.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.panorama.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StorageLocationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StorageLocationMarshaller {

    private static final MarshallingInfo<String> BINARYPREFIXLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BinaryPrefixLocation").build();
    private static final MarshallingInfo<String> BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Bucket").build();
    private static final MarshallingInfo<String> GENERATEDPREFIXLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeneratedPrefixLocation").build();
    private static final MarshallingInfo<String> MANIFESTPREFIXLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManifestPrefixLocation").build();
    private static final MarshallingInfo<String> REPOPREFIXLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RepoPrefixLocation").build();

    private static final StorageLocationMarshaller instance = new StorageLocationMarshaller();

    public static StorageLocationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StorageLocation storageLocation, ProtocolMarshaller protocolMarshaller) {

        if (storageLocation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(storageLocation.getBinaryPrefixLocation(), BINARYPREFIXLOCATION_BINDING);
            protocolMarshaller.marshall(storageLocation.getBucket(), BUCKET_BINDING);
            protocolMarshaller.marshall(storageLocation.getGeneratedPrefixLocation(), GENERATEDPREFIXLOCATION_BINDING);
            protocolMarshaller.marshall(storageLocation.getManifestPrefixLocation(), MANIFESTPREFIXLOCATION_BINDING);
            protocolMarshaller.marshall(storageLocation.getRepoPrefixLocation(), REPOPREFIXLOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
