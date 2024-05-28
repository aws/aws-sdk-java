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
 * ReviewTemplateLensReviewMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReviewTemplateLensReviewMarshaller {

    private static final MarshallingInfo<String> LENSALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LensAlias").build();
    private static final MarshallingInfo<String> LENSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LensArn").build();
    private static final MarshallingInfo<String> LENSVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LensVersion").build();
    private static final MarshallingInfo<String> LENSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LensName").build();
    private static final MarshallingInfo<String> LENSSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LensStatus").build();
    private static final MarshallingInfo<List> PILLARREVIEWSUMMARIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PillarReviewSummaries").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NOTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Notes").build();
    private static final MarshallingInfo<Map> QUESTIONCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QuestionCounts").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final ReviewTemplateLensReviewMarshaller instance = new ReviewTemplateLensReviewMarshaller();

    public static ReviewTemplateLensReviewMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReviewTemplateLensReview reviewTemplateLensReview, ProtocolMarshaller protocolMarshaller) {

        if (reviewTemplateLensReview == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reviewTemplateLensReview.getLensAlias(), LENSALIAS_BINDING);
            protocolMarshaller.marshall(reviewTemplateLensReview.getLensArn(), LENSARN_BINDING);
            protocolMarshaller.marshall(reviewTemplateLensReview.getLensVersion(), LENSVERSION_BINDING);
            protocolMarshaller.marshall(reviewTemplateLensReview.getLensName(), LENSNAME_BINDING);
            protocolMarshaller.marshall(reviewTemplateLensReview.getLensStatus(), LENSSTATUS_BINDING);
            protocolMarshaller.marshall(reviewTemplateLensReview.getPillarReviewSummaries(), PILLARREVIEWSUMMARIES_BINDING);
            protocolMarshaller.marshall(reviewTemplateLensReview.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(reviewTemplateLensReview.getNotes(), NOTES_BINDING);
            protocolMarshaller.marshall(reviewTemplateLensReview.getQuestionCounts(), QUESTIONCOUNTS_BINDING);
            protocolMarshaller.marshall(reviewTemplateLensReview.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
