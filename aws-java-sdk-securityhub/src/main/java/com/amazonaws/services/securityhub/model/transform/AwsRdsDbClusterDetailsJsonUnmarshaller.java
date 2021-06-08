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
 * AwsRdsDbClusterDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbClusterDetailsJsonUnmarshaller implements Unmarshaller<AwsRdsDbClusterDetails, JsonUnmarshallerContext> {

    public AwsRdsDbClusterDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRdsDbClusterDetails awsRdsDbClusterDetails = new AwsRdsDbClusterDetails();

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
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setAvailabilityZones(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("BackupRetentionPeriod", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setBackupRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReaderEndpoint", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setReaderEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomEndpoints", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setCustomEndpoints(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("MultiAz", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setMultiAz(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Engine", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setMasterUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredBackupWindow", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setPreferredBackupWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReadReplicaIdentifiers", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setReadReplicaIdentifiers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setVpcSecurityGroups(new ListUnmarshaller<AwsRdsDbInstanceVpcSecurityGroup>(
                            AwsRdsDbInstanceVpcSecurityGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("HostedZoneId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setHostedZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageEncrypted", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setStorageEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbClusterResourceId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setDbClusterResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociatedRoles", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setAssociatedRoles(new ListUnmarshaller<AwsRdsDbClusterAssociatedRole>(AwsRdsDbClusterAssociatedRoleJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ClusterCreateTime", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setClusterCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnabledCloudWatchLogsExports", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setEnabledCloudWatchLogsExports(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("EngineMode", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setEngineMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeletionProtection", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setDeletionProtection(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HttpEndpointEnabled", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setHttpEndpointEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ActivityStreamStatus", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setActivityStreamStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CopyTagsToSnapshot", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setCopyTagsToSnapshot(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrossAccountClone", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setCrossAccountClone(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DomainMemberships", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setDomainMemberships(new ListUnmarshaller<AwsRdsDbDomainMembership>(AwsRdsDbDomainMembershipJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DbClusterParameterGroup", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setDbClusterParameterGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbSubnetGroup", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setDbSubnetGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbClusterOptionGroupMemberships", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setDbClusterOptionGroupMemberships(new ListUnmarshaller<AwsRdsDbClusterOptionGroupMembership>(
                            AwsRdsDbClusterOptionGroupMembershipJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DbClusterIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setDbClusterIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbClusterMembers", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setDbClusterMembers(new ListUnmarshaller<AwsRdsDbClusterMember>(AwsRdsDbClusterMemberJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("IamDatabaseAuthenticationEnabled", targetDepth)) {
                    context.nextToken();
                    awsRdsDbClusterDetails.setIamDatabaseAuthenticationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsRdsDbClusterDetails;
    }

    private static AwsRdsDbClusterDetailsJsonUnmarshaller instance;

    public static AwsRdsDbClusterDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbClusterDetailsJsonUnmarshaller();
        return instance;
    }
}
