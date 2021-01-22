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
 * BotAliasSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BotAliasSummaryMarshaller {

    private static final MarshallingInfo<String> BOTALIASID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botAliasId").build();
    private static final MarshallingInfo<String> BOTALIASNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botAliasName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> BOTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botVersion").build();
    private static final MarshallingInfo<String> BOTALIASSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botAliasStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedDateTime").timestampFormat("unixTimestamp").build();

    private static final BotAliasSummaryMarshaller instance = new BotAliasSummaryMarshaller();

    public static BotAliasSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BotAliasSummary botAliasSummary, ProtocolMarshaller protocolMarshaller) {

        if (botAliasSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(botAliasSummary.getBotAliasId(), BOTALIASID_BINDING);
            protocolMarshaller.marshall(botAliasSummary.getBotAliasName(), BOTALIASNAME_BINDING);
            protocolMarshaller.marshall(botAliasSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(botAliasSummary.getBotVersion(), BOTVERSION_BINDING);
            protocolMarshaller.marshall(botAliasSummary.getBotAliasStatus(), BOTALIASSTATUS_BINDING);
            protocolMarshaller.marshall(botAliasSummary.getCreationDateTime(), CREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(botAliasSummary.getLastUpdatedDateTime(), LASTUPDATEDDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
