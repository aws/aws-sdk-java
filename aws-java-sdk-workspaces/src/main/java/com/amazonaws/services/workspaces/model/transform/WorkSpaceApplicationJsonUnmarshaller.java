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
package com.amazonaws.services.workspaces.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkSpaceApplication JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkSpaceApplicationJsonUnmarshaller implements Unmarshaller<WorkSpaceApplication, JsonUnmarshallerContext> {

    public WorkSpaceApplication unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkSpaceApplication workSpaceApplication = new WorkSpaceApplication();

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
                if (context.testExpression("ApplicationId", targetDepth)) {
                    context.nextToken();
                    workSpaceApplication.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Created", targetDepth)) {
                    context.nextToken();
                    workSpaceApplication.setCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    workSpaceApplication.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseType", targetDepth)) {
                    context.nextToken();
                    workSpaceApplication.setLicenseType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    workSpaceApplication.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    context.nextToken();
                    workSpaceApplication.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    workSpaceApplication.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SupportedComputeTypeNames", targetDepth)) {
                    context.nextToken();
                    workSpaceApplication.setSupportedComputeTypeNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SupportedOperatingSystemNames", targetDepth)) {
                    context.nextToken();
                    workSpaceApplication.setSupportedOperatingSystemNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return workSpaceApplication;
    }

    private static WorkSpaceApplicationJsonUnmarshaller instance;

    public static WorkSpaceApplicationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkSpaceApplicationJsonUnmarshaller();
        return instance;
    }
}
