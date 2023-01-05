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
package com.amazonaws.services.transcribe.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RuleMarshaller {

    private static final MarshallingInfo<StructuredPojo> NONTALKTIMEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonTalkTimeFilter").build();
    private static final MarshallingInfo<StructuredPojo> INTERRUPTIONFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InterruptionFilter").build();
    private static final MarshallingInfo<StructuredPojo> TRANSCRIPTFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TranscriptFilter").build();
    private static final MarshallingInfo<StructuredPojo> SENTIMENTFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SentimentFilter").build();

    private static final RuleMarshaller instance = new RuleMarshaller();

    public static RuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Rule rule, ProtocolMarshaller protocolMarshaller) {

        if (rule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rule.getNonTalkTimeFilter(), NONTALKTIMEFILTER_BINDING);
            protocolMarshaller.marshall(rule.getInterruptionFilter(), INTERRUPTIONFILTER_BINDING);
            protocolMarshaller.marshall(rule.getTranscriptFilter(), TRANSCRIPTFILTER_BINDING);
            protocolMarshaller.marshall(rule.getSentimentFilter(), SENTIMENTFILTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
