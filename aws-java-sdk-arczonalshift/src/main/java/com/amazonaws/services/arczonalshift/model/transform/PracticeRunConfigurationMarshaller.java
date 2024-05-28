/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.arczonalshift.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.arczonalshift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PracticeRunConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PracticeRunConfigurationMarshaller {

    private static final MarshallingInfo<List> BLOCKEDDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("blockedDates").build();
    private static final MarshallingInfo<List> BLOCKEDWINDOWS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blockedWindows").build();
    private static final MarshallingInfo<List> BLOCKINGALARMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blockingAlarms").build();
    private static final MarshallingInfo<List> OUTCOMEALARMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("outcomeAlarms").build();

    private static final PracticeRunConfigurationMarshaller instance = new PracticeRunConfigurationMarshaller();

    public static PracticeRunConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PracticeRunConfiguration practiceRunConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (practiceRunConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(practiceRunConfiguration.getBlockedDates(), BLOCKEDDATES_BINDING);
            protocolMarshaller.marshall(practiceRunConfiguration.getBlockedWindows(), BLOCKEDWINDOWS_BINDING);
            protocolMarshaller.marshall(practiceRunConfiguration.getBlockingAlarms(), BLOCKINGALARMS_BINDING);
            protocolMarshaller.marshall(practiceRunConfiguration.getOutcomeAlarms(), OUTCOMEALARMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
