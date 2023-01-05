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
package com.amazonaws.services.redshiftserverless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.redshiftserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TableRestoreStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TableRestoreStatusMarshaller {

    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("message").build();
    private static final MarshallingInfo<String> NAMESPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("namespaceName").build();
    private static final MarshallingInfo<String> NEWTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("newTableName").build();
    private static final MarshallingInfo<Long> PROGRESSINMEGABYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("progressInMegaBytes").build();
    private static final MarshallingInfo<java.util.Date> REQUESTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SNAPSHOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotName").build();
    private static final MarshallingInfo<String> SOURCEDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceDatabaseName").build();
    private static final MarshallingInfo<String> SOURCESCHEMANAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceSchemaName").build();
    private static final MarshallingInfo<String> SOURCETABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceTableName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> TABLERESTOREREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tableRestoreRequestId").build();
    private static final MarshallingInfo<String> TARGETDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetDatabaseName").build();
    private static final MarshallingInfo<String> TARGETSCHEMANAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetSchemaName").build();
    private static final MarshallingInfo<Long> TOTALDATAINMEGABYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalDataInMegaBytes").build();
    private static final MarshallingInfo<String> WORKGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workgroupName").build();

    private static final TableRestoreStatusMarshaller instance = new TableRestoreStatusMarshaller();

    public static TableRestoreStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TableRestoreStatus tableRestoreStatus, ProtocolMarshaller protocolMarshaller) {

        if (tableRestoreStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tableRestoreStatus.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getNamespaceName(), NAMESPACENAME_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getNewTableName(), NEWTABLENAME_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getProgressInMegaBytes(), PROGRESSINMEGABYTES_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getRequestTime(), REQUESTTIME_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getSnapshotName(), SNAPSHOTNAME_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getSourceDatabaseName(), SOURCEDATABASENAME_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getSourceSchemaName(), SOURCESCHEMANAME_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getSourceTableName(), SOURCETABLENAME_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getTableRestoreRequestId(), TABLERESTOREREQUESTID_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getTargetDatabaseName(), TARGETDATABASENAME_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getTargetSchemaName(), TARGETSCHEMANAME_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getTotalDataInMegaBytes(), TOTALDATAINMEGABYTES_BINDING);
            protocolMarshaller.marshall(tableRestoreStatus.getWorkgroupName(), WORKGROUPNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
