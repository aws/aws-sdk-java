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
package com.amazonaws.services.codedeploy.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeploymentInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentInfoJsonUnmarshaller implements Unmarshaller<DeploymentInfo, JsonUnmarshallerContext> {

    public DeploymentInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeploymentInfo deploymentInfo = new DeploymentInfo();

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
                if (context.testExpression("applicationName", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setApplicationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentGroupName", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setDeploymentGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentConfigName", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setDeploymentConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentId", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("previousRevision", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setPreviousRevision(RevisionLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("revision", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setRevision(RevisionLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorInformation", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setErrorInformation(ErrorInformationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("completeTime", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setCompleteTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("deploymentOverview", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setDeploymentOverview(DeploymentOverviewJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creator", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setCreator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ignoreApplicationStopFailures", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setIgnoreApplicationStopFailures(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("autoRollbackConfiguration", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setAutoRollbackConfiguration(AutoRollbackConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("updateOutdatedInstancesOnly", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setUpdateOutdatedInstancesOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("rollbackInfo", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setRollbackInfo(RollbackInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deploymentStyle", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setDeploymentStyle(DeploymentStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("targetInstances", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setTargetInstances(TargetInstancesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("instanceTerminationWaitTimeStarted", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setInstanceTerminationWaitTimeStarted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("blueGreenDeploymentConfiguration", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setBlueGreenDeploymentConfiguration(BlueGreenDeploymentConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("loadBalancerInfo", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setLoadBalancerInfo(LoadBalancerInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("additionalDeploymentStatusInfo", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setAdditionalDeploymentStatusInfo(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fileExistsBehavior", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setFileExistsBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentStatusMessages", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setDeploymentStatusMessages(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("computePlatform", targetDepth)) {
                    context.nextToken();
                    deploymentInfo.setComputePlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deploymentInfo;
    }

    private static DeploymentInfoJsonUnmarshaller instance;

    public static DeploymentInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentInfoJsonUnmarshaller();
        return instance;
    }
}
