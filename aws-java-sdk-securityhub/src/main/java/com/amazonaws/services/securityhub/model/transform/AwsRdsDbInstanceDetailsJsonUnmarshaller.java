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
 * AwsRdsDbInstanceDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbInstanceDetailsJsonUnmarshaller implements Unmarshaller<AwsRdsDbInstanceDetails, JsonUnmarshallerContext> {

    public AwsRdsDbInstanceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRdsDbInstanceDetails awsRdsDbInstanceDetails = new AwsRdsDbInstanceDetails();

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
                if (context.testExpression("AssociatedRoles", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setAssociatedRoles(new ListUnmarshaller<AwsRdsDbInstanceAssociatedRole>(
                            AwsRdsDbInstanceAssociatedRoleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CACertificateIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setCACertificateIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DBClusterIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setDBClusterIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DBInstanceIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setDBInstanceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DBInstanceClass", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setDBInstanceClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbInstancePort", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setDbInstancePort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DbiResourceId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setDbiResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DBName", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setDBName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeletionProtection", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setDeletionProtection(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setEndpoint(AwsRdsDbInstanceEndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Engine", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IAMDatabaseAuthenticationEnabled", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setIAMDatabaseAuthenticationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("InstanceCreateTime", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setInstanceCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PubliclyAccessible", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("StorageEncrypted", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setStorageEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TdeCredentialArn", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setTdeCredentialArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setVpcSecurityGroups(new ListUnmarshaller<AwsRdsDbInstanceVpcSecurityGroup>(
                            AwsRdsDbInstanceVpcSecurityGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MultiAz", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setMultiAz(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnhancedMonitoringResourceArn", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setEnhancedMonitoringResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbInstanceStatus", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setDbInstanceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setMasterUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PreferredBackupWindow", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setPreferredBackupWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupRetentionPeriod", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setBackupRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DbSecurityGroups", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setDbSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DbParameterGroups", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setDbParameterGroups(new ListUnmarshaller<AwsRdsDbParameterGroup>(AwsRdsDbParameterGroupJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbSubnetGroup", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setDbSubnetGroup(AwsRdsDbSubnetGroupJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PendingModifiedValues", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setPendingModifiedValues(AwsRdsDbPendingModifiedValuesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LatestRestorableTime", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setLatestRestorableTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMinorVersionUpgrade", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setAutoMinorVersionUpgrade(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ReadReplicaSourceDBInstanceIdentifier", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setReadReplicaSourceDBInstanceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReadReplicaDBInstanceIdentifiers", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setReadReplicaDBInstanceIdentifiers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ReadReplicaDBClusterIdentifiers", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setReadReplicaDBClusterIdentifiers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("LicenseModel", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setLicenseModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Iops", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setIops(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("OptionGroupMemberships", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setOptionGroupMemberships(new ListUnmarshaller<AwsRdsDbOptionGroupMembership>(
                            AwsRdsDbOptionGroupMembershipJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CharacterSetName", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setCharacterSetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecondaryAvailabilityZone", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setSecondaryAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusInfos", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setStatusInfos(new ListUnmarshaller<AwsRdsDbStatusInfo>(AwsRdsDbStatusInfoJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StorageType", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setStorageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainMemberships", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setDomainMemberships(new ListUnmarshaller<AwsRdsDbDomainMembership>(AwsRdsDbDomainMembershipJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CopyTagsToSnapshot", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setCopyTagsToSnapshot(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MonitoringInterval", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setMonitoringInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MonitoringRoleArn", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setMonitoringRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PromotionTier", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setPromotionTier(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Timezone", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PerformanceInsightsEnabled", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setPerformanceInsightsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PerformanceInsightsKmsKeyId", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setPerformanceInsightsKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PerformanceInsightsRetentionPeriod", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setPerformanceInsightsRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EnabledCloudWatchLogsExports", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setEnabledCloudWatchLogsExports(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ProcessorFeatures", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setProcessorFeatures(new ListUnmarshaller<AwsRdsDbProcessorFeature>(AwsRdsDbProcessorFeatureJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ListenerEndpoint", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setListenerEndpoint(AwsRdsDbInstanceEndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxAllocatedStorage", targetDepth)) {
                    context.nextToken();
                    awsRdsDbInstanceDetails.setMaxAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsRdsDbInstanceDetails;
    }

    private static AwsRdsDbInstanceDetailsJsonUnmarshaller instance;

    public static AwsRdsDbInstanceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbInstanceDetailsJsonUnmarshaller();
        return instance;
    }
}
