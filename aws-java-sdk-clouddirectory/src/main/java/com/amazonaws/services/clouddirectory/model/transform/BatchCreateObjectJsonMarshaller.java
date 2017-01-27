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
 * BatchCreateObjectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateObjectJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BatchCreateObject batchCreateObject, StructuredJsonGenerator jsonGenerator) {

        if (batchCreateObject == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<SchemaFacet> schemaFacetList = batchCreateObject.getSchemaFacet();
            if (schemaFacetList != null) {
                jsonGenerator.writeFieldName("SchemaFacet");
                jsonGenerator.writeStartArray();
                for (SchemaFacet schemaFacetListValue : schemaFacetList) {
                    if (schemaFacetListValue != null) {

                        SchemaFacetJsonMarshaller.getInstance().marshall(schemaFacetListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<AttributeKeyAndValue> objectAttributeListList = batchCreateObject.getObjectAttributeList();
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
            if (batchCreateObject.getParentReference() != null) {
                jsonGenerator.writeFieldName("ParentReference");
                ObjectReferenceJsonMarshaller.getInstance().marshall(batchCreateObject.getParentReference(), jsonGenerator);
            }
            if (batchCreateObject.getLinkName() != null) {
                jsonGenerator.writeFieldName("LinkName").writeValue(batchCreateObject.getLinkName());
            }
            if (batchCreateObject.getBatchReferenceName() != null) {
                jsonGenerator.writeFieldName("BatchReferenceName").writeValue(batchCreateObject.getBatchReferenceName());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BatchCreateObjectJsonMarshaller instance;

    public static BatchCreateObjectJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchCreateObjectJsonMarshaller();
        return instance;
    }

}
