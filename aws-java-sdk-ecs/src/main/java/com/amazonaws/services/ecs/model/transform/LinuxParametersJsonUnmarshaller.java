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
package com.amazonaws.services.ecs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LinuxParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LinuxParametersJsonUnmarshaller implements Unmarshaller<LinuxParameters, JsonUnmarshallerContext> {

    public LinuxParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        LinuxParameters linuxParameters = new LinuxParameters();

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
                if (context.testExpression("capabilities", targetDepth)) {
                    context.nextToken();
                    linuxParameters.setCapabilities(KernelCapabilitiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("devices", targetDepth)) {
                    context.nextToken();
                    linuxParameters.setDevices(new ListUnmarshaller<Device>(DeviceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("initProcessEnabled", targetDepth)) {
                    context.nextToken();
                    linuxParameters.setInitProcessEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("sharedMemorySize", targetDepth)) {
                    context.nextToken();
                    linuxParameters.setSharedMemorySize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tmpfs", targetDepth)) {
                    context.nextToken();
                    linuxParameters.setTmpfs(new ListUnmarshaller<Tmpfs>(TmpfsJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return linuxParameters;
    }

    private static LinuxParametersJsonUnmarshaller instance;

    public static LinuxParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LinuxParametersJsonUnmarshaller();
        return instance;
    }
}
