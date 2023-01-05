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
 * FeatureMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FeatureMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DEFAULTVARIATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultVariation").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Map> ENTITYOVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityOverrides").build();
    private static final MarshallingInfo<List> EVALUATIONRULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationRules").build();
    private static final MarshallingInfo<String> EVALUATIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationStrategy").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PROJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("project").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> VALUETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("valueType").build();
    private static final MarshallingInfo<List> VARIATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("variations").build();

    private static final FeatureMarshaller instance = new FeatureMarshaller();

    public static FeatureMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Feature feature, ProtocolMarshaller protocolMarshaller) {

        if (feature == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(feature.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(feature.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(feature.getDefaultVariation(), DEFAULTVARIATION_BINDING);
            protocolMarshaller.marshall(feature.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(feature.getEntityOverrides(), ENTITYOVERRIDES_BINDING);
            protocolMarshaller.marshall(feature.getEvaluationRules(), EVALUATIONRULES_BINDING);
            protocolMarshaller.marshall(feature.getEvaluationStrategy(), EVALUATIONSTRATEGY_BINDING);
            protocolMarshaller.marshall(feature.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
            protocolMarshaller.marshall(feature.getName(), NAME_BINDING);
            protocolMarshaller.marshall(feature.getProject(), PROJECT_BINDING);
            protocolMarshaller.marshall(feature.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(feature.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(feature.getValueType(), VALUETYPE_BINDING);
            protocolMarshaller.marshall(feature.getVariations(), VARIATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
