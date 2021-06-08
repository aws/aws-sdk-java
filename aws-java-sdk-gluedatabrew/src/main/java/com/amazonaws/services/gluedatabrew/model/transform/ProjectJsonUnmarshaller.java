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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gluedatabrew.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Project JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectJsonUnmarshaller implements Unmarshaller<Project, JsonUnmarshallerContext> {

    public Project unmarshall(JsonUnmarshallerContext context) throws Exception {
        Project project = new Project();

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
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    project.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateDate", targetDepth)) {
                    context.nextToken();
                    project.setCreateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    project.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetName", targetDepth)) {
                    context.nextToken();
                    project.setDatasetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    project.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    project.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    project.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecipeName", targetDepth)) {
                    context.nextToken();
                    project.setRecipeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    project.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sample", targetDepth)) {
                    context.nextToken();
                    project.setSample(SampleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    project.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    project.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OpenedBy", targetDepth)) {
                    context.nextToken();
                    project.setOpenedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OpenDate", targetDepth)) {
                    context.nextToken();
                    project.setOpenDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return project;
    }

    private static ProjectJsonUnmarshaller instance;

    public static ProjectJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectJsonUnmarshaller();
        return instance;
    }
}
