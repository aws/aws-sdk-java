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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resiliencehub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfigRecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigRecommendationMarshaller {

    private static final MarshallingInfo<String> APPCOMPONENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appComponentName").build();
    private static final MarshallingInfo<Map> COMPLIANCE_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("compliance").build();
    private static final MarshallingInfo<StructuredPojo> COST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cost").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> HAARCHITECTURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("haArchitecture").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> OPTIMIZATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("optimizationType").build();
    private static final MarshallingInfo<Map> RECOMMENDATIONCOMPLIANCE_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationCompliance").build();
    private static final MarshallingInfo<String> REFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("referenceId").build();
    private static final MarshallingInfo<List> SUGGESTEDCHANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suggestedChanges").build();

    private static final ConfigRecommendationMarshaller instance = new ConfigRecommendationMarshaller();

    public static ConfigRecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigRecommendation configRecommendation, ProtocolMarshaller protocolMarshaller) {

        if (configRecommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configRecommendation.getAppComponentName(), APPCOMPONENTNAME_BINDING);
            protocolMarshaller.marshall(configRecommendation.getCompliance(), COMPLIANCE_BINDING);
            protocolMarshaller.marshall(configRecommendation.getCost(), COST_BINDING);
            protocolMarshaller.marshall(configRecommendation.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(configRecommendation.getHaArchitecture(), HAARCHITECTURE_BINDING);
            protocolMarshaller.marshall(configRecommendation.getName(), NAME_BINDING);
            protocolMarshaller.marshall(configRecommendation.getOptimizationType(), OPTIMIZATIONTYPE_BINDING);
            protocolMarshaller.marshall(configRecommendation.getRecommendationCompliance(), RECOMMENDATIONCOMPLIANCE_BINDING);
            protocolMarshaller.marshall(configRecommendation.getReferenceId(), REFERENCEID_BINDING);
            protocolMarshaller.marshall(configRecommendation.getSuggestedChanges(), SUGGESTEDCHANGES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
