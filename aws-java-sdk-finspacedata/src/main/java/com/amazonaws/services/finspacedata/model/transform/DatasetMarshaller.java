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
package com.amazonaws.services.finspacedata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspacedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DatasetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatasetMarshaller {

    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("datasetId").build();
    private static final MarshallingInfo<String> DATASETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datasetArn").build();
    private static final MarshallingInfo<String> DATASETTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datasetTitle").build();
    private static final MarshallingInfo<String> KIND_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kind").build();
    private static final MarshallingInfo<String> DATASETDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datasetDescription").build();
    private static final MarshallingInfo<StructuredPojo> OWNERINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ownerInfo").build();
    private static final MarshallingInfo<Long> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createTime").build();
    private static final MarshallingInfo<Long> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedTime").build();
    private static final MarshallingInfo<StructuredPojo> SCHEMADEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("schemaDefinition").build();
    private static final MarshallingInfo<String> ALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("alias").build();

    private static final DatasetMarshaller instance = new DatasetMarshaller();

    public static DatasetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Dataset dataset, ProtocolMarshaller protocolMarshaller) {

        if (dataset == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataset.getDatasetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(dataset.getDatasetArn(), DATASETARN_BINDING);
            protocolMarshaller.marshall(dataset.getDatasetTitle(), DATASETTITLE_BINDING);
            protocolMarshaller.marshall(dataset.getKind(), KIND_BINDING);
            protocolMarshaller.marshall(dataset.getDatasetDescription(), DATASETDESCRIPTION_BINDING);
            protocolMarshaller.marshall(dataset.getOwnerInfo(), OWNERINFO_BINDING);
            protocolMarshaller.marshall(dataset.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(dataset.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(dataset.getSchemaDefinition(), SCHEMADEFINITION_BINDING);
            protocolMarshaller.marshall(dataset.getAlias(), ALIAS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
