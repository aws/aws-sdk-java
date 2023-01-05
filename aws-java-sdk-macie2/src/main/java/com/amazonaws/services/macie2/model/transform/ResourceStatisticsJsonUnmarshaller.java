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
package com.amazonaws.services.macie2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResourceStatistics JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceStatisticsJsonUnmarshaller implements Unmarshaller<ResourceStatistics, JsonUnmarshallerContext> {

    public ResourceStatistics unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceStatistics resourceStatistics = new ResourceStatistics();

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
                if (context.testExpression("totalBytesClassified", targetDepth)) {
                    context.nextToken();
                    resourceStatistics.setTotalBytesClassified(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("totalDetections", targetDepth)) {
                    context.nextToken();
                    resourceStatistics.setTotalDetections(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("totalDetectionsSuppressed", targetDepth)) {
                    context.nextToken();
                    resourceStatistics.setTotalDetectionsSuppressed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("totalItemsClassified", targetDepth)) {
                    context.nextToken();
                    resourceStatistics.setTotalItemsClassified(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("totalItemsSensitive", targetDepth)) {
                    context.nextToken();
                    resourceStatistics.setTotalItemsSensitive(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("totalItemsSkipped", targetDepth)) {
                    context.nextToken();
                    resourceStatistics.setTotalItemsSkipped(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("totalItemsSkippedInvalidEncryption", targetDepth)) {
                    context.nextToken();
                    resourceStatistics.setTotalItemsSkippedInvalidEncryption(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("totalItemsSkippedInvalidKms", targetDepth)) {
                    context.nextToken();
                    resourceStatistics.setTotalItemsSkippedInvalidKms(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("totalItemsSkippedPermissionDenied", targetDepth)) {
                    context.nextToken();
                    resourceStatistics.setTotalItemsSkippedPermissionDenied(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return resourceStatistics;
    }

    private static ResourceStatisticsJsonUnmarshaller instance;

    public static ResourceStatisticsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceStatisticsJsonUnmarshaller();
        return instance;
    }
}
