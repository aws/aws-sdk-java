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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StillWaitingResponseSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StillWaitingResponseSpecificationMarshaller {

    private static final MarshallingInfo<List> MESSAGEGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("messageGroups").build();
    private static final MarshallingInfo<Integer> FREQUENCYINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("frequencyInSeconds").build();
    private static final MarshallingInfo<Integer> TIMEOUTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutInSeconds").build();
    private static final MarshallingInfo<Boolean> ALLOWINTERRUPT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowInterrupt").build();

    private static final StillWaitingResponseSpecificationMarshaller instance = new StillWaitingResponseSpecificationMarshaller();

    public static StillWaitingResponseSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StillWaitingResponseSpecification stillWaitingResponseSpecification, ProtocolMarshaller protocolMarshaller) {

        if (stillWaitingResponseSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stillWaitingResponseSpecification.getMessageGroups(), MESSAGEGROUPS_BINDING);
            protocolMarshaller.marshall(stillWaitingResponseSpecification.getFrequencyInSeconds(), FREQUENCYINSECONDS_BINDING);
            protocolMarshaller.marshall(stillWaitingResponseSpecification.getTimeoutInSeconds(), TIMEOUTINSECONDS_BINDING);
            protocolMarshaller.marshall(stillWaitingResponseSpecification.getAllowInterrupt(), ALLOWINTERRUPT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
