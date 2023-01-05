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
package com.amazonaws.services.costexplorer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListSavingsPlansPurchaseRecommendationGenerationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListSavingsPlansPurchaseRecommendationGenerationRequestMarshaller {

    private static final MarshallingInfo<String> GENERATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenerationStatus").build();
    private static final MarshallingInfo<List> RECOMMENDATIONIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationIds").build();
    private static final MarshallingInfo<Integer> PAGESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PageSize").build();
    private static final MarshallingInfo<String> NEXTPAGETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NextPageToken").build();

    private static final ListSavingsPlansPurchaseRecommendationGenerationRequestMarshaller instance = new ListSavingsPlansPurchaseRecommendationGenerationRequestMarshaller();

    public static ListSavingsPlansPurchaseRecommendationGenerationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListSavingsPlansPurchaseRecommendationGenerationRequest listSavingsPlansPurchaseRecommendationGenerationRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (listSavingsPlansPurchaseRecommendationGenerationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listSavingsPlansPurchaseRecommendationGenerationRequest.getGenerationStatus(), GENERATIONSTATUS_BINDING);
            protocolMarshaller.marshall(listSavingsPlansPurchaseRecommendationGenerationRequest.getRecommendationIds(), RECOMMENDATIONIDS_BINDING);
            protocolMarshaller.marshall(listSavingsPlansPurchaseRecommendationGenerationRequest.getPageSize(), PAGESIZE_BINDING);
            protocolMarshaller.marshall(listSavingsPlansPurchaseRecommendationGenerationRequest.getNextPageToken(), NEXTPAGETOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
