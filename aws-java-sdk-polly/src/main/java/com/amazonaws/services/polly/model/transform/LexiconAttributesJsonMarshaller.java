/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.polly.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.polly.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * LexiconAttributesMarshaller
 */
public class LexiconAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(LexiconAttributes lexiconAttributes, StructuredJsonGenerator jsonGenerator) {

        if (lexiconAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (lexiconAttributes.getAlphabet() != null) {
                jsonGenerator.writeFieldName("Alphabet").writeValue(lexiconAttributes.getAlphabet());
            }
            if (lexiconAttributes.getLanguageCode() != null) {
                jsonGenerator.writeFieldName("LanguageCode").writeValue(lexiconAttributes.getLanguageCode());
            }
            if (lexiconAttributes.getLastModified() != null) {
                jsonGenerator.writeFieldName("LastModified").writeValue(lexiconAttributes.getLastModified());
            }
            if (lexiconAttributes.getLexiconArn() != null) {
                jsonGenerator.writeFieldName("LexiconArn").writeValue(lexiconAttributes.getLexiconArn());
            }
            if (lexiconAttributes.getLexemesCount() != null) {
                jsonGenerator.writeFieldName("LexemesCount").writeValue(lexiconAttributes.getLexemesCount());
            }
            if (lexiconAttributes.getSize() != null) {
                jsonGenerator.writeFieldName("Size").writeValue(lexiconAttributes.getSize());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LexiconAttributesJsonMarshaller instance;

    public static LexiconAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LexiconAttributesJsonMarshaller();
        return instance;
    }

}
