/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsCloudFrontDistributionOriginS3OriginConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsCloudFrontDistributionOriginS3OriginConfigMarshaller {

    private static final MarshallingInfo<String> ORIGINACCESSIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginAccessIdentity").build();

    private static final AwsCloudFrontDistributionOriginS3OriginConfigMarshaller instance = new AwsCloudFrontDistributionOriginS3OriginConfigMarshaller();

    public static AwsCloudFrontDistributionOriginS3OriginConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsCloudFrontDistributionOriginS3OriginConfig awsCloudFrontDistributionOriginS3OriginConfig, ProtocolMarshaller protocolMarshaller) {

        if (awsCloudFrontDistributionOriginS3OriginConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsCloudFrontDistributionOriginS3OriginConfig.getOriginAccessIdentity(), ORIGINACCESSIDENTITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
