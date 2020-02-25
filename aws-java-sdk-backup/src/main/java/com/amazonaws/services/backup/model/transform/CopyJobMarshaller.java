/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CopyJobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CopyJobMarshaller {

    private static final MarshallingInfo<String> COPYJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CopyJobId").build();
    private static final MarshallingInfo<String> SOURCEBACKUPVAULTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceBackupVaultArn").build();
    private static final MarshallingInfo<String> SOURCERECOVERYPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceRecoveryPointArn").build();
    private static final MarshallingInfo<String> DESTINATIONBACKUPVAULTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationBackupVaultArn").build();
    private static final MarshallingInfo<String> DESTINATIONRECOVERYPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationRecoveryPointArn").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();
    private static final MarshallingInfo<Long> BACKUPSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupSizeInBytes").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();

    private static final CopyJobMarshaller instance = new CopyJobMarshaller();

    public static CopyJobMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CopyJob copyJob, ProtocolMarshaller protocolMarshaller) {

        if (copyJob == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(copyJob.getCopyJobId(), COPYJOBID_BINDING);
            protocolMarshaller.marshall(copyJob.getSourceBackupVaultArn(), SOURCEBACKUPVAULTARN_BINDING);
            protocolMarshaller.marshall(copyJob.getSourceRecoveryPointArn(), SOURCERECOVERYPOINTARN_BINDING);
            protocolMarshaller.marshall(copyJob.getDestinationBackupVaultArn(), DESTINATIONBACKUPVAULTARN_BINDING);
            protocolMarshaller.marshall(copyJob.getDestinationRecoveryPointArn(), DESTINATIONRECOVERYPOINTARN_BINDING);
            protocolMarshaller.marshall(copyJob.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(copyJob.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(copyJob.getCompletionDate(), COMPLETIONDATE_BINDING);
            protocolMarshaller.marshall(copyJob.getState(), STATE_BINDING);
            protocolMarshaller.marshall(copyJob.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(copyJob.getBackupSizeInBytes(), BACKUPSIZEINBYTES_BINDING);
            protocolMarshaller.marshall(copyJob.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(copyJob.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(copyJob.getResourceType(), RESOURCETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
