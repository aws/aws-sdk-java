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
package com.amazonaws.services.cloudhsmv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudhsmv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BackupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BackupMarshaller {

    private static final MarshallingInfo<String> BACKUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BackupId").build();
    private static final MarshallingInfo<String> BACKUPSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupState").build();
    private static final MarshallingInfo<String> CLUSTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClusterId").build();
    private static final MarshallingInfo<java.util.Date> CREATETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COPYTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SOURCEREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceRegion").build();
    private static final MarshallingInfo<String> SOURCEBACKUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceBackup").build();
    private static final MarshallingInfo<String> SOURCECLUSTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceCluster").build();
    private static final MarshallingInfo<java.util.Date> DELETETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteTimestamp").timestampFormat("unixTimestamp").build();

    private static final BackupMarshaller instance = new BackupMarshaller();

    public static BackupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Backup backup, ProtocolMarshaller protocolMarshaller) {

        if (backup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(backup.getBackupId(), BACKUPID_BINDING);
            protocolMarshaller.marshall(backup.getBackupState(), BACKUPSTATE_BINDING);
            protocolMarshaller.marshall(backup.getClusterId(), CLUSTERID_BINDING);
            protocolMarshaller.marshall(backup.getCreateTimestamp(), CREATETIMESTAMP_BINDING);
            protocolMarshaller.marshall(backup.getCopyTimestamp(), COPYTIMESTAMP_BINDING);
            protocolMarshaller.marshall(backup.getSourceRegion(), SOURCEREGION_BINDING);
            protocolMarshaller.marshall(backup.getSourceBackup(), SOURCEBACKUP_BINDING);
            protocolMarshaller.marshall(backup.getSourceCluster(), SOURCECLUSTER_BINDING);
            protocolMarshaller.marshall(backup.getDeleteTimestamp(), DELETETIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
