/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideosignalingchannels.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisvideosignalingchannels.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendAlexaOfferToMasterRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendAlexaOfferToMasterRequestMarshaller {

    private static final MarshallingInfo<String> CHANNELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelARN").build();
    private static final MarshallingInfo<String> SENDERCLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SenderClientId").build();
    private static final MarshallingInfo<String> MESSAGEPAYLOAD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessagePayload").build();

    private static final SendAlexaOfferToMasterRequestMarshaller instance = new SendAlexaOfferToMasterRequestMarshaller();

    public static SendAlexaOfferToMasterRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendAlexaOfferToMasterRequest sendAlexaOfferToMasterRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendAlexaOfferToMasterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendAlexaOfferToMasterRequest.getChannelARN(), CHANNELARN_BINDING);
            protocolMarshaller.marshall(sendAlexaOfferToMasterRequest.getSenderClientId(), SENDERCLIENTID_BINDING);
            protocolMarshaller.marshall(sendAlexaOfferToMasterRequest.getMessagePayload(), MESSAGEPAYLOAD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
