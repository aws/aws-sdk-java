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
 * BatchReadOperation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchReadOperationJsonUnmarshaller implements Unmarshaller<BatchReadOperation, JsonUnmarshallerContext> {

    public BatchReadOperation unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchReadOperation batchReadOperation = new BatchReadOperation();

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
                if (context.testExpression("ListObjectAttributes", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setListObjectAttributes(BatchListObjectAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListObjectChildren", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setListObjectChildren(BatchListObjectChildrenJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListAttachedIndices", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setListAttachedIndices(BatchListAttachedIndicesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListObjectParentPaths", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setListObjectParentPaths(BatchListObjectParentPathsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GetObjectInformation", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setGetObjectInformation(BatchGetObjectInformationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GetObjectAttributes", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setGetObjectAttributes(BatchGetObjectAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListObjectParents", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setListObjectParents(BatchListObjectParentsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListObjectPolicies", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setListObjectPolicies(BatchListObjectPoliciesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListPolicyAttachments", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setListPolicyAttachments(BatchListPolicyAttachmentsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LookupPolicy", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setLookupPolicy(BatchLookupPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListIndex", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setListIndex(BatchListIndexJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListOutgoingTypedLinks", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setListOutgoingTypedLinks(BatchListOutgoingTypedLinksJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListIncomingTypedLinks", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setListIncomingTypedLinks(BatchListIncomingTypedLinksJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GetLinkAttributes", targetDepth)) {
                    context.nextToken();
                    batchReadOperation.setGetLinkAttributes(BatchGetLinkAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchReadOperation;
    }

    private static BatchReadOperationJsonUnmarshaller instance;

    public static BatchReadOperationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchReadOperationJsonUnmarshaller();
        return instance;
    }
}
