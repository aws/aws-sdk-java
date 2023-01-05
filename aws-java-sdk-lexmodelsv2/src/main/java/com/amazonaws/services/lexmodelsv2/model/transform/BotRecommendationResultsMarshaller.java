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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BotRecommendationResultsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BotRecommendationResultsMarshaller {

    private static final MarshallingInfo<String> BOTLOCALEEXPORTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botLocaleExportUrl").build();
    private static final MarshallingInfo<String> ASSOCIATEDTRANSCRIPTSURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatedTranscriptsUrl").build();
    private static final MarshallingInfo<StructuredPojo> STATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statistics").build();

    private static final BotRecommendationResultsMarshaller instance = new BotRecommendationResultsMarshaller();

    public static BotRecommendationResultsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BotRecommendationResults botRecommendationResults, ProtocolMarshaller protocolMarshaller) {

        if (botRecommendationResults == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(botRecommendationResults.getBotLocaleExportUrl(), BOTLOCALEEXPORTURL_BINDING);
            protocolMarshaller.marshall(botRecommendationResults.getAssociatedTranscriptsUrl(), ASSOCIATEDTRANSCRIPTSURL_BINDING);
            protocolMarshaller.marshall(botRecommendationResults.getStatistics(), STATISTICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
