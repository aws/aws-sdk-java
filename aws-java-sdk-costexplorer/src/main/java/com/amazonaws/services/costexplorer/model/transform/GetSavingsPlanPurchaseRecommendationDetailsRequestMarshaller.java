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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetSavingsPlanPurchaseRecommendationDetailsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetSavingsPlanPurchaseRecommendationDetailsRequestMarshaller {

    private static final MarshallingInfo<String> RECOMMENDATIONDETAILID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationDetailId").build();

    private static final GetSavingsPlanPurchaseRecommendationDetailsRequestMarshaller instance = new GetSavingsPlanPurchaseRecommendationDetailsRequestMarshaller();

    public static GetSavingsPlanPurchaseRecommendationDetailsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetSavingsPlanPurchaseRecommendationDetailsRequest getSavingsPlanPurchaseRecommendationDetailsRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (getSavingsPlanPurchaseRecommendationDetailsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getSavingsPlanPurchaseRecommendationDetailsRequest.getRecommendationDetailId(), RECOMMENDATIONDETAILID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
