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
 * AwsS3BucketWebsiteConfigurationRoutingRuleRedirectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsS3BucketWebsiteConfigurationRoutingRuleRedirectMarshaller {

    private static final MarshallingInfo<String> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Hostname").build();
    private static final MarshallingInfo<String> HTTPREDIRECTCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpRedirectCode").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Protocol").build();
    private static final MarshallingInfo<String> REPLACEKEYPREFIXWITH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplaceKeyPrefixWith").build();
    private static final MarshallingInfo<String> REPLACEKEYWITH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplaceKeyWith").build();

    private static final AwsS3BucketWebsiteConfigurationRoutingRuleRedirectMarshaller instance = new AwsS3BucketWebsiteConfigurationRoutingRuleRedirectMarshaller();

    public static AwsS3BucketWebsiteConfigurationRoutingRuleRedirectMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsS3BucketWebsiteConfigurationRoutingRuleRedirect awsS3BucketWebsiteConfigurationRoutingRuleRedirect,
            ProtocolMarshaller protocolMarshaller) {

        if (awsS3BucketWebsiteConfigurationRoutingRuleRedirect == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsS3BucketWebsiteConfigurationRoutingRuleRedirect.getHostname(), HOSTNAME_BINDING);
            protocolMarshaller.marshall(awsS3BucketWebsiteConfigurationRoutingRuleRedirect.getHttpRedirectCode(), HTTPREDIRECTCODE_BINDING);
            protocolMarshaller.marshall(awsS3BucketWebsiteConfigurationRoutingRuleRedirect.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(awsS3BucketWebsiteConfigurationRoutingRuleRedirect.getReplaceKeyPrefixWith(), REPLACEKEYPREFIXWITH_BINDING);
            protocolMarshaller.marshall(awsS3BucketWebsiteConfigurationRoutingRuleRedirect.getReplaceKeyWith(), REPLACEKEYWITH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
