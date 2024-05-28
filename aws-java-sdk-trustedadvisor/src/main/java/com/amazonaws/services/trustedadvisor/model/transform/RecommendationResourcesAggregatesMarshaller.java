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
package com.amazonaws.services.trustedadvisor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.trustedadvisor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommendationResourcesAggregatesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommendationResourcesAggregatesMarshaller {

    private static final MarshallingInfo<Long> ERRORCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("errorCount").build();
    private static final MarshallingInfo<Long> OKCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("okCount").build();
    private static final MarshallingInfo<Long> WARNINGCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("warningCount").build();

    private static final RecommendationResourcesAggregatesMarshaller instance = new RecommendationResourcesAggregatesMarshaller();

    public static RecommendationResourcesAggregatesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecommendationResourcesAggregates recommendationResourcesAggregates, ProtocolMarshaller protocolMarshaller) {

        if (recommendationResourcesAggregates == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommendationResourcesAggregates.getErrorCount(), ERRORCOUNT_BINDING);
            protocolMarshaller.marshall(recommendationResourcesAggregates.getOkCount(), OKCOUNT_BINDING);
            protocolMarshaller.marshall(recommendationResourcesAggregates.getWarningCount(), WARNINGCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
