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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AggregateEvaluationResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AggregateEvaluationResultMarshaller {

    private static final MarshallingInfo<StructuredPojo> EVALUATIONRESULTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationResultIdentifier").build();
    private static final MarshallingInfo<String> COMPLIANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceType").build();
    private static final MarshallingInfo<java.util.Date> RESULTRECORDEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultRecordedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CONFIGRULEINVOKEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigRuleInvokedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ANNOTATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Annotation").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> AWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AwsRegion").build();

    private static final AggregateEvaluationResultMarshaller instance = new AggregateEvaluationResultMarshaller();

    public static AggregateEvaluationResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AggregateEvaluationResult aggregateEvaluationResult, ProtocolMarshaller protocolMarshaller) {

        if (aggregateEvaluationResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aggregateEvaluationResult.getEvaluationResultIdentifier(), EVALUATIONRESULTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(aggregateEvaluationResult.getComplianceType(), COMPLIANCETYPE_BINDING);
            protocolMarshaller.marshall(aggregateEvaluationResult.getResultRecordedTime(), RESULTRECORDEDTIME_BINDING);
            protocolMarshaller.marshall(aggregateEvaluationResult.getConfigRuleInvokedTime(), CONFIGRULEINVOKEDTIME_BINDING);
            protocolMarshaller.marshall(aggregateEvaluationResult.getAnnotation(), ANNOTATION_BINDING);
            protocolMarshaller.marshall(aggregateEvaluationResult.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(aggregateEvaluationResult.getAwsRegion(), AWSREGION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
