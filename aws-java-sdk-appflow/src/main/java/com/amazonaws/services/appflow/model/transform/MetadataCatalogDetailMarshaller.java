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
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MetadataCatalogDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MetadataCatalogDetailMarshaller {

    private static final MarshallingInfo<String> CATALOGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("catalogType").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tableName").build();
    private static final MarshallingInfo<StructuredPojo> TABLEREGISTRATIONOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tableRegistrationOutput").build();
    private static final MarshallingInfo<StructuredPojo> PARTITIONREGISTRATIONOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("partitionRegistrationOutput").build();

    private static final MetadataCatalogDetailMarshaller instance = new MetadataCatalogDetailMarshaller();

    public static MetadataCatalogDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MetadataCatalogDetail metadataCatalogDetail, ProtocolMarshaller protocolMarshaller) {

        if (metadataCatalogDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(metadataCatalogDetail.getCatalogType(), CATALOGTYPE_BINDING);
            protocolMarshaller.marshall(metadataCatalogDetail.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(metadataCatalogDetail.getTableRegistrationOutput(), TABLEREGISTRATIONOUTPUT_BINDING);
            protocolMarshaller.marshall(metadataCatalogDetail.getPartitionRegistrationOutput(), PARTITIONREGISTRATIONOUTPUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
