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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TabularJobConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TabularJobConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> CANDIDATEGENERATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CandidateGenerationConfig").build();
    private static final MarshallingInfo<StructuredPojo> COMPLETIONCRITERIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionCriteria").build();
    private static final MarshallingInfo<String> FEATURESPECIFICATIONS3URI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeatureSpecificationS3Uri").build();
    private static final MarshallingInfo<String> MODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mode").build();
    private static final MarshallingInfo<Boolean> GENERATECANDIDATEDEFINITIONSONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenerateCandidateDefinitionsOnly").build();
    private static final MarshallingInfo<String> PROBLEMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProblemType").build();
    private static final MarshallingInfo<String> TARGETATTRIBUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetAttributeName").build();
    private static final MarshallingInfo<String> SAMPLEWEIGHTATTRIBUTENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleWeightAttributeName").build();

    private static final TabularJobConfigMarshaller instance = new TabularJobConfigMarshaller();

    public static TabularJobConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TabularJobConfig tabularJobConfig, ProtocolMarshaller protocolMarshaller) {

        if (tabularJobConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tabularJobConfig.getCandidateGenerationConfig(), CANDIDATEGENERATIONCONFIG_BINDING);
            protocolMarshaller.marshall(tabularJobConfig.getCompletionCriteria(), COMPLETIONCRITERIA_BINDING);
            protocolMarshaller.marshall(tabularJobConfig.getFeatureSpecificationS3Uri(), FEATURESPECIFICATIONS3URI_BINDING);
            protocolMarshaller.marshall(tabularJobConfig.getMode(), MODE_BINDING);
            protocolMarshaller.marshall(tabularJobConfig.getGenerateCandidateDefinitionsOnly(), GENERATECANDIDATEDEFINITIONSONLY_BINDING);
            protocolMarshaller.marshall(tabularJobConfig.getProblemType(), PROBLEMTYPE_BINDING);
            protocolMarshaller.marshall(tabularJobConfig.getTargetAttributeName(), TARGETATTRIBUTENAME_BINDING);
            protocolMarshaller.marshall(tabularJobConfig.getSampleWeightAttributeName(), SAMPLEWEIGHTATTRIBUTENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
