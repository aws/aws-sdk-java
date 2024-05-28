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
 * AwsEc2ClientVpnEndpointConnectionLogOptionsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2ClientVpnEndpointConnectionLogOptionsDetailsMarshaller {

    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();
    private static final MarshallingInfo<String> CLOUDWATCHLOGGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudwatchLogGroup").build();
    private static final MarshallingInfo<String> CLOUDWATCHLOGSTREAM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudwatchLogStream").build();

    private static final AwsEc2ClientVpnEndpointConnectionLogOptionsDetailsMarshaller instance = new AwsEc2ClientVpnEndpointConnectionLogOptionsDetailsMarshaller();

    public static AwsEc2ClientVpnEndpointConnectionLogOptionsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2ClientVpnEndpointConnectionLogOptionsDetails awsEc2ClientVpnEndpointConnectionLogOptionsDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2ClientVpnEndpointConnectionLogOptionsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointConnectionLogOptionsDetails.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointConnectionLogOptionsDetails.getCloudwatchLogGroup(), CLOUDWATCHLOGGROUP_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointConnectionLogOptionsDetails.getCloudwatchLogStream(), CLOUDWATCHLOGSTREAM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
