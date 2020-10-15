/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeClassificationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClassificationJobResultJsonUnmarshaller implements Unmarshaller<DescribeClassificationJobResult, JsonUnmarshallerContext> {

    public DescribeClassificationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeClassificationJobResult describeClassificationJobResult = new DescribeClassificationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeClassificationJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("clientToken", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setClientToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("customDataIdentifierIds", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setCustomDataIdentifierIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("initialRun", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setInitialRun(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("jobArn", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobStatus", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobType", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setJobType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastRunTime", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setLastRunTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("s3JobDefinition", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setS3JobDefinition(S3JobDefinitionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("samplingPercentage", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setSamplingPercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("scheduleFrequency", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setScheduleFrequency(JobScheduleFrequencyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("statistics", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setStatistics(StatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("userPausedDetails", targetDepth)) {
                    context.nextToken();
                    describeClassificationJobResult.setUserPausedDetails(UserPausedDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeClassificationJobResult;
    }

    private static DescribeClassificationJobResultJsonUnmarshaller instance;

    public static DescribeClassificationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeClassificationJobResultJsonUnmarshaller();
        return instance;
    }
}
