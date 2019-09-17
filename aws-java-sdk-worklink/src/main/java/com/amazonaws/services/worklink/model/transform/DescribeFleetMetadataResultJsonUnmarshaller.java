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
package com.amazonaws.services.worklink.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.worklink.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeFleetMetadataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetMetadataResultJsonUnmarshaller implements Unmarshaller<DescribeFleetMetadataResult, JsonUnmarshallerContext> {

    public DescribeFleetMetadataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeFleetMetadataResult describeFleetMetadataResult = new DescribeFleetMetadataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeFleetMetadataResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    describeFleetMetadataResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    describeFleetMetadataResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FleetName", targetDepth)) {
                    context.nextToken();
                    describeFleetMetadataResult.setFleetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    describeFleetMetadataResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OptimizeForEndUserLocation", targetDepth)) {
                    context.nextToken();
                    describeFleetMetadataResult.setOptimizeForEndUserLocation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CompanyCode", targetDepth)) {
                    context.nextToken();
                    describeFleetMetadataResult.setCompanyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FleetStatus", targetDepth)) {
                    context.nextToken();
                    describeFleetMetadataResult.setFleetStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeFleetMetadataResult;
    }

    private static DescribeFleetMetadataResultJsonUnmarshaller instance;

    public static DescribeFleetMetadataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFleetMetadataResultJsonUnmarshaller();
        return instance;
    }
}
