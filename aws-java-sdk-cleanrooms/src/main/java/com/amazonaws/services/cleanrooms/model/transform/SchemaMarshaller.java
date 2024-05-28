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
package com.amazonaws.services.cleanrooms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SchemaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SchemaMarshaller {

    private static final MarshallingInfo<List> COLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("columns").build();
    private static final MarshallingInfo<List> PARTITIONKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("partitionKeys").build();
    private static final MarshallingInfo<List> ANALYSISRULETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("analysisRuleTypes").build();
    private static final MarshallingInfo<String> ANALYSISMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("analysisMethod").build();
    private static final MarshallingInfo<String> CREATORACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creatorAccountId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> COLLABORATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collaborationId").build();
    private static final MarshallingInfo<String> COLLABORATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collaborationArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<List> SCHEMASTATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("schemaStatusDetails").build();

    private static final SchemaMarshaller instance = new SchemaMarshaller();

    public static SchemaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Schema schema, ProtocolMarshaller protocolMarshaller) {

        if (schema == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(schema.getColumns(), COLUMNS_BINDING);
            protocolMarshaller.marshall(schema.getPartitionKeys(), PARTITIONKEYS_BINDING);
            protocolMarshaller.marshall(schema.getAnalysisRuleTypes(), ANALYSISRULETYPES_BINDING);
            protocolMarshaller.marshall(schema.getAnalysisMethod(), ANALYSISMETHOD_BINDING);
            protocolMarshaller.marshall(schema.getCreatorAccountId(), CREATORACCOUNTID_BINDING);
            protocolMarshaller.marshall(schema.getName(), NAME_BINDING);
            protocolMarshaller.marshall(schema.getCollaborationId(), COLLABORATIONID_BINDING);
            protocolMarshaller.marshall(schema.getCollaborationArn(), COLLABORATIONARN_BINDING);
            protocolMarshaller.marshall(schema.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(schema.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(schema.getUpdateTime(), UPDATETIME_BINDING);
            protocolMarshaller.marshall(schema.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(schema.getSchemaStatusDetails(), SCHEMASTATUSDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
