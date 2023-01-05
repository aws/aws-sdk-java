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
 * SopRecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SopRecommendationMarshaller {

    private static final MarshallingInfo<String> APPCOMPONENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appComponentName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
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
    private static final MarshallingInfo<String> SERVICETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceType").build();

    private static final SopRecommendationMarshaller instance = new SopRecommendationMarshaller();

    public static SopRecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SopRecommendation sopRecommendation, ProtocolMarshaller protocolMarshaller) {

        if (sopRecommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sopRecommendation.getAppComponentName(), APPCOMPONENTNAME_BINDING);
            protocolMarshaller.marshall(sopRecommendation.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(sopRecommendation.getItems(), ITEMS_BINDING);
            protocolMarshaller.marshall(sopRecommendation.getName(), NAME_BINDING);
            protocolMarshaller.marshall(sopRecommendation.getPrerequisite(), PREREQUISITE_BINDING);
            protocolMarshaller.marshall(sopRecommendation.getRecommendationId(), RECOMMENDATIONID_BINDING);
            protocolMarshaller.marshall(sopRecommendation.getReferenceId(), REFERENCEID_BINDING);
            protocolMarshaller.marshall(sopRecommendation.getServiceType(), SERVICETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
