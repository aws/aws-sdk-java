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
package com.amazonaws.services.glue.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SnowflakeNodeDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SnowflakeNodeDataMarshaller {

    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceType").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Connection").build();
    private static final MarshallingInfo<String> SCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Schema").build();
    private static final MarshallingInfo<String> TABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Table").build();
    private static final MarshallingInfo<String> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Database").build();
    private static final MarshallingInfo<String> TEMPDIR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TempDir").build();
    private static final MarshallingInfo<StructuredPojo> IAMROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRole").build();
    private static final MarshallingInfo<Map> ADDITIONALOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalOptions").build();
    private static final MarshallingInfo<String> SAMPLEQUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleQuery").build();
    private static final MarshallingInfo<String> PREACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PreAction").build();
    private static final MarshallingInfo<String> POSTACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostAction").build();
    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<Boolean> UPSERT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Upsert").build();
    private static final MarshallingInfo<String> MERGEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MergeAction").build();
    private static final MarshallingInfo<String> MERGEWHENMATCHED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MergeWhenMatched").build();
    private static final MarshallingInfo<String> MERGEWHENNOTMATCHED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MergeWhenNotMatched").build();
    private static final MarshallingInfo<String> MERGECLAUSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MergeClause").build();
    private static final MarshallingInfo<String> STAGINGTABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StagingTable").build();
    private static final MarshallingInfo<List> SELECTEDCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectedColumns").build();
    private static final MarshallingInfo<Boolean> AUTOPUSHDOWN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoPushdown").build();
    private static final MarshallingInfo<List> TABLESCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableSchema").build();

    private static final SnowflakeNodeDataMarshaller instance = new SnowflakeNodeDataMarshaller();

    public static SnowflakeNodeDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SnowflakeNodeData snowflakeNodeData, ProtocolMarshaller protocolMarshaller) {

        if (snowflakeNodeData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(snowflakeNodeData.getSourceType(), SOURCETYPE_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getConnection(), CONNECTION_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getSchema(), SCHEMA_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getTable(), TABLE_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getTempDir(), TEMPDIR_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getIamRole(), IAMROLE_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getAdditionalOptions(), ADDITIONALOPTIONS_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getSampleQuery(), SAMPLEQUERY_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getPreAction(), PREACTION_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getPostAction(), POSTACTION_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getUpsert(), UPSERT_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getMergeAction(), MERGEACTION_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getMergeWhenMatched(), MERGEWHENMATCHED_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getMergeWhenNotMatched(), MERGEWHENNOTMATCHED_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getMergeClause(), MERGECLAUSE_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getStagingTable(), STAGINGTABLE_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getSelectedColumns(), SELECTEDCOLUMNS_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getAutoPushdown(), AUTOPUSHDOWN_BINDING);
            protocolMarshaller.marshall(snowflakeNodeData.getTableSchema(), TABLESCHEMA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
