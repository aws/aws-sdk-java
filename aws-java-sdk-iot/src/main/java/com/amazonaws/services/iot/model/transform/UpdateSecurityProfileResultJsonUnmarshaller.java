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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateSecurityProfileResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecurityProfileResultJsonUnmarshaller implements Unmarshaller<UpdateSecurityProfileResult, JsonUnmarshallerContext> {

    public UpdateSecurityProfileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateSecurityProfileResult updateSecurityProfileResult = new UpdateSecurityProfileResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateSecurityProfileResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("securityProfileName", targetDepth)) {
                    context.nextToken();
                    updateSecurityProfileResult.setSecurityProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityProfileArn", targetDepth)) {
                    context.nextToken();
                    updateSecurityProfileResult.setSecurityProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityProfileDescription", targetDepth)) {
                    context.nextToken();
                    updateSecurityProfileResult.setSecurityProfileDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("behaviors", targetDepth)) {
                    context.nextToken();
                    updateSecurityProfileResult.setBehaviors(new ListUnmarshaller<Behavior>(BehaviorJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("alertTargets", targetDepth)) {
                    context.nextToken();
                    updateSecurityProfileResult.setAlertTargets(new MapUnmarshaller<String, AlertTarget>(context.getUnmarshaller(String.class),
                            AlertTargetJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("additionalMetricsToRetain", targetDepth)) {
                    context.nextToken();
                    updateSecurityProfileResult.setAdditionalMetricsToRetain(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    updateSecurityProfileResult.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    updateSecurityProfileResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    updateSecurityProfileResult.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateSecurityProfileResult;
    }

    private static UpdateSecurityProfileResultJsonUnmarshaller instance;

    public static UpdateSecurityProfileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateSecurityProfileResultJsonUnmarshaller();
        return instance;
    }
}
