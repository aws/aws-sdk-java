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

package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Cluster JSON Unmarshaller
 */
public class ClusterJsonUnmarshaller implements Unmarshaller<Cluster, JsonUnmarshallerContext> {

    

    public Cluster unmarshall(JsonUnmarshallerContext context) throws Exception {
        Cluster cluster = new Cluster();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    cluster.setId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    cluster.setName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    cluster.setStatus(ClusterStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Ec2InstanceAttributes", targetDepth)) {
                    context.nextToken();
                    cluster.setEc2InstanceAttributes(Ec2InstanceAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LogUri", targetDepth)) {
                    context.nextToken();
                    cluster.setLogUri(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RequestedAmiVersion", targetDepth)) {
                    context.nextToken();
                    cluster.setRequestedAmiVersion(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RunningAmiVersion", targetDepth)) {
                    context.nextToken();
                    cluster.setRunningAmiVersion(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoTerminate", targetDepth)) {
                    context.nextToken();
                    cluster.setAutoTerminate(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TerminationProtected", targetDepth)) {
                    context.nextToken();
                    cluster.setTerminationProtected(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VisibleToAllUsers", targetDepth)) {
                    context.nextToken();
                    cluster.setVisibleToAllUsers(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Applications", targetDepth)) {
                    cluster.setApplications(new ListUnmarshaller<Application>(ApplicationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return cluster;
    }

    private static ClusterJsonUnmarshaller instance;
    public static ClusterJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ClusterJsonUnmarshaller();
        return instance;
    }
}
    