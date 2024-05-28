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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CloudWatchLogsLogGroupArnConfigDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CloudWatchLogsLogGroupArnConfigDetailsMarshaller {

    private static final MarshallingInfo<String> CLOUDWATCHLOGSLOGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogsLogGroupArn").build();
    private static final MarshallingInfo<String> HOSTEDZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HostedZoneId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();

    private static final CloudWatchLogsLogGroupArnConfigDetailsMarshaller instance = new CloudWatchLogsLogGroupArnConfigDetailsMarshaller();

    public static CloudWatchLogsLogGroupArnConfigDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CloudWatchLogsLogGroupArnConfigDetails cloudWatchLogsLogGroupArnConfigDetails, ProtocolMarshaller protocolMarshaller) {

        if (cloudWatchLogsLogGroupArnConfigDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cloudWatchLogsLogGroupArnConfigDetails.getCloudWatchLogsLogGroupArn(), CLOUDWATCHLOGSLOGGROUPARN_BINDING);
            protocolMarshaller.marshall(cloudWatchLogsLogGroupArnConfigDetails.getHostedZoneId(), HOSTEDZONEID_BINDING);
            protocolMarshaller.marshall(cloudWatchLogsLogGroupArnConfigDetails.getId(), ID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
