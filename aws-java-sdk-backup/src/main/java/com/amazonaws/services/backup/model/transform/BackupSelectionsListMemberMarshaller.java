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
 * BackupSelectionsListMemberMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BackupSelectionsListMemberMarshaller {

    private static final MarshallingInfo<String> SELECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectionId").build();
    private static final MarshallingInfo<String> SELECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectionName").build();
    private static final MarshallingInfo<String> BACKUPPLANID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupPlanId").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CREATORREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatorRequestId").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();

    private static final BackupSelectionsListMemberMarshaller instance = new BackupSelectionsListMemberMarshaller();

    public static BackupSelectionsListMemberMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BackupSelectionsListMember backupSelectionsListMember, ProtocolMarshaller protocolMarshaller) {

        if (backupSelectionsListMember == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(backupSelectionsListMember.getSelectionId(), SELECTIONID_BINDING);
            protocolMarshaller.marshall(backupSelectionsListMember.getSelectionName(), SELECTIONNAME_BINDING);
            protocolMarshaller.marshall(backupSelectionsListMember.getBackupPlanId(), BACKUPPLANID_BINDING);
            protocolMarshaller.marshall(backupSelectionsListMember.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(backupSelectionsListMember.getCreatorRequestId(), CREATORREQUESTID_BINDING);
            protocolMarshaller.marshall(backupSelectionsListMember.getIamRoleArn(), IAMROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
