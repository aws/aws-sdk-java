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
package com.amazonaws.services.omics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.omics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReadOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReadOptionsMarshaller {

    private static final MarshallingInfo<String> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("comment").build();
    private static final MarshallingInfo<String> ENCODING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("encoding").build();
    private static final MarshallingInfo<String> ESCAPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("escape").build();
    private static final MarshallingInfo<Boolean> ESCAPEQUOTES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("escapeQuotes").build();
    private static final MarshallingInfo<Boolean> HEADER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("header").build();
    private static final MarshallingInfo<String> LINESEP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lineSep").build();
    private static final MarshallingInfo<String> QUOTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("quote").build();
    private static final MarshallingInfo<Boolean> QUOTEALL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("quoteAll").build();
    private static final MarshallingInfo<String> SEP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sep").build();

    private static final ReadOptionsMarshaller instance = new ReadOptionsMarshaller();

    public static ReadOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReadOptions readOptions, ProtocolMarshaller protocolMarshaller) {

        if (readOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(readOptions.getComment(), COMMENT_BINDING);
            protocolMarshaller.marshall(readOptions.getEncoding(), ENCODING_BINDING);
            protocolMarshaller.marshall(readOptions.getEscape(), ESCAPE_BINDING);
            protocolMarshaller.marshall(readOptions.getEscapeQuotes(), ESCAPEQUOTES_BINDING);
            protocolMarshaller.marshall(readOptions.getHeader(), HEADER_BINDING);
            protocolMarshaller.marshall(readOptions.getLineSep(), LINESEP_BINDING);
            protocolMarshaller.marshall(readOptions.getQuote(), QUOTE_BINDING);
            protocolMarshaller.marshall(readOptions.getQuoteAll(), QUOTEALL_BINDING);
            protocolMarshaller.marshall(readOptions.getSep(), SEP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
