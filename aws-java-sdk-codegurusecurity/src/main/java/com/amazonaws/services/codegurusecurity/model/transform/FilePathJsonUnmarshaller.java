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
package com.amazonaws.services.codegurusecurity.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codegurusecurity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FilePath JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilePathJsonUnmarshaller implements Unmarshaller<FilePath, JsonUnmarshallerContext> {

    public FilePath unmarshall(JsonUnmarshallerContext context) throws Exception {
        FilePath filePath = new FilePath();

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
                    filePath.setCodeSnippet(new ListUnmarshaller<CodeLine>(CodeLineJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("endLine", targetDepth)) {
                    context.nextToken();
                    filePath.setEndLine(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    filePath.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("path", targetDepth)) {
                    context.nextToken();
                    filePath.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startLine", targetDepth)) {
                    context.nextToken();
                    filePath.setStartLine(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return filePath;
    }

    private static FilePathJsonUnmarshaller instance;

    public static FilePathJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FilePathJsonUnmarshaller();
        return instance;
    }
}
