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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobFlowDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobFlowDetailJsonUnmarshaller implements Unmarshaller<JobFlowDetail, JsonUnmarshallerContext> {

    public JobFlowDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobFlowDetail jobFlowDetail = new JobFlowDetail();

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
                if (context.testExpression("JobFlowId", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setJobFlowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogUri", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setLogUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AmiVersion", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setAmiVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionStatusDetail", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setExecutionStatusDetail(JobFlowExecutionStatusDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Instances", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setInstances(JobFlowInstancesDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Steps", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setSteps(new ListUnmarshaller<StepDetail>(StepDetailJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("BootstrapActions", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setBootstrapActions(new ListUnmarshaller<BootstrapActionDetail>(BootstrapActionDetailJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("SupportedProducts", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setSupportedProducts(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("VisibleToAllUsers", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setVisibleToAllUsers(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("JobFlowRole", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setJobFlowRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceRole", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoScalingRole", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setAutoScalingRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScaleDownBehavior", targetDepth)) {
                    context.nextToken();
                    jobFlowDetail.setScaleDownBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobFlowDetail;
    }

    private static JobFlowDetailJsonUnmarshaller instance;

    public static JobFlowDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowDetailJsonUnmarshaller();
        return instance;
    }
}
