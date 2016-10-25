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
 * DocumentDescriptionMarshaller
 */
public class DocumentDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DocumentDescription documentDescription, StructuredJsonGenerator jsonGenerator) {

        if (documentDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (documentDescription.getSha1() != null) {
                jsonGenerator.writeFieldName("Sha1").writeValue(documentDescription.getSha1());
            }
            if (documentDescription.getHash() != null) {
                jsonGenerator.writeFieldName("Hash").writeValue(documentDescription.getHash());
            }
            if (documentDescription.getHashType() != null) {
                jsonGenerator.writeFieldName("HashType").writeValue(documentDescription.getHashType());
            }
            if (documentDescription.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(documentDescription.getName());
            }
            if (documentDescription.getOwner() != null) {
                jsonGenerator.writeFieldName("Owner").writeValue(documentDescription.getOwner());
            }
            if (documentDescription.getCreatedDate() != null) {
                jsonGenerator.writeFieldName("CreatedDate").writeValue(documentDescription.getCreatedDate());
            }
            if (documentDescription.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(documentDescription.getStatus());
            }
            if (documentDescription.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(documentDescription.getDescription());
            }

            com.amazonaws.internal.SdkInternalList<DocumentParameter> parametersList = (com.amazonaws.internal.SdkInternalList<DocumentParameter>) documentDescription
                    .getParameters();
            if (!parametersList.isEmpty() || !parametersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Parameters");
                jsonGenerator.writeStartArray();
                for (DocumentParameter parametersListValue : parametersList) {
                    if (parametersListValue != null) {

                        DocumentParameterJsonMarshaller.getInstance().marshall(parametersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> platformTypesList = (com.amazonaws.internal.SdkInternalList<String>) documentDescription
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

    private static DocumentDescriptionJsonMarshaller instance;

    public static DocumentDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentDescriptionJsonMarshaller();
        return instance;
    }

}
