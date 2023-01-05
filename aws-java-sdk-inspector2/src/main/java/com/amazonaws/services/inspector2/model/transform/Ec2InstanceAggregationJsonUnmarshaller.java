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
 * Ec2InstanceAggregation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2InstanceAggregationJsonUnmarshaller implements Unmarshaller<Ec2InstanceAggregation, JsonUnmarshallerContext> {

    public Ec2InstanceAggregation unmarshall(JsonUnmarshallerContext context) throws Exception {
        Ec2InstanceAggregation ec2InstanceAggregation = new Ec2InstanceAggregation();

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
                if (context.testExpression("amis", targetDepth)) {
                    context.nextToken();
                    ec2InstanceAggregation.setAmis(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("instanceIds", targetDepth)) {
                    context.nextToken();
                    ec2InstanceAggregation.setInstanceIds(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("instanceTags", targetDepth)) {
                    context.nextToken();
                    ec2InstanceAggregation.setInstanceTags(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("operatingSystems", targetDepth)) {
                    context.nextToken();
                    ec2InstanceAggregation.setOperatingSystems(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("sortBy", targetDepth)) {
                    context.nextToken();
                    ec2InstanceAggregation.setSortBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sortOrder", targetDepth)) {
                    context.nextToken();
                    ec2InstanceAggregation.setSortOrder(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ec2InstanceAggregation;
    }

    private static Ec2InstanceAggregationJsonUnmarshaller instance;

    public static Ec2InstanceAggregationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Ec2InstanceAggregationJsonUnmarshaller();
        return instance;
    }
}
