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
 * TestRecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TestRecommendationMarshaller {

    private static final MarshallingInfo<String> APPCOMPONENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appComponentName").build();
    private static final MarshallingInfo<List> DEPENDSONALARMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dependsOnAlarms").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> INTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("intent").build();
    private static final MarshallingInfo<List> ITEMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("items").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PREREQUISITE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("prerequisite").build();
    private static final MarshallingInfo<String> RECOMMENDATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationId").build();
    private static final MarshallingInfo<String> REFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("referenceId").build();
    private static final MarshallingInfo<String> RISK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("risk").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();

    private static final TestRecommendationMarshaller instance = new TestRecommendationMarshaller();

    public static TestRecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TestRecommendation testRecommendation, ProtocolMarshaller protocolMarshaller) {

        if (testRecommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(testRecommendation.getAppComponentName(), APPCOMPONENTNAME_BINDING);
            protocolMarshaller.marshall(testRecommendation.getDependsOnAlarms(), DEPENDSONALARMS_BINDING);
            protocolMarshaller.marshall(testRecommendation.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(testRecommendation.getIntent(), INTENT_BINDING);
            protocolMarshaller.marshall(testRecommendation.getItems(), ITEMS_BINDING);
            protocolMarshaller.marshall(testRecommendation.getName(), NAME_BINDING);
            protocolMarshaller.marshall(testRecommendation.getPrerequisite(), PREREQUISITE_BINDING);
            protocolMarshaller.marshall(testRecommendation.getRecommendationId(), RECOMMENDATIONID_BINDING);
            protocolMarshaller.marshall(testRecommendation.getReferenceId(), REFERENCEID_BINDING);
            protocolMarshaller.marshall(testRecommendation.getRisk(), RISK_BINDING);
            protocolMarshaller.marshall(testRecommendation.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
