/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    private static final MarshallingInfo<Long> FULLLOADCONDTNLCHKFAILEDROWS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FullLoadCondtnlChkFailedRows").build();
    private static final MarshallingInfo<Long> FULLLOADERRORROWS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FullLoadErrorRows").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TABLESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableState").build();
    private static final MarshallingInfo<Long> VALIDATIONPENDINGRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationPendingRecords").build();
    private static final MarshallingInfo<Long> VALIDATIONFAILEDRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationFailedRecords").build();
    private static final MarshallingInfo<Long> VALIDATIONSUSPENDEDRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationSuspendedRecords").build();
    private static final MarshallingInfo<String> VALIDATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationState").build();
    private static final MarshallingInfo<String> VALIDATIONSTATEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationStateDetails").build();

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
            protocolMarshaller.marshall(tableStatistics.getFullLoadCondtnlChkFailedRows(), FULLLOADCONDTNLCHKFAILEDROWS_BINDING);
            protocolMarshaller.marshall(tableStatistics.getFullLoadErrorRows(), FULLLOADERRORROWS_BINDING);
            protocolMarshaller.marshall(tableStatistics.getLastUpdateTime(), LASTUPDATETIME_BINDING);
            protocolMarshaller.marshall(tableStatistics.getTableState(), TABLESTATE_BINDING);
            protocolMarshaller.marshall(tableStatistics.getValidationPendingRecords(), VALIDATIONPENDINGRECORDS_BINDING);
            protocolMarshaller.marshall(tableStatistics.getValidationFailedRecords(), VALIDATIONFAILEDRECORDS_BINDING);
            protocolMarshaller.marshall(tableStatistics.getValidationSuspendedRecords(), VALIDATIONSUSPENDEDRECORDS_BINDING);
            protocolMarshaller.marshall(tableStatistics.getValidationState(), VALIDATIONSTATE_BINDING);
            protocolMarshaller.marshall(tableStatistics.getValidationStateDetails(), VALIDATIONSTATEDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
