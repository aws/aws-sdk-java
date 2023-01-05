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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JourneyChannelSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JourneyChannelSettingsMarshaller {

    private static final MarshallingInfo<String> CONNECTCAMPAIGNARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectCampaignArn").build();
    private static final MarshallingInfo<String> CONNECTCAMPAIGNEXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectCampaignExecutionRoleArn").build();

    private static final JourneyChannelSettingsMarshaller instance = new JourneyChannelSettingsMarshaller();

    public static JourneyChannelSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JourneyChannelSettings journeyChannelSettings, ProtocolMarshaller protocolMarshaller) {

        if (journeyChannelSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(journeyChannelSettings.getConnectCampaignArn(), CONNECTCAMPAIGNARN_BINDING);
            protocolMarshaller.marshall(journeyChannelSettings.getConnectCampaignExecutionRoleArn(), CONNECTCAMPAIGNEXECUTIONROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
