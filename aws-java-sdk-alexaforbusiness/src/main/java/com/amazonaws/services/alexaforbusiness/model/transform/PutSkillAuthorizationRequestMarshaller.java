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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutSkillAuthorizationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutSkillAuthorizationRequestMarshaller {

    private static final MarshallingInfo<Map> AUTHORIZATIONRESULT_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthorizationResult").build();
    private static final MarshallingInfo<String> SKILLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SkillId").build();
    private static final MarshallingInfo<String> ROOMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoomArn").build();

    private static final PutSkillAuthorizationRequestMarshaller instance = new PutSkillAuthorizationRequestMarshaller();

    public static PutSkillAuthorizationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutSkillAuthorizationRequest putSkillAuthorizationRequest, ProtocolMarshaller protocolMarshaller) {

        if (putSkillAuthorizationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putSkillAuthorizationRequest.getAuthorizationResult(), AUTHORIZATIONRESULT_BINDING);
            protocolMarshaller.marshall(putSkillAuthorizationRequest.getSkillId(), SKILLID_BINDING);
            protocolMarshaller.marshall(putSkillAuthorizationRequest.getRoomArn(), ROOMARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
