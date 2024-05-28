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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplifyuibuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartCodegenJobData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCodegenJobDataJsonUnmarshaller implements Unmarshaller<StartCodegenJobData, JsonUnmarshallerContext> {

    public StartCodegenJobData unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartCodegenJobData startCodegenJobData = new StartCodegenJobData();

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
                if (context.testExpression("renderConfig", targetDepth)) {
                    context.nextToken();
                    startCodegenJobData.setRenderConfig(CodegenJobRenderConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("genericDataSchema", targetDepth)) {
                    context.nextToken();
                    startCodegenJobData.setGenericDataSchema(CodegenJobGenericDataSchemaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("autoGenerateForms", targetDepth)) {
                    context.nextToken();
                    startCodegenJobData.setAutoGenerateForms(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("features", targetDepth)) {
                    context.nextToken();
                    startCodegenJobData.setFeatures(CodegenFeatureFlagsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    startCodegenJobData.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return startCodegenJobData;
    }

    private static StartCodegenJobDataJsonUnmarshaller instance;

    public static StartCodegenJobDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartCodegenJobDataJsonUnmarshaller();
        return instance;
    }
}
