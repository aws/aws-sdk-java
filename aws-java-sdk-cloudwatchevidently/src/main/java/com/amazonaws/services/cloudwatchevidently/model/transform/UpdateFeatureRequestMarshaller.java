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
package com.amazonaws.services.cloudwatchevidently.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevidently.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFeatureRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFeatureRequestMarshaller {

    private static final MarshallingInfo<List> ADDORUPDATEVARIATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addOrUpdateVariations").build();
    private static final MarshallingInfo<String> DEFAULTVARIATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultVariation").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Map> ENTITYOVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityOverrides").build();
    private static final MarshallingInfo<String> EVALUATIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationStrategy").build();
    private static final MarshallingInfo<String> FEATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("feature").build();
    private static final MarshallingInfo<String> PROJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("project").build();
    private static final MarshallingInfo<List> REMOVEVARIATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("removeVariations").build();

    private static final UpdateFeatureRequestMarshaller instance = new UpdateFeatureRequestMarshaller();

    public static UpdateFeatureRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFeatureRequest updateFeatureRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFeatureRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFeatureRequest.getAddOrUpdateVariations(), ADDORUPDATEVARIATIONS_BINDING);
            protocolMarshaller.marshall(updateFeatureRequest.getDefaultVariation(), DEFAULTVARIATION_BINDING);
            protocolMarshaller.marshall(updateFeatureRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateFeatureRequest.getEntityOverrides(), ENTITYOVERRIDES_BINDING);
            protocolMarshaller.marshall(updateFeatureRequest.getEvaluationStrategy(), EVALUATIONSTRATEGY_BINDING);
            protocolMarshaller.marshall(updateFeatureRequest.getFeature(), FEATURE_BINDING);
            protocolMarshaller.marshall(updateFeatureRequest.getProject(), PROJECT_BINDING);
            protocolMarshaller.marshall(updateFeatureRequest.getRemoveVariations(), REMOVEVARIATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
