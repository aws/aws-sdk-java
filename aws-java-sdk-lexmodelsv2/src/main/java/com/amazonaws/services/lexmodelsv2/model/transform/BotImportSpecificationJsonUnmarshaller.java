/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BotImportSpecification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotImportSpecificationJsonUnmarshaller implements Unmarshaller<BotImportSpecification, JsonUnmarshallerContext> {

    public BotImportSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        BotImportSpecification botImportSpecification = new BotImportSpecification();

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
                if (context.testExpression("botName", targetDepth)) {
                    context.nextToken();
                    botImportSpecification.setBotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    botImportSpecification.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataPrivacy", targetDepth)) {
                    context.nextToken();
                    botImportSpecification.setDataPrivacy(DataPrivacyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("idleSessionTTLInSeconds", targetDepth)) {
                    context.nextToken();
                    botImportSpecification.setIdleSessionTTLInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("botTags", targetDepth)) {
                    context.nextToken();
                    botImportSpecification.setBotTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("testBotAliasTags", targetDepth)) {
                    context.nextToken();
                    botImportSpecification.setTestBotAliasTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return botImportSpecification;
    }

    private static BotImportSpecificationJsonUnmarshaller instance;

    public static BotImportSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BotImportSpecificationJsonUnmarshaller();
        return instance;
    }
}
