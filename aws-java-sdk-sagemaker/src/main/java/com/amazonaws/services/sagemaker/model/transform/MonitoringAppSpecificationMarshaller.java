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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MonitoringAppSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MonitoringAppSpecificationMarshaller {

    private static final MarshallingInfo<String> IMAGEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageUri").build();
    private static final MarshallingInfo<List> CONTAINERENTRYPOINT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerEntrypoint").build();
    private static final MarshallingInfo<List> CONTAINERARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerArguments").build();
    private static final MarshallingInfo<String> RECORDPREPROCESSORSOURCEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordPreprocessorSourceUri").build();
    private static final MarshallingInfo<String> POSTANALYTICSPROCESSORSOURCEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostAnalyticsProcessorSourceUri").build();

    private static final MonitoringAppSpecificationMarshaller instance = new MonitoringAppSpecificationMarshaller();

    public static MonitoringAppSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MonitoringAppSpecification monitoringAppSpecification, ProtocolMarshaller protocolMarshaller) {

        if (monitoringAppSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(monitoringAppSpecification.getImageUri(), IMAGEURI_BINDING);
            protocolMarshaller.marshall(monitoringAppSpecification.getContainerEntrypoint(), CONTAINERENTRYPOINT_BINDING);
            protocolMarshaller.marshall(monitoringAppSpecification.getContainerArguments(), CONTAINERARGUMENTS_BINDING);
            protocolMarshaller.marshall(monitoringAppSpecification.getRecordPreprocessorSourceUri(), RECORDPREPROCESSORSOURCEURI_BINDING);
            protocolMarshaller.marshall(monitoringAppSpecification.getPostAnalyticsProcessorSourceUri(), POSTANALYTICSPROCESSORSOURCEURI_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
