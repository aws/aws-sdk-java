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
 * AwsCloudFrontDistributionOriginCustomOriginConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsCloudFrontDistributionOriginCustomOriginConfigMarshaller {

    private static final MarshallingInfo<Integer> HTTPPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpPort").build();
    private static final MarshallingInfo<Integer> HTTPSPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpsPort").build();
    private static final MarshallingInfo<Integer> ORIGINKEEPALIVETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginKeepaliveTimeout").build();
    private static final MarshallingInfo<String> ORIGINPROTOCOLPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginProtocolPolicy").build();
    private static final MarshallingInfo<Integer> ORIGINREADTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginReadTimeout").build();
    private static final MarshallingInfo<StructuredPojo> ORIGINSSLPROTOCOLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginSslProtocols").build();

    private static final AwsCloudFrontDistributionOriginCustomOriginConfigMarshaller instance = new AwsCloudFrontDistributionOriginCustomOriginConfigMarshaller();

    public static AwsCloudFrontDistributionOriginCustomOriginConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsCloudFrontDistributionOriginCustomOriginConfig awsCloudFrontDistributionOriginCustomOriginConfig,
            ProtocolMarshaller protocolMarshaller) {

        if (awsCloudFrontDistributionOriginCustomOriginConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsCloudFrontDistributionOriginCustomOriginConfig.getHttpPort(), HTTPPORT_BINDING);
            protocolMarshaller.marshall(awsCloudFrontDistributionOriginCustomOriginConfig.getHttpsPort(), HTTPSPORT_BINDING);
            protocolMarshaller.marshall(awsCloudFrontDistributionOriginCustomOriginConfig.getOriginKeepaliveTimeout(), ORIGINKEEPALIVETIMEOUT_BINDING);
            protocolMarshaller.marshall(awsCloudFrontDistributionOriginCustomOriginConfig.getOriginProtocolPolicy(), ORIGINPROTOCOLPOLICY_BINDING);
            protocolMarshaller.marshall(awsCloudFrontDistributionOriginCustomOriginConfig.getOriginReadTimeout(), ORIGINREADTIMEOUT_BINDING);
            protocolMarshaller.marshall(awsCloudFrontDistributionOriginCustomOriginConfig.getOriginSslProtocols(), ORIGINSSLPROTOCOLS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
