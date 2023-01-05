/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dataexchange.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RevokeRevisionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeRevisionResultJsonUnmarshaller implements Unmarshaller<RevokeRevisionResult, JsonUnmarshallerContext> {

    public RevokeRevisionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RevokeRevisionResult revokeRevisionResult = new RevokeRevisionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return revokeRevisionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    revokeRevisionResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Comment", targetDepth)) {
                    context.nextToken();
                    revokeRevisionResult.setComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    revokeRevisionResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("DataSetId", targetDepth)) {
                    context.nextToken();
                    revokeRevisionResult.setDataSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Finalized", targetDepth)) {
                    context.nextToken();
                    revokeRevisionResult.setFinalized(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    revokeRevisionResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceId", targetDepth)) {
                    context.nextToken();
                    revokeRevisionResult.setSourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    revokeRevisionResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("RevocationComment", targetDepth)) {
                    context.nextToken();
                    revokeRevisionResult.setRevocationComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Revoked", targetDepth)) {
                    context.nextToken();
                    revokeRevisionResult.setRevoked(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RevokedAt", targetDepth)) {
                    context.nextToken();
                    revokeRevisionResult.setRevokedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return revokeRevisionResult;
    }

    private static RevokeRevisionResultJsonUnmarshaller instance;

    public static RevokeRevisionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RevokeRevisionResultJsonUnmarshaller();
        return instance;
    }
}
