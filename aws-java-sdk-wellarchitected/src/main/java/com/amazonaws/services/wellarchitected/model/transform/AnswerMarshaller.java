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
package com.amazonaws.services.wellarchitected.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnswerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnswerMarshaller {

    private static final MarshallingInfo<String> QUESTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionId").build();
    private static final MarshallingInfo<String> PILLARID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PillarId").build();
    private static final MarshallingInfo<String> QUESTIONTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionTitle").build();
    private static final MarshallingInfo<String> QUESTIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionDescription").build();
    private static final MarshallingInfo<String> IMPROVEMENTPLANURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImprovementPlanUrl").build();
    private static final MarshallingInfo<String> HELPFULRESOURCEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HelpfulResourceUrl").build();
    private static final MarshallingInfo<List> CHOICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Choices").build();
    private static final MarshallingInfo<List> SELECTEDCHOICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectedChoices").build();
    private static final MarshallingInfo<List> CHOICEANSWERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ChoiceAnswers").build();
    private static final MarshallingInfo<Boolean> ISAPPLICABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsApplicable").build();
    private static final MarshallingInfo<String> RISK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Risk").build();
    private static final MarshallingInfo<String> NOTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Notes").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Reason").build();

    private static final AnswerMarshaller instance = new AnswerMarshaller();

    public static AnswerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Answer answer, ProtocolMarshaller protocolMarshaller) {

        if (answer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(answer.getQuestionId(), QUESTIONID_BINDING);
            protocolMarshaller.marshall(answer.getPillarId(), PILLARID_BINDING);
            protocolMarshaller.marshall(answer.getQuestionTitle(), QUESTIONTITLE_BINDING);
            protocolMarshaller.marshall(answer.getQuestionDescription(), QUESTIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(answer.getImprovementPlanUrl(), IMPROVEMENTPLANURL_BINDING);
            protocolMarshaller.marshall(answer.getHelpfulResourceUrl(), HELPFULRESOURCEURL_BINDING);
            protocolMarshaller.marshall(answer.getChoices(), CHOICES_BINDING);
            protocolMarshaller.marshall(answer.getSelectedChoices(), SELECTEDCHOICES_BINDING);
            protocolMarshaller.marshall(answer.getChoiceAnswers(), CHOICEANSWERS_BINDING);
            protocolMarshaller.marshall(answer.getIsApplicable(), ISAPPLICABLE_BINDING);
            protocolMarshaller.marshall(answer.getRisk(), RISK_BINDING);
            protocolMarshaller.marshall(answer.getNotes(), NOTES_BINDING);
            protocolMarshaller.marshall(answer.getReason(), REASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
