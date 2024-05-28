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
package com.amazonaws.services.deadline.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateStorageProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateStorageProfileRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amz-Client-Token")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<String> FARMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("farmId").build();
    private static final MarshallingInfo<List> FILESYSTEMLOCATIONSTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileSystemLocationsToAdd").build();
    private static final MarshallingInfo<List> FILESYSTEMLOCATIONSTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileSystemLocationsToRemove").build();
    private static final MarshallingInfo<String> OSFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("osFamily").build();
    private static final MarshallingInfo<String> STORAGEPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("storageProfileId").build();

    private static final UpdateStorageProfileRequestMarshaller instance = new UpdateStorageProfileRequestMarshaller();

    public static UpdateStorageProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateStorageProfileRequest updateStorageProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateStorageProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateStorageProfileRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateStorageProfileRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(updateStorageProfileRequest.getFarmId(), FARMID_BINDING);
            protocolMarshaller.marshall(updateStorageProfileRequest.getFileSystemLocationsToAdd(), FILESYSTEMLOCATIONSTOADD_BINDING);
            protocolMarshaller.marshall(updateStorageProfileRequest.getFileSystemLocationsToRemove(), FILESYSTEMLOCATIONSTOREMOVE_BINDING);
            protocolMarshaller.marshall(updateStorageProfileRequest.getOsFamily(), OSFAMILY_BINDING);
            protocolMarshaller.marshall(updateStorageProfileRequest.getStorageProfileId(), STORAGEPROFILEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
