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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KinesisVideoStreamPoolConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KinesisVideoStreamPoolConfigurationMarshaller {

    private static final MarshallingInfo<String> POOLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PoolArn").build();
    private static final MarshallingInfo<String> POOLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PoolName").build();
    private static final MarshallingInfo<String> POOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PoolId").build();
    private static final MarshallingInfo<String> POOLSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PoolStatus").build();
    private static final MarshallingInfo<Integer> POOLSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PoolSize").build();
    private static final MarshallingInfo<StructuredPojo> STREAMCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamConfiguration").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedTimestamp").timestampFormat("iso8601").build();

    private static final KinesisVideoStreamPoolConfigurationMarshaller instance = new KinesisVideoStreamPoolConfigurationMarshaller();

    public static KinesisVideoStreamPoolConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KinesisVideoStreamPoolConfiguration kinesisVideoStreamPoolConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (kinesisVideoStreamPoolConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kinesisVideoStreamPoolConfiguration.getPoolArn(), POOLARN_BINDING);
            protocolMarshaller.marshall(kinesisVideoStreamPoolConfiguration.getPoolName(), POOLNAME_BINDING);
            protocolMarshaller.marshall(kinesisVideoStreamPoolConfiguration.getPoolId(), POOLID_BINDING);
            protocolMarshaller.marshall(kinesisVideoStreamPoolConfiguration.getPoolStatus(), POOLSTATUS_BINDING);
            protocolMarshaller.marshall(kinesisVideoStreamPoolConfiguration.getPoolSize(), POOLSIZE_BINDING);
            protocolMarshaller.marshall(kinesisVideoStreamPoolConfiguration.getStreamConfiguration(), STREAMCONFIGURATION_BINDING);
            protocolMarshaller.marshall(kinesisVideoStreamPoolConfiguration.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(kinesisVideoStreamPoolConfiguration.getUpdatedTimestamp(), UPDATEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
