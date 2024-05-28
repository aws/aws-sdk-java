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
package com.amazonaws.services.cleanrooms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DifferentialPrivacySensitivityParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DifferentialPrivacySensitivityParametersMarshaller {

    private static final MarshallingInfo<String> AGGREGATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggregationType").build();
    private static final MarshallingInfo<String> AGGREGATIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggregationExpression").build();
    private static final MarshallingInfo<Integer> USERCONTRIBUTIONLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userContributionLimit").build();
    private static final MarshallingInfo<Float> MINCOLUMNVALUE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minColumnValue").build();
    private static final MarshallingInfo<Float> MAXCOLUMNVALUE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxColumnValue").build();

    private static final DifferentialPrivacySensitivityParametersMarshaller instance = new DifferentialPrivacySensitivityParametersMarshaller();

    public static DifferentialPrivacySensitivityParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DifferentialPrivacySensitivityParameters differentialPrivacySensitivityParameters, ProtocolMarshaller protocolMarshaller) {

        if (differentialPrivacySensitivityParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(differentialPrivacySensitivityParameters.getAggregationType(), AGGREGATIONTYPE_BINDING);
            protocolMarshaller.marshall(differentialPrivacySensitivityParameters.getAggregationExpression(), AGGREGATIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(differentialPrivacySensitivityParameters.getUserContributionLimit(), USERCONTRIBUTIONLIMIT_BINDING);
            protocolMarshaller.marshall(differentialPrivacySensitivityParameters.getMinColumnValue(), MINCOLUMNVALUE_BINDING);
            protocolMarshaller.marshall(differentialPrivacySensitivityParameters.getMaxColumnValue(), MAXCOLUMNVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
