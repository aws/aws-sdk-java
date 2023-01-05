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
 * FileCacheLustreConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FileCacheLustreConfigurationMarshaller {

    private static final MarshallingInfo<Integer> PERUNITSTORAGETHROUGHPUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PerUnitStorageThroughput").build();
    private static final MarshallingInfo<String> DEPLOYMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentType").build();
    private static final MarshallingInfo<String> MOUNTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MountName").build();
    private static final MarshallingInfo<String> WEEKLYMAINTENANCESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WeeklyMaintenanceStartTime").build();
    private static final MarshallingInfo<StructuredPojo> METADATACONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetadataConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> LOGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogConfiguration").build();

    private static final FileCacheLustreConfigurationMarshaller instance = new FileCacheLustreConfigurationMarshaller();

    public static FileCacheLustreConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FileCacheLustreConfiguration fileCacheLustreConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (fileCacheLustreConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fileCacheLustreConfiguration.getPerUnitStorageThroughput(), PERUNITSTORAGETHROUGHPUT_BINDING);
            protocolMarshaller.marshall(fileCacheLustreConfiguration.getDeploymentType(), DEPLOYMENTTYPE_BINDING);
            protocolMarshaller.marshall(fileCacheLustreConfiguration.getMountName(), MOUNTNAME_BINDING);
            protocolMarshaller.marshall(fileCacheLustreConfiguration.getWeeklyMaintenanceStartTime(), WEEKLYMAINTENANCESTARTTIME_BINDING);
            protocolMarshaller.marshall(fileCacheLustreConfiguration.getMetadataConfiguration(), METADATACONFIGURATION_BINDING);
            protocolMarshaller.marshall(fileCacheLustreConfiguration.getLogConfiguration(), LOGCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
