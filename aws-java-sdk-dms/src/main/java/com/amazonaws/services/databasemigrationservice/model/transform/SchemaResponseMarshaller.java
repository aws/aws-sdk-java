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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SchemaResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SchemaResponseMarshaller {

    private static final MarshallingInfo<Long> CODELINECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CodeLineCount").build();
    private static final MarshallingInfo<Long> CODESIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CodeSize").build();
    private static final MarshallingInfo<String> COMPLEXITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Complexity").build();
    private static final MarshallingInfo<StructuredPojo> SERVER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Server").build();
    private static final MarshallingInfo<StructuredPojo> DATABASEINSTANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseInstance").build();
    private static final MarshallingInfo<String> SCHEMAID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SchemaId").build();
    private static final MarshallingInfo<String> SCHEMANAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaName").build();
    private static final MarshallingInfo<StructuredPojo> ORIGINALSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginalSchema").build();
    private static final MarshallingInfo<Double> SIMILARITY_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Similarity").build();

    private static final SchemaResponseMarshaller instance = new SchemaResponseMarshaller();

    public static SchemaResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SchemaResponse schemaResponse, ProtocolMarshaller protocolMarshaller) {

        if (schemaResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(schemaResponse.getCodeLineCount(), CODELINECOUNT_BINDING);
            protocolMarshaller.marshall(schemaResponse.getCodeSize(), CODESIZE_BINDING);
            protocolMarshaller.marshall(schemaResponse.getComplexity(), COMPLEXITY_BINDING);
            protocolMarshaller.marshall(schemaResponse.getServer(), SERVER_BINDING);
            protocolMarshaller.marshall(schemaResponse.getDatabaseInstance(), DATABASEINSTANCE_BINDING);
            protocolMarshaller.marshall(schemaResponse.getSchemaId(), SCHEMAID_BINDING);
            protocolMarshaller.marshall(schemaResponse.getSchemaName(), SCHEMANAME_BINDING);
            protocolMarshaller.marshall(schemaResponse.getOriginalSchema(), ORIGINALSCHEMA_BINDING);
            protocolMarshaller.marshall(schemaResponse.getSimilarity(), SIMILARITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
