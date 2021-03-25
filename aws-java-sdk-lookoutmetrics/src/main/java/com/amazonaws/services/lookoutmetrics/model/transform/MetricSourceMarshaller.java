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
package com.amazonaws.services.lookoutmetrics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MetricSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MetricSourceMarshaller {

    private static final MarshallingInfo<StructuredPojo> S3SOURCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3SourceConfig").build();
    private static final MarshallingInfo<StructuredPojo> APPFLOWCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppFlowConfig").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchConfig").build();
    private static final MarshallingInfo<StructuredPojo> RDSSOURCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RDSSourceConfig").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTSOURCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftSourceConfig").build();

    private static final MetricSourceMarshaller instance = new MetricSourceMarshaller();

    public static MetricSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MetricSource metricSource, ProtocolMarshaller protocolMarshaller) {

        if (metricSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(metricSource.getS3SourceConfig(), S3SOURCECONFIG_BINDING);
            protocolMarshaller.marshall(metricSource.getAppFlowConfig(), APPFLOWCONFIG_BINDING);
            protocolMarshaller.marshall(metricSource.getCloudWatchConfig(), CLOUDWATCHCONFIG_BINDING);
            protocolMarshaller.marshall(metricSource.getRDSSourceConfig(), RDSSOURCECONFIG_BINDING);
            protocolMarshaller.marshall(metricSource.getRedshiftSourceConfig(), REDSHIFTSOURCECONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
