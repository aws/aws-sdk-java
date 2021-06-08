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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gluedatabrew.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeProjectResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProjectResultJsonUnmarshaller implements Unmarshaller<DescribeProjectResult, JsonUnmarshallerContext> {

    public DescribeProjectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeProjectResult describeProjectResult = new DescribeProjectResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeProjectResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreateDate", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setCreateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetName", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setDatasetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecipeName", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setRecipeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sample", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setSample(SampleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SessionStatus", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setSessionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OpenedBy", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setOpenedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OpenDate", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setOpenDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeProjectResult;
    }

    private static DescribeProjectResultJsonUnmarshaller instance;

    public static DescribeProjectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeProjectResultJsonUnmarshaller();
        return instance;
    }
}
