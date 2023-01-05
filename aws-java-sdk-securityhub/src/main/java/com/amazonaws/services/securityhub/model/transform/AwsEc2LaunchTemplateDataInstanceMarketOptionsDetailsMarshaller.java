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
 * AwsEc2LaunchTemplateDataInstanceMarketOptionsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDataInstanceMarketOptionsDetailsMarshaller {

    private static final MarshallingInfo<String> MARKETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MarketType").build();
    private static final MarshallingInfo<StructuredPojo> SPOTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpotOptions").build();

    private static final AwsEc2LaunchTemplateDataInstanceMarketOptionsDetailsMarshaller instance = new AwsEc2LaunchTemplateDataInstanceMarketOptionsDetailsMarshaller();

    public static AwsEc2LaunchTemplateDataInstanceMarketOptionsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails awsEc2LaunchTemplateDataInstanceMarketOptionsDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDataInstanceMarketOptionsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceMarketOptionsDetails.getMarketType(), MARKETTYPE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceMarketOptionsDetails.getSpotOptions(), SPOTOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
