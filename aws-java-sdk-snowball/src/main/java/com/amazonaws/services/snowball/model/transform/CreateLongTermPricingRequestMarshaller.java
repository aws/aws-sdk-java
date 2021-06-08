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
package com.amazonaws.services.snowball.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLongTermPricingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLongTermPricingRequestMarshaller {

    private static final MarshallingInfo<String> LONGTERMPRICINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LongTermPricingType").build();
    private static final MarshallingInfo<Boolean> ISLONGTERMPRICINGAUTORENEW_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsLongTermPricingAutoRenew").build();
    private static final MarshallingInfo<String> SNOWBALLTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnowballType").build();

    private static final CreateLongTermPricingRequestMarshaller instance = new CreateLongTermPricingRequestMarshaller();

    public static CreateLongTermPricingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLongTermPricingRequest createLongTermPricingRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLongTermPricingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLongTermPricingRequest.getLongTermPricingType(), LONGTERMPRICINGTYPE_BINDING);
            protocolMarshaller.marshall(createLongTermPricingRequest.getIsLongTermPricingAutoRenew(), ISLONGTERMPRICINGAUTORENEW_BINDING);
            protocolMarshaller.marshall(createLongTermPricingRequest.getSnowballType(), SNOWBALLTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
