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
package com.amazonaws.services.batch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDetailJsonUnmarshaller implements Unmarshaller<JobDetail, JsonUnmarshallerContext> {

    public JobDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobDetail jobDetail = new JobDetail();

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
                if (context.testExpression("jobName", targetDepth)) {
                    context.nextToken();
                    jobDetail.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    jobDetail.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobQueue", targetDepth)) {
                    context.nextToken();
                    jobDetail.setJobQueue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    jobDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("attempts", targetDepth)) {
                    context.nextToken();
                    jobDetail.setAttempts(new ListUnmarshaller<AttemptDetail>(AttemptDetailJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    jobDetail.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    jobDetail.setCreatedAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("retryStrategy", targetDepth)) {
                    context.nextToken();
                    jobDetail.setRetryStrategy(RetryStrategyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    jobDetail.setStartedAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("stoppedAt", targetDepth)) {
                    context.nextToken();
                    jobDetail.setStoppedAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("dependsOn", targetDepth)) {
                    context.nextToken();
                    jobDetail.setDependsOn(new ListUnmarshaller<JobDependency>(JobDependencyJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("jobDefinition", targetDepth)) {
                    context.nextToken();
                    jobDetail.setJobDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parameters", targetDepth)) {
                    context.nextToken();
                    jobDetail.setParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("container", targetDepth)) {
                    context.nextToken();
                    jobDetail.setContainer(ContainerDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("nodeDetails", targetDepth)) {
                    context.nextToken();
                    jobDetail.setNodeDetails(NodeDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("nodeProperties", targetDepth)) {
                    context.nextToken();
                    jobDetail.setNodeProperties(NodePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("arrayProperties", targetDepth)) {
                    context.nextToken();
                    jobDetail.setArrayProperties(ArrayPropertiesDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timeout", targetDepth)) {
                    context.nextToken();
                    jobDetail.setTimeout(JobTimeoutJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobDetail;
    }

    private static JobDetailJsonUnmarshaller instance;

    public static JobDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobDetailJsonUnmarshaller();
        return instance;
    }
}
