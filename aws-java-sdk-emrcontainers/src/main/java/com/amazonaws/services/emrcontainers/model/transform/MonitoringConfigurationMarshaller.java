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
package com.amazonaws.services.emrcontainers.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.emrcontainers.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MonitoringConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MonitoringConfigurationMarshaller {

    private static final MarshallingInfo<String> PERSISTENTAPPUI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("persistentAppUI").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHMONITORINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudWatchMonitoringConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> S3MONITORINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3MonitoringConfiguration").build();

    private static final MonitoringConfigurationMarshaller instance = new MonitoringConfigurationMarshaller();

    public static MonitoringConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MonitoringConfiguration monitoringConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (monitoringConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(monitoringConfiguration.getPersistentAppUI(), PERSISTENTAPPUI_BINDING);
            protocolMarshaller.marshall(monitoringConfiguration.getCloudWatchMonitoringConfiguration(), CLOUDWATCHMONITORINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(monitoringConfiguration.getS3MonitoringConfiguration(), S3MONITORINGCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
