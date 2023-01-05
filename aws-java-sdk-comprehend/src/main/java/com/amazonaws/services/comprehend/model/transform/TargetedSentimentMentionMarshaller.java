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
package com.amazonaws.services.comprehend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TargetedSentimentMentionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TargetedSentimentMentionMarshaller {

    private static final MarshallingInfo<Float> SCORE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Score").build();
    private static final MarshallingInfo<Float> GROUPSCORE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupScore").build();
    private static final MarshallingInfo<String> TEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Text").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> MENTIONSENTIMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MentionSentiment").build();
    private static final MarshallingInfo<Integer> BEGINOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BeginOffset").build();
    private static final MarshallingInfo<Integer> ENDOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndOffset").build();

    private static final TargetedSentimentMentionMarshaller instance = new TargetedSentimentMentionMarshaller();

    public static TargetedSentimentMentionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TargetedSentimentMention targetedSentimentMention, ProtocolMarshaller protocolMarshaller) {

        if (targetedSentimentMention == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(targetedSentimentMention.getScore(), SCORE_BINDING);
            protocolMarshaller.marshall(targetedSentimentMention.getGroupScore(), GROUPSCORE_BINDING);
            protocolMarshaller.marshall(targetedSentimentMention.getText(), TEXT_BINDING);
            protocolMarshaller.marshall(targetedSentimentMention.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(targetedSentimentMention.getMentionSentiment(), MENTIONSENTIMENT_BINDING);
            protocolMarshaller.marshall(targetedSentimentMention.getBeginOffset(), BEGINOFFSET_BINDING);
            protocolMarshaller.marshall(targetedSentimentMention.getEndOffset(), ENDOFFSET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
