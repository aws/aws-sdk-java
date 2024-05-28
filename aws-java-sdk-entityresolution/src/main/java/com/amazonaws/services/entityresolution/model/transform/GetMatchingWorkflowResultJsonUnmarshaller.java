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
package com.amazonaws.services.entityresolution.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.entityresolution.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetMatchingWorkflowResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMatchingWorkflowResultJsonUnmarshaller implements Unmarshaller<GetMatchingWorkflowResult, JsonUnmarshallerContext> {

    public GetMatchingWorkflowResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMatchingWorkflowResult getMatchingWorkflowResult = new GetMatchingWorkflowResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMatchingWorkflowResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getMatchingWorkflowResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getMatchingWorkflowResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("incrementalRunConfig", targetDepth)) {
                    context.nextToken();
                    getMatchingWorkflowResult.setIncrementalRunConfig(IncrementalRunConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputSourceConfig", targetDepth)) {
                    context.nextToken();
                    getMatchingWorkflowResult.setInputSourceConfig(new ListUnmarshaller<InputSource>(InputSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("outputSourceConfig", targetDepth)) {
                    context.nextToken();
                    getMatchingWorkflowResult.setOutputSourceConfig(new ListUnmarshaller<OutputSource>(OutputSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resolutionTechniques", targetDepth)) {
                    context.nextToken();
                    getMatchingWorkflowResult.setResolutionTechniques(ResolutionTechniquesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    getMatchingWorkflowResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getMatchingWorkflowResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getMatchingWorkflowResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("workflowArn", targetDepth)) {
                    context.nextToken();
                    getMatchingWorkflowResult.setWorkflowArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowName", targetDepth)) {
                    context.nextToken();
                    getMatchingWorkflowResult.setWorkflowName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMatchingWorkflowResult;
    }

    private static GetMatchingWorkflowResultJsonUnmarshaller instance;

    public static GetMatchingWorkflowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMatchingWorkflowResultJsonUnmarshaller();
        return instance;
    }
}
