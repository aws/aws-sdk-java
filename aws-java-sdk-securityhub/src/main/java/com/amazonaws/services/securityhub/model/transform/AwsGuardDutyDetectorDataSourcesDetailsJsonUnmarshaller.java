/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsGuardDutyDetectorDataSourcesDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsGuardDutyDetectorDataSourcesDetailsJsonUnmarshaller implements Unmarshaller<AwsGuardDutyDetectorDataSourcesDetails, JsonUnmarshallerContext> {

    public AwsGuardDutyDetectorDataSourcesDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsGuardDutyDetectorDataSourcesDetails awsGuardDutyDetectorDataSourcesDetails = new AwsGuardDutyDetectorDataSourcesDetails();

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
                if (context.testExpression("CloudTrail", targetDepth)) {
                    context.nextToken();
                    awsGuardDutyDetectorDataSourcesDetails.setCloudTrail(AwsGuardDutyDetectorDataSourcesCloudTrailDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("DnsLogs", targetDepth)) {
                    context.nextToken();
                    awsGuardDutyDetectorDataSourcesDetails.setDnsLogs(AwsGuardDutyDetectorDataSourcesDnsLogsDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("FlowLogs", targetDepth)) {
                    context.nextToken();
                    awsGuardDutyDetectorDataSourcesDetails.setFlowLogs(AwsGuardDutyDetectorDataSourcesFlowLogsDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("Kubernetes", targetDepth)) {
                    context.nextToken();
                    awsGuardDutyDetectorDataSourcesDetails.setKubernetes(AwsGuardDutyDetectorDataSourcesKubernetesDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("MalwareProtection", targetDepth)) {
                    context.nextToken();
                    awsGuardDutyDetectorDataSourcesDetails.setMalwareProtection(AwsGuardDutyDetectorDataSourcesMalwareProtectionDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("S3Logs", targetDepth)) {
                    context.nextToken();
                    awsGuardDutyDetectorDataSourcesDetails.setS3Logs(AwsGuardDutyDetectorDataSourcesS3LogsDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsGuardDutyDetectorDataSourcesDetails;
    }

    private static AwsGuardDutyDetectorDataSourcesDetailsJsonUnmarshaller instance;

    public static AwsGuardDutyDetectorDataSourcesDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsGuardDutyDetectorDataSourcesDetailsJsonUnmarshaller();
        return instance;
    }
}
