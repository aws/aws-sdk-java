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
 * ListRecommendationFeedbackRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListRecommendationFeedbackRequestMarshaller {

    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> CODEREVIEWARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("CodeReviewArn").build();
    private static final MarshallingInfo<List> USERIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("UserIds").build();
    private static final MarshallingInfo<List> RECOMMENDATIONIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("RecommendationIds").build();

    private static final ListRecommendationFeedbackRequestMarshaller instance = new ListRecommendationFeedbackRequestMarshaller();

    public static ListRecommendationFeedbackRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListRecommendationFeedbackRequest listRecommendationFeedbackRequest, ProtocolMarshaller protocolMarshaller) {

        if (listRecommendationFeedbackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listRecommendationFeedbackRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listRecommendationFeedbackRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listRecommendationFeedbackRequest.getCodeReviewArn(), CODEREVIEWARN_BINDING);
            protocolMarshaller.marshall(listRecommendationFeedbackRequest.getUserIds(), USERIDS_BINDING);
            protocolMarshaller.marshall(listRecommendationFeedbackRequest.getRecommendationIds(), RECOMMENDATIONIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
