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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetReplicationConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReplicationConfigurationResultJsonUnmarshaller implements Unmarshaller<GetReplicationConfigurationResult, JsonUnmarshallerContext> {

    public GetReplicationConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetReplicationConfigurationResult getReplicationConfigurationResult = new GetReplicationConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getReplicationConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("associateDefaultSecurityGroup", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setAssociateDefaultSecurityGroup(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("bandwidthThrottling", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setBandwidthThrottling(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("createPublicIP", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setCreatePublicIP(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("dataPlaneRouting", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setDataPlaneRouting(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultLargeStagingDiskType", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setDefaultLargeStagingDiskType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ebsEncryption", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setEbsEncryption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ebsEncryptionKeyArn", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setEbsEncryptionKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicatedDisks", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setReplicatedDisks(new ListUnmarshaller<ReplicationConfigurationReplicatedDisk>(
                            ReplicationConfigurationReplicatedDiskJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("replicationServerInstanceType", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setReplicationServerInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationServersSecurityGroupsIDs", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult
                            .setReplicationServersSecurityGroupsIDs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                            .unmarshall(context));
                }
                if (context.testExpression("sourceServerID", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setSourceServerID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stagingAreaSubnetId", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setStagingAreaSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stagingAreaTags", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setStagingAreaTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("useDedicatedReplicationServer", targetDepth)) {
                    context.nextToken();
                    getReplicationConfigurationResult.setUseDedicatedReplicationServer(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getReplicationConfigurationResult;
    }

    private static GetReplicationConfigurationResultJsonUnmarshaller instance;

    public static GetReplicationConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetReplicationConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
