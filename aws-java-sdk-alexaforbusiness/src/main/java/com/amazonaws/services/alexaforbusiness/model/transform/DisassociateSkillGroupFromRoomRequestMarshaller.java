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
package com.amazonaws.services.alexaforbusiness.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DisassociateSkillGroupFromRoomRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DisassociateSkillGroupFromRoomRequestMarshaller {

    private static final MarshallingInfo<String> SKILLGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SkillGroupArn").build();
    private static final MarshallingInfo<String> ROOMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoomArn").build();

    private static final DisassociateSkillGroupFromRoomRequestMarshaller instance = new DisassociateSkillGroupFromRoomRequestMarshaller();

    public static DisassociateSkillGroupFromRoomRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DisassociateSkillGroupFromRoomRequest disassociateSkillGroupFromRoomRequest, ProtocolMarshaller protocolMarshaller) {

        if (disassociateSkillGroupFromRoomRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(disassociateSkillGroupFromRoomRequest.getSkillGroupArn(), SKILLGROUPARN_BINDING);
            protocolMarshaller.marshall(disassociateSkillGroupFromRoomRequest.getRoomArn(), ROOMARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
