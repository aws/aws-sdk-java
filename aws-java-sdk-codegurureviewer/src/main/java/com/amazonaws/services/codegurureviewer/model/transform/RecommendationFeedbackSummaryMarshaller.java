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
package com.amazonaws.services.codegurureviewer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codegurureviewer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommendationFeedbackSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommendationFeedbackSummaryMarshaller {

    private static final MarshallingInfo<String> RECOMMENDATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationId").build();
    private static final MarshallingInfo<List> REACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Reactions").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserId").build();

    private static final RecommendationFeedbackSummaryMarshaller instance = new RecommendationFeedbackSummaryMarshaller();

    public static RecommendationFeedbackSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecommendationFeedbackSummary recommendationFeedbackSummary, ProtocolMarshaller protocolMarshaller) {

        if (recommendationFeedbackSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommendationFeedbackSummary.getRecommendationId(), RECOMMENDATIONID_BINDING);
            protocolMarshaller.marshall(recommendationFeedbackSummary.getReactions(), REACTIONS_BINDING);
            protocolMarshaller.marshall(recommendationFeedbackSummary.getUserId(), USERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
