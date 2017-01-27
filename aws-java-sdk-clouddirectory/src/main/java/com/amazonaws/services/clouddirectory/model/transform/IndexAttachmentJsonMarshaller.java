/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.clouddirectory.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.json.*;

/**
 * IndexAttachmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IndexAttachmentJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(IndexAttachment indexAttachment, StructuredJsonGenerator jsonGenerator) {

        if (indexAttachment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<AttributeKeyAndValue> indexedAttributesList = indexAttachment.getIndexedAttributes();
            if (indexedAttributesList != null) {
                jsonGenerator.writeFieldName("IndexedAttributes");
                jsonGenerator.writeStartArray();
                for (AttributeKeyAndValue indexedAttributesListValue : indexedAttributesList) {
                    if (indexedAttributesListValue != null) {

                        AttributeKeyAndValueJsonMarshaller.getInstance().marshall(indexedAttributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (indexAttachment.getObjectIdentifier() != null) {
                jsonGenerator.writeFieldName("ObjectIdentifier").writeValue(indexAttachment.getObjectIdentifier());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static IndexAttachmentJsonMarshaller instance;

    public static IndexAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IndexAttachmentJsonMarshaller();
        return instance;
    }

}
