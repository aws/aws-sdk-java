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
package com.amazonaws.services.redshiftserverless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.redshiftserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UsageLimitMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UsageLimitMarshaller {

    private static final MarshallingInfo<Long> AMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("amount").build();
    private static final MarshallingInfo<String> BREACHACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("breachAction").build();
    private static final MarshallingInfo<String> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("period").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<String> USAGELIMITARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("usageLimitArn").build();
    private static final MarshallingInfo<String> USAGELIMITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("usageLimitId").build();
    private static final MarshallingInfo<String> USAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("usageType").build();

    private static final UsageLimitMarshaller instance = new UsageLimitMarshaller();

    public static UsageLimitMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UsageLimit usageLimit, ProtocolMarshaller protocolMarshaller) {

        if (usageLimit == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(usageLimit.getAmount(), AMOUNT_BINDING);
            protocolMarshaller.marshall(usageLimit.getBreachAction(), BREACHACTION_BINDING);
            protocolMarshaller.marshall(usageLimit.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(usageLimit.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(usageLimit.getUsageLimitArn(), USAGELIMITARN_BINDING);
            protocolMarshaller.marshall(usageLimit.getUsageLimitId(), USAGELIMITID_BINDING);
            protocolMarshaller.marshall(usageLimit.getUsageType(), USAGETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
