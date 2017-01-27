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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.json.*;

/**
 * BatchWriteOperationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchWriteOperationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BatchWriteOperation batchWriteOperation, StructuredJsonGenerator jsonGenerator) {

        if (batchWriteOperation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (batchWriteOperation.getCreateObject() != null) {
                jsonGenerator.writeFieldName("CreateObject");
                BatchCreateObjectJsonMarshaller.getInstance().marshall(batchWriteOperation.getCreateObject(), jsonGenerator);
            }
            if (batchWriteOperation.getAttachObject() != null) {
                jsonGenerator.writeFieldName("AttachObject");
                BatchAttachObjectJsonMarshaller.getInstance().marshall(batchWriteOperation.getAttachObject(), jsonGenerator);
            }
            if (batchWriteOperation.getDetachObject() != null) {
                jsonGenerator.writeFieldName("DetachObject");
                BatchDetachObjectJsonMarshaller.getInstance().marshall(batchWriteOperation.getDetachObject(), jsonGenerator);
            }
            if (batchWriteOperation.getUpdateObjectAttributes() != null) {
                jsonGenerator.writeFieldName("UpdateObjectAttributes");
                BatchUpdateObjectAttributesJsonMarshaller.getInstance().marshall(batchWriteOperation.getUpdateObjectAttributes(), jsonGenerator);
            }
            if (batchWriteOperation.getDeleteObject() != null) {
                jsonGenerator.writeFieldName("DeleteObject");
                BatchDeleteObjectJsonMarshaller.getInstance().marshall(batchWriteOperation.getDeleteObject(), jsonGenerator);
            }
            if (batchWriteOperation.getAddFacetToObject() != null) {
                jsonGenerator.writeFieldName("AddFacetToObject");
                BatchAddFacetToObjectJsonMarshaller.getInstance().marshall(batchWriteOperation.getAddFacetToObject(), jsonGenerator);
            }
            if (batchWriteOperation.getRemoveFacetFromObject() != null) {
                jsonGenerator.writeFieldName("RemoveFacetFromObject");
                BatchRemoveFacetFromObjectJsonMarshaller.getInstance().marshall(batchWriteOperation.getRemoveFacetFromObject(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BatchWriteOperationJsonMarshaller instance;

    public static BatchWriteOperationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchWriteOperationJsonMarshaller();
        return instance;
    }

}
