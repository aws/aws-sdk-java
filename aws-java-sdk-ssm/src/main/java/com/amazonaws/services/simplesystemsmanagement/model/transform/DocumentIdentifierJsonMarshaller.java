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
 * DocumentIdentifierMarshaller
 */
public class DocumentIdentifierJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DocumentIdentifier documentIdentifier, StructuredJsonGenerator jsonGenerator) {

        if (documentIdentifier == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (documentIdentifier.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(documentIdentifier.getName());
            }
            if (documentIdentifier.getOwner() != null) {
                jsonGenerator.writeFieldName("Owner").writeValue(documentIdentifier.getOwner());
            }

            com.amazonaws.internal.SdkInternalList<String> platformTypesList = (com.amazonaws.internal.SdkInternalList<String>) documentIdentifier
                    .getPlatformTypes();
            if (!platformTypesList.isEmpty() || !platformTypesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("PlatformTypes");
                jsonGenerator.writeStartArray();
                for (String platformTypesListValue : platformTypesList) {
                    if (platformTypesListValue != null) {
                        jsonGenerator.writeValue(platformTypesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DocumentIdentifierJsonMarshaller instance;

    public static DocumentIdentifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentIdentifierJsonMarshaller();
        return instance;
    }

}
