/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * TableStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TableStatisticsMarshaller {

    private static final MarshallingInfo<String> SCHEMANAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaName").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<Long> INSERTS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Inserts").build();
    private static final MarshallingInfo<Long> DELETES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Deletes").build();
    private static final MarshallingInfo<Long> UPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Updates").build();
    private static final MarshallingInfo<Long> DDLS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Ddls").build();
    private static final MarshallingInfo<Long> FULLLOADROWS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FullLoadRows").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateTime").build();
    private static final MarshallingInfo<String> TABLESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableState").build();

    private static final TableStatisticsMarshaller instance = new TableStatisticsMarshaller();

    public static TableStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TableStatistics tableStatistics, ProtocolMarshaller protocolMarshaller) {

        if (tableStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tableStatistics.getSchemaName(), SCHEMANAME_BINDING);
            protocolMarshaller.marshall(tableStatistics.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(tableStatistics.getInserts(), INSERTS_BINDING);
            protocolMarshaller.marshall(tableStatistics.getDeletes(), DELETES_BINDING);
            protocolMarshaller.marshall(tableStatistics.getUpdates(), UPDATES_BINDING);
            protocolMarshaller.marshall(tableStatistics.getDdls(), DDLS_BINDING);
            protocolMarshaller.marshall(tableStatistics.getFullLoadRows(), FULLLOADROWS_BINDING);
            protocolMarshaller.marshall(tableStatistics.getLastUpdateTime(), LASTUPDATETIME_BINDING);
            protocolMarshaller.marshall(tableStatistics.getTableState(), TABLESTATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
