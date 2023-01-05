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
package com.amazonaws.services.lookoutmetrics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DetectedCsvFormatDescriptorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DetectedCsvFormatDescriptorMarshaller {

    private static final MarshallingInfo<StructuredPojo> FILECOMPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileCompression").build();
    private static final MarshallingInfo<StructuredPojo> CHARSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Charset").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINSHEADER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainsHeader").build();
    private static final MarshallingInfo<StructuredPojo> DELIMITER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Delimiter").build();
    private static final MarshallingInfo<StructuredPojo> HEADERLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeaderList").build();
    private static final MarshallingInfo<StructuredPojo> QUOTESYMBOL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuoteSymbol").build();

    private static final DetectedCsvFormatDescriptorMarshaller instance = new DetectedCsvFormatDescriptorMarshaller();

    public static DetectedCsvFormatDescriptorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DetectedCsvFormatDescriptor detectedCsvFormatDescriptor, ProtocolMarshaller protocolMarshaller) {

        if (detectedCsvFormatDescriptor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(detectedCsvFormatDescriptor.getFileCompression(), FILECOMPRESSION_BINDING);
            protocolMarshaller.marshall(detectedCsvFormatDescriptor.getCharset(), CHARSET_BINDING);
            protocolMarshaller.marshall(detectedCsvFormatDescriptor.getContainsHeader(), CONTAINSHEADER_BINDING);
            protocolMarshaller.marshall(detectedCsvFormatDescriptor.getDelimiter(), DELIMITER_BINDING);
            protocolMarshaller.marshall(detectedCsvFormatDescriptor.getHeaderList(), HEADERLIST_BINDING);
            protocolMarshaller.marshall(detectedCsvFormatDescriptor.getQuoteSymbol(), QUOTESYMBOL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
