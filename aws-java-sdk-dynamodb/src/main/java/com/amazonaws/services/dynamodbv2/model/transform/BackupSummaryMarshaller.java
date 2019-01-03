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
package com.amazonaws.services.dynamodbv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BackupSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BackupSummaryMarshaller {

    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<String> TABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableId").build();
    private static final MarshallingInfo<String> TABLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableArn").build();
    private static final MarshallingInfo<String> BACKUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BackupArn").build();
    private static final MarshallingInfo<String> BACKUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupName").build();
    private static final MarshallingInfo<java.util.Date> BACKUPCREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupCreationDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> BACKUPEXPIRYDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupExpiryDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> BACKUPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupStatus").build();
    private static final MarshallingInfo<String> BACKUPTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupType").build();
    private static final MarshallingInfo<Long> BACKUPSIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupSizeBytes").build();

    private static final BackupSummaryMarshaller instance = new BackupSummaryMarshaller();

    public static BackupSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BackupSummary backupSummary, ProtocolMarshaller protocolMarshaller) {

        if (backupSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(backupSummary.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(backupSummary.getTableId(), TABLEID_BINDING);
            protocolMarshaller.marshall(backupSummary.getTableArn(), TABLEARN_BINDING);
            protocolMarshaller.marshall(backupSummary.getBackupArn(), BACKUPARN_BINDING);
            protocolMarshaller.marshall(backupSummary.getBackupName(), BACKUPNAME_BINDING);
            protocolMarshaller.marshall(backupSummary.getBackupCreationDateTime(), BACKUPCREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(backupSummary.getBackupExpiryDateTime(), BACKUPEXPIRYDATETIME_BINDING);
            protocolMarshaller.marshall(backupSummary.getBackupStatus(), BACKUPSTATUS_BINDING);
            protocolMarshaller.marshall(backupSummary.getBackupType(), BACKUPTYPE_BINDING);
            protocolMarshaller.marshall(backupSummary.getBackupSizeBytes(), BACKUPSIZEBYTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
