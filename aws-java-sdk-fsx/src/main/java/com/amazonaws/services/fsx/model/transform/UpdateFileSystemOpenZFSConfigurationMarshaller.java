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
package com.amazonaws.services.fsx.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFileSystemOpenZFSConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFileSystemOpenZFSConfigurationMarshaller {

    private static final MarshallingInfo<Integer> AUTOMATICBACKUPRETENTIONDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomaticBackupRetentionDays").build();
    private static final MarshallingInfo<Boolean> COPYTAGSTOBACKUPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTagsToBackups").build();
    private static final MarshallingInfo<Boolean> COPYTAGSTOVOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTagsToVolumes").build();
    private static final MarshallingInfo<String> DAILYAUTOMATICBACKUPSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DailyAutomaticBackupStartTime").build();
    private static final MarshallingInfo<Integer> THROUGHPUTCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThroughputCapacity").build();
    private static final MarshallingInfo<String> WEEKLYMAINTENANCESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WeeklyMaintenanceStartTime").build();
    private static final MarshallingInfo<StructuredPojo> DISKIOPSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DiskIopsConfiguration").build();

    private static final UpdateFileSystemOpenZFSConfigurationMarshaller instance = new UpdateFileSystemOpenZFSConfigurationMarshaller();

    public static UpdateFileSystemOpenZFSConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFileSystemOpenZFSConfiguration updateFileSystemOpenZFSConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (updateFileSystemOpenZFSConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFileSystemOpenZFSConfiguration.getAutomaticBackupRetentionDays(), AUTOMATICBACKUPRETENTIONDAYS_BINDING);
            protocolMarshaller.marshall(updateFileSystemOpenZFSConfiguration.getCopyTagsToBackups(), COPYTAGSTOBACKUPS_BINDING);
            protocolMarshaller.marshall(updateFileSystemOpenZFSConfiguration.getCopyTagsToVolumes(), COPYTAGSTOVOLUMES_BINDING);
            protocolMarshaller.marshall(updateFileSystemOpenZFSConfiguration.getDailyAutomaticBackupStartTime(), DAILYAUTOMATICBACKUPSTARTTIME_BINDING);
            protocolMarshaller.marshall(updateFileSystemOpenZFSConfiguration.getThroughputCapacity(), THROUGHPUTCAPACITY_BINDING);
            protocolMarshaller.marshall(updateFileSystemOpenZFSConfiguration.getWeeklyMaintenanceStartTime(), WEEKLYMAINTENANCESTARTTIME_BINDING);
            protocolMarshaller.marshall(updateFileSystemOpenZFSConfiguration.getDiskIopsConfiguration(), DISKIOPSCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
