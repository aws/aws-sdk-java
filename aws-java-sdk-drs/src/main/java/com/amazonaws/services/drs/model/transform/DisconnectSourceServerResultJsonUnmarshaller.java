/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DisconnectSourceServerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisconnectSourceServerResultJsonUnmarshaller implements Unmarshaller<DisconnectSourceServerResult, JsonUnmarshallerContext> {

    public DisconnectSourceServerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DisconnectSourceServerResult disconnectSourceServerResult = new DisconnectSourceServerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return disconnectSourceServerResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    disconnectSourceServerResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataReplicationInfo", targetDepth)) {
                    context.nextToken();
                    disconnectSourceServerResult.setDataReplicationInfo(DataReplicationInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastLaunchResult", targetDepth)) {
                    context.nextToken();
                    disconnectSourceServerResult.setLastLaunchResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lifeCycle", targetDepth)) {
                    context.nextToken();
                    disconnectSourceServerResult.setLifeCycle(LifeCycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("recoveryInstanceId", targetDepth)) {
                    context.nextToken();
                    disconnectSourceServerResult.setRecoveryInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationDirection", targetDepth)) {
                    context.nextToken();
                    disconnectSourceServerResult.setReplicationDirection(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reversedDirectionSourceServerArn", targetDepth)) {
                    context.nextToken();
                    disconnectSourceServerResult.setReversedDirectionSourceServerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceCloudProperties", targetDepth)) {
                    context.nextToken();
                    disconnectSourceServerResult.setSourceCloudProperties(SourceCloudPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceProperties", targetDepth)) {
                    context.nextToken();
                    disconnectSourceServerResult.setSourceProperties(SourcePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceServerID", targetDepth)) {
                    context.nextToken();
                    disconnectSourceServerResult.setSourceServerID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stagingArea", targetDepth)) {
                    context.nextToken();
                    disconnectSourceServerResult.setStagingArea(StagingAreaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    disconnectSourceServerResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return disconnectSourceServerResult;
    }

    private static DisconnectSourceServerResultJsonUnmarshaller instance;

    public static DisconnectSourceServerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisconnectSourceServerResultJsonUnmarshaller();
        return instance;
    }
}
