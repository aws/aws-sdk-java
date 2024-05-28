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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartTestSetGenerationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTestSetGenerationResultJsonUnmarshaller implements Unmarshaller<StartTestSetGenerationResult, JsonUnmarshallerContext> {

    public StartTestSetGenerationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartTestSetGenerationResult startTestSetGenerationResult = new StartTestSetGenerationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startTestSetGenerationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("testSetGenerationId", targetDepth)) {
                    context.nextToken();
                    startTestSetGenerationResult.setTestSetGenerationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    startTestSetGenerationResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("testSetGenerationStatus", targetDepth)) {
                    context.nextToken();
                    startTestSetGenerationResult.setTestSetGenerationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testSetName", targetDepth)) {
                    context.nextToken();
                    startTestSetGenerationResult.setTestSetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    startTestSetGenerationResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storageLocation", targetDepth)) {
                    context.nextToken();
                    startTestSetGenerationResult.setStorageLocation(TestSetStorageLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("generationDataSource", targetDepth)) {
                    context.nextToken();
                    startTestSetGenerationResult.setGenerationDataSource(TestSetGenerationDataSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    startTestSetGenerationResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testSetTags", targetDepth)) {
                    context.nextToken();
                    startTestSetGenerationResult.setTestSetTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return startTestSetGenerationResult;
    }

    private static StartTestSetGenerationResultJsonUnmarshaller instance;

    public static StartTestSetGenerationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartTestSetGenerationResultJsonUnmarshaller();
        return instance;
    }
}
