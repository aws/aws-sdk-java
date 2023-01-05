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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEcrContainerAggregation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcrContainerAggregationJsonUnmarshaller implements Unmarshaller<AwsEcrContainerAggregation, JsonUnmarshallerContext> {

    public AwsEcrContainerAggregation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEcrContainerAggregation awsEcrContainerAggregation = new AwsEcrContainerAggregation();

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
                if (context.testExpression("architectures", targetDepth)) {
                    context.nextToken();
                    awsEcrContainerAggregation.setArchitectures(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("imageShas", targetDepth)) {
                    context.nextToken();
                    awsEcrContainerAggregation.setImageShas(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("imageTags", targetDepth)) {
                    context.nextToken();
                    awsEcrContainerAggregation.setImageTags(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("repositories", targetDepth)) {
                    context.nextToken();
                    awsEcrContainerAggregation.setRepositories(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resourceIds", targetDepth)) {
                    context.nextToken();
                    awsEcrContainerAggregation.setResourceIds(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("sortBy", targetDepth)) {
                    context.nextToken();
                    awsEcrContainerAggregation.setSortBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sortOrder", targetDepth)) {
                    context.nextToken();
                    awsEcrContainerAggregation.setSortOrder(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEcrContainerAggregation;
    }

    private static AwsEcrContainerAggregationJsonUnmarshaller instance;

    public static AwsEcrContainerAggregationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEcrContainerAggregationJsonUnmarshaller();
        return instance;
    }
}
