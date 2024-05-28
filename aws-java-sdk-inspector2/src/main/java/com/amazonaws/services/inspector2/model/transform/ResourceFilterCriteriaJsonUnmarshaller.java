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
 * ResourceFilterCriteria JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceFilterCriteriaJsonUnmarshaller implements Unmarshaller<ResourceFilterCriteria, JsonUnmarshallerContext> {

    public ResourceFilterCriteria unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceFilterCriteria resourceFilterCriteria = new ResourceFilterCriteria();

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
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    resourceFilterCriteria.setAccountId(new ListUnmarshaller<ResourceStringFilter>(ResourceStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ec2InstanceTags", targetDepth)) {
                    context.nextToken();
                    resourceFilterCriteria.setEc2InstanceTags(new ListUnmarshaller<ResourceMapFilter>(ResourceMapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ecrImageTags", targetDepth)) {
                    context.nextToken();
                    resourceFilterCriteria.setEcrImageTags(new ListUnmarshaller<ResourceStringFilter>(ResourceStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ecrRepositoryName", targetDepth)) {
                    context.nextToken();
                    resourceFilterCriteria.setEcrRepositoryName(new ListUnmarshaller<ResourceStringFilter>(ResourceStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionName", targetDepth)) {
                    context.nextToken();
                    resourceFilterCriteria.setLambdaFunctionName(new ListUnmarshaller<ResourceStringFilter>(ResourceStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionTags", targetDepth)) {
                    context.nextToken();
                    resourceFilterCriteria.setLambdaFunctionTags(new ListUnmarshaller<ResourceMapFilter>(ResourceMapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    context.nextToken();
                    resourceFilterCriteria.setResourceId(new ListUnmarshaller<ResourceStringFilter>(ResourceStringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    resourceFilterCriteria.setResourceType(new ListUnmarshaller<ResourceStringFilter>(ResourceStringFilterJsonUnmarshaller.getInstance())

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

        return resourceFilterCriteria;
    }

    private static ResourceFilterCriteriaJsonUnmarshaller instance;

    public static ResourceFilterCriteriaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceFilterCriteriaJsonUnmarshaller();
        return instance;
    }
}
