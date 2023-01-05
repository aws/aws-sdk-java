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
 * NumberDisplayFormatConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NumberDisplayFormatConfigurationMarshaller {

    private static final MarshallingInfo<String> PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Prefix").build();
    private static final MarshallingInfo<String> SUFFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Suffix").build();
    private static final MarshallingInfo<StructuredPojo> SEPARATORCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SeparatorConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DECIMALPLACESCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DecimalPlacesConfiguration").build();
    private static final MarshallingInfo<String> NUMBERSCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberScale").build();
    private static final MarshallingInfo<StructuredPojo> NEGATIVEVALUECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NegativeValueConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> NULLVALUEFORMATCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NullValueFormatConfiguration").build();

    private static final NumberDisplayFormatConfigurationMarshaller instance = new NumberDisplayFormatConfigurationMarshaller();

    public static NumberDisplayFormatConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NumberDisplayFormatConfiguration numberDisplayFormatConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (numberDisplayFormatConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(numberDisplayFormatConfiguration.getPrefix(), PREFIX_BINDING);
            protocolMarshaller.marshall(numberDisplayFormatConfiguration.getSuffix(), SUFFIX_BINDING);
            protocolMarshaller.marshall(numberDisplayFormatConfiguration.getSeparatorConfiguration(), SEPARATORCONFIGURATION_BINDING);
            protocolMarshaller.marshall(numberDisplayFormatConfiguration.getDecimalPlacesConfiguration(), DECIMALPLACESCONFIGURATION_BINDING);
            protocolMarshaller.marshall(numberDisplayFormatConfiguration.getNumberScale(), NUMBERSCALE_BINDING);
            protocolMarshaller.marshall(numberDisplayFormatConfiguration.getNegativeValueConfiguration(), NEGATIVEVALUECONFIGURATION_BINDING);
            protocolMarshaller.marshall(numberDisplayFormatConfiguration.getNullValueFormatConfiguration(), NULLVALUEFORMATCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
