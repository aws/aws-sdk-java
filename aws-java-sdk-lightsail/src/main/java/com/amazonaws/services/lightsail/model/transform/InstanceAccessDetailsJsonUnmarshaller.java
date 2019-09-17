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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceAccessDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceAccessDetailsJsonUnmarshaller implements Unmarshaller<InstanceAccessDetails, JsonUnmarshallerContext> {

    public InstanceAccessDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceAccessDetails instanceAccessDetails = new InstanceAccessDetails();

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
                if (context.testExpression("certKey", targetDepth)) {
                    context.nextToken();
                    instanceAccessDetails.setCertKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expiresAt", targetDepth)) {
                    context.nextToken();
                    instanceAccessDetails.setExpiresAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ipAddress", targetDepth)) {
                    context.nextToken();
                    instanceAccessDetails.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("password", targetDepth)) {
                    context.nextToken();
                    instanceAccessDetails.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("passwordData", targetDepth)) {
                    context.nextToken();
                    instanceAccessDetails.setPasswordData(PasswordDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("privateKey", targetDepth)) {
                    context.nextToken();
                    instanceAccessDetails.setPrivateKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("protocol", targetDepth)) {
                    context.nextToken();
                    instanceAccessDetails.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceName", targetDepth)) {
                    context.nextToken();
                    instanceAccessDetails.setInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("username", targetDepth)) {
                    context.nextToken();
                    instanceAccessDetails.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostKeys", targetDepth)) {
                    context.nextToken();
                    instanceAccessDetails.setHostKeys(new ListUnmarshaller<HostKeyAttributes>(HostKeyAttributesJsonUnmarshaller.getInstance())
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

        return instanceAccessDetails;
    }

    private static InstanceAccessDetailsJsonUnmarshaller instance;

    public static InstanceAccessDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceAccessDetailsJsonUnmarshaller();
        return instance;
    }
}
