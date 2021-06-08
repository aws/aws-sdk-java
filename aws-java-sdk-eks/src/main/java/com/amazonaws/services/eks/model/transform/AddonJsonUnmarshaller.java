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
package com.amazonaws.services.eks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.eks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Addon JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddonJsonUnmarshaller implements Unmarshaller<Addon, JsonUnmarshallerContext> {

    public Addon unmarshall(JsonUnmarshallerContext context) throws Exception {
        Addon addon = new Addon();

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
                if (context.testExpression("addonName", targetDepth)) {
                    context.nextToken();
                    addon.setAddonName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterName", targetDepth)) {
                    context.nextToken();
                    addon.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    addon.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("addonVersion", targetDepth)) {
                    context.nextToken();
                    addon.setAddonVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("health", targetDepth)) {
                    context.nextToken();
                    addon.setHealth(AddonHealthJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("addonArn", targetDepth)) {
                    context.nextToken();
                    addon.setAddonArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    addon.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("modifiedAt", targetDepth)) {
                    context.nextToken();
                    addon.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("serviceAccountRoleArn", targetDepth)) {
                    context.nextToken();
                    addon.setServiceAccountRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    addon.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return addon;
    }

    private static AddonJsonUnmarshaller instance;

    public static AddonJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddonJsonUnmarshaller();
        return instance;
    }
}
