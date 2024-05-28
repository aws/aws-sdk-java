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
package com.amazonaws.services.timestreamwrite.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreamwrite.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchLoadTaskDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchLoadTaskDescriptionMarshaller {

    private static final MarshallingInfo<String> TASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskId").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();
    private static final MarshallingInfo<StructuredPojo> DATASOURCECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSourceConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> PROGRESSREPORT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProgressReport").build();
    private static final MarshallingInfo<StructuredPojo> REPORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DATAMODELCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataModelConfiguration").build();
    private static final MarshallingInfo<String> TARGETDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetDatabaseName").build();
    private static final MarshallingInfo<String> TARGETTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetTableName").build();
    private static final MarshallingInfo<String> TASKSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskStatus").build();
    private static final MarshallingInfo<Long> RECORDVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RecordVersion").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> RESUMABLEUNTIL_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResumableUntil").timestampFormat("unixTimestamp").build();

    private static final BatchLoadTaskDescriptionMarshaller instance = new BatchLoadTaskDescriptionMarshaller();

    public static BatchLoadTaskDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchLoadTaskDescription batchLoadTaskDescription, ProtocolMarshaller protocolMarshaller) {

        if (batchLoadTaskDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchLoadTaskDescription.getTaskId(), TASKID_BINDING);
            protocolMarshaller.marshall(batchLoadTaskDescription.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(batchLoadTaskDescription.getDataSourceConfiguration(), DATASOURCECONFIGURATION_BINDING);
            protocolMarshaller.marshall(batchLoadTaskDescription.getProgressReport(), PROGRESSREPORT_BINDING);
            protocolMarshaller.marshall(batchLoadTaskDescription.getReportConfiguration(), REPORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(batchLoadTaskDescription.getDataModelConfiguration(), DATAMODELCONFIGURATION_BINDING);
            protocolMarshaller.marshall(batchLoadTaskDescription.getTargetDatabaseName(), TARGETDATABASENAME_BINDING);
            protocolMarshaller.marshall(batchLoadTaskDescription.getTargetTableName(), TARGETTABLENAME_BINDING);
            protocolMarshaller.marshall(batchLoadTaskDescription.getTaskStatus(), TASKSTATUS_BINDING);
            protocolMarshaller.marshall(batchLoadTaskDescription.getRecordVersion(), RECORDVERSION_BINDING);
            protocolMarshaller.marshall(batchLoadTaskDescription.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(batchLoadTaskDescription.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
            protocolMarshaller.marshall(batchLoadTaskDescription.getResumableUntil(), RESUMABLEUNTIL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
