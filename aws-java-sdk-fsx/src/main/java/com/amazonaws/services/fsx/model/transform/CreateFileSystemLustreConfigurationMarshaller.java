/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateFileSystemLustreConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFileSystemLustreConfigurationMarshaller {

    private static final MarshallingInfo<String> WEEKLYMAINTENANCESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WeeklyMaintenanceStartTime").build();
    private static final MarshallingInfo<String> IMPORTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportPath").build();
    private static final MarshallingInfo<String> EXPORTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportPath").build();
    private static final MarshallingInfo<Integer> IMPORTEDFILECHUNKSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportedFileChunkSize").build();
    private static final MarshallingInfo<String> DEPLOYMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentType").build();
    private static final MarshallingInfo<String> AUTOIMPORTPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoImportPolicy").build();
    private static final MarshallingInfo<Integer> PERUNITSTORAGETHROUGHPUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PerUnitStorageThroughput").build();
    private static final MarshallingInfo<String> DAILYAUTOMATICBACKUPSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DailyAutomaticBackupStartTime").build();
    private static final MarshallingInfo<Integer> AUTOMATICBACKUPRETENTIONDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomaticBackupRetentionDays").build();
    private static final MarshallingInfo<Boolean> COPYTAGSTOBACKUPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTagsToBackups").build();
    private static final MarshallingInfo<String> DRIVECACHETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DriveCacheType").build();
    private static final MarshallingInfo<String> DATACOMPRESSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataCompressionType").build();

    private static final CreateFileSystemLustreConfigurationMarshaller instance = new CreateFileSystemLustreConfigurationMarshaller();

    public static CreateFileSystemLustreConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFileSystemLustreConfiguration createFileSystemLustreConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (createFileSystemLustreConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFileSystemLustreConfiguration.getWeeklyMaintenanceStartTime(), WEEKLYMAINTENANCESTARTTIME_BINDING);
            protocolMarshaller.marshall(createFileSystemLustreConfiguration.getImportPath(), IMPORTPATH_BINDING);
            protocolMarshaller.marshall(createFileSystemLustreConfiguration.getExportPath(), EXPORTPATH_BINDING);
            protocolMarshaller.marshall(createFileSystemLustreConfiguration.getImportedFileChunkSize(), IMPORTEDFILECHUNKSIZE_BINDING);
            protocolMarshaller.marshall(createFileSystemLustreConfiguration.getDeploymentType(), DEPLOYMENTTYPE_BINDING);
            protocolMarshaller.marshall(createFileSystemLustreConfiguration.getAutoImportPolicy(), AUTOIMPORTPOLICY_BINDING);
            protocolMarshaller.marshall(createFileSystemLustreConfiguration.getPerUnitStorageThroughput(), PERUNITSTORAGETHROUGHPUT_BINDING);
            protocolMarshaller.marshall(createFileSystemLustreConfiguration.getDailyAutomaticBackupStartTime(), DAILYAUTOMATICBACKUPSTARTTIME_BINDING);
            protocolMarshaller.marshall(createFileSystemLustreConfiguration.getAutomaticBackupRetentionDays(), AUTOMATICBACKUPRETENTIONDAYS_BINDING);
            protocolMarshaller.marshall(createFileSystemLustreConfiguration.getCopyTagsToBackups(), COPYTAGSTOBACKUPS_BINDING);
            protocolMarshaller.marshall(createFileSystemLustreConfiguration.getDriveCacheType(), DRIVECACHETYPE_BINDING);
            protocolMarshaller.marshall(createFileSystemLustreConfiguration.getDataCompressionType(), DATACOMPRESSIONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
