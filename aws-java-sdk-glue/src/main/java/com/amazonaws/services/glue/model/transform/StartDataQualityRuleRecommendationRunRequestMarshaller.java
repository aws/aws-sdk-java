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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartDataQualityRuleRecommendationRunRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartDataQualityRuleRecommendationRunRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSource").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<Integer> NUMBEROFWORKERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfWorkers").build();
    private static final MarshallingInfo<Integer> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timeout").build();
    private static final MarshallingInfo<String> CREATEDRULESETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedRulesetName").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();

    private static final StartDataQualityRuleRecommendationRunRequestMarshaller instance = new StartDataQualityRuleRecommendationRunRequestMarshaller();

    public static StartDataQualityRuleRecommendationRunRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartDataQualityRuleRecommendationRunRequest startDataQualityRuleRecommendationRunRequest, ProtocolMarshaller protocolMarshaller) {

        if (startDataQualityRuleRecommendationRunRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startDataQualityRuleRecommendationRunRequest.getDataSource(), DATASOURCE_BINDING);
            protocolMarshaller.marshall(startDataQualityRuleRecommendationRunRequest.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(startDataQualityRuleRecommendationRunRequest.getNumberOfWorkers(), NUMBEROFWORKERS_BINDING);
            protocolMarshaller.marshall(startDataQualityRuleRecommendationRunRequest.getTimeout(), TIMEOUT_BINDING);
            protocolMarshaller.marshall(startDataQualityRuleRecommendationRunRequest.getCreatedRulesetName(), CREATEDRULESETNAME_BINDING);
            protocolMarshaller.marshall(startDataQualityRuleRecommendationRunRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
