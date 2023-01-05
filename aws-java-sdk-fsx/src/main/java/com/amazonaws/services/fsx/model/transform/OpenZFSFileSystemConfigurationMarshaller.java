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
 * OpenZFSFileSystemConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OpenZFSFileSystemConfigurationMarshaller {

    private static final MarshallingInfo<Integer> AUTOMATICBACKUPRETENTIONDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomaticBackupRetentionDays").build();
    private static final MarshallingInfo<Boolean> COPYTAGSTOBACKUPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTagsToBackups").build();
    private static final MarshallingInfo<Boolean> COPYTAGSTOVOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTagsToVolumes").build();
    private static final MarshallingInfo<String> DAILYAUTOMATICBACKUPSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DailyAutomaticBackupStartTime").build();
    private static final MarshallingInfo<String> DEPLOYMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentType").build();
    private static final MarshallingInfo<Integer> THROUGHPUTCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThroughputCapacity").build();
    private static final MarshallingInfo<String> WEEKLYMAINTENANCESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WeeklyMaintenanceStartTime").build();
    private static final MarshallingInfo<StructuredPojo> DISKIOPSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DiskIopsConfiguration").build();
    private static final MarshallingInfo<String> ROOTVOLUMEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootVolumeId").build();

    private static final OpenZFSFileSystemConfigurationMarshaller instance = new OpenZFSFileSystemConfigurationMarshaller();

    public static OpenZFSFileSystemConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OpenZFSFileSystemConfiguration openZFSFileSystemConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (openZFSFileSystemConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(openZFSFileSystemConfiguration.getAutomaticBackupRetentionDays(), AUTOMATICBACKUPRETENTIONDAYS_BINDING);
            protocolMarshaller.marshall(openZFSFileSystemConfiguration.getCopyTagsToBackups(), COPYTAGSTOBACKUPS_BINDING);
            protocolMarshaller.marshall(openZFSFileSystemConfiguration.getCopyTagsToVolumes(), COPYTAGSTOVOLUMES_BINDING);
            protocolMarshaller.marshall(openZFSFileSystemConfiguration.getDailyAutomaticBackupStartTime(), DAILYAUTOMATICBACKUPSTARTTIME_BINDING);
            protocolMarshaller.marshall(openZFSFileSystemConfiguration.getDeploymentType(), DEPLOYMENTTYPE_BINDING);
            protocolMarshaller.marshall(openZFSFileSystemConfiguration.getThroughputCapacity(), THROUGHPUTCAPACITY_BINDING);
            protocolMarshaller.marshall(openZFSFileSystemConfiguration.getWeeklyMaintenanceStartTime(), WEEKLYMAINTENANCESTARTTIME_BINDING);
            protocolMarshaller.marshall(openZFSFileSystemConfiguration.getDiskIopsConfiguration(), DISKIOPSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(openZFSFileSystemConfiguration.getRootVolumeId(), ROOTVOLUMEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
