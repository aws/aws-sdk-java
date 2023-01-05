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
 * AwsWafv2RulesActionDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsWafv2RulesActionDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ALLOW_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Allow").build();
    private static final MarshallingInfo<StructuredPojo> BLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Block").build();
    private static final MarshallingInfo<StructuredPojo> CAPTCHA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Captcha").build();
    private static final MarshallingInfo<StructuredPojo> COUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Count").build();

    private static final AwsWafv2RulesActionDetailsMarshaller instance = new AwsWafv2RulesActionDetailsMarshaller();

    public static AwsWafv2RulesActionDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsWafv2RulesActionDetails awsWafv2RulesActionDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsWafv2RulesActionDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsWafv2RulesActionDetails.getAllow(), ALLOW_BINDING);
            protocolMarshaller.marshall(awsWafv2RulesActionDetails.getBlock(), BLOCK_BINDING);
            protocolMarshaller.marshall(awsWafv2RulesActionDetails.getCaptcha(), CAPTCHA_BINDING);
            protocolMarshaller.marshall(awsWafv2RulesActionDetails.getCount(), COUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
