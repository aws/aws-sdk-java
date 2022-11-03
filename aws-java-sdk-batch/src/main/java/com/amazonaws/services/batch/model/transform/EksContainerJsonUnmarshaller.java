/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EksContainer JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksContainerJsonUnmarshaller implements Unmarshaller<EksContainer, JsonUnmarshallerContext> {

    public EksContainer unmarshall(JsonUnmarshallerContext context) throws Exception {
        EksContainer eksContainer = new EksContainer();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    eksContainer.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("image", targetDepth)) {
                    context.nextToken();
                    eksContainer.setImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imagePullPolicy", targetDepth)) {
                    context.nextToken();
                    eksContainer.setImagePullPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("command", targetDepth)) {
                    context.nextToken();
                    eksContainer.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("args", targetDepth)) {
                    context.nextToken();
                    eksContainer.setArgs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("env", targetDepth)) {
                    context.nextToken();
                    eksContainer.setEnv(new ListUnmarshaller<EksContainerEnvironmentVariable>(EksContainerEnvironmentVariableJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resources", targetDepth)) {
                    context.nextToken();
                    eksContainer.setResources(EksContainerResourceRequirementsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("volumeMounts", targetDepth)) {
                    context.nextToken();
                    eksContainer.setVolumeMounts(new ListUnmarshaller<EksContainerVolumeMount>(EksContainerVolumeMountJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("securityContext", targetDepth)) {
                    context.nextToken();
                    eksContainer.setSecurityContext(EksContainerSecurityContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eksContainer;
    }

    private static EksContainerJsonUnmarshaller instance;

    public static EksContainerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EksContainerJsonUnmarshaller();
        return instance;
    }
}
