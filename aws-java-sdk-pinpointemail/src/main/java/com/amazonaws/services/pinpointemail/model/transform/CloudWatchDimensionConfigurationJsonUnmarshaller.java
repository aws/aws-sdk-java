/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointemail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointemail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CloudWatchDimensionConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchDimensionConfigurationJsonUnmarshaller implements Unmarshaller<CloudWatchDimensionConfiguration, JsonUnmarshallerContext> {

    public CloudWatchDimensionConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        CloudWatchDimensionConfiguration cloudWatchDimensionConfiguration = new CloudWatchDimensionConfiguration();

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
                if (context.testExpression("DimensionName", targetDepth)) {
                    context.nextToken();
                    cloudWatchDimensionConfiguration.setDimensionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DimensionValueSource", targetDepth)) {
                    context.nextToken();
                    cloudWatchDimensionConfiguration.setDimensionValueSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultDimensionValue", targetDepth)) {
                    context.nextToken();
                    cloudWatchDimensionConfiguration.setDefaultDimensionValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cloudWatchDimensionConfiguration;
    }

    private static CloudWatchDimensionConfigurationJsonUnmarshaller instance;

    public static CloudWatchDimensionConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CloudWatchDimensionConfigurationJsonUnmarshaller();
        return instance;
    }
}
