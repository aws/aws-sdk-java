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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartDataQualityRulesetEvaluationRunRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartDataQualityRulesetEvaluationRunRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSource").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<Integer> NUMBEROFWORKERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfWorkers").build();
    private static final MarshallingInfo<Integer> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timeout").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();
    private static final MarshallingInfo<StructuredPojo> ADDITIONALRUNOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalRunOptions").build();
    private static final MarshallingInfo<List> RULESETNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RulesetNames").build();

    private static final StartDataQualityRulesetEvaluationRunRequestMarshaller instance = new StartDataQualityRulesetEvaluationRunRequestMarshaller();

    public static StartDataQualityRulesetEvaluationRunRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartDataQualityRulesetEvaluationRunRequest startDataQualityRulesetEvaluationRunRequest, ProtocolMarshaller protocolMarshaller) {

        if (startDataQualityRulesetEvaluationRunRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startDataQualityRulesetEvaluationRunRequest.getDataSource(), DATASOURCE_BINDING);
            protocolMarshaller.marshall(startDataQualityRulesetEvaluationRunRequest.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(startDataQualityRulesetEvaluationRunRequest.getNumberOfWorkers(), NUMBEROFWORKERS_BINDING);
            protocolMarshaller.marshall(startDataQualityRulesetEvaluationRunRequest.getTimeout(), TIMEOUT_BINDING);
            protocolMarshaller.marshall(startDataQualityRulesetEvaluationRunRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(startDataQualityRulesetEvaluationRunRequest.getAdditionalRunOptions(), ADDITIONALRUNOPTIONS_BINDING);
            protocolMarshaller.marshall(startDataQualityRulesetEvaluationRunRequest.getRulesetNames(), RULESETNAMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
