/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Runbook JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunbookJsonUnmarshaller implements Unmarshaller<Runbook, JsonUnmarshallerContext> {

    public Runbook unmarshall(JsonUnmarshallerContext context) throws Exception {
        Runbook runbook = new Runbook();

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
                if (context.testExpression("DocumentName", targetDepth)) {
                    context.nextToken();
                    runbook.setDocumentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    context.nextToken();
                    runbook.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    runbook.setParameters(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("TargetParameterName", targetDepth)) {
                    context.nextToken();
                    runbook.setTargetParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    context.nextToken();
                    runbook.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MaxConcurrency", targetDepth)) {
                    context.nextToken();
                    runbook.setMaxConcurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxErrors", targetDepth)) {
                    context.nextToken();
                    runbook.setMaxErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetLocations", targetDepth)) {
                    context.nextToken();
                    runbook.setTargetLocations(new ListUnmarshaller<TargetLocation>(TargetLocationJsonUnmarshaller.getInstance())

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

        return runbook;
    }

    private static RunbookJsonUnmarshaller instance;

    public static RunbookJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RunbookJsonUnmarshaller();
        return instance;
    }
}
