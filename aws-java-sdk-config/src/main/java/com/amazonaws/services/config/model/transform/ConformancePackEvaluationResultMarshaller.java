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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConformancePackEvaluationResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConformancePackEvaluationResultMarshaller {

    private static final MarshallingInfo<String> COMPLIANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceType").build();
    private static final MarshallingInfo<StructuredPojo> EVALUATIONRESULTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationResultIdentifier").build();
    private static final MarshallingInfo<java.util.Date> CONFIGRULEINVOKEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigRuleInvokedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> RESULTRECORDEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultRecordedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ANNOTATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Annotation").build();

    private static final ConformancePackEvaluationResultMarshaller instance = new ConformancePackEvaluationResultMarshaller();

    public static ConformancePackEvaluationResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConformancePackEvaluationResult conformancePackEvaluationResult, ProtocolMarshaller protocolMarshaller) {

        if (conformancePackEvaluationResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(conformancePackEvaluationResult.getComplianceType(), COMPLIANCETYPE_BINDING);
            protocolMarshaller.marshall(conformancePackEvaluationResult.getEvaluationResultIdentifier(), EVALUATIONRESULTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(conformancePackEvaluationResult.getConfigRuleInvokedTime(), CONFIGRULEINVOKEDTIME_BINDING);
            protocolMarshaller.marshall(conformancePackEvaluationResult.getResultRecordedTime(), RESULTRECORDEDTIME_BINDING);
            protocolMarshaller.marshall(conformancePackEvaluationResult.getAnnotation(), ANNOTATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
