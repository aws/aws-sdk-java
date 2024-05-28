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
 * ReviewTemplateAnswerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReviewTemplateAnswerMarshaller {

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
    private static final MarshallingInfo<String> HELPFULRESOURCEDISPLAYTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HelpfulResourceDisplayText").build();
    private static final MarshallingInfo<List> CHOICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Choices").build();
    private static final MarshallingInfo<List> SELECTEDCHOICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectedChoices").build();
    private static final MarshallingInfo<List> CHOICEANSWERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ChoiceAnswers").build();
    private static final MarshallingInfo<Boolean> ISAPPLICABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsApplicable").build();
    private static final MarshallingInfo<String> ANSWERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnswerStatus").build();
    private static final MarshallingInfo<String> NOTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Notes").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Reason").build();

    private static final ReviewTemplateAnswerMarshaller instance = new ReviewTemplateAnswerMarshaller();

    public static ReviewTemplateAnswerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReviewTemplateAnswer reviewTemplateAnswer, ProtocolMarshaller protocolMarshaller) {

        if (reviewTemplateAnswer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reviewTemplateAnswer.getQuestionId(), QUESTIONID_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getPillarId(), PILLARID_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getQuestionTitle(), QUESTIONTITLE_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getQuestionDescription(), QUESTIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getImprovementPlanUrl(), IMPROVEMENTPLANURL_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getHelpfulResourceUrl(), HELPFULRESOURCEURL_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getHelpfulResourceDisplayText(), HELPFULRESOURCEDISPLAYTEXT_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getChoices(), CHOICES_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getSelectedChoices(), SELECTEDCHOICES_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getChoiceAnswers(), CHOICEANSWERS_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getIsApplicable(), ISAPPLICABLE_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getAnswerStatus(), ANSWERSTATUS_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getNotes(), NOTES_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswer.getReason(), REASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
