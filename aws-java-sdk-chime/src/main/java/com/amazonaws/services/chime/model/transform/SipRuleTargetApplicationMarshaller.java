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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SipRuleTargetApplicationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SipRuleTargetApplicationMarshaller {

    private static final MarshallingInfo<String> SIPMEDIAAPPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SipMediaApplicationId").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Priority").build();
    private static final MarshallingInfo<String> AWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AwsRegion").build();

    private static final SipRuleTargetApplicationMarshaller instance = new SipRuleTargetApplicationMarshaller();

    public static SipRuleTargetApplicationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SipRuleTargetApplication sipRuleTargetApplication, ProtocolMarshaller protocolMarshaller) {

        if (sipRuleTargetApplication == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sipRuleTargetApplication.getSipMediaApplicationId(), SIPMEDIAAPPLICATIONID_BINDING);
            protocolMarshaller.marshall(sipRuleTargetApplication.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(sipRuleTargetApplication.getAwsRegion(), AWSREGION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
