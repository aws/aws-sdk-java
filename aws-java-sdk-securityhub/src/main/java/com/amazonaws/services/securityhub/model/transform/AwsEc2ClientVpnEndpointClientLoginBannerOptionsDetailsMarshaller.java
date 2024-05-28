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
 * AwsEc2ClientVpnEndpointClientLoginBannerOptionsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2ClientVpnEndpointClientLoginBannerOptionsDetailsMarshaller {

    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();
    private static final MarshallingInfo<String> BANNERTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BannerText").build();

    private static final AwsEc2ClientVpnEndpointClientLoginBannerOptionsDetailsMarshaller instance = new AwsEc2ClientVpnEndpointClientLoginBannerOptionsDetailsMarshaller();

    public static AwsEc2ClientVpnEndpointClientLoginBannerOptionsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2ClientVpnEndpointClientLoginBannerOptionsDetails awsEc2ClientVpnEndpointClientLoginBannerOptionsDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2ClientVpnEndpointClientLoginBannerOptionsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointClientLoginBannerOptionsDetails.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointClientLoginBannerOptionsDetails.getBannerText(), BANNERTEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
