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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KPIOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KPIOptionsMarshaller {

    private static final MarshallingInfo<StructuredPojo> PROGRESSBAR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProgressBar").build();
    private static final MarshallingInfo<StructuredPojo> TRENDARROWS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrendArrows").build();
    private static final MarshallingInfo<StructuredPojo> SECONDARYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondaryValue").build();
    private static final MarshallingInfo<StructuredPojo> COMPARISON_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Comparison").build();
    private static final MarshallingInfo<String> PRIMARYVALUEDISPLAYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryValueDisplayType").build();
    private static final MarshallingInfo<StructuredPojo> PRIMARYVALUEFONTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryValueFontConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SECONDARYVALUEFONTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondaryValueFontConfiguration").build();

    private static final KPIOptionsMarshaller instance = new KPIOptionsMarshaller();

    public static KPIOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KPIOptions kPIOptions, ProtocolMarshaller protocolMarshaller) {

        if (kPIOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kPIOptions.getProgressBar(), PROGRESSBAR_BINDING);
            protocolMarshaller.marshall(kPIOptions.getTrendArrows(), TRENDARROWS_BINDING);
            protocolMarshaller.marshall(kPIOptions.getSecondaryValue(), SECONDARYVALUE_BINDING);
            protocolMarshaller.marshall(kPIOptions.getComparison(), COMPARISON_BINDING);
            protocolMarshaller.marshall(kPIOptions.getPrimaryValueDisplayType(), PRIMARYVALUEDISPLAYTYPE_BINDING);
            protocolMarshaller.marshall(kPIOptions.getPrimaryValueFontConfiguration(), PRIMARYVALUEFONTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(kPIOptions.getSecondaryValueFontConfiguration(), SECONDARYVALUEFONTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
