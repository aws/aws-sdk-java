/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoicev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutKeywordRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutKeywordRequestMarshaller {

    private static final MarshallingInfo<String> ORIGINATIONIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginationIdentity").build();
    private static final MarshallingInfo<String> KEYWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Keyword").build();
    private static final MarshallingInfo<String> KEYWORDMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeywordMessage").build();
    private static final MarshallingInfo<String> KEYWORDACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeywordAction").build();

    private static final PutKeywordRequestMarshaller instance = new PutKeywordRequestMarshaller();

    public static PutKeywordRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutKeywordRequest putKeywordRequest, ProtocolMarshaller protocolMarshaller) {

        if (putKeywordRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putKeywordRequest.getOriginationIdentity(), ORIGINATIONIDENTITY_BINDING);
            protocolMarshaller.marshall(putKeywordRequest.getKeyword(), KEYWORD_BINDING);
            protocolMarshaller.marshall(putKeywordRequest.getKeywordMessage(), KEYWORDMESSAGE_BINDING);
            protocolMarshaller.marshall(putKeywordRequest.getKeywordAction(), KEYWORDACTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
