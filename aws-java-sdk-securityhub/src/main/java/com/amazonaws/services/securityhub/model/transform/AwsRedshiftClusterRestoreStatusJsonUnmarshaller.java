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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsRedshiftClusterRestoreStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterRestoreStatusJsonUnmarshaller implements Unmarshaller<AwsRedshiftClusterRestoreStatus, JsonUnmarshallerContext> {

    public AwsRedshiftClusterRestoreStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRedshiftClusterRestoreStatus awsRedshiftClusterRestoreStatus = new AwsRedshiftClusterRestoreStatus();

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
                if (context.testExpression("CurrentRestoreRateInMegaBytesPerSecond", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterRestoreStatus.setCurrentRestoreRateInMegaBytesPerSecond(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ElapsedTimeInSeconds", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterRestoreStatus.setElapsedTimeInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedTimeToCompletionInSeconds", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterRestoreStatus.setEstimatedTimeToCompletionInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ProgressInMegaBytes", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterRestoreStatus.setProgressInMegaBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotSizeInMegaBytes", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterRestoreStatus.setSnapshotSizeInMegaBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterRestoreStatus.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsRedshiftClusterRestoreStatus;
    }

    private static AwsRedshiftClusterRestoreStatusJsonUnmarshaller instance;

    public static AwsRedshiftClusterRestoreStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRedshiftClusterRestoreStatusJsonUnmarshaller();
        return instance;
    }
}
