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
package com.amazonaws.services.transfer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribedHostKey JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedHostKeyJsonUnmarshaller implements Unmarshaller<DescribedHostKey, JsonUnmarshallerContext> {

    public DescribedHostKey unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribedHostKey describedHostKey = new DescribedHostKey();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    describedHostKey.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HostKeyId", targetDepth)) {
                    context.nextToken();
                    describedHostKey.setHostKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HostKeyFingerprint", targetDepth)) {
                    context.nextToken();
                    describedHostKey.setHostKeyFingerprint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describedHostKey.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    describedHostKey.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DateImported", targetDepth)) {
                    context.nextToken();
                    describedHostKey.setDateImported(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describedHostKey.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return describedHostKey;
    }

    private static DescribedHostKeyJsonUnmarshaller instance;

    public static DescribedHostKeyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribedHostKeyJsonUnmarshaller();
        return instance;
    }
}
