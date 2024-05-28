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
package com.amazonaws.services.timestreamwrite.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreamwrite.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CsvConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CsvConfigurationMarshaller {

    private static final MarshallingInfo<String> COLUMNSEPARATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnSeparator").build();
    private static final MarshallingInfo<String> ESCAPECHAR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EscapeChar").build();
    private static final MarshallingInfo<String> QUOTECHAR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QuoteChar").build();
    private static final MarshallingInfo<String> NULLVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NullValue").build();
    private static final MarshallingInfo<Boolean> TRIMWHITESPACE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrimWhiteSpace").build();

    private static final CsvConfigurationMarshaller instance = new CsvConfigurationMarshaller();

    public static CsvConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CsvConfiguration csvConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (csvConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(csvConfiguration.getColumnSeparator(), COLUMNSEPARATOR_BINDING);
            protocolMarshaller.marshall(csvConfiguration.getEscapeChar(), ESCAPECHAR_BINDING);
            protocolMarshaller.marshall(csvConfiguration.getQuoteChar(), QUOTECHAR_BINDING);
            protocolMarshaller.marshall(csvConfiguration.getNullValue(), NULLVALUE_BINDING);
            protocolMarshaller.marshall(csvConfiguration.getTrimWhiteSpace(), TRIMWHITESPACE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
