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
package com.amazonaws.services.connect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EvaluationFormNumericQuestionPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EvaluationFormNumericQuestionPropertiesMarshaller {

    private static final MarshallingInfo<Integer> MINVALUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinValue").build();
    private static final MarshallingInfo<Integer> MAXVALUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxValue").build();
    private static final MarshallingInfo<List> OPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Options").build();
    private static final MarshallingInfo<StructuredPojo> AUTOMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Automation").build();

    private static final EvaluationFormNumericQuestionPropertiesMarshaller instance = new EvaluationFormNumericQuestionPropertiesMarshaller();

    public static EvaluationFormNumericQuestionPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EvaluationFormNumericQuestionProperties evaluationFormNumericQuestionProperties, ProtocolMarshaller protocolMarshaller) {

        if (evaluationFormNumericQuestionProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(evaluationFormNumericQuestionProperties.getMinValue(), MINVALUE_BINDING);
            protocolMarshaller.marshall(evaluationFormNumericQuestionProperties.getMaxValue(), MAXVALUE_BINDING);
            protocolMarshaller.marshall(evaluationFormNumericQuestionProperties.getOptions(), OPTIONS_BINDING);
            protocolMarshaller.marshall(evaluationFormNumericQuestionProperties.getAutomation(), AUTOMATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
