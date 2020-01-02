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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FindMatchesParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FindMatchesParametersMarshaller {

    private static final MarshallingInfo<String> PRIMARYKEYCOLUMNNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryKeyColumnName").build();
    private static final MarshallingInfo<Double> PRECISIONRECALLTRADEOFF_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrecisionRecallTradeoff").build();
    private static final MarshallingInfo<Double> ACCURACYCOSTTRADEOFF_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccuracyCostTradeoff").build();
    private static final MarshallingInfo<Boolean> ENFORCEPROVIDEDLABELS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnforceProvidedLabels").build();

    private static final FindMatchesParametersMarshaller instance = new FindMatchesParametersMarshaller();

    public static FindMatchesParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FindMatchesParameters findMatchesParameters, ProtocolMarshaller protocolMarshaller) {

        if (findMatchesParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(findMatchesParameters.getPrimaryKeyColumnName(), PRIMARYKEYCOLUMNNAME_BINDING);
            protocolMarshaller.marshall(findMatchesParameters.getPrecisionRecallTradeoff(), PRECISIONRECALLTRADEOFF_BINDING);
            protocolMarshaller.marshall(findMatchesParameters.getAccuracyCostTradeoff(), ACCURACYCOSTTRADEOFF_BINDING);
            protocolMarshaller.marshall(findMatchesParameters.getEnforceProvidedLabels(), ENFORCEPROVIDEDLABELS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
