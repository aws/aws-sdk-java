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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.voiceid.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EnrollmentJobFraudDetectionConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EnrollmentJobFraudDetectionConfigMarshaller {

    private static final MarshallingInfo<String> FRAUDDETECTIONACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FraudDetectionAction").build();
    private static final MarshallingInfo<Integer> RISKTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RiskThreshold").build();

    private static final EnrollmentJobFraudDetectionConfigMarshaller instance = new EnrollmentJobFraudDetectionConfigMarshaller();

    public static EnrollmentJobFraudDetectionConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EnrollmentJobFraudDetectionConfig enrollmentJobFraudDetectionConfig, ProtocolMarshaller protocolMarshaller) {

        if (enrollmentJobFraudDetectionConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(enrollmentJobFraudDetectionConfig.getFraudDetectionAction(), FRAUDDETECTIONACTION_BINDING);
            protocolMarshaller.marshall(enrollmentJobFraudDetectionConfig.getRiskThreshold(), RISKTHRESHOLD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
