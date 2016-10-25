/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ReplicationInstanceMarshaller
 */
public class ReplicationInstanceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ReplicationInstance replicationInstance, StructuredJsonGenerator jsonGenerator) {

        if (replicationInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (replicationInstance.getReplicationInstanceIdentifier() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceIdentifier").writeValue(replicationInstance.getReplicationInstanceIdentifier());
            }
            if (replicationInstance.getReplicationInstanceClass() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceClass").writeValue(replicationInstance.getReplicationInstanceClass());
            }
            if (replicationInstance.getReplicationInstanceStatus() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceStatus").writeValue(replicationInstance.getReplicationInstanceStatus());
            }
            if (replicationInstance.getAllocatedStorage() != null) {
                jsonGenerator.writeFieldName("AllocatedStorage").writeValue(replicationInstance.getAllocatedStorage());
            }
            if (replicationInstance.getInstanceCreateTime() != null) {
                jsonGenerator.writeFieldName("InstanceCreateTime").writeValue(replicationInstance.getInstanceCreateTime());
            }

            java.util.List<VpcSecurityGroupMembership> vpcSecurityGroupsList = replicationInstance.getVpcSecurityGroups();
            if (vpcSecurityGroupsList != null) {
                jsonGenerator.writeFieldName("VpcSecurityGroups");
                jsonGenerator.writeStartArray();
                for (VpcSecurityGroupMembership vpcSecurityGroupsListValue : vpcSecurityGroupsList) {
                    if (vpcSecurityGroupsListValue != null) {

                        VpcSecurityGroupMembershipJsonMarshaller.getInstance().marshall(vpcSecurityGroupsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (replicationInstance.getAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("AvailabilityZone").writeValue(replicationInstance.getAvailabilityZone());
            }
            if (replicationInstance.getReplicationSubnetGroup() != null) {
                jsonGenerator.writeFieldName("ReplicationSubnetGroup");
                ReplicationSubnetGroupJsonMarshaller.getInstance().marshall(replicationInstance.getReplicationSubnetGroup(), jsonGenerator);
            }
            if (replicationInstance.getPreferredMaintenanceWindow() != null) {
                jsonGenerator.writeFieldName("PreferredMaintenanceWindow").writeValue(replicationInstance.getPreferredMaintenanceWindow());
            }
            if (replicationInstance.getPendingModifiedValues() != null) {
                jsonGenerator.writeFieldName("PendingModifiedValues");
                ReplicationPendingModifiedValuesJsonMarshaller.getInstance().marshall(replicationInstance.getPendingModifiedValues(), jsonGenerator);
            }
            if (replicationInstance.getMultiAZ() != null) {
                jsonGenerator.writeFieldName("MultiAZ").writeValue(replicationInstance.getMultiAZ());
            }
            if (replicationInstance.getEngineVersion() != null) {
                jsonGenerator.writeFieldName("EngineVersion").writeValue(replicationInstance.getEngineVersion());
            }
            if (replicationInstance.getAutoMinorVersionUpgrade() != null) {
                jsonGenerator.writeFieldName("AutoMinorVersionUpgrade").writeValue(replicationInstance.getAutoMinorVersionUpgrade());
            }
            if (replicationInstance.getKmsKeyId() != null) {
                jsonGenerator.writeFieldName("KmsKeyId").writeValue(replicationInstance.getKmsKeyId());
            }
            if (replicationInstance.getReplicationInstanceArn() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceArn").writeValue(replicationInstance.getReplicationInstanceArn());
            }
            if (replicationInstance.getReplicationInstancePublicIpAddress() != null) {
                jsonGenerator.writeFieldName("ReplicationInstancePublicIpAddress").writeValue(replicationInstance.getReplicationInstancePublicIpAddress());
            }
            if (replicationInstance.getReplicationInstancePrivateIpAddress() != null) {
                jsonGenerator.writeFieldName("ReplicationInstancePrivateIpAddress").writeValue(replicationInstance.getReplicationInstancePrivateIpAddress());
            }

            java.util.List<String> replicationInstancePublicIpAddressesList = replicationInstance.getReplicationInstancePublicIpAddresses();
            if (replicationInstancePublicIpAddressesList != null) {
                jsonGenerator.writeFieldName("ReplicationInstancePublicIpAddresses");
                jsonGenerator.writeStartArray();
                for (String replicationInstancePublicIpAddressesListValue : replicationInstancePublicIpAddressesList) {
                    if (replicationInstancePublicIpAddressesListValue != null) {
                        jsonGenerator.writeValue(replicationInstancePublicIpAddressesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> replicationInstancePrivateIpAddressesList = replicationInstance.getReplicationInstancePrivateIpAddresses();
            if (replicationInstancePrivateIpAddressesList != null) {
                jsonGenerator.writeFieldName("ReplicationInstancePrivateIpAddresses");
                jsonGenerator.writeStartArray();
                for (String replicationInstancePrivateIpAddressesListValue : replicationInstancePrivateIpAddressesList) {
                    if (replicationInstancePrivateIpAddressesListValue != null) {
                        jsonGenerator.writeValue(replicationInstancePrivateIpAddressesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (replicationInstance.getPubliclyAccessible() != null) {
                jsonGenerator.writeFieldName("PubliclyAccessible").writeValue(replicationInstance.getPubliclyAccessible());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ReplicationInstanceJsonMarshaller instance;

    public static ReplicationInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationInstanceJsonMarshaller();
        return instance;
    }

}
