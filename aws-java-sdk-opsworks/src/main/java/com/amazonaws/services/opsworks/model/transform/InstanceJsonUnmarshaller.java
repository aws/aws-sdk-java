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
package com.amazonaws.services.opsworks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Instance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceJsonUnmarshaller implements Unmarshaller<Instance, JsonUnmarshallerContext> {

    public Instance unmarshall(JsonUnmarshallerContext context) throws Exception {
        Instance instance = new Instance();

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
                if (context.testExpression("AgentVersion", targetDepth)) {
                    context.nextToken();
                    instance.setAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AmiId", targetDepth)) {
                    context.nextToken();
                    instance.setAmiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Architecture", targetDepth)) {
                    context.nextToken();
                    instance.setArchitecture(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    instance.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoScalingType", targetDepth)) {
                    context.nextToken();
                    instance.setAutoScalingType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    instance.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BlockDeviceMappings", targetDepth)) {
                    context.nextToken();
                    instance.setBlockDeviceMappings(new ListUnmarshaller<BlockDeviceMapping>(BlockDeviceMappingJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    instance.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EbsOptimized", targetDepth)) {
                    context.nextToken();
                    instance.setEbsOptimized(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Ec2InstanceId", targetDepth)) {
                    context.nextToken();
                    instance.setEc2InstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EcsClusterArn", targetDepth)) {
                    context.nextToken();
                    instance.setEcsClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EcsContainerInstanceArn", targetDepth)) {
                    context.nextToken();
                    instance.setEcsContainerInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ElasticIp", targetDepth)) {
                    context.nextToken();
                    instance.setElasticIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Hostname", targetDepth)) {
                    context.nextToken();
                    instance.setHostname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InfrastructureClass", targetDepth)) {
                    context.nextToken();
                    instance.setInfrastructureClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstallUpdatesOnBoot", targetDepth)) {
                    context.nextToken();
                    instance.setInstallUpdatesOnBoot(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    instance.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceProfileArn", targetDepth)) {
                    context.nextToken();
                    instance.setInstanceProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    instance.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastServiceErrorId", targetDepth)) {
                    context.nextToken();
                    instance.setLastServiceErrorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LayerIds", targetDepth)) {
                    context.nextToken();
                    instance.setLayerIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Os", targetDepth)) {
                    context.nextToken();
                    instance.setOs(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Platform", targetDepth)) {
                    context.nextToken();
                    instance.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateDns", targetDepth)) {
                    context.nextToken();
                    instance.setPrivateDns(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateIp", targetDepth)) {
                    context.nextToken();
                    instance.setPrivateIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicDns", targetDepth)) {
                    context.nextToken();
                    instance.setPublicDns(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicIp", targetDepth)) {
                    context.nextToken();
                    instance.setPublicIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegisteredBy", targetDepth)) {
                    context.nextToken();
                    instance.setRegisteredBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportedAgentVersion", targetDepth)) {
                    context.nextToken();
                    instance.setReportedAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportedOs", targetDepth)) {
                    context.nextToken();
                    instance.setReportedOs(ReportedOsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RootDeviceType", targetDepth)) {
                    context.nextToken();
                    instance.setRootDeviceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RootDeviceVolumeId", targetDepth)) {
                    context.nextToken();
                    instance.setRootDeviceVolumeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIds", targetDepth)) {
                    context.nextToken();
                    instance.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SshHostDsaKeyFingerprint", targetDepth)) {
                    context.nextToken();
                    instance.setSshHostDsaKeyFingerprint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SshHostRsaKeyFingerprint", targetDepth)) {
                    context.nextToken();
                    instance.setSshHostRsaKeyFingerprint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SshKeyName", targetDepth)) {
                    context.nextToken();
                    instance.setSshKeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StackId", targetDepth)) {
                    context.nextToken();
                    instance.setStackId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    instance.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    instance.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tenancy", targetDepth)) {
                    context.nextToken();
                    instance.setTenancy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VirtualizationType", targetDepth)) {
                    context.nextToken();
                    instance.setVirtualizationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instance;
    }

    private static InstanceJsonUnmarshaller instance;

    public static InstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonUnmarshaller();
        return instance;
    }
}
