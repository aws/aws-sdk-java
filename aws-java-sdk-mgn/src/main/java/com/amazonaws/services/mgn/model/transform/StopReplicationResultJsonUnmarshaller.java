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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StopReplicationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopReplicationResultJsonUnmarshaller implements Unmarshaller<StopReplicationResult, JsonUnmarshallerContext> {

    public StopReplicationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StopReplicationResult stopReplicationResult = new StopReplicationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return stopReplicationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("applicationID", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setApplicationID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorAction", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setConnectorAction(SourceServerConnectorActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dataReplicationInfo", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setDataReplicationInfo(DataReplicationInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fqdnForActionFramework", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setFqdnForActionFramework(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isArchived", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setIsArchived(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("launchedInstance", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setLaunchedInstance(LaunchedInstanceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lifeCycle", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setLifeCycle(LifeCycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("replicationType", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setReplicationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceProperties", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setSourceProperties(SourcePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceServerID", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setSourceServerID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("userProvidedID", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setUserProvidedID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vcenterClientID", targetDepth)) {
                    context.nextToken();
                    stopReplicationResult.setVcenterClientID(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return stopReplicationResult;
    }

    private static StopReplicationResultJsonUnmarshaller instance;

    public static StopReplicationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopReplicationResultJsonUnmarshaller();
        return instance;
    }
}
