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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ClarifyInferenceConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClarifyInferenceConfigMarshaller {

    private static final MarshallingInfo<String> FEATURESATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeaturesAttribute").build();
    private static final MarshallingInfo<String> CONTENTTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentTemplate").build();
    private static final MarshallingInfo<Integer> MAXRECORDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxRecordCount").build();
    private static final MarshallingInfo<Integer> MAXPAYLOADINMB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxPayloadInMB").build();
    private static final MarshallingInfo<Integer> PROBABILITYINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProbabilityIndex").build();
    private static final MarshallingInfo<Integer> LABELINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelIndex").build();
    private static final MarshallingInfo<String> PROBABILITYATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProbabilityAttribute").build();
    private static final MarshallingInfo<String> LABELATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelAttribute").build();
    private static final MarshallingInfo<List> LABELHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LabelHeaders").build();
    private static final MarshallingInfo<List> FEATUREHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeatureHeaders").build();
    private static final MarshallingInfo<List> FEATURETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FeatureTypes").build();

    private static final ClarifyInferenceConfigMarshaller instance = new ClarifyInferenceConfigMarshaller();

    public static ClarifyInferenceConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClarifyInferenceConfig clarifyInferenceConfig, ProtocolMarshaller protocolMarshaller) {

        if (clarifyInferenceConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(clarifyInferenceConfig.getFeaturesAttribute(), FEATURESATTRIBUTE_BINDING);
            protocolMarshaller.marshall(clarifyInferenceConfig.getContentTemplate(), CONTENTTEMPLATE_BINDING);
            protocolMarshaller.marshall(clarifyInferenceConfig.getMaxRecordCount(), MAXRECORDCOUNT_BINDING);
            protocolMarshaller.marshall(clarifyInferenceConfig.getMaxPayloadInMB(), MAXPAYLOADINMB_BINDING);
            protocolMarshaller.marshall(clarifyInferenceConfig.getProbabilityIndex(), PROBABILITYINDEX_BINDING);
            protocolMarshaller.marshall(clarifyInferenceConfig.getLabelIndex(), LABELINDEX_BINDING);
            protocolMarshaller.marshall(clarifyInferenceConfig.getProbabilityAttribute(), PROBABILITYATTRIBUTE_BINDING);
            protocolMarshaller.marshall(clarifyInferenceConfig.getLabelAttribute(), LABELATTRIBUTE_BINDING);
            protocolMarshaller.marshall(clarifyInferenceConfig.getLabelHeaders(), LABELHEADERS_BINDING);
            protocolMarshaller.marshall(clarifyInferenceConfig.getFeatureHeaders(), FEATUREHEADERS_BINDING);
            protocolMarshaller.marshall(clarifyInferenceConfig.getFeatureTypes(), FEATURETYPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
