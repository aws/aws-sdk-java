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
package com.amazonaws.services.gluedatabrew.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gluedatabrew.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DatabaseInputDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatabaseInputDefinitionMarshaller {

    private static final MarshallingInfo<String> GLUECONNECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlueConnectionName").build();
    private static final MarshallingInfo<String> DATABASETABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseTableName").build();
    private static final MarshallingInfo<StructuredPojo> TEMPDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TempDirectory").build();

    private static final DatabaseInputDefinitionMarshaller instance = new DatabaseInputDefinitionMarshaller();

    public static DatabaseInputDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DatabaseInputDefinition databaseInputDefinition, ProtocolMarshaller protocolMarshaller) {

        if (databaseInputDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(databaseInputDefinition.getGlueConnectionName(), GLUECONNECTIONNAME_BINDING);
            protocolMarshaller.marshall(databaseInputDefinition.getDatabaseTableName(), DATABASETABLENAME_BINDING);
            protocolMarshaller.marshall(databaseInputDefinition.getTempDirectory(), TEMPDIRECTORY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
