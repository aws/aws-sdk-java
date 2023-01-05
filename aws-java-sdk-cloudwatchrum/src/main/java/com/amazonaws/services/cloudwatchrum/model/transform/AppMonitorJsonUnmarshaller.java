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
package com.amazonaws.services.cloudwatchrum.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchrum.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppMonitor JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppMonitorJsonUnmarshaller implements Unmarshaller<AppMonitor, JsonUnmarshallerContext> {

    public AppMonitor unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppMonitor appMonitor = new AppMonitor();

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
                if (context.testExpression("AppMonitorConfiguration", targetDepth)) {
                    context.nextToken();
                    appMonitor.setAppMonitorConfiguration(AppMonitorConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Created", targetDepth)) {
                    context.nextToken();
                    appMonitor.setCreated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomEvents", targetDepth)) {
                    context.nextToken();
                    appMonitor.setCustomEvents(CustomEventsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataStorage", targetDepth)) {
                    context.nextToken();
                    appMonitor.setDataStorage(DataStorageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Domain", targetDepth)) {
                    context.nextToken();
                    appMonitor.setDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    appMonitor.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    context.nextToken();
                    appMonitor.setLastModified(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    appMonitor.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    appMonitor.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    appMonitor.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return appMonitor;
    }

    private static AppMonitorJsonUnmarshaller instance;

    public static AppMonitorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppMonitorJsonUnmarshaller();
        return instance;
    }
}
