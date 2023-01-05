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
package com.amazonaws.services.resiliencehub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resiliencehub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListRecommendationTemplatesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListRecommendationTemplatesRequestMarshaller {

    private static final MarshallingInfo<String> ASSESSMENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("assessmentArn").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> RECOMMENDATIONTEMPLATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("recommendationTemplateArn").build();
    private static final MarshallingInfo<Boolean> REVERSEORDER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("reverseOrder").build();
    private static final MarshallingInfo<List> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("status").build();

    private static final ListRecommendationTemplatesRequestMarshaller instance = new ListRecommendationTemplatesRequestMarshaller();

    public static ListRecommendationTemplatesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListRecommendationTemplatesRequest listRecommendationTemplatesRequest, ProtocolMarshaller protocolMarshaller) {

        if (listRecommendationTemplatesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listRecommendationTemplatesRequest.getAssessmentArn(), ASSESSMENTARN_BINDING);
            protocolMarshaller.marshall(listRecommendationTemplatesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listRecommendationTemplatesRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(listRecommendationTemplatesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listRecommendationTemplatesRequest.getRecommendationTemplateArn(), RECOMMENDATIONTEMPLATEARN_BINDING);
            protocolMarshaller.marshall(listRecommendationTemplatesRequest.getReverseOrder(), REVERSEORDER_BINDING);
            protocolMarshaller.marshall(listRecommendationTemplatesRequest.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
