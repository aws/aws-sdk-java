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
 * BatchUpdateObjectAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateObjectAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BatchUpdateObjectAttributes batchUpdateObjectAttributes, StructuredJsonGenerator jsonGenerator) {

        if (batchUpdateObjectAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (batchUpdateObjectAttributes.getObjectReference() != null) {
                jsonGenerator.writeFieldName("ObjectReference");
                ObjectReferenceJsonMarshaller.getInstance().marshall(batchUpdateObjectAttributes.getObjectReference(), jsonGenerator);
            }

            java.util.List<ObjectAttributeUpdate> attributeUpdatesList = batchUpdateObjectAttributes.getAttributeUpdates();
            if (attributeUpdatesList != null) {
                jsonGenerator.writeFieldName("AttributeUpdates");
                jsonGenerator.writeStartArray();
                for (ObjectAttributeUpdate attributeUpdatesListValue : attributeUpdatesList) {
                    if (attributeUpdatesListValue != null) {

                        ObjectAttributeUpdateJsonMarshaller.getInstance().marshall(attributeUpdatesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BatchUpdateObjectAttributesJsonMarshaller instance;

    public static BatchUpdateObjectAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchUpdateObjectAttributesJsonMarshaller();
        return instance;
    }

}
