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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateSchemaRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSchemaRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> REGISTRYID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistryId").build();
    private static final MarshallingInfo<String> SCHEMANAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaName").build();
    private static final MarshallingInfo<String> DATAFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataFormat").build();
    private static final MarshallingInfo<String> COMPATIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Compatibility").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> SCHEMADEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaDefinition").build();

    private static final CreateSchemaRequestMarshaller instance = new CreateSchemaRequestMarshaller();

    public static CreateSchemaRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSchemaRequest createSchemaRequest, ProtocolMarshaller protocolMarshaller) {

        if (createSchemaRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSchemaRequest.getRegistryId(), REGISTRYID_BINDING);
            protocolMarshaller.marshall(createSchemaRequest.getSchemaName(), SCHEMANAME_BINDING);
            protocolMarshaller.marshall(createSchemaRequest.getDataFormat(), DATAFORMAT_BINDING);
            protocolMarshaller.marshall(createSchemaRequest.getCompatibility(), COMPATIBILITY_BINDING);
            protocolMarshaller.marshall(createSchemaRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createSchemaRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createSchemaRequest.getSchemaDefinition(), SCHEMADEFINITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
