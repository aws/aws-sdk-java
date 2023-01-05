/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsEc2LaunchTemplateDataMetadataOptionsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDataMetadataOptionsDetailsMarshaller {

    private static final MarshallingInfo<String> HTTPENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpEndpoint").build();
    private static final MarshallingInfo<String> HTTPPROTOCOLIPV6_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpProtocolIpv6").build();
    private static final MarshallingInfo<String> HTTPTOKENS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpTokens").build();
    private static final MarshallingInfo<Integer> HTTPPUTRESPONSEHOPLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpPutResponseHopLimit").build();
    private static final MarshallingInfo<String> INSTANCEMETADATATAGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceMetadataTags").build();

    private static final AwsEc2LaunchTemplateDataMetadataOptionsDetailsMarshaller instance = new AwsEc2LaunchTemplateDataMetadataOptionsDetailsMarshaller();

    public static AwsEc2LaunchTemplateDataMetadataOptionsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2LaunchTemplateDataMetadataOptionsDetails awsEc2LaunchTemplateDataMetadataOptionsDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDataMetadataOptionsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataMetadataOptionsDetails.getHttpEndpoint(), HTTPENDPOINT_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataMetadataOptionsDetails.getHttpProtocolIpv6(), HTTPPROTOCOLIPV6_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataMetadataOptionsDetails.getHttpTokens(), HTTPTOKENS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataMetadataOptionsDetails.getHttpPutResponseHopLimit(), HTTPPUTRESPONSEHOPLIMIT_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataMetadataOptionsDetails.getInstanceMetadataTags(), INSTANCEMETADATATAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
