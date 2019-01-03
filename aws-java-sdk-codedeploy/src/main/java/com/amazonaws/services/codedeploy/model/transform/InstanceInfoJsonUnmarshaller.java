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
package com.amazonaws.services.codedeploy.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceInfoJsonUnmarshaller implements Unmarshaller<InstanceInfo, JsonUnmarshallerContext> {

    public InstanceInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceInfo instanceInfo = new InstanceInfo();

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
                if (context.testExpression("instanceName", targetDepth)) {
                    context.nextToken();
                    instanceInfo.setInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iamSessionArn", targetDepth)) {
                    context.nextToken();
                    instanceInfo.setIamSessionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iamUserArn", targetDepth)) {
                    context.nextToken();
                    instanceInfo.setIamUserArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceArn", targetDepth)) {
                    context.nextToken();
                    instanceInfo.setInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("registerTime", targetDepth)) {
                    context.nextToken();
                    instanceInfo.setRegisterTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("deregisterTime", targetDepth)) {
                    context.nextToken();
                    instanceInfo.setDeregisterTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    instanceInfo.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceInfo;
    }

    private static InstanceInfoJsonUnmarshaller instance;

    public static InstanceInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceInfoJsonUnmarshaller();
        return instance;
    }
}
