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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SchemaVersionListItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SchemaVersionListItemMarshaller {

    private static final MarshallingInfo<String> SCHEMAARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SchemaArn").build();
    private static final MarshallingInfo<String> SCHEMAVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaVersionId").build();
    private static final MarshallingInfo<Long> VERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VersionNumber").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").build();

    private static final SchemaVersionListItemMarshaller instance = new SchemaVersionListItemMarshaller();

    public static SchemaVersionListItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SchemaVersionListItem schemaVersionListItem, ProtocolMarshaller protocolMarshaller) {

        if (schemaVersionListItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(schemaVersionListItem.getSchemaArn(), SCHEMAARN_BINDING);
            protocolMarshaller.marshall(schemaVersionListItem.getSchemaVersionId(), SCHEMAVERSIONID_BINDING);
            protocolMarshaller.marshall(schemaVersionListItem.getVersionNumber(), VERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(schemaVersionListItem.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(schemaVersionListItem.getCreatedTime(), CREATEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
