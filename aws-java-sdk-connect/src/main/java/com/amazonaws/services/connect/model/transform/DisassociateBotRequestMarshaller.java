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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DisassociateBotRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DisassociateBotRequestMarshaller {

    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<StructuredPojo> LEXBOT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LexBot").build();
    private static final MarshallingInfo<StructuredPojo> LEXV2BOT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LexV2Bot").build();

    private static final DisassociateBotRequestMarshaller instance = new DisassociateBotRequestMarshaller();

    public static DisassociateBotRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DisassociateBotRequest disassociateBotRequest, ProtocolMarshaller protocolMarshaller) {

        if (disassociateBotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(disassociateBotRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(disassociateBotRequest.getLexBot(), LEXBOT_BINDING);
            protocolMarshaller.marshall(disassociateBotRequest.getLexV2Bot(), LEXV2BOT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
