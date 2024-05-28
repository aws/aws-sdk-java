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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CodeSnippetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeSnippetResultJsonUnmarshaller implements Unmarshaller<CodeSnippetResult, JsonUnmarshallerContext> {

    public CodeSnippetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CodeSnippetResult codeSnippetResult = new CodeSnippetResult();

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
                if (context.testExpression("codeSnippet", targetDepth)) {
                    context.nextToken();
                    codeSnippetResult.setCodeSnippet(new ListUnmarshaller<CodeLine>(CodeLineJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("endLine", targetDepth)) {
                    context.nextToken();
                    codeSnippetResult.setEndLine(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("findingArn", targetDepth)) {
                    context.nextToken();
                    codeSnippetResult.setFindingArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startLine", targetDepth)) {
                    context.nextToken();
                    codeSnippetResult.setStartLine(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("suggestedFixes", targetDepth)) {
                    context.nextToken();
                    codeSnippetResult.setSuggestedFixes(new ListUnmarshaller<SuggestedFix>(SuggestedFixJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return codeSnippetResult;
    }

    private static CodeSnippetResultJsonUnmarshaller instance;

    public static CodeSnippetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodeSnippetResultJsonUnmarshaller();
        return instance;
    }
}
