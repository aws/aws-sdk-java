/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pipes.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pipes.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipeLogConfigurationParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipeLogConfigurationParametersMarshaller {

    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHLOGSLOGDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudwatchLogsLogDestination").build();
    private static final MarshallingInfo<StructuredPojo> FIREHOSELOGDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirehoseLogDestination").build();
    private static final MarshallingInfo<List> INCLUDEEXECUTIONDATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeExecutionData").build();
    private static final MarshallingInfo<String> LEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Level").build();
    private static final MarshallingInfo<StructuredPojo> S3LOGDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3LogDestination").build();

    private static final PipeLogConfigurationParametersMarshaller instance = new PipeLogConfigurationParametersMarshaller();

    public static PipeLogConfigurationParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipeLogConfigurationParameters pipeLogConfigurationParameters, ProtocolMarshaller protocolMarshaller) {

        if (pipeLogConfigurationParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipeLogConfigurationParameters.getCloudwatchLogsLogDestination(), CLOUDWATCHLOGSLOGDESTINATION_BINDING);
            protocolMarshaller.marshall(pipeLogConfigurationParameters.getFirehoseLogDestination(), FIREHOSELOGDESTINATION_BINDING);
            protocolMarshaller.marshall(pipeLogConfigurationParameters.getIncludeExecutionData(), INCLUDEEXECUTIONDATA_BINDING);
            protocolMarshaller.marshall(pipeLogConfigurationParameters.getLevel(), LEVEL_BINDING);
            protocolMarshaller.marshall(pipeLogConfigurationParameters.getS3LogDestination(), S3LOGDESTINATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
