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
 * ColumnStatisticsTaskRunMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ColumnStatisticsTaskRunMarshaller {

    private static final MarshallingInfo<String> CUSTOMERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomerId").build();
    private static final MarshallingInfo<String> COLUMNSTATISTICSTASKRUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnStatisticsTaskRunId").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<List> COLUMNNAMELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnNameList").build();
    private static final MarshallingInfo<String> CATALOGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CatalogID").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<Double> SAMPLESIZE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleSize").build();
    private static final MarshallingInfo<String> SECURITYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityConfiguration").build();
    private static final MarshallingInfo<Integer> NUMBEROFWORKERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfWorkers").build();
    private static final MarshallingInfo<String> WORKERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkerType").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();
    private static final MarshallingInfo<Double> DPUSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DPUSeconds").build();

    private static final ColumnStatisticsTaskRunMarshaller instance = new ColumnStatisticsTaskRunMarshaller();

    public static ColumnStatisticsTaskRunMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ColumnStatisticsTaskRun columnStatisticsTaskRun, ProtocolMarshaller protocolMarshaller) {

        if (columnStatisticsTaskRun == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(columnStatisticsTaskRun.getCustomerId(), CUSTOMERID_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getColumnStatisticsTaskRunId(), COLUMNSTATISTICSTASKRUNID_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getColumnNameList(), COLUMNNAMELIST_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getCatalogID(), CATALOGID_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getSampleSize(), SAMPLESIZE_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getSecurityConfiguration(), SECURITYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getNumberOfWorkers(), NUMBEROFWORKERS_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getWorkerType(), WORKERTYPE_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getLastUpdated(), LASTUPDATED_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(columnStatisticsTaskRun.getDPUSeconds(), DPUSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
