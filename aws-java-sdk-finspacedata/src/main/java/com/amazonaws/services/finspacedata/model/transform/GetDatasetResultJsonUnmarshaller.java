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
package com.amazonaws.services.finspacedata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspacedata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDatasetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDatasetResultJsonUnmarshaller implements Unmarshaller<GetDatasetResult, JsonUnmarshallerContext> {

    public GetDatasetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDatasetResult getDatasetResult = new GetDatasetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDatasetResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("datasetId", targetDepth)) {
                    context.nextToken();
                    getDatasetResult.setDatasetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetArn", targetDepth)) {
                    context.nextToken();
                    getDatasetResult.setDatasetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetTitle", targetDepth)) {
                    context.nextToken();
                    getDatasetResult.setDatasetTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kind", targetDepth)) {
                    context.nextToken();
                    getDatasetResult.setKind(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetDescription", targetDepth)) {
                    context.nextToken();
                    getDatasetResult.setDatasetDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    getDatasetResult.setCreateTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    context.nextToken();
                    getDatasetResult.setLastModifiedTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("schemaDefinition", targetDepth)) {
                    context.nextToken();
                    getDatasetResult.setSchemaDefinition(SchemaUnionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("alias", targetDepth)) {
                    context.nextToken();
                    getDatasetResult.setAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getDatasetResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getDatasetResult;
    }

    private static GetDatasetResultJsonUnmarshaller instance;

    public static GetDatasetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDatasetResultJsonUnmarshaller();
        return instance;
    }
}
