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
 * RestoreJobsListMemberMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RestoreJobsListMemberMarshaller {

    private static final MarshallingInfo<String> RESTOREJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreJobId").build();
    private static final MarshallingInfo<String> RECOVERYPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecoveryPointArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();
    private static final MarshallingInfo<String> PERCENTDONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PercentDone").build();
    private static final MarshallingInfo<Long> BACKUPSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupSizeInBytes").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<Long> EXPECTEDCOMPLETIONTIMEMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpectedCompletionTimeMinutes").build();
    private static final MarshallingInfo<String> CREATEDRESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedResourceArn").build();

    private static final RestoreJobsListMemberMarshaller instance = new RestoreJobsListMemberMarshaller();

    public static RestoreJobsListMemberMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RestoreJobsListMember restoreJobsListMember, ProtocolMarshaller protocolMarshaller) {

        if (restoreJobsListMember == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(restoreJobsListMember.getRestoreJobId(), RESTOREJOBID_BINDING);
            protocolMarshaller.marshall(restoreJobsListMember.getRecoveryPointArn(), RECOVERYPOINTARN_BINDING);
            protocolMarshaller.marshall(restoreJobsListMember.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(restoreJobsListMember.getCompletionDate(), COMPLETIONDATE_BINDING);
            protocolMarshaller.marshall(restoreJobsListMember.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(restoreJobsListMember.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(restoreJobsListMember.getPercentDone(), PERCENTDONE_BINDING);
            protocolMarshaller.marshall(restoreJobsListMember.getBackupSizeInBytes(), BACKUPSIZEINBYTES_BINDING);
            protocolMarshaller.marshall(restoreJobsListMember.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(restoreJobsListMember.getExpectedCompletionTimeMinutes(), EXPECTEDCOMPLETIONTIMEMINUTES_BINDING);
            protocolMarshaller.marshall(restoreJobsListMember.getCreatedResourceArn(), CREATEDRESOURCEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
