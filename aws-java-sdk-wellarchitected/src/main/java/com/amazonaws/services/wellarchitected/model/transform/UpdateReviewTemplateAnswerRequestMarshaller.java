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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateReviewTemplateAnswerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateReviewTemplateAnswerRequestMarshaller {

    private static final MarshallingInfo<String> TEMPLATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("TemplateArn").build();
    private static final MarshallingInfo<String> LENSALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("LensAlias").build();
    private static final MarshallingInfo<String> QUESTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("QuestionId").build();
    private static final MarshallingInfo<List> SELECTEDCHOICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectedChoices").build();
    private static final MarshallingInfo<Map> CHOICEUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ChoiceUpdates").build();
    private static final MarshallingInfo<String> NOTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Notes").build();
    private static final MarshallingInfo<Boolean> ISAPPLICABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsApplicable").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Reason").build();

    private static final UpdateReviewTemplateAnswerRequestMarshaller instance = new UpdateReviewTemplateAnswerRequestMarshaller();

    public static UpdateReviewTemplateAnswerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateReviewTemplateAnswerRequest updateReviewTemplateAnswerRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateReviewTemplateAnswerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateReviewTemplateAnswerRequest.getTemplateArn(), TEMPLATEARN_BINDING);
            protocolMarshaller.marshall(updateReviewTemplateAnswerRequest.getLensAlias(), LENSALIAS_BINDING);
            protocolMarshaller.marshall(updateReviewTemplateAnswerRequest.getQuestionId(), QUESTIONID_BINDING);
            protocolMarshaller.marshall(updateReviewTemplateAnswerRequest.getSelectedChoices(), SELECTEDCHOICES_BINDING);
            protocolMarshaller.marshall(updateReviewTemplateAnswerRequest.getChoiceUpdates(), CHOICEUPDATES_BINDING);
            protocolMarshaller.marshall(updateReviewTemplateAnswerRequest.getNotes(), NOTES_BINDING);
            protocolMarshaller.marshall(updateReviewTemplateAnswerRequest.getIsApplicable(), ISAPPLICABLE_BINDING);
            protocolMarshaller.marshall(updateReviewTemplateAnswerRequest.getReason(), REASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
