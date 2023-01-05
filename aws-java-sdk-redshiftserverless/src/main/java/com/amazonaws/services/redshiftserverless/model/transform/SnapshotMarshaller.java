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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.redshiftserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SnapshotMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SnapshotMarshaller {

    private static final MarshallingInfo<List> ACCOUNTSWITHPROVISIONEDRESTOREACCESS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountsWithProvisionedRestoreAccess").build();
    private static final MarshallingInfo<List> ACCOUNTSWITHRESTOREACCESS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountsWithRestoreAccess").build();
    private static final MarshallingInfo<Double> ACTUALINCREMENTALBACKUPSIZEINMEGABYTES_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actualIncrementalBackupSizeInMegaBytes").build();
    private static final MarshallingInfo<String> ADMINUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adminUsername").build();
    private static final MarshallingInfo<Double> BACKUPPROGRESSINMEGABYTES_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("backupProgressInMegaBytes").build();
    private static final MarshallingInfo<Double> CURRENTBACKUPRATEINMEGABYTESPERSECOND_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentBackupRateInMegaBytesPerSecond").build();
    private static final MarshallingInfo<Long> ELAPSEDTIMEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("elapsedTimeInSeconds").build();
    private static final MarshallingInfo<Long> ESTIMATEDSECONDSTOCOMPLETION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedSecondsToCompletion").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<String> NAMESPACEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("namespaceArn").build();
    private static final MarshallingInfo<String> NAMESPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("namespaceName").build();
    private static final MarshallingInfo<String> OWNERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ownerAccount").build();
    private static final MarshallingInfo<String> SNAPSHOTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotArn").build();
    private static final MarshallingInfo<java.util.Date> SNAPSHOTCREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotCreateTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> SNAPSHOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotName").build();
    private static final MarshallingInfo<Integer> SNAPSHOTREMAININGDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotRemainingDays").build();
    private static final MarshallingInfo<Integer> SNAPSHOTRETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotRetentionPeriod").build();
    private static final MarshallingInfo<java.util.Date> SNAPSHOTRETENTIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotRetentionStartTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Double> TOTALBACKUPSIZEINMEGABYTES_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalBackupSizeInMegaBytes").build();

    private static final SnapshotMarshaller instance = new SnapshotMarshaller();

    public static SnapshotMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Snapshot snapshot, ProtocolMarshaller protocolMarshaller) {

        if (snapshot == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(snapshot.getAccountsWithProvisionedRestoreAccess(), ACCOUNTSWITHPROVISIONEDRESTOREACCESS_BINDING);
            protocolMarshaller.marshall(snapshot.getAccountsWithRestoreAccess(), ACCOUNTSWITHRESTOREACCESS_BINDING);
            protocolMarshaller.marshall(snapshot.getActualIncrementalBackupSizeInMegaBytes(), ACTUALINCREMENTALBACKUPSIZEINMEGABYTES_BINDING);
            protocolMarshaller.marshall(snapshot.getAdminUsername(), ADMINUSERNAME_BINDING);
            protocolMarshaller.marshall(snapshot.getBackupProgressInMegaBytes(), BACKUPPROGRESSINMEGABYTES_BINDING);
            protocolMarshaller.marshall(snapshot.getCurrentBackupRateInMegaBytesPerSecond(), CURRENTBACKUPRATEINMEGABYTESPERSECOND_BINDING);
            protocolMarshaller.marshall(snapshot.getElapsedTimeInSeconds(), ELAPSEDTIMEINSECONDS_BINDING);
            protocolMarshaller.marshall(snapshot.getEstimatedSecondsToCompletion(), ESTIMATEDSECONDSTOCOMPLETION_BINDING);
            protocolMarshaller.marshall(snapshot.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(snapshot.getNamespaceArn(), NAMESPACEARN_BINDING);
            protocolMarshaller.marshall(snapshot.getNamespaceName(), NAMESPACENAME_BINDING);
            protocolMarshaller.marshall(snapshot.getOwnerAccount(), OWNERACCOUNT_BINDING);
            protocolMarshaller.marshall(snapshot.getSnapshotArn(), SNAPSHOTARN_BINDING);
            protocolMarshaller.marshall(snapshot.getSnapshotCreateTime(), SNAPSHOTCREATETIME_BINDING);
            protocolMarshaller.marshall(snapshot.getSnapshotName(), SNAPSHOTNAME_BINDING);
            protocolMarshaller.marshall(snapshot.getSnapshotRemainingDays(), SNAPSHOTREMAININGDAYS_BINDING);
            protocolMarshaller.marshall(snapshot.getSnapshotRetentionPeriod(), SNAPSHOTRETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(snapshot.getSnapshotRetentionStartTime(), SNAPSHOTRETENTIONSTARTTIME_BINDING);
            protocolMarshaller.marshall(snapshot.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(snapshot.getTotalBackupSizeInMegaBytes(), TOTALBACKUPSIZEINMEGABYTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
