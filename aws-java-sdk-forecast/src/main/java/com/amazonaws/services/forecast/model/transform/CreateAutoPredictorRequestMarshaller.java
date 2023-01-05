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
package com.amazonaws.services.forecast.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAutoPredictorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAutoPredictorRequestMarshaller {

    private static final MarshallingInfo<String> PREDICTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredictorName").build();
    private static final MarshallingInfo<Integer> FORECASTHORIZON_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastHorizon").build();
    private static final MarshallingInfo<List> FORECASTTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ForecastTypes").build();
    private static final MarshallingInfo<List> FORECASTDIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastDimensions").build();
    private static final MarshallingInfo<String> FORECASTFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastFrequency").build();
    private static final MarshallingInfo<StructuredPojo> DATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataConfig").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionConfig").build();
    private static final MarshallingInfo<String> REFERENCEPREDICTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferencePredictorArn").build();
    private static final MarshallingInfo<String> OPTIMIZATIONMETRIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptimizationMetric").build();
    private static final MarshallingInfo<Boolean> EXPLAINPREDICTOR_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExplainPredictor").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<StructuredPojo> MONITORCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitorConfig").build();
    private static final MarshallingInfo<StructuredPojo> TIMEALIGNMENTBOUNDARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeAlignmentBoundary").build();

    private static final CreateAutoPredictorRequestMarshaller instance = new CreateAutoPredictorRequestMarshaller();

    public static CreateAutoPredictorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAutoPredictorRequest createAutoPredictorRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAutoPredictorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAutoPredictorRequest.getPredictorName(), PREDICTORNAME_BINDING);
            protocolMarshaller.marshall(createAutoPredictorRequest.getForecastHorizon(), FORECASTHORIZON_BINDING);
            protocolMarshaller.marshall(createAutoPredictorRequest.getForecastTypes(), FORECASTTYPES_BINDING);
            protocolMarshaller.marshall(createAutoPredictorRequest.getForecastDimensions(), FORECASTDIMENSIONS_BINDING);
            protocolMarshaller.marshall(createAutoPredictorRequest.getForecastFrequency(), FORECASTFREQUENCY_BINDING);
            protocolMarshaller.marshall(createAutoPredictorRequest.getDataConfig(), DATACONFIG_BINDING);
            protocolMarshaller.marshall(createAutoPredictorRequest.getEncryptionConfig(), ENCRYPTIONCONFIG_BINDING);
            protocolMarshaller.marshall(createAutoPredictorRequest.getReferencePredictorArn(), REFERENCEPREDICTORARN_BINDING);
            protocolMarshaller.marshall(createAutoPredictorRequest.getOptimizationMetric(), OPTIMIZATIONMETRIC_BINDING);
            protocolMarshaller.marshall(createAutoPredictorRequest.getExplainPredictor(), EXPLAINPREDICTOR_BINDING);
            protocolMarshaller.marshall(createAutoPredictorRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createAutoPredictorRequest.getMonitorConfig(), MONITORCONFIG_BINDING);
            protocolMarshaller.marshall(createAutoPredictorRequest.getTimeAlignmentBoundary(), TIMEALIGNMENTBOUNDARY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
