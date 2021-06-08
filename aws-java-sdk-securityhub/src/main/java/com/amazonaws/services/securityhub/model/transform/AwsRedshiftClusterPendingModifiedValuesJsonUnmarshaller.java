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
 * AwsRedshiftClusterPendingModifiedValues JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterPendingModifiedValuesJsonUnmarshaller implements Unmarshaller<AwsRedshiftClusterPendingModifiedValues, JsonUnmarshallerContext> {

    public AwsRedshiftClusterPendingModifiedValues unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRedshiftClusterPendingModifiedValues awsRedshiftClusterPendingModifiedValues = new AwsRedshiftClusterPendingModifiedValues();

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
                if (context.testExpression("AutomatedSnapshotRetentionPeriod", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterPendingModifiedValues.setAutomatedSnapshotRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterPendingModifiedValues.setClusterIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterType", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterPendingModifiedValues.setClusterType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterVersion", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterPendingModifiedValues.setClusterVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionType", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterPendingModifiedValues.setEncryptionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnhancedVpcRouting", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterPendingModifiedValues.setEnhancedVpcRouting(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MaintenanceTrackName", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterPendingModifiedValues.setMaintenanceTrackName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MasterUserPassword", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterPendingModifiedValues.setMasterUserPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterPendingModifiedValues.setNodeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfNodes", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterPendingModifiedValues.setNumberOfNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PubliclyAccessible", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterPendingModifiedValues.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsRedshiftClusterPendingModifiedValues;
    }

    private static AwsRedshiftClusterPendingModifiedValuesJsonUnmarshaller instance;

    public static AwsRedshiftClusterPendingModifiedValuesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRedshiftClusterPendingModifiedValuesJsonUnmarshaller();
        return instance;
    }
}
