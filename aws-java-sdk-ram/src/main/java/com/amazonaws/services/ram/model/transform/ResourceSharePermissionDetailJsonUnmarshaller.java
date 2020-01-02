/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ram.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ram.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResourceSharePermissionDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceSharePermissionDetailJsonUnmarshaller implements Unmarshaller<ResourceSharePermissionDetail, JsonUnmarshallerContext> {

    public ResourceSharePermissionDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceSharePermissionDetail resourceSharePermissionDetail = new ResourceSharePermissionDetail();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    resourceSharePermissionDetail.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    resourceSharePermissionDetail.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultVersion", targetDepth)) {
                    context.nextToken();
                    resourceSharePermissionDetail.setDefaultVersion(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    resourceSharePermissionDetail.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    resourceSharePermissionDetail.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("permission", targetDepth)) {
                    context.nextToken();
                    resourceSharePermissionDetail.setPermission(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    resourceSharePermissionDetail.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    resourceSharePermissionDetail.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return resourceSharePermissionDetail;
    }

    private static ResourceSharePermissionDetailJsonUnmarshaller instance;

    public static ResourceSharePermissionDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceSharePermissionDetailJsonUnmarshaller();
        return instance;
    }
}
