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
 * JobFlowInstancesDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobFlowInstancesDetailJsonUnmarshaller implements Unmarshaller<JobFlowInstancesDetail, JsonUnmarshallerContext> {

    public JobFlowInstancesDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobFlowInstancesDetail jobFlowInstancesDetail = new JobFlowInstancesDetail();

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
                if (context.testExpression("MasterInstanceType", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setMasterInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MasterPublicDnsName", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setMasterPublicDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MasterInstanceId", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setMasterInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SlaveInstanceType", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setSlaveInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceCount", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstanceGroups", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setInstanceGroups(new ListUnmarshaller<InstanceGroupDetail>(InstanceGroupDetailJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NormalizedInstanceHours", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setNormalizedInstanceHours(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Ec2KeyName", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setEc2KeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ec2SubnetId", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setEc2SubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Placement", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setPlacement(PlacementTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KeepJobFlowAliveWhenNoSteps", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setKeepJobFlowAliveWhenNoSteps(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TerminationProtected", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setTerminationProtected(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HadoopVersion", targetDepth)) {
                    context.nextToken();
                    jobFlowInstancesDetail.setHadoopVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobFlowInstancesDetail;
    }

    private static JobFlowInstancesDetailJsonUnmarshaller instance;

    public static JobFlowInstancesDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowInstancesDetailJsonUnmarshaller();
        return instance;
    }
}
