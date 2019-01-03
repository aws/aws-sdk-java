/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.support.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.support.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrustedAdvisorCheckRefreshStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrustedAdvisorCheckRefreshStatusMarshaller {

    private static final MarshallingInfo<String> CHECKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("checkId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Long> MILLISUNTILNEXTREFRESHABLE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("millisUntilNextRefreshable").build();

    private static final TrustedAdvisorCheckRefreshStatusMarshaller instance = new TrustedAdvisorCheckRefreshStatusMarshaller();

    public static TrustedAdvisorCheckRefreshStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrustedAdvisorCheckRefreshStatus trustedAdvisorCheckRefreshStatus, ProtocolMarshaller protocolMarshaller) {

        if (trustedAdvisorCheckRefreshStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trustedAdvisorCheckRefreshStatus.getCheckId(), CHECKID_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCheckRefreshStatus.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCheckRefreshStatus.getMillisUntilNextRefreshable(), MILLISUNTILNEXTREFRESHABLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
