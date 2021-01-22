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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BotSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BotSummaryMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> BOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("botName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> BOTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("botStatus").build();
    private static final MarshallingInfo<String> LATESTBOTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("latestBotVersion").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedDateTime").timestampFormat("unixTimestamp").build();

    private static final BotSummaryMarshaller instance = new BotSummaryMarshaller();

    public static BotSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BotSummary botSummary, ProtocolMarshaller protocolMarshaller) {

        if (botSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(botSummary.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(botSummary.getBotName(), BOTNAME_BINDING);
            protocolMarshaller.marshall(botSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(botSummary.getBotStatus(), BOTSTATUS_BINDING);
            protocolMarshaller.marshall(botSummary.getLatestBotVersion(), LATESTBOTVERSION_BINDING);
            protocolMarshaller.marshall(botSummary.getLastUpdatedDateTime(), LASTUPDATEDDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
