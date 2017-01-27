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
 * BatchAddFacetToObjectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAddFacetToObjectJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BatchAddFacetToObject batchAddFacetToObject, StructuredJsonGenerator jsonGenerator) {

        if (batchAddFacetToObject == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (batchAddFacetToObject.getSchemaFacet() != null) {
                jsonGenerator.writeFieldName("SchemaFacet");
                SchemaFacetJsonMarshaller.getInstance().marshall(batchAddFacetToObject.getSchemaFacet(), jsonGenerator);
            }

            java.util.List<AttributeKeyAndValue> objectAttributeListList = batchAddFacetToObject.getObjectAttributeList();
            if (objectAttributeListList != null) {
                jsonGenerator.writeFieldName("ObjectAttributeList");
                jsonGenerator.writeStartArray();
                for (AttributeKeyAndValue objectAttributeListListValue : objectAttributeListList) {
                    if (objectAttributeListListValue != null) {

                        AttributeKeyAndValueJsonMarshaller.getInstance().marshall(objectAttributeListListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (batchAddFacetToObject.getObjectReference() != null) {
                jsonGenerator.writeFieldName("ObjectReference");
                ObjectReferenceJsonMarshaller.getInstance().marshall(batchAddFacetToObject.getObjectReference(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BatchAddFacetToObjectJsonMarshaller instance;

    public static BatchAddFacetToObjectJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchAddFacetToObjectJsonMarshaller();
        return instance;
    }

}
