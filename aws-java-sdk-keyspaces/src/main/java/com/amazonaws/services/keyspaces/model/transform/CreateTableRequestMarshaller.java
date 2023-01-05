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
package com.amazonaws.services.keyspaces.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.keyspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateTableRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateTableRequestMarshaller {

    private static final MarshallingInfo<String> KEYSPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("keyspaceName").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tableName").build();
    private static final MarshallingInfo<StructuredPojo> SCHEMADEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("schemaDefinition").build();
    private static final MarshallingInfo<StructuredPojo> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("comment").build();
    private static final MarshallingInfo<StructuredPojo> CAPACITYSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capacitySpecification").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionSpecification").build();
    private static final MarshallingInfo<StructuredPojo> POINTINTIMERECOVERY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pointInTimeRecovery").build();
    private static final MarshallingInfo<StructuredPojo> TTL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ttl").build();
    private static final MarshallingInfo<Integer> DEFAULTTIMETOLIVE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultTimeToLive").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateTableRequestMarshaller instance = new CreateTableRequestMarshaller();

    public static CreateTableRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateTableRequest createTableRequest, ProtocolMarshaller protocolMarshaller) {

        if (createTableRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createTableRequest.getKeyspaceName(), KEYSPACENAME_BINDING);
            protocolMarshaller.marshall(createTableRequest.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(createTableRequest.getSchemaDefinition(), SCHEMADEFINITION_BINDING);
            protocolMarshaller.marshall(createTableRequest.getComment(), COMMENT_BINDING);
            protocolMarshaller.marshall(createTableRequest.getCapacitySpecification(), CAPACITYSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createTableRequest.getEncryptionSpecification(), ENCRYPTIONSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createTableRequest.getPointInTimeRecovery(), POINTINTIMERECOVERY_BINDING);
            protocolMarshaller.marshall(createTableRequest.getTtl(), TTL_BINDING);
            protocolMarshaller.marshall(createTableRequest.getDefaultTimeToLive(), DEFAULTTIMETOLIVE_BINDING);
            protocolMarshaller.marshall(createTableRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
