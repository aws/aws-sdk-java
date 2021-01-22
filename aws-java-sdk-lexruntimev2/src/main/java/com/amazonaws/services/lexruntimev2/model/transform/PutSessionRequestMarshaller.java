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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexruntimev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutSessionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutSessionRequestMarshaller {

    private static final MarshallingInfo<String> BOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botId").build();
    private static final MarshallingInfo<String> BOTALIASID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("botAliasId").build();
    private static final MarshallingInfo<String> LOCALEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("localeId").build();
    private static final MarshallingInfo<String> SESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("sessionId").build();
    private static final MarshallingInfo<List> MESSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("messages").build();
    private static final MarshallingInfo<StructuredPojo> SESSIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sessionState").build();
    private static final MarshallingInfo<Map> REQUESTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestAttributes").build();
    private static final MarshallingInfo<String> RESPONSECONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("ResponseContentType").build();

    private static final PutSessionRequestMarshaller instance = new PutSessionRequestMarshaller();

    public static PutSessionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutSessionRequest putSessionRequest, ProtocolMarshaller protocolMarshaller) {

        if (putSessionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putSessionRequest.getBotId(), BOTID_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getBotAliasId(), BOTALIASID_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getLocaleId(), LOCALEID_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getSessionId(), SESSIONID_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getMessages(), MESSAGES_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getSessionState(), SESSIONSTATE_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getRequestAttributes(), REQUESTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(putSessionRequest.getResponseContentType(), RESPONSECONTENTTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
