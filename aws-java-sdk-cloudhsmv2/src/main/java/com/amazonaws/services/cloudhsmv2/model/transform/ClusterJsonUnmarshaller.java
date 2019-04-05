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
package com.amazonaws.services.cloudhsmv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsmv2.model.*;
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
                if (context.testExpression("BackupPolicy", targetDepth)) {
                    context.nextToken();
                    cluster.setBackupPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterId", targetDepth)) {
                    context.nextToken();
                    cluster.setClusterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateTimestamp", targetDepth)) {
                    context.nextToken();
                    cluster.setCreateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Hsms", targetDepth)) {
                    context.nextToken();
                    cluster.setHsms(new ListUnmarshaller<Hsm>(HsmJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("HsmType", targetDepth)) {
                    context.nextToken();
                    cluster.setHsmType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreCoPassword", targetDepth)) {
                    context.nextToken();
                    cluster.setPreCoPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroup", targetDepth)) {
                    context.nextToken();
                    cluster.setSecurityGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceBackupId", targetDepth)) {
                    context.nextToken();
                    cluster.setSourceBackupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    cluster.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateMessage", targetDepth)) {
                    context.nextToken();
                    cluster.setStateMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetMapping", targetDepth)) {
                    context.nextToken();
                    cluster.setSubnetMapping(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    cluster.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Certificates", targetDepth)) {
                    context.nextToken();
                    cluster.setCertificates(CertificatesJsonUnmarshaller.getInstance().unmarshall(context));
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
