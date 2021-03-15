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
package com.amazonaws.services.ecs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExecuteCommandLogConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExecuteCommandLogConfigurationMarshaller {

    private static final MarshallingInfo<String> CLOUDWATCHLOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudWatchLogGroupName").build();
    private static final MarshallingInfo<Boolean> CLOUDWATCHENCRYPTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudWatchEncryptionEnabled").build();
    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3BucketName").build();
    private static final MarshallingInfo<Boolean> S3ENCRYPTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3EncryptionEnabled").build();
    private static final MarshallingInfo<String> S3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3KeyPrefix").build();

    private static final ExecuteCommandLogConfigurationMarshaller instance = new ExecuteCommandLogConfigurationMarshaller();

    public static ExecuteCommandLogConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExecuteCommandLogConfiguration executeCommandLogConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (executeCommandLogConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(executeCommandLogConfiguration.getCloudWatchLogGroupName(), CLOUDWATCHLOGGROUPNAME_BINDING);
            protocolMarshaller.marshall(executeCommandLogConfiguration.getCloudWatchEncryptionEnabled(), CLOUDWATCHENCRYPTIONENABLED_BINDING);
            protocolMarshaller.marshall(executeCommandLogConfiguration.getS3BucketName(), S3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(executeCommandLogConfiguration.getS3EncryptionEnabled(), S3ENCRYPTIONENABLED_BINDING);
            protocolMarshaller.marshall(executeCommandLogConfiguration.getS3KeyPrefix(), S3KEYPREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
