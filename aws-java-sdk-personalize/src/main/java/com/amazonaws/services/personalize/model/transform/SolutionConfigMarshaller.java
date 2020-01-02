/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.personalize.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SolutionConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SolutionConfigMarshaller {

    private static final MarshallingInfo<String> EVENTVALUETHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventValueThreshold").build();
    private static final MarshallingInfo<StructuredPojo> HPOCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hpoConfig").build();
    private static final MarshallingInfo<Map> ALGORITHMHYPERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("algorithmHyperParameters").build();
    private static final MarshallingInfo<Map> FEATURETRANSFORMATIONPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("featureTransformationParameters").build();
    private static final MarshallingInfo<StructuredPojo> AUTOMLCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoMLConfig").build();

    private static final SolutionConfigMarshaller instance = new SolutionConfigMarshaller();

    public static SolutionConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SolutionConfig solutionConfig, ProtocolMarshaller protocolMarshaller) {

        if (solutionConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(solutionConfig.getEventValueThreshold(), EVENTVALUETHRESHOLD_BINDING);
            protocolMarshaller.marshall(solutionConfig.getHpoConfig(), HPOCONFIG_BINDING);
            protocolMarshaller.marshall(solutionConfig.getAlgorithmHyperParameters(), ALGORITHMHYPERPARAMETERS_BINDING);
            protocolMarshaller.marshall(solutionConfig.getFeatureTransformationParameters(), FEATURETRANSFORMATIONPARAMETERS_BINDING);
            protocolMarshaller.marshall(solutionConfig.getAutoMLConfig(), AUTOMLCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
