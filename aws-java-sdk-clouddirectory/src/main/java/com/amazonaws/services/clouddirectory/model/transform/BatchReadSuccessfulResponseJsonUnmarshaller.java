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
 * BatchReadSuccessfulResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchReadSuccessfulResponseJsonUnmarshaller implements Unmarshaller<BatchReadSuccessfulResponse, JsonUnmarshallerContext> {

    public BatchReadSuccessfulResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchReadSuccessfulResponse batchReadSuccessfulResponse = new BatchReadSuccessfulResponse();

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
                    batchReadSuccessfulResponse.setListObjectAttributes(BatchListObjectAttributesResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListObjectChildren", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse.setListObjectChildren(BatchListObjectChildrenResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GetObjectInformation", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse.setGetObjectInformation(BatchGetObjectInformationResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GetObjectAttributes", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse.setGetObjectAttributes(BatchGetObjectAttributesResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListAttachedIndices", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse.setListAttachedIndices(BatchListAttachedIndicesResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListObjectParentPaths", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse.setListObjectParentPaths(BatchListObjectParentPathsResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListObjectPolicies", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse.setListObjectPolicies(BatchListObjectPoliciesResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListPolicyAttachments", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse.setListPolicyAttachments(BatchListPolicyAttachmentsResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LookupPolicy", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse.setLookupPolicy(BatchLookupPolicyResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListIndex", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse.setListIndex(BatchListIndexResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListOutgoingTypedLinks", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse
                            .setListOutgoingTypedLinks(BatchListOutgoingTypedLinksResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListIncomingTypedLinks", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse
                            .setListIncomingTypedLinks(BatchListIncomingTypedLinksResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GetLinkAttributes", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse.setGetLinkAttributes(BatchGetLinkAttributesResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ListObjectParents", targetDepth)) {
                    context.nextToken();
                    batchReadSuccessfulResponse.setListObjectParents(BatchListObjectParentsResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchReadSuccessfulResponse;
    }

    private static BatchReadSuccessfulResponseJsonUnmarshaller instance;

    public static BatchReadSuccessfulResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchReadSuccessfulResponseJsonUnmarshaller();
        return instance;
    }
}
