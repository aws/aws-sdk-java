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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OpenHours JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenHoursJsonUnmarshaller implements Unmarshaller<OpenHours, JsonUnmarshallerContext> {

    public OpenHours unmarshall(JsonUnmarshallerContext context) throws Exception {
        OpenHours openHours = new OpenHours();

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
                if (context.testExpression("EMAIL", targetDepth)) {
                    context.nextToken();
                    openHours.setEMAIL(new MapUnmarshaller<String, java.util.List<OpenHoursRule>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<OpenHoursRule>(OpenHoursRuleJsonUnmarshaller.getInstance())

                    ).unmarshall(context));
                }
                if (context.testExpression("SMS", targetDepth)) {
                    context.nextToken();
                    openHours.setSMS(new MapUnmarshaller<String, java.util.List<OpenHoursRule>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<OpenHoursRule>(OpenHoursRuleJsonUnmarshaller.getInstance())

                    ).unmarshall(context));
                }
                if (context.testExpression("PUSH", targetDepth)) {
                    context.nextToken();
                    openHours.setPUSH(new MapUnmarshaller<String, java.util.List<OpenHoursRule>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<OpenHoursRule>(OpenHoursRuleJsonUnmarshaller.getInstance())

                    ).unmarshall(context));
                }
                if (context.testExpression("VOICE", targetDepth)) {
                    context.nextToken();
                    openHours.setVOICE(new MapUnmarshaller<String, java.util.List<OpenHoursRule>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<OpenHoursRule>(OpenHoursRuleJsonUnmarshaller.getInstance())

                    ).unmarshall(context));
                }
                if (context.testExpression("CUSTOM", targetDepth)) {
                    context.nextToken();
                    openHours.setCUSTOM(new MapUnmarshaller<String, java.util.List<OpenHoursRule>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<OpenHoursRule>(OpenHoursRuleJsonUnmarshaller.getInstance())

                    ).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return openHours;
    }

    private static OpenHoursJsonUnmarshaller instance;

    public static OpenHoursJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OpenHoursJsonUnmarshaller();
        return instance;
    }
}
