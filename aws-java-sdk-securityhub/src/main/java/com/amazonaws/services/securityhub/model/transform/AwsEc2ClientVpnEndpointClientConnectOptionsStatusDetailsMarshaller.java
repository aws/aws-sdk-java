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
 * AwsEc2ClientVpnEndpointClientConnectOptionsStatusDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2ClientVpnEndpointClientConnectOptionsStatusDetailsMarshaller {

    private static final MarshallingInfo<String> CODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Code").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Message").build();

    private static final AwsEc2ClientVpnEndpointClientConnectOptionsStatusDetailsMarshaller instance = new AwsEc2ClientVpnEndpointClientConnectOptionsStatusDetailsMarshaller();

    public static AwsEc2ClientVpnEndpointClientConnectOptionsStatusDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2ClientVpnEndpointClientConnectOptionsStatusDetails awsEc2ClientVpnEndpointClientConnectOptionsStatusDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2ClientVpnEndpointClientConnectOptionsStatusDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointClientConnectOptionsStatusDetails.getCode(), CODE_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointClientConnectOptionsStatusDetails.getMessage(), MESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
