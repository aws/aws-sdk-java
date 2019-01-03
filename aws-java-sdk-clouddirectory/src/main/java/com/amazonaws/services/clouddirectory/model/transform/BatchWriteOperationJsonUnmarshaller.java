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
package com.amazonaws.services.clouddirectory.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.clouddirectory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchWriteOperation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchWriteOperationJsonUnmarshaller implements Unmarshaller<BatchWriteOperation, JsonUnmarshallerContext> {

    public BatchWriteOperation unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchWriteOperation batchWriteOperation = new BatchWriteOperation();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreateObject", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setCreateObject(BatchCreateObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AttachObject", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setAttachObject(BatchAttachObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DetachObject", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setDetachObject(BatchDetachObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UpdateObjectAttributes", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setUpdateObjectAttributes(BatchUpdateObjectAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeleteObject", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setDeleteObject(BatchDeleteObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AddFacetToObject", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setAddFacetToObject(BatchAddFacetToObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RemoveFacetFromObject", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setRemoveFacetFromObject(BatchRemoveFacetFromObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AttachPolicy", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setAttachPolicy(BatchAttachPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DetachPolicy", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setDetachPolicy(BatchDetachPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreateIndex", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setCreateIndex(BatchCreateIndexJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AttachToIndex", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setAttachToIndex(BatchAttachToIndexJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DetachFromIndex", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setDetachFromIndex(BatchDetachFromIndexJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AttachTypedLink", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setAttachTypedLink(BatchAttachTypedLinkJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DetachTypedLink", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setDetachTypedLink(BatchDetachTypedLinkJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UpdateLinkAttributes", targetDepth)) {
                    context.nextToken();
                    batchWriteOperation.setUpdateLinkAttributes(BatchUpdateLinkAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchWriteOperation;
    }

    private static BatchWriteOperationJsonUnmarshaller instance;

    public static BatchWriteOperationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchWriteOperationJsonUnmarshaller();
        return instance;
    }
}
