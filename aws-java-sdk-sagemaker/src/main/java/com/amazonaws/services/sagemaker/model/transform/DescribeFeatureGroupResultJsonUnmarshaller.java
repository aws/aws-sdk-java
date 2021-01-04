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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeFeatureGroupResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFeatureGroupResultJsonUnmarshaller implements Unmarshaller<DescribeFeatureGroupResult, JsonUnmarshallerContext> {

    public DescribeFeatureGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeFeatureGroupResult describeFeatureGroupResult = new DescribeFeatureGroupResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeFeatureGroupResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FeatureGroupArn", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setFeatureGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FeatureGroupName", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setFeatureGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecordIdentifierFeatureName", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setRecordIdentifierFeatureName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventTimeFeatureName", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setEventTimeFeatureName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FeatureDefinitions", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setFeatureDefinitions(new ListUnmarshaller<FeatureDefinition>(FeatureDefinitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OnlineStoreConfig", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setOnlineStoreConfig(OnlineStoreConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OfflineStoreConfig", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setOfflineStoreConfig(OfflineStoreConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FeatureGroupStatus", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setFeatureGroupStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OfflineStoreStatus", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setOfflineStoreStatus(OfflineStoreStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    describeFeatureGroupResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeFeatureGroupResult;
    }

    private static DescribeFeatureGroupResultJsonUnmarshaller instance;

    public static DescribeFeatureGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFeatureGroupResultJsonUnmarshaller();
        return instance;
    }
}
