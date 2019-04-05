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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CodeGenNode JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeGenNodeJsonUnmarshaller implements Unmarshaller<CodeGenNode, JsonUnmarshallerContext> {

    public CodeGenNode unmarshall(JsonUnmarshallerContext context) throws Exception {
        CodeGenNode codeGenNode = new CodeGenNode();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    codeGenNode.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    context.nextToken();
                    codeGenNode.setNodeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Args", targetDepth)) {
                    context.nextToken();
                    codeGenNode.setArgs(new ListUnmarshaller<CodeGenNodeArg>(CodeGenNodeArgJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("LineNumber", targetDepth)) {
                    context.nextToken();
                    codeGenNode.setLineNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return codeGenNode;
    }

    private static CodeGenNodeJsonUnmarshaller instance;

    public static CodeGenNodeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodeGenNodeJsonUnmarshaller();
        return instance;
    }
}
