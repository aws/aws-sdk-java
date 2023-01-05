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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CatalogKinesisSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CatalogKinesisSourceMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Integer> WINDOWSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WindowSize").build();
    private static final MarshallingInfo<Boolean> DETECTSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetectSchema").build();
    private static final MarshallingInfo<String> TABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Table").build();
    private static final MarshallingInfo<String> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Database").build();
    private static final MarshallingInfo<StructuredPojo> STREAMINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamingOptions").build();
    private static final MarshallingInfo<StructuredPojo> DATAPREVIEWOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataPreviewOptions").build();

    private static final CatalogKinesisSourceMarshaller instance = new CatalogKinesisSourceMarshaller();

    public static CatalogKinesisSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CatalogKinesisSource catalogKinesisSource, ProtocolMarshaller protocolMarshaller) {

        if (catalogKinesisSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(catalogKinesisSource.getName(), NAME_BINDING);
            protocolMarshaller.marshall(catalogKinesisSource.getWindowSize(), WINDOWSIZE_BINDING);
            protocolMarshaller.marshall(catalogKinesisSource.getDetectSchema(), DETECTSCHEMA_BINDING);
            protocolMarshaller.marshall(catalogKinesisSource.getTable(), TABLE_BINDING);
            protocolMarshaller.marshall(catalogKinesisSource.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(catalogKinesisSource.getStreamingOptions(), STREAMINGOPTIONS_BINDING);
            protocolMarshaller.marshall(catalogKinesisSource.getDataPreviewOptions(), DATAPREVIEWOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
