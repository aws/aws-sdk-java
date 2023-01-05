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
package com.amazonaws.services.fis.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fis.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExperimentTemplateLogConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExperimentTemplateLogConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHLOGSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudWatchLogsConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> S3CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3Configuration").build();
    private static final MarshallingInfo<Integer> LOGSCHEMAVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logSchemaVersion").build();

    private static final ExperimentTemplateLogConfigurationMarshaller instance = new ExperimentTemplateLogConfigurationMarshaller();

    public static ExperimentTemplateLogConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExperimentTemplateLogConfiguration experimentTemplateLogConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (experimentTemplateLogConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(experimentTemplateLogConfiguration.getCloudWatchLogsConfiguration(), CLOUDWATCHLOGSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(experimentTemplateLogConfiguration.getS3Configuration(), S3CONFIGURATION_BINDING);
            protocolMarshaller.marshall(experimentTemplateLogConfiguration.getLogSchemaVersion(), LOGSCHEMAVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
