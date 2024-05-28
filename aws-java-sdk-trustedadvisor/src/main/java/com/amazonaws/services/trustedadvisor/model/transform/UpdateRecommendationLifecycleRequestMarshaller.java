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
 * UpdateRecommendationLifecycleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateRecommendationLifecycleRequestMarshaller {

    private static final MarshallingInfo<String> LIFECYCLESTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lifecycleStage").build();
    private static final MarshallingInfo<String> RECOMMENDATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("recommendationIdentifier").build();
    private static final MarshallingInfo<String> UPDATEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateReason").build();
    private static final MarshallingInfo<String> UPDATEREASONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateReasonCode").build();

    private static final UpdateRecommendationLifecycleRequestMarshaller instance = new UpdateRecommendationLifecycleRequestMarshaller();

    public static UpdateRecommendationLifecycleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateRecommendationLifecycleRequest updateRecommendationLifecycleRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateRecommendationLifecycleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateRecommendationLifecycleRequest.getLifecycleStage(), LIFECYCLESTAGE_BINDING);
            protocolMarshaller.marshall(updateRecommendationLifecycleRequest.getRecommendationIdentifier(), RECOMMENDATIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateRecommendationLifecycleRequest.getUpdateReason(), UPDATEREASON_BINDING);
            protocolMarshaller.marshall(updateRecommendationLifecycleRequest.getUpdateReasonCode(), UPDATEREASONCODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
