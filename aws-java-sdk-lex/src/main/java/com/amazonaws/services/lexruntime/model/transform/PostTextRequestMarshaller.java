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
package com.amazonaws.services.lexruntime.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PostTextRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostTextRequestMarshaller {

    private static final MarshallingInfo<String> BOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botName").build();
    private static final MarshallingInfo<String> BOTALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botAlias").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("userId").build();
    private static final MarshallingInfo<Map> SESSIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sessionAttributes").build();
    private static final MarshallingInfo<Map> REQUESTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestAttributes").build();
    private static final MarshallingInfo<String> INPUTTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputText").build();

    private static final PostTextRequestMarshaller instance = new PostTextRequestMarshaller();

    public static PostTextRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostTextRequest postTextRequest, ProtocolMarshaller protocolMarshaller) {

        if (postTextRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postTextRequest.getBotName(), BOTNAME_BINDING);
            protocolMarshaller.marshall(postTextRequest.getBotAlias(), BOTALIAS_BINDING);
            protocolMarshaller.marshall(postTextRequest.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(postTextRequest.getSessionAttributes(), SESSIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(postTextRequest.getRequestAttributes(), REQUESTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(postTextRequest.getInputText(), INPUTTEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
