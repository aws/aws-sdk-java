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
package com.amazonaws.services.servermigration.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServerReplicationParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerReplicationParametersJsonUnmarshaller implements Unmarshaller<ServerReplicationParameters, JsonUnmarshallerContext> {

    public ServerReplicationParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServerReplicationParameters serverReplicationParameters = new ServerReplicationParameters();

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
                if (context.testExpression("seedTime", targetDepth)) {
                    context.nextToken();
                    serverReplicationParameters.setSeedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("frequency", targetDepth)) {
                    context.nextToken();
                    serverReplicationParameters.setFrequency(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("runOnce", targetDepth)) {
                    context.nextToken();
                    serverReplicationParameters.setRunOnce(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("licenseType", targetDepth)) {
                    context.nextToken();
                    serverReplicationParameters.setLicenseType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfRecentAmisToKeep", targetDepth)) {
                    context.nextToken();
                    serverReplicationParameters.setNumberOfRecentAmisToKeep(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("encrypted", targetDepth)) {
                    context.nextToken();
                    serverReplicationParameters.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    serverReplicationParameters.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serverReplicationParameters;
    }

    private static ServerReplicationParametersJsonUnmarshaller instance;

    public static ServerReplicationParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServerReplicationParametersJsonUnmarshaller();
        return instance;
    }
}
