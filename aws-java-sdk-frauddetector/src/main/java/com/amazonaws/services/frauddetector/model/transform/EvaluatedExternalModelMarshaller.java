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
package com.amazonaws.services.frauddetector.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EvaluatedExternalModelMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EvaluatedExternalModelMarshaller {

    private static final MarshallingInfo<String> MODELENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelEndpoint").build();
    private static final MarshallingInfo<Boolean> USEEVENTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("useEventVariables").build();
    private static final MarshallingInfo<Map> INPUTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputVariables").build();
    private static final MarshallingInfo<Map> OUTPUTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("outputVariables").build();

    private static final EvaluatedExternalModelMarshaller instance = new EvaluatedExternalModelMarshaller();

    public static EvaluatedExternalModelMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EvaluatedExternalModel evaluatedExternalModel, ProtocolMarshaller protocolMarshaller) {

        if (evaluatedExternalModel == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(evaluatedExternalModel.getModelEndpoint(), MODELENDPOINT_BINDING);
            protocolMarshaller.marshall(evaluatedExternalModel.getUseEventVariables(), USEEVENTVARIABLES_BINDING);
            protocolMarshaller.marshall(evaluatedExternalModel.getInputVariables(), INPUTVARIABLES_BINDING);
            protocolMarshaller.marshall(evaluatedExternalModel.getOutputVariables(), OUTPUTVARIABLES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
