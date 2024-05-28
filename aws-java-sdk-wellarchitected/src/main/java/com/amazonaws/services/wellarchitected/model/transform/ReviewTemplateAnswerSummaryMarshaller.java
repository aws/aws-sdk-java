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
 * ReviewTemplateAnswerSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReviewTemplateAnswerSummaryMarshaller {

    private static final MarshallingInfo<String> QUESTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionId").build();
    private static final MarshallingInfo<String> PILLARID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PillarId").build();
    private static final MarshallingInfo<String> QUESTIONTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionTitle").build();
    private static final MarshallingInfo<List> CHOICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Choices").build();
    private static final MarshallingInfo<List> SELECTEDCHOICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectedChoices").build();
    private static final MarshallingInfo<List> CHOICEANSWERSUMMARIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChoiceAnswerSummaries").build();
    private static final MarshallingInfo<Boolean> ISAPPLICABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsApplicable").build();
    private static final MarshallingInfo<String> ANSWERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnswerStatus").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Reason").build();
    private static final MarshallingInfo<String> QUESTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionType").build();

    private static final ReviewTemplateAnswerSummaryMarshaller instance = new ReviewTemplateAnswerSummaryMarshaller();

    public static ReviewTemplateAnswerSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReviewTemplateAnswerSummary reviewTemplateAnswerSummary, ProtocolMarshaller protocolMarshaller) {

        if (reviewTemplateAnswerSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reviewTemplateAnswerSummary.getQuestionId(), QUESTIONID_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswerSummary.getPillarId(), PILLARID_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswerSummary.getQuestionTitle(), QUESTIONTITLE_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswerSummary.getChoices(), CHOICES_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswerSummary.getSelectedChoices(), SELECTEDCHOICES_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswerSummary.getChoiceAnswerSummaries(), CHOICEANSWERSUMMARIES_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswerSummary.getIsApplicable(), ISAPPLICABLE_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswerSummary.getAnswerStatus(), ANSWERSTATUS_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswerSummary.getReason(), REASON_BINDING);
            protocolMarshaller.marshall(reviewTemplateAnswerSummary.getQuestionType(), QUESTIONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
