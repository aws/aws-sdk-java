/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProjectVersionDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectVersionDescriptionJsonUnmarshaller implements Unmarshaller<ProjectVersionDescription, JsonUnmarshallerContext> {

    public ProjectVersionDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProjectVersionDescription projectVersionDescription = new ProjectVersionDescription();

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
                if (context.testExpression("ProjectVersionArn", targetDepth)) {
                    context.nextToken();
                    projectVersionDescription.setProjectVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTimestamp", targetDepth)) {
                    context.nextToken();
                    projectVersionDescription.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("MinInferenceUnits", targetDepth)) {
                    context.nextToken();
                    projectVersionDescription.setMinInferenceUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    projectVersionDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    projectVersionDescription.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BillableTrainingTimeInSeconds", targetDepth)) {
                    context.nextToken();
                    projectVersionDescription.setBillableTrainingTimeInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TrainingEndTimestamp", targetDepth)) {
                    context.nextToken();
                    projectVersionDescription.setTrainingEndTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OutputConfig", targetDepth)) {
                    context.nextToken();
                    projectVersionDescription.setOutputConfig(OutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainingDataResult", targetDepth)) {
                    context.nextToken();
                    projectVersionDescription.setTrainingDataResult(TrainingDataResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TestingDataResult", targetDepth)) {
                    context.nextToken();
                    projectVersionDescription.setTestingDataResult(TestingDataResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EvaluationResult", targetDepth)) {
                    context.nextToken();
                    projectVersionDescription.setEvaluationResult(EvaluationResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return projectVersionDescription;
    }

    private static ProjectVersionDescriptionJsonUnmarshaller instance;

    public static ProjectVersionDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectVersionDescriptionJsonUnmarshaller();
        return instance;
    }
}
