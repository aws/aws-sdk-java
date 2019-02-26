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
package com.amazonaws.services.backup.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BackupPlansListMemberMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BackupPlansListMemberMarshaller {

    private static final MarshallingInfo<String> BACKUPPLANARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupPlanArn").build();
    private static final MarshallingInfo<String> BACKUPPLANID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupPlanId").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DELETIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> VERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VersionId").build();
    private static final MarshallingInfo<String> BACKUPPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupPlanName").build();
    private static final MarshallingInfo<String> CREATORREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatorRequestId").build();
    private static final MarshallingInfo<java.util.Date> LASTEXECUTIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastExecutionDate").timestampFormat("unixTimestamp").build();

    private static final BackupPlansListMemberMarshaller instance = new BackupPlansListMemberMarshaller();

    public static BackupPlansListMemberMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BackupPlansListMember backupPlansListMember, ProtocolMarshaller protocolMarshaller) {

        if (backupPlansListMember == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(backupPlansListMember.getBackupPlanArn(), BACKUPPLANARN_BINDING);
            protocolMarshaller.marshall(backupPlansListMember.getBackupPlanId(), BACKUPPLANID_BINDING);
            protocolMarshaller.marshall(backupPlansListMember.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(backupPlansListMember.getDeletionDate(), DELETIONDATE_BINDING);
            protocolMarshaller.marshall(backupPlansListMember.getVersionId(), VERSIONID_BINDING);
            protocolMarshaller.marshall(backupPlansListMember.getBackupPlanName(), BACKUPPLANNAME_BINDING);
            protocolMarshaller.marshall(backupPlansListMember.getCreatorRequestId(), CREATORREQUESTID_BINDING);
            protocolMarshaller.marshall(backupPlansListMember.getLastExecutionDate(), LASTEXECUTIONDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
