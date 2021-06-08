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
package com.amazonaws.services.lexruntimev2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexruntimev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecognizeUtteranceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecognizeUtteranceRequestMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> BOTALIASID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botAliasId").build();
    private static final MarshallingInfo<String> LOCALEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("localeId").build();
    private static final MarshallingInfo<String> SESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("sessionId").build();
    private static final MarshallingInfo<String> SESSIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-lex-session-state").build();
    private static final MarshallingInfo<String> REQUESTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-lex-request-attributes").build();
    private static final MarshallingInfo<String> REQUESTCONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("Content-Type").build();
    private static final MarshallingInfo<String> RESPONSECONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("Response-Content-Type").build();
    private static final MarshallingInfo<java.io.InputStream> INPUTSTREAM_BINDING = MarshallingInfo.builder(MarshallingType.STREAM)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();

    private static final RecognizeUtteranceRequestMarshaller instance = new RecognizeUtteranceRequestMarshaller();

    public static RecognizeUtteranceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecognizeUtteranceRequest recognizeUtteranceRequest, ProtocolMarshaller protocolMarshaller) {

        if (recognizeUtteranceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recognizeUtteranceRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(recognizeUtteranceRequest.getBotAliasId(), BOTALIASID_BINDING);
            protocolMarshaller.marshall(recognizeUtteranceRequest.getLocaleId(), LOCALEID_BINDING);
            protocolMarshaller.marshall(recognizeUtteranceRequest.getSessionId(), SESSIONID_BINDING);
            protocolMarshaller.marshall(recognizeUtteranceRequest.getSessionState(), SESSIONSTATE_BINDING);
            protocolMarshaller.marshall(recognizeUtteranceRequest.getRequestAttributes(), REQUESTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(recognizeUtteranceRequest.getRequestContentType(), REQUESTCONTENTTYPE_BINDING);
            protocolMarshaller.marshall(recognizeUtteranceRequest.getResponseContentType(), RESPONSECONTENTTYPE_BINDING);
            protocolMarshaller.marshall(recognizeUtteranceRequest.getInputStream(), INPUTSTREAM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
