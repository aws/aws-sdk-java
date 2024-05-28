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
 * AwsEc2ClientVpnEndpointClientConnectOptionsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2ClientVpnEndpointClientConnectOptionsDetailsMarshaller {

    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();
    private static final MarshallingInfo<String> LAMBDAFUNCTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaFunctionArn").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Status").build();

    private static final AwsEc2ClientVpnEndpointClientConnectOptionsDetailsMarshaller instance = new AwsEc2ClientVpnEndpointClientConnectOptionsDetailsMarshaller();

    public static AwsEc2ClientVpnEndpointClientConnectOptionsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2ClientVpnEndpointClientConnectOptionsDetails awsEc2ClientVpnEndpointClientConnectOptionsDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2ClientVpnEndpointClientConnectOptionsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointClientConnectOptionsDetails.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointClientConnectOptionsDetails.getLambdaFunctionArn(), LAMBDAFUNCTIONARN_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointClientConnectOptionsDetails.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
