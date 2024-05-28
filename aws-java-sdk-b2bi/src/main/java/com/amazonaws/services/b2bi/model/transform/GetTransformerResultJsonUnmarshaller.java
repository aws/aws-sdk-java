/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.b2bi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.b2bi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetTransformerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTransformerResultJsonUnmarshaller implements Unmarshaller<GetTransformerResult, JsonUnmarshallerContext> {

    public GetTransformerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTransformerResult getTransformerResult = new GetTransformerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getTransformerResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("transformerId", targetDepth)) {
                    context.nextToken();
                    getTransformerResult.setTransformerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transformerArn", targetDepth)) {
                    context.nextToken();
                    getTransformerResult.setTransformerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getTransformerResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fileFormat", targetDepth)) {
                    context.nextToken();
                    getTransformerResult.setFileFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mappingTemplate", targetDepth)) {
                    context.nextToken();
                    getTransformerResult.setMappingTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getTransformerResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ediType", targetDepth)) {
                    context.nextToken();
                    getTransformerResult.setEdiType(EdiTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sampleDocument", targetDepth)) {
                    context.nextToken();
                    getTransformerResult.setSampleDocument(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getTransformerResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("modifiedAt", targetDepth)) {
                    context.nextToken();
                    getTransformerResult.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getTransformerResult;
    }

    private static GetTransformerResultJsonUnmarshaller instance;

    public static GetTransformerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTransformerResultJsonUnmarshaller();
        return instance;
    }
}
