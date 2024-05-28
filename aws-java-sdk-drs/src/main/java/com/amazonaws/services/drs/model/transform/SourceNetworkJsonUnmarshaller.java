/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.drs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SourceNetwork JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceNetworkJsonUnmarshaller implements Unmarshaller<SourceNetwork, JsonUnmarshallerContext> {

    public SourceNetwork unmarshall(JsonUnmarshallerContext context) throws Exception {
        SourceNetwork sourceNetwork = new SourceNetwork();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    sourceNetwork.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cfnStackName", targetDepth)) {
                    context.nextToken();
                    sourceNetwork.setCfnStackName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastRecovery", targetDepth)) {
                    context.nextToken();
                    sourceNetwork.setLastRecovery(RecoveryLifeCycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("launchedVpcID", targetDepth)) {
                    context.nextToken();
                    sourceNetwork.setLaunchedVpcID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationStatus", targetDepth)) {
                    context.nextToken();
                    sourceNetwork.setReplicationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationStatusDetails", targetDepth)) {
                    context.nextToken();
                    sourceNetwork.setReplicationStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceAccountID", targetDepth)) {
                    context.nextToken();
                    sourceNetwork.setSourceAccountID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceNetworkID", targetDepth)) {
                    context.nextToken();
                    sourceNetwork.setSourceNetworkID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceRegion", targetDepth)) {
                    context.nextToken();
                    sourceNetwork.setSourceRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceVpcID", targetDepth)) {
                    context.nextToken();
                    sourceNetwork.setSourceVpcID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    sourceNetwork.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sourceNetwork;
    }

    private static SourceNetworkJsonUnmarshaller instance;

    public static SourceNetworkJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SourceNetworkJsonUnmarshaller();
        return instance;
    }
}
