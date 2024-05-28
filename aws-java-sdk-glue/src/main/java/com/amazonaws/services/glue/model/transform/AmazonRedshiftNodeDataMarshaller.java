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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AmazonRedshiftNodeDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AmazonRedshiftNodeDataMarshaller {

    private static final MarshallingInfo<String> ACCESSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessType").build();
    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceType").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Connection").build();
    private static final MarshallingInfo<StructuredPojo> SCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Schema").build();
    private static final MarshallingInfo<StructuredPojo> TABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Table").build();
    private static final MarshallingInfo<StructuredPojo> CATALOGDATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogDatabase").build();
    private static final MarshallingInfo<StructuredPojo> CATALOGTABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogTable").build();
    private static final MarshallingInfo<String> CATALOGREDSHIFTSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogRedshiftSchema").build();
    private static final MarshallingInfo<String> CATALOGREDSHIFTTABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CatalogRedshiftTable").build();
    private static final MarshallingInfo<String> TEMPDIR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TempDir").build();
    private static final MarshallingInfo<StructuredPojo> IAMROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRole").build();
    private static final MarshallingInfo<List> ADVANCEDOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdvancedOptions").build();
    private static final MarshallingInfo<String> SAMPLEQUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleQuery").build();
    private static final MarshallingInfo<String> PREACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PreAction").build();
    private static final MarshallingInfo<String> POSTACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostAction").build();
    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<String> TABLEPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TablePrefix").build();
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
    private static final MarshallingInfo<String> CRAWLERCONNECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlerConnection").build();
    private static final MarshallingInfo<List> TABLESCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableSchema").build();
    private static final MarshallingInfo<String> STAGINGTABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StagingTable").build();
    private static final MarshallingInfo<List> SELECTEDCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectedColumns").build();

    private static final AmazonRedshiftNodeDataMarshaller instance = new AmazonRedshiftNodeDataMarshaller();

    public static AmazonRedshiftNodeDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AmazonRedshiftNodeData amazonRedshiftNodeData, ProtocolMarshaller protocolMarshaller) {

        if (amazonRedshiftNodeData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(amazonRedshiftNodeData.getAccessType(), ACCESSTYPE_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getSourceType(), SOURCETYPE_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getConnection(), CONNECTION_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getSchema(), SCHEMA_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getTable(), TABLE_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getCatalogDatabase(), CATALOGDATABASE_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getCatalogTable(), CATALOGTABLE_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getCatalogRedshiftSchema(), CATALOGREDSHIFTSCHEMA_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getCatalogRedshiftTable(), CATALOGREDSHIFTTABLE_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getTempDir(), TEMPDIR_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getIamRole(), IAMROLE_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getAdvancedOptions(), ADVANCEDOPTIONS_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getSampleQuery(), SAMPLEQUERY_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getPreAction(), PREACTION_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getPostAction(), POSTACTION_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getTablePrefix(), TABLEPREFIX_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getUpsert(), UPSERT_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getMergeAction(), MERGEACTION_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getMergeWhenMatched(), MERGEWHENMATCHED_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getMergeWhenNotMatched(), MERGEWHENNOTMATCHED_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getMergeClause(), MERGECLAUSE_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getCrawlerConnection(), CRAWLERCONNECTION_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getTableSchema(), TABLESCHEMA_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getStagingTable(), STAGINGTABLE_BINDING);
            protocolMarshaller.marshall(amazonRedshiftNodeData.getSelectedColumns(), SELECTEDCOLUMNS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
