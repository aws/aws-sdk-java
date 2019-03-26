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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CsvClassifierMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CsvClassifierMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();
    private static final MarshallingInfo<String> DELIMITER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Delimiter").build();
    private static final MarshallingInfo<String> QUOTESYMBOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuoteSymbol").build();
    private static final MarshallingInfo<String> CONTAINSHEADER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainsHeader").build();
    private static final MarshallingInfo<List> HEADER_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Header").build();
    private static final MarshallingInfo<Boolean> DISABLEVALUETRIMMING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisableValueTrimming").build();
    private static final MarshallingInfo<Boolean> ALLOWSINGLECOLUMN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowSingleColumn").build();

    private static final CsvClassifierMarshaller instance = new CsvClassifierMarshaller();

    public static CsvClassifierMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CsvClassifier csvClassifier, ProtocolMarshaller protocolMarshaller) {

        if (csvClassifier == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(csvClassifier.getName(), NAME_BINDING);
            protocolMarshaller.marshall(csvClassifier.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(csvClassifier.getLastUpdated(), LASTUPDATED_BINDING);
            protocolMarshaller.marshall(csvClassifier.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(csvClassifier.getDelimiter(), DELIMITER_BINDING);
            protocolMarshaller.marshall(csvClassifier.getQuoteSymbol(), QUOTESYMBOL_BINDING);
            protocolMarshaller.marshall(csvClassifier.getContainsHeader(), CONTAINSHEADER_BINDING);
            protocolMarshaller.marshall(csvClassifier.getHeader(), HEADER_BINDING);
            protocolMarshaller.marshall(csvClassifier.getDisableValueTrimming(), DISABLEVALUETRIMMING_BINDING);
            protocolMarshaller.marshall(csvClassifier.getAllowSingleColumn(), ALLOWSINGLECOLUMN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
