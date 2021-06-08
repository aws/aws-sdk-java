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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateChannelModeratorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateChannelModeratorRequestMarshaller {

    private static final MarshallingInfo<String> CHANNELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("channelArn").build();
    private static final MarshallingInfo<String> CHANNELMODERATORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelModeratorArn").build();
    private static final MarshallingInfo<String> CHIMEBEARER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-chime-bearer").build();

    private static final CreateChannelModeratorRequestMarshaller instance = new CreateChannelModeratorRequestMarshaller();

    public static CreateChannelModeratorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateChannelModeratorRequest createChannelModeratorRequest, ProtocolMarshaller protocolMarshaller) {

        if (createChannelModeratorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createChannelModeratorRequest.getChannelArn(), CHANNELARN_BINDING);
            protocolMarshaller.marshall(createChannelModeratorRequest.getChannelModeratorArn(), CHANNELMODERATORARN_BINDING);
            protocolMarshaller.marshall(createChannelModeratorRequest.getChimeBearer(), CHIMEBEARER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
