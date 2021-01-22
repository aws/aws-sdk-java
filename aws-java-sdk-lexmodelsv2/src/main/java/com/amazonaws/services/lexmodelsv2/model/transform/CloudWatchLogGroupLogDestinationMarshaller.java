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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CloudWatchLogGroupLogDestinationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CloudWatchLogGroupLogDestinationMarshaller {

    private static final MarshallingInfo<String> CLOUDWATCHLOGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudWatchLogGroupArn").build();
    private static final MarshallingInfo<String> LOGPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("logPrefix").build();

    private static final CloudWatchLogGroupLogDestinationMarshaller instance = new CloudWatchLogGroupLogDestinationMarshaller();

    public static CloudWatchLogGroupLogDestinationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CloudWatchLogGroupLogDestination cloudWatchLogGroupLogDestination, ProtocolMarshaller protocolMarshaller) {

        if (cloudWatchLogGroupLogDestination == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cloudWatchLogGroupLogDestination.getCloudWatchLogGroupArn(), CLOUDWATCHLOGGROUPARN_BINDING);
            protocolMarshaller.marshall(cloudWatchLogGroupLogDestination.getLogPrefix(), LOGPREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
