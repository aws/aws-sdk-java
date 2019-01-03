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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeThingTypeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeThingTypeResultJsonUnmarshaller implements Unmarshaller<DescribeThingTypeResult, JsonUnmarshallerContext> {

    public DescribeThingTypeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeThingTypeResult describeThingTypeResult = new DescribeThingTypeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeThingTypeResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("thingTypeName", targetDepth)) {
                    context.nextToken();
                    describeThingTypeResult.setThingTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingTypeId", targetDepth)) {
                    context.nextToken();
                    describeThingTypeResult.setThingTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingTypeArn", targetDepth)) {
                    context.nextToken();
                    describeThingTypeResult.setThingTypeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingTypeProperties", targetDepth)) {
                    context.nextToken();
                    describeThingTypeResult.setThingTypeProperties(ThingTypePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("thingTypeMetadata", targetDepth)) {
                    context.nextToken();
                    describeThingTypeResult.setThingTypeMetadata(ThingTypeMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeThingTypeResult;
    }

    private static DescribeThingTypeResultJsonUnmarshaller instance;

    public static DescribeThingTypeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeThingTypeResultJsonUnmarshaller();
        return instance;
    }
}
