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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PostContentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostContentRequestMarshaller {

    private static final MarshallingInfo<String> BOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botName").build();
    private static final MarshallingInfo<String> BOTALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botAlias").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("userId").build();
    private static final MarshallingInfo<String> SESSIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.JSON_VALUE)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-lex-session-attributes").build();
    private static final MarshallingInfo<String> REQUESTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.JSON_VALUE)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-lex-request-attributes").build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("Content-Type").build();
    private static final MarshallingInfo<String> ACCEPT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("Accept").build();
    private static final MarshallingInfo<java.io.InputStream> INPUTSTREAM_BINDING = MarshallingInfo.builder(MarshallingType.STREAM)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();

    private static final PostContentRequestMarshaller instance = new PostContentRequestMarshaller();

    public static PostContentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostContentRequest postContentRequest, ProtocolMarshaller protocolMarshaller) {

        if (postContentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postContentRequest.getBotName(), BOTNAME_BINDING);
            protocolMarshaller.marshall(postContentRequest.getBotAlias(), BOTALIAS_BINDING);
            protocolMarshaller.marshall(postContentRequest.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(postContentRequest.getSessionAttributes(), SESSIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(postContentRequest.getRequestAttributes(), REQUESTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(postContentRequest.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(postContentRequest.getAccept(), ACCEPT_BINDING);
            protocolMarshaller.marshall(postContentRequest.getInputStream(), INPUTSTREAM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
