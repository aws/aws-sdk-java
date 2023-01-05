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
package com.amazonaws.services.voiceid.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.voiceid.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FraudDetectionResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FraudDetectionResultMarshaller {

    private static final MarshallingInfo<java.util.Date> AUDIOAGGREGATIONENDEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AudioAggregationEndedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> AUDIOAGGREGATIONSTARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AudioAggregationStartedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Configuration").build();
    private static final MarshallingInfo<String> DECISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Decision").build();
    private static final MarshallingInfo<String> FRAUDDETECTIONRESULTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FraudDetectionResultId").build();
    private static final MarshallingInfo<List> REASONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Reasons").build();
    private static final MarshallingInfo<StructuredPojo> RISKDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RiskDetails").build();

    private static final FraudDetectionResultMarshaller instance = new FraudDetectionResultMarshaller();

    public static FraudDetectionResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FraudDetectionResult fraudDetectionResult, ProtocolMarshaller protocolMarshaller) {

        if (fraudDetectionResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fraudDetectionResult.getAudioAggregationEndedAt(), AUDIOAGGREGATIONENDEDAT_BINDING);
            protocolMarshaller.marshall(fraudDetectionResult.getAudioAggregationStartedAt(), AUDIOAGGREGATIONSTARTEDAT_BINDING);
            protocolMarshaller.marshall(fraudDetectionResult.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(fraudDetectionResult.getDecision(), DECISION_BINDING);
            protocolMarshaller.marshall(fraudDetectionResult.getFraudDetectionResultId(), FRAUDDETECTIONRESULTID_BINDING);
            protocolMarshaller.marshall(fraudDetectionResult.getReasons(), REASONS_BINDING);
            protocolMarshaller.marshall(fraudDetectionResult.getRiskDetails(), RISKDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
