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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Cluster JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterJsonUnmarshaller implements Unmarshaller<Cluster, JsonUnmarshallerContext> {

    public Cluster unmarshall(JsonUnmarshallerContext context) throws Exception {
        Cluster cluster = new Cluster();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    cluster.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    cluster.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    cluster.setStatus(ClusterStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Ec2InstanceAttributes", targetDepth)) {
                    context.nextToken();
                    cluster.setEc2InstanceAttributes(Ec2InstanceAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceCollectionType", targetDepth)) {
                    context.nextToken();
                    cluster.setInstanceCollectionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogUri", targetDepth)) {
                    context.nextToken();
                    cluster.setLogUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestedAmiVersion", targetDepth)) {
                    context.nextToken();
                    cluster.setRequestedAmiVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RunningAmiVersion", targetDepth)) {
                    context.nextToken();
                    cluster.setRunningAmiVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReleaseLabel", targetDepth)) {
                    context.nextToken();
                    cluster.setReleaseLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoTerminate", targetDepth)) {
                    context.nextToken();
                    cluster.setAutoTerminate(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TerminationProtected", targetDepth)) {
                    context.nextToken();
                    cluster.setTerminationProtected(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("VisibleToAllUsers", targetDepth)) {
                    context.nextToken();
                    cluster.setVisibleToAllUsers(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Applications", targetDepth)) {
                    context.nextToken();
                    cluster.setApplications(new ListUnmarshaller<Application>(ApplicationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    cluster.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ServiceRole", targetDepth)) {
                    context.nextToken();
                    cluster.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NormalizedInstanceHours", targetDepth)) {
                    context.nextToken();
                    cluster.setNormalizedInstanceHours(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MasterPublicDnsName", targetDepth)) {
                    context.nextToken();
                    cluster.setMasterPublicDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Configurations", targetDepth)) {
                    context.nextToken();
                    cluster.setConfigurations(new ListUnmarshaller<Configuration>(ConfigurationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("SecurityConfiguration", targetDepth)) {
                    context.nextToken();
                    cluster.setSecurityConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoScalingRole", targetDepth)) {
                    context.nextToken();
                    cluster.setAutoScalingRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScaleDownBehavior", targetDepth)) {
                    context.nextToken();
                    cluster.setScaleDownBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomAmiId", targetDepth)) {
                    context.nextToken();
                    cluster.setCustomAmiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EbsRootVolumeSize", targetDepth)) {
                    context.nextToken();
                    cluster.setEbsRootVolumeSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RepoUpgradeOnBoot", targetDepth)) {
                    context.nextToken();
                    cluster.setRepoUpgradeOnBoot(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KerberosAttributes", targetDepth)) {
                    context.nextToken();
                    cluster.setKerberosAttributes(KerberosAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cluster;
    }

    private static ClusterJsonUnmarshaller instance;

    public static ClusterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterJsonUnmarshaller();
        return instance;
    }
}
