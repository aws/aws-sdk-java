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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RateIncreaseCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RateIncreaseCriteriaMarshaller {

    private static final MarshallingInfo<Integer> NUMBEROFNOTIFIEDTHINGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfNotifiedThings").build();
    private static final MarshallingInfo<Integer> NUMBEROFSUCCEEDEDTHINGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfSucceededThings").build();

    private static final RateIncreaseCriteriaMarshaller instance = new RateIncreaseCriteriaMarshaller();

    public static RateIncreaseCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RateIncreaseCriteria rateIncreaseCriteria, ProtocolMarshaller protocolMarshaller) {

        if (rateIncreaseCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rateIncreaseCriteria.getNumberOfNotifiedThings(), NUMBEROFNOTIFIEDTHINGS_BINDING);
            protocolMarshaller.marshall(rateIncreaseCriteria.getNumberOfSucceededThings(), NUMBEROFSUCCEEDEDTHINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
