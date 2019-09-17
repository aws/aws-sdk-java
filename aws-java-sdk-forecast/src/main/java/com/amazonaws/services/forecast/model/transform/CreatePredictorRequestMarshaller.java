/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreatePredictorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreatePredictorRequestMarshaller {

    private static final MarshallingInfo<String> PREDICTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredictorName").build();
    private static final MarshallingInfo<String> ALGORITHMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlgorithmArn").build();
    private static final MarshallingInfo<Integer> FORECASTHORIZON_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastHorizon").build();
    private static final MarshallingInfo<Boolean> PERFORMAUTOML_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PerformAutoML").build();
    private static final MarshallingInfo<Boolean> PERFORMHPO_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PerformHPO").build();
    private static final MarshallingInfo<Map> TRAININGPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingParameters").build();
    private static final MarshallingInfo<StructuredPojo> EVALUATIONPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationParameters").build();
    private static final MarshallingInfo<StructuredPojo> HPOCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HPOConfig").build();
    private static final MarshallingInfo<StructuredPojo> INPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> FEATURIZATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeaturizationConfig").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionConfig").build();

    private static final CreatePredictorRequestMarshaller instance = new CreatePredictorRequestMarshaller();

    public static CreatePredictorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreatePredictorRequest createPredictorRequest, ProtocolMarshaller protocolMarshaller) {

        if (createPredictorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createPredictorRequest.getPredictorName(), PREDICTORNAME_BINDING);
            protocolMarshaller.marshall(createPredictorRequest.getAlgorithmArn(), ALGORITHMARN_BINDING);
            protocolMarshaller.marshall(createPredictorRequest.getForecastHorizon(), FORECASTHORIZON_BINDING);
            protocolMarshaller.marshall(createPredictorRequest.getPerformAutoML(), PERFORMAUTOML_BINDING);
            protocolMarshaller.marshall(createPredictorRequest.getPerformHPO(), PERFORMHPO_BINDING);
            protocolMarshaller.marshall(createPredictorRequest.getTrainingParameters(), TRAININGPARAMETERS_BINDING);
            protocolMarshaller.marshall(createPredictorRequest.getEvaluationParameters(), EVALUATIONPARAMETERS_BINDING);
            protocolMarshaller.marshall(createPredictorRequest.getHPOConfig(), HPOCONFIG_BINDING);
            protocolMarshaller.marshall(createPredictorRequest.getInputDataConfig(), INPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(createPredictorRequest.getFeaturizationConfig(), FEATURIZATIONCONFIG_BINDING);
            protocolMarshaller.marshall(createPredictorRequest.getEncryptionConfig(), ENCRYPTIONCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
