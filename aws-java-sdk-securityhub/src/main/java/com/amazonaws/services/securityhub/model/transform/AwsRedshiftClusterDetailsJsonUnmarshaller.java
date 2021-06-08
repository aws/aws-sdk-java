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
 * AwsRedshiftClusterDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterDetailsJsonUnmarshaller implements Unmarshaller<AwsRedshiftClusterDetails, JsonUnmarshallerContext> {

    public AwsRedshiftClusterDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRedshiftClusterDetails awsRedshiftClusterDetails = new AwsRedshiftClusterDetails();

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
                if (context.testExpression("AllowVersionUpgrade", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setAllowVersionUpgrade(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AutomatedSnapshotRetentionPeriod", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setAutomatedSnapshotRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterAvailabilityStatus", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterAvailabilityStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterCreateTime", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterNodes", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterNodes(new ListUnmarshaller<AwsRedshiftClusterClusterNode>(AwsRedshiftClusterClusterNodeJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ClusterParameterGroups", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterParameterGroups(new ListUnmarshaller<AwsRedshiftClusterClusterParameterGroup>(
                            AwsRedshiftClusterClusterParameterGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ClusterPublicKey", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterPublicKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterRevisionNumber", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterRevisionNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterSecurityGroups", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterSecurityGroups(new ListUnmarshaller<AwsRedshiftClusterClusterSecurityGroup>(
                            AwsRedshiftClusterClusterSecurityGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ClusterSnapshotCopyStatus", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterSnapshotCopyStatus(AwsRedshiftClusterClusterSnapshotCopyStatusJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ClusterStatus", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterSubnetGroupName", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterSubnetGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterVersion", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DBName", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setDBName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeferredMaintenanceWindows", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setDeferredMaintenanceWindows(new ListUnmarshaller<AwsRedshiftClusterDeferredMaintenanceWindow>(
                            AwsRedshiftClusterDeferredMaintenanceWindowJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ElasticIpStatus", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setElasticIpStatus(AwsRedshiftClusterElasticIpStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ElasticResizeNumberOfNodeOptions", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setElasticResizeNumberOfNodeOptions(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Encrypted", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setEndpoint(AwsRedshiftClusterEndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EnhancedVpcRouting", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setEnhancedVpcRouting(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ExpectedNextSnapshotScheduleTime", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setExpectedNextSnapshotScheduleTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpectedNextSnapshotScheduleTimeStatus", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setExpectedNextSnapshotScheduleTimeStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HsmStatus", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setHsmStatus(AwsRedshiftClusterHsmStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IamRoles", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setIamRoles(new ListUnmarshaller<AwsRedshiftClusterIamRole>(AwsRedshiftClusterIamRoleJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaintenanceTrackName", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setMaintenanceTrackName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ManualSnapshotRetentionPeriod", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setManualSnapshotRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setMasterUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NextMaintenanceWindowStartTime", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setNextMaintenanceWindowStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setNodeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfNodes", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setNumberOfNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PendingActions", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setPendingActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("PendingModifiedValues", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setPendingModifiedValues(AwsRedshiftClusterPendingModifiedValuesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PubliclyAccessible", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ResizeInfo", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setResizeInfo(AwsRedshiftClusterResizeInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RestoreStatus", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setRestoreStatus(AwsRedshiftClusterRestoreStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SnapshotScheduleIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setSnapshotScheduleIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotScheduleState", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setSnapshotScheduleState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    context.nextToken();
                    awsRedshiftClusterDetails.setVpcSecurityGroups(new ListUnmarshaller<AwsRedshiftClusterVpcSecurityGroup>(
                            AwsRedshiftClusterVpcSecurityGroupJsonUnmarshaller.getInstance())

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

        return awsRedshiftClusterDetails;
    }

    private static AwsRedshiftClusterDetailsJsonUnmarshaller instance;

    public static AwsRedshiftClusterDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRedshiftClusterDetailsJsonUnmarshaller();
        return instance;
    }
}
