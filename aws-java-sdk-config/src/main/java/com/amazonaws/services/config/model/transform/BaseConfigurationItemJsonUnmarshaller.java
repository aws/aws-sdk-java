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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BaseConfigurationItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BaseConfigurationItemJsonUnmarshaller implements Unmarshaller<BaseConfigurationItem, JsonUnmarshallerContext> {

    public BaseConfigurationItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        BaseConfigurationItem baseConfigurationItem = new BaseConfigurationItem();

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
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configurationItemCaptureTime", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setConfigurationItemCaptureTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("configurationItemStatus", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setConfigurationItemStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configurationStateId", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setConfigurationStateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceName", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setResourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsRegion", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setAwsRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("availabilityZone", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceCreationTime", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setResourceCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supplementaryConfiguration", targetDepth)) {
                    context.nextToken();
                    baseConfigurationItem.setSupplementaryConfiguration(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return baseConfigurationItem;
    }

    private static BaseConfigurationItemJsonUnmarshaller instance;

    public static BaseConfigurationItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BaseConfigurationItemJsonUnmarshaller();
        return instance;
    }
}
