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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OfflineStoreConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OfflineStoreConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> S3STORAGECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3StorageConfig").build();
    private static final MarshallingInfo<Boolean> DISABLEGLUETABLECREATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisableGlueTableCreation").build();
    private static final MarshallingInfo<StructuredPojo> DATACATALOGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataCatalogConfig").build();

    private static final OfflineStoreConfigMarshaller instance = new OfflineStoreConfigMarshaller();

    public static OfflineStoreConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OfflineStoreConfig offlineStoreConfig, ProtocolMarshaller protocolMarshaller) {

        if (offlineStoreConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(offlineStoreConfig.getS3StorageConfig(), S3STORAGECONFIG_BINDING);
            protocolMarshaller.marshall(offlineStoreConfig.getDisableGlueTableCreation(), DISABLEGLUETABLECREATION_BINDING);
            protocolMarshaller.marshall(offlineStoreConfig.getDataCatalogConfig(), DATACATALOGCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
