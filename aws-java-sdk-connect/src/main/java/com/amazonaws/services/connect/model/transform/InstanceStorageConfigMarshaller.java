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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceStorageConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceStorageConfigMarshaller {

    private static final MarshallingInfo<String> ASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationId").build();
    private static final MarshallingInfo<String> STORAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageType").build();
    private static final MarshallingInfo<StructuredPojo> S3CONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Config").build();
    private static final MarshallingInfo<StructuredPojo> KINESISVIDEOSTREAMCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisVideoStreamConfig").build();
    private static final MarshallingInfo<StructuredPojo> KINESISSTREAMCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisStreamConfig").build();
    private static final MarshallingInfo<StructuredPojo> KINESISFIREHOSECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisFirehoseConfig").build();

    private static final InstanceStorageConfigMarshaller instance = new InstanceStorageConfigMarshaller();

    public static InstanceStorageConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceStorageConfig instanceStorageConfig, ProtocolMarshaller protocolMarshaller) {

        if (instanceStorageConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceStorageConfig.getAssociationId(), ASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(instanceStorageConfig.getStorageType(), STORAGETYPE_BINDING);
            protocolMarshaller.marshall(instanceStorageConfig.getS3Config(), S3CONFIG_BINDING);
            protocolMarshaller.marshall(instanceStorageConfig.getKinesisVideoStreamConfig(), KINESISVIDEOSTREAMCONFIG_BINDING);
            protocolMarshaller.marshall(instanceStorageConfig.getKinesisStreamConfig(), KINESISSTREAMCONFIG_BINDING);
            protocolMarshaller.marshall(instanceStorageConfig.getKinesisFirehoseConfig(), KINESISFIREHOSECONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
