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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DocumentParameterMarshaller
 */
public class DocumentParameterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DocumentParameter documentParameter, StructuredJsonGenerator jsonGenerator) {

        if (documentParameter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (documentParameter.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(documentParameter.getName());
            }
            if (documentParameter.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(documentParameter.getType());
            }
            if (documentParameter.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(documentParameter.getDescription());
            }
            if (documentParameter.getDefaultValue() != null) {
                jsonGenerator.writeFieldName("DefaultValue").writeValue(documentParameter.getDefaultValue());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DocumentParameterJsonMarshaller instance;

    public static DocumentParameterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentParameterJsonMarshaller();
        return instance;
    }

}
