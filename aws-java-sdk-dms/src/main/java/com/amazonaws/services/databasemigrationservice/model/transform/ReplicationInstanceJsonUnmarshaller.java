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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReplicationInstance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationInstanceJsonUnmarshaller implements Unmarshaller<ReplicationInstance, JsonUnmarshallerContext> {

    public ReplicationInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicationInstance replicationInstance = new ReplicationInstance();

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
                if (context.testExpression("ReplicationInstanceIdentifier", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setReplicationInstanceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstanceClass", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setReplicationInstanceClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstanceStatus", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setReplicationInstanceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstanceCreateTime", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setInstanceCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setVpcSecurityGroups(new ListUnmarshaller<VpcSecurityGroupMembership>(VpcSecurityGroupMembershipJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationSubnetGroup", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setReplicationSubnetGroup(ReplicationSubnetGroupJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PendingModifiedValues", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setPendingModifiedValues(ReplicationPendingModifiedValuesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MultiAZ", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setMultiAZ(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMinorVersionUpgrade", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setAutoMinorVersionUpgrade(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstanceArn", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setReplicationInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstancePublicIpAddress", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setReplicationInstancePublicIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstancePrivateIpAddress", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setReplicationInstancePrivateIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstancePublicIpAddresses", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setReplicationInstancePublicIpAddresses(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("ReplicationInstancePrivateIpAddresses", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setReplicationInstancePrivateIpAddresses(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("PubliclyAccessible", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SecondaryAvailabilityZone", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setSecondaryAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FreeUntil", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setFreeUntil(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DnsNameServers", targetDepth)) {
                    context.nextToken();
                    replicationInstance.setDnsNameServers(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return replicationInstance;
    }

    private static ReplicationInstanceJsonUnmarshaller instance;

    public static ReplicationInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationInstanceJsonUnmarshaller();
        return instance;
    }
}
