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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BotMemberMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BotMemberMarshaller {

    private static final MarshallingInfo<String> BOTMEMBERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botMemberId").build();
    private static final MarshallingInfo<String> BOTMEMBERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botMemberName").build();
    private static final MarshallingInfo<String> BOTMEMBERALIASID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botMemberAliasId").build();
    private static final MarshallingInfo<String> BOTMEMBERALIASNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botMemberAliasName").build();
    private static final MarshallingInfo<String> BOTMEMBERVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botMemberVersion").build();

    private static final BotMemberMarshaller instance = new BotMemberMarshaller();

    public static BotMemberMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BotMember botMember, ProtocolMarshaller protocolMarshaller) {

        if (botMember == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(botMember.getBotMemberId(), BOTMEMBERID_BINDING);
            protocolMarshaller.marshall(botMember.getBotMemberName(), BOTMEMBERNAME_BINDING);
            protocolMarshaller.marshall(botMember.getBotMemberAliasId(), BOTMEMBERALIASID_BINDING);
            protocolMarshaller.marshall(botMember.getBotMemberAliasName(), BOTMEMBERALIASNAME_BINDING);
            protocolMarshaller.marshall(botMember.getBotMemberVersion(), BOTMEMBERVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
