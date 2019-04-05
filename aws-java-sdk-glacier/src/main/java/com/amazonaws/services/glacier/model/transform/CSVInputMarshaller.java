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
package com.amazonaws.services.glacier.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glacier.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CSVInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CSVInputMarshaller {

    private static final MarshallingInfo<String> FILEHEADERINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileHeaderInfo").build();
    private static final MarshallingInfo<String> COMMENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Comments").build();
    private static final MarshallingInfo<String> QUOTEESCAPECHARACTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuoteEscapeCharacter").build();
    private static final MarshallingInfo<String> RECORDDELIMITER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordDelimiter").build();
    private static final MarshallingInfo<String> FIELDDELIMITER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldDelimiter").build();
    private static final MarshallingInfo<String> QUOTECHARACTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuoteCharacter").build();

    private static final CSVInputMarshaller instance = new CSVInputMarshaller();

    public static CSVInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CSVInput cSVInput, ProtocolMarshaller protocolMarshaller) {

        if (cSVInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cSVInput.getFileHeaderInfo(), FILEHEADERINFO_BINDING);
            protocolMarshaller.marshall(cSVInput.getComments(), COMMENTS_BINDING);
            protocolMarshaller.marshall(cSVInput.getQuoteEscapeCharacter(), QUOTEESCAPECHARACTER_BINDING);
            protocolMarshaller.marshall(cSVInput.getRecordDelimiter(), RECORDDELIMITER_BINDING);
            protocolMarshaller.marshall(cSVInput.getFieldDelimiter(), FIELDDELIMITER_BINDING);
            protocolMarshaller.marshall(cSVInput.getQuoteCharacter(), QUOTECHARACTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
