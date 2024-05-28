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
 * AwsRoute53QueryLoggingConfigDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRoute53QueryLoggingConfigDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHLOGSLOGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogsLogGroupArn").build();

    private static final AwsRoute53QueryLoggingConfigDetailsMarshaller instance = new AwsRoute53QueryLoggingConfigDetailsMarshaller();

    public static AwsRoute53QueryLoggingConfigDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRoute53QueryLoggingConfigDetails awsRoute53QueryLoggingConfigDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsRoute53QueryLoggingConfigDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRoute53QueryLoggingConfigDetails.getCloudWatchLogsLogGroupArn(), CLOUDWATCHLOGSLOGGROUPARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
