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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsBackupBackupPlanDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsBackupBackupPlanDetailsJsonUnmarshaller implements Unmarshaller<AwsBackupBackupPlanDetails, JsonUnmarshallerContext> {

    public AwsBackupBackupPlanDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsBackupBackupPlanDetails awsBackupBackupPlanDetails = new AwsBackupBackupPlanDetails();

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
                if (context.testExpression("BackupPlan", targetDepth)) {
                    context.nextToken();
                    awsBackupBackupPlanDetails.setBackupPlan(AwsBackupBackupPlanBackupPlanDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BackupPlanArn", targetDepth)) {
                    context.nextToken();
                    awsBackupBackupPlanDetails.setBackupPlanArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupPlanId", targetDepth)) {
                    context.nextToken();
                    awsBackupBackupPlanDetails.setBackupPlanId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionId", targetDepth)) {
                    context.nextToken();
                    awsBackupBackupPlanDetails.setVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsBackupBackupPlanDetails;
    }

    private static AwsBackupBackupPlanDetailsJsonUnmarshaller instance;

    public static AwsBackupBackupPlanDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsBackupBackupPlanDetailsJsonUnmarshaller();
        return instance;
    }
}
