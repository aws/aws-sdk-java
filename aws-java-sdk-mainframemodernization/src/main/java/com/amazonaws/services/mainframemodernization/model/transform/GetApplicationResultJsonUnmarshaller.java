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
package com.amazonaws.services.mainframemodernization.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mainframemodernization.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetApplicationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationResultJsonUnmarshaller implements Unmarshaller<GetApplicationResult, JsonUnmarshallerContext> {

    public GetApplicationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetApplicationResult getApplicationResult = new GetApplicationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getApplicationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("applicationArn", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setApplicationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applicationId", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("deployedVersion", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setDeployedVersion(DeployedVersionSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineType", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setEngineType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastStartTime", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setLastStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("latestVersion", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setLatestVersion(ApplicationVersionSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("listenerArns", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setListenerArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("listenerPorts", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setListenerPorts(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                    .unmarshall(context));
                }
                if (context.testExpression("loadBalancerDnsName", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setLoadBalancerDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logGroups", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setLogGroups(new ListUnmarshaller<LogGroupSummary>(LogGroupSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("targetGroupArns", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setTargetGroupArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return getApplicationResult;
    }

    private static GetApplicationResultJsonUnmarshaller instance;

    public static GetApplicationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetApplicationResultJsonUnmarshaller();
        return instance;
    }
}
