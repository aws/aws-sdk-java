/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutmetrics.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CsvFormatDescriptorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CsvFormatDescriptorMarshaller {

    private static final MarshallingInfo<String> FILECOMPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileCompression").build();
    private static final MarshallingInfo<String> CHARSET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Charset").build();
    private static final MarshallingInfo<Boolean> CONTAINSHEADER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainsHeader").build();
    private static final MarshallingInfo<String> DELIMITER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Delimiter").build();
    private static final MarshallingInfo<List> HEADERLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HeaderList").build();
    private static final MarshallingInfo<String> QUOTESYMBOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuoteSymbol").build();

    private static final CsvFormatDescriptorMarshaller instance = new CsvFormatDescriptorMarshaller();

    public static CsvFormatDescriptorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CsvFormatDescriptor csvFormatDescriptor, ProtocolMarshaller protocolMarshaller) {

        if (csvFormatDescriptor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(csvFormatDescriptor.getFileCompression(), FILECOMPRESSION_BINDING);
            protocolMarshaller.marshall(csvFormatDescriptor.getCharset(), CHARSET_BINDING);
            protocolMarshaller.marshall(csvFormatDescriptor.getContainsHeader(), CONTAINSHEADER_BINDING);
            protocolMarshaller.marshall(csvFormatDescriptor.getDelimiter(), DELIMITER_BINDING);
            protocolMarshaller.marshall(csvFormatDescriptor.getHeaderList(), HEADERLIST_BINDING);
            protocolMarshaller.marshall(csvFormatDescriptor.getQuoteSymbol(), QUOTESYMBOL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
