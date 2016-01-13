/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * InstancesCount JSON Unmarshaller
 */
public class InstancesCountJsonUnmarshaller implements
        Unmarshaller<InstancesCount, JsonUnmarshallerContext> {

    public InstancesCount unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        InstancesCount instancesCount = new InstancesCount();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Assigning", targetDepth)) {
                    context.nextToken();
                    instancesCount.setAssigning(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Booting", targetDepth)) {
                    context.nextToken();
                    instancesCount.setBooting(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("ConnectionLost", targetDepth)) {
                    context.nextToken();
                    instancesCount.setConnectionLost(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Deregistering", targetDepth)) {
                    context.nextToken();
                    instancesCount.setDeregistering(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Online", targetDepth)) {
                    context.nextToken();
                    instancesCount.setOnline(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Pending", targetDepth)) {
                    context.nextToken();
                    instancesCount.setPending(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Rebooting", targetDepth)) {
                    context.nextToken();
                    instancesCount.setRebooting(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Registered", targetDepth)) {
                    context.nextToken();
                    instancesCount.setRegistered(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Registering", targetDepth)) {
                    context.nextToken();
                    instancesCount.setRegistering(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Requested", targetDepth)) {
                    context.nextToken();
                    instancesCount.setRequested(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("RunningSetup", targetDepth)) {
                    context.nextToken();
                    instancesCount.setRunningSetup(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("SetupFailed", targetDepth)) {
                    context.nextToken();
                    instancesCount.setSetupFailed(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("ShuttingDown", targetDepth)) {
                    context.nextToken();
                    instancesCount.setShuttingDown(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("StartFailed", targetDepth)) {
                    context.nextToken();
                    instancesCount.setStartFailed(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Stopped", targetDepth)) {
                    context.nextToken();
                    instancesCount.setStopped(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Stopping", targetDepth)) {
                    context.nextToken();
                    instancesCount.setStopping(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Terminated", targetDepth)) {
                    context.nextToken();
                    instancesCount.setTerminated(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Terminating", targetDepth)) {
                    context.nextToken();
                    instancesCount.setTerminating(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Unassigning", targetDepth)) {
                    context.nextToken();
                    instancesCount.setUnassigning(IntegerJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instancesCount;
    }

    private static InstancesCountJsonUnmarshaller instance;

    public static InstancesCountJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstancesCountJsonUnmarshaller();
        return instance;
    }
}
