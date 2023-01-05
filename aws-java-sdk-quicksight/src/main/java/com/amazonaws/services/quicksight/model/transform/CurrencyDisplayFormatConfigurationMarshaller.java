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
 * CurrencyDisplayFormatConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CurrencyDisplayFormatConfigurationMarshaller {

    private static final MarshallingInfo<String> PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Prefix").build();
    private static final MarshallingInfo<String> SUFFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Suffix").build();
    private static final MarshallingInfo<StructuredPojo> SEPARATORCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SeparatorConfiguration").build();
    private static final MarshallingInfo<String> SYMBOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Symbol").build();
    private static final MarshallingInfo<StructuredPojo> DECIMALPLACESCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DecimalPlacesConfiguration").build();
    private static final MarshallingInfo<String> NUMBERSCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberScale").build();
    private static final MarshallingInfo<StructuredPojo> NEGATIVEVALUECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NegativeValueConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> NULLVALUEFORMATCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NullValueFormatConfiguration").build();

    private static final CurrencyDisplayFormatConfigurationMarshaller instance = new CurrencyDisplayFormatConfigurationMarshaller();

    public static CurrencyDisplayFormatConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CurrencyDisplayFormatConfiguration currencyDisplayFormatConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (currencyDisplayFormatConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(currencyDisplayFormatConfiguration.getPrefix(), PREFIX_BINDING);
            protocolMarshaller.marshall(currencyDisplayFormatConfiguration.getSuffix(), SUFFIX_BINDING);
            protocolMarshaller.marshall(currencyDisplayFormatConfiguration.getSeparatorConfiguration(), SEPARATORCONFIGURATION_BINDING);
            protocolMarshaller.marshall(currencyDisplayFormatConfiguration.getSymbol(), SYMBOL_BINDING);
            protocolMarshaller.marshall(currencyDisplayFormatConfiguration.getDecimalPlacesConfiguration(), DECIMALPLACESCONFIGURATION_BINDING);
            protocolMarshaller.marshall(currencyDisplayFormatConfiguration.getNumberScale(), NUMBERSCALE_BINDING);
            protocolMarshaller.marshall(currencyDisplayFormatConfiguration.getNegativeValueConfiguration(), NEGATIVEVALUECONFIGURATION_BINDING);
            protocolMarshaller.marshall(currencyDisplayFormatConfiguration.getNullValueFormatConfiguration(), NULLVALUEFORMATCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
