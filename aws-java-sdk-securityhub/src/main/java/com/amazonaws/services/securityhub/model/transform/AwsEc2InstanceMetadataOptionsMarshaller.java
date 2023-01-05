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
 * AwsEc2InstanceMetadataOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2InstanceMetadataOptionsMarshaller {

    private static final MarshallingInfo<String> HTTPENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpEndpoint").build();
    private static final MarshallingInfo<String> HTTPPROTOCOLIPV6_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpProtocolIpv6").build();
    private static final MarshallingInfo<Integer> HTTPPUTRESPONSEHOPLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpPutResponseHopLimit").build();
    private static final MarshallingInfo<String> HTTPTOKENS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpTokens").build();
    private static final MarshallingInfo<String> INSTANCEMETADATATAGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceMetadataTags").build();

    private static final AwsEc2InstanceMetadataOptionsMarshaller instance = new AwsEc2InstanceMetadataOptionsMarshaller();

    public static AwsEc2InstanceMetadataOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2InstanceMetadataOptions awsEc2InstanceMetadataOptions, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2InstanceMetadataOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2InstanceMetadataOptions.getHttpEndpoint(), HTTPENDPOINT_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceMetadataOptions.getHttpProtocolIpv6(), HTTPPROTOCOLIPV6_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceMetadataOptions.getHttpPutResponseHopLimit(), HTTPPUTRESPONSEHOPLIMIT_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceMetadataOptions.getHttpTokens(), HTTPTOKENS_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceMetadataOptions.getInstanceMetadataTags(), INSTANCEMETADATATAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
