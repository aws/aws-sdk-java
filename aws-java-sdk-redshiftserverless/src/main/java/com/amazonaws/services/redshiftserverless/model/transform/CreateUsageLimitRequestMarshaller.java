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
 * CreateUsageLimitRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateUsageLimitRequestMarshaller {

    private static final MarshallingInfo<Long> AMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("amount").build();
    private static final MarshallingInfo<String> BREACHACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("breachAction").build();
    private static final MarshallingInfo<String> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("period").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<String> USAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("usageType").build();

    private static final CreateUsageLimitRequestMarshaller instance = new CreateUsageLimitRequestMarshaller();

    public static CreateUsageLimitRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateUsageLimitRequest createUsageLimitRequest, ProtocolMarshaller protocolMarshaller) {

        if (createUsageLimitRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createUsageLimitRequest.getAmount(), AMOUNT_BINDING);
            protocolMarshaller.marshall(createUsageLimitRequest.getBreachAction(), BREACHACTION_BINDING);
            protocolMarshaller.marshall(createUsageLimitRequest.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(createUsageLimitRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(createUsageLimitRequest.getUsageType(), USAGETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
