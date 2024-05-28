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
 * AwsEc2ClientVpnEndpointAuthenticationOptionsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2ClientVpnEndpointAuthenticationOptionsDetailsMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> ACTIVEDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveDirectory").build();
    private static final MarshallingInfo<StructuredPojo> MUTUALAUTHENTICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MutualAuthentication").build();
    private static final MarshallingInfo<StructuredPojo> FEDERATEDAUTHENTICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FederatedAuthentication").build();

    private static final AwsEc2ClientVpnEndpointAuthenticationOptionsDetailsMarshaller instance = new AwsEc2ClientVpnEndpointAuthenticationOptionsDetailsMarshaller();

    public static AwsEc2ClientVpnEndpointAuthenticationOptionsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2ClientVpnEndpointAuthenticationOptionsDetails awsEc2ClientVpnEndpointAuthenticationOptionsDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2ClientVpnEndpointAuthenticationOptionsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointAuthenticationOptionsDetails.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointAuthenticationOptionsDetails.getActiveDirectory(), ACTIVEDIRECTORY_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointAuthenticationOptionsDetails.getMutualAuthentication(), MUTUALAUTHENTICATION_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointAuthenticationOptionsDetails.getFederatedAuthentication(), FEDERATEDAUTHENTICATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
