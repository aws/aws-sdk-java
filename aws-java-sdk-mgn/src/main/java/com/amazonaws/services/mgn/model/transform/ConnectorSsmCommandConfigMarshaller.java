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
package com.amazonaws.services.mgn.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectorSsmCommandConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectorSsmCommandConfigMarshaller {

    private static final MarshallingInfo<String> CLOUDWATCHLOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudWatchLogGroupName").build();
    private static final MarshallingInfo<Boolean> CLOUDWATCHOUTPUTENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudWatchOutputEnabled").build();
    private static final MarshallingInfo<String> OUTPUTS3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputS3BucketName").build();
    private static final MarshallingInfo<Boolean> S3OUTPUTENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3OutputEnabled").build();

    private static final ConnectorSsmCommandConfigMarshaller instance = new ConnectorSsmCommandConfigMarshaller();

    public static ConnectorSsmCommandConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectorSsmCommandConfig connectorSsmCommandConfig, ProtocolMarshaller protocolMarshaller) {

        if (connectorSsmCommandConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectorSsmCommandConfig.getCloudWatchLogGroupName(), CLOUDWATCHLOGGROUPNAME_BINDING);
            protocolMarshaller.marshall(connectorSsmCommandConfig.getCloudWatchOutputEnabled(), CLOUDWATCHOUTPUTENABLED_BINDING);
            protocolMarshaller.marshall(connectorSsmCommandConfig.getOutputS3BucketName(), OUTPUTS3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(connectorSsmCommandConfig.getS3OutputEnabled(), S3OUTPUTENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
