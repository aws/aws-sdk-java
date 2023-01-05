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
package com.amazonaws.services.braket.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.braket.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobResultJsonUnmarshaller implements Unmarshaller<GetJobResult, JsonUnmarshallerContext> {

    public GetJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetJobResult getJobResult = new GetJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("algorithmSpecification", targetDepth)) {
                    context.nextToken();
                    getJobResult.setAlgorithmSpecification(AlgorithmSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("billableDuration", targetDepth)) {
                    context.nextToken();
                    getJobResult.setBillableDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("checkpointConfig", targetDepth)) {
                    context.nextToken();
                    getJobResult.setCheckpointConfig(JobCheckpointConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getJobResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("deviceConfig", targetDepth)) {
                    context.nextToken();
                    getJobResult.setDeviceConfig(DeviceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("endedAt", targetDepth)) {
                    context.nextToken();
                    getJobResult.setEndedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("events", targetDepth)) {
                    context.nextToken();
                    getJobResult.setEvents(new ListUnmarshaller<JobEventDetails>(JobEventDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    getJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hyperParameters", targetDepth)) {
                    context.nextToken();
                    getJobResult.setHyperParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("inputDataConfig", targetDepth)) {
                    context.nextToken();
                    getJobResult.setInputDataConfig(new ListUnmarshaller<InputFileConfig>(InputFileConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("instanceConfig", targetDepth)) {
                    context.nextToken();
                    getJobResult.setInstanceConfig(InstanceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("jobArn", targetDepth)) {
                    context.nextToken();
                    getJobResult.setJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobName", targetDepth)) {
                    context.nextToken();
                    getJobResult.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputDataConfig", targetDepth)) {
                    context.nextToken();
                    getJobResult.setOutputDataConfig(JobOutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    getJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    getJobResult.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stoppingCondition", targetDepth)) {
                    context.nextToken();
                    getJobResult.setStoppingCondition(JobStoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getJobResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getJobResult;
    }

    private static GetJobResultJsonUnmarshaller instance;

    public static GetJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetJobResultJsonUnmarshaller();
        return instance;
    }
}
