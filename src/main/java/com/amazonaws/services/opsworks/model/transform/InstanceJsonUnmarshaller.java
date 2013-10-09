/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Instance JSON Unmarshaller
 */
public class InstanceJsonUnmarshaller implements Unmarshaller<Instance, JsonUnmarshallerContext> {

    

    public Instance unmarshall(JsonUnmarshallerContext context) throws Exception {
        Instance instance = new Instance();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    instance.setInstanceId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Ec2InstanceId", targetDepth)) {
                    context.nextToken();
                    instance.setEc2InstanceId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Hostname", targetDepth)) {
                    context.nextToken();
                    instance.setHostname(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StackId", targetDepth)) {
                    context.nextToken();
                    instance.setStackId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LayerIds", targetDepth)) {
                    instance.setLayerIds(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIds", targetDepth)) {
                    instance.setSecurityGroupIds(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    instance.setInstanceType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceProfileArn", targetDepth)) {
                    context.nextToken();
                    instance.setInstanceProfileArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    instance.setStatus(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Os", targetDepth)) {
                    context.nextToken();
                    instance.setOs(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AmiId", targetDepth)) {
                    context.nextToken();
                    instance.setAmiId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    instance.setAvailabilityZone(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    instance.setSubnetId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PublicDns", targetDepth)) {
                    context.nextToken();
                    instance.setPublicDns(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrivateDns", targetDepth)) {
                    context.nextToken();
                    instance.setPrivateDns(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PublicIp", targetDepth)) {
                    context.nextToken();
                    instance.setPublicIp(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrivateIp", targetDepth)) {
                    context.nextToken();
                    instance.setPrivateIp(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ElasticIp", targetDepth)) {
                    context.nextToken();
                    instance.setElasticIp(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoScalingType", targetDepth)) {
                    context.nextToken();
                    instance.setAutoScalingType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SshKeyName", targetDepth)) {
                    context.nextToken();
                    instance.setSshKeyName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SshHostRsaKeyFingerprint", targetDepth)) {
                    context.nextToken();
                    instance.setSshHostRsaKeyFingerprint(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SshHostDsaKeyFingerprint", targetDepth)) {
                    context.nextToken();
                    instance.setSshHostDsaKeyFingerprint(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    instance.setCreatedAt(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastServiceErrorId", targetDepth)) {
                    context.nextToken();
                    instance.setLastServiceErrorId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Architecture", targetDepth)) {
                    context.nextToken();
                    instance.setArchitecture(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RootDeviceType", targetDepth)) {
                    context.nextToken();
                    instance.setRootDeviceType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RootDeviceVolumeId", targetDepth)) {
                    context.nextToken();
                    instance.setRootDeviceVolumeId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstallUpdatesOnBoot", targetDepth)) {
                    context.nextToken();
                    instance.setInstallUpdatesOnBoot(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return instance;
    }

    private static InstanceJsonUnmarshaller instance;
    public static InstanceJsonUnmarshaller getInstance() {
        if (instance == null) instance = new InstanceJsonUnmarshaller();
        return instance;
    }
}
    