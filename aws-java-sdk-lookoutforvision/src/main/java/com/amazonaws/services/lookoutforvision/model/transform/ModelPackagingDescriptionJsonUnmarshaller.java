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
package com.amazonaws.services.lookoutforvision.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutforvision.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ModelPackagingDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelPackagingDescriptionJsonUnmarshaller implements Unmarshaller<ModelPackagingDescription, JsonUnmarshallerContext> {

    public ModelPackagingDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModelPackagingDescription modelPackagingDescription = new ModelPackagingDescription();

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
                if (context.testExpression("JobName", targetDepth)) {
                    context.nextToken();
                    modelPackagingDescription.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProjectName", targetDepth)) {
                    context.nextToken();
                    modelPackagingDescription.setProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelVersion", targetDepth)) {
                    context.nextToken();
                    modelPackagingDescription.setModelVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackagingConfiguration", targetDepth)) {
                    context.nextToken();
                    modelPackagingDescription.setModelPackagingConfiguration(ModelPackagingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelPackagingJobDescription", targetDepth)) {
                    context.nextToken();
                    modelPackagingDescription.setModelPackagingJobDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackagingMethod", targetDepth)) {
                    context.nextToken();
                    modelPackagingDescription.setModelPackagingMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackagingOutputDetails", targetDepth)) {
                    context.nextToken();
                    modelPackagingDescription.setModelPackagingOutputDetails(ModelPackagingOutputDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    modelPackagingDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    modelPackagingDescription.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTimestamp", targetDepth)) {
                    context.nextToken();
                    modelPackagingDescription.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    modelPackagingDescription.setLastUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return modelPackagingDescription;
    }

    private static ModelPackagingDescriptionJsonUnmarshaller instance;

    public static ModelPackagingDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelPackagingDescriptionJsonUnmarshaller();
        return instance;
    }
}
