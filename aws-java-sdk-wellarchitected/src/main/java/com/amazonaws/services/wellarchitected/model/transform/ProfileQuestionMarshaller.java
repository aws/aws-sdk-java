/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProfileQuestionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProfileQuestionMarshaller {

    private static final MarshallingInfo<String> QUESTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionId").build();
    private static final MarshallingInfo<String> QUESTIONTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionTitle").build();
    private static final MarshallingInfo<String> QUESTIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionDescription").build();
    private static final MarshallingInfo<List> QUESTIONCHOICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionChoices").build();
    private static final MarshallingInfo<List> SELECTEDCHOICEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectedChoiceIds").build();
    private static final MarshallingInfo<Integer> MINSELECTEDCHOICES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinSelectedChoices").build();
    private static final MarshallingInfo<Integer> MAXSELECTEDCHOICES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxSelectedChoices").build();

    private static final ProfileQuestionMarshaller instance = new ProfileQuestionMarshaller();

    public static ProfileQuestionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProfileQuestion profileQuestion, ProtocolMarshaller protocolMarshaller) {

        if (profileQuestion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(profileQuestion.getQuestionId(), QUESTIONID_BINDING);
            protocolMarshaller.marshall(profileQuestion.getQuestionTitle(), QUESTIONTITLE_BINDING);
            protocolMarshaller.marshall(profileQuestion.getQuestionDescription(), QUESTIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(profileQuestion.getQuestionChoices(), QUESTIONCHOICES_BINDING);
            protocolMarshaller.marshall(profileQuestion.getSelectedChoiceIds(), SELECTEDCHOICEIDS_BINDING);
            protocolMarshaller.marshall(profileQuestion.getMinSelectedChoices(), MINSELECTEDCHOICES_BINDING);
            protocolMarshaller.marshall(profileQuestion.getMaxSelectedChoices(), MAXSELECTEDCHOICES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
