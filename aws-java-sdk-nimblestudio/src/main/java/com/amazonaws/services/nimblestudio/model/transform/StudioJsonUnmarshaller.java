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
package com.amazonaws.services.nimblestudio.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.nimblestudio.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Studio JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudioJsonUnmarshaller implements Unmarshaller<Studio, JsonUnmarshallerContext> {

    public Studio unmarshall(JsonUnmarshallerContext context) throws Exception {
        Studio studio = new Studio();

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
                if (context.testExpression("adminRoleArn", targetDepth)) {
                    context.nextToken();
                    studio.setAdminRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    studio.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    studio.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    studio.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("homeRegion", targetDepth)) {
                    context.nextToken();
                    studio.setHomeRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ssoClientId", targetDepth)) {
                    context.nextToken();
                    studio.setSsoClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    studio.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusCode", targetDepth)) {
                    context.nextToken();
                    studio.setStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    studio.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("studioEncryptionConfiguration", targetDepth)) {
                    context.nextToken();
                    studio.setStudioEncryptionConfiguration(StudioEncryptionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("studioId", targetDepth)) {
                    context.nextToken();
                    studio.setStudioId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("studioName", targetDepth)) {
                    context.nextToken();
                    studio.setStudioName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("studioUrl", targetDepth)) {
                    context.nextToken();
                    studio.setStudioUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    studio.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    studio.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("userRoleArn", targetDepth)) {
                    context.nextToken();
                    studio.setUserRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return studio;
    }

    private static StudioJsonUnmarshaller instance;

    public static StudioJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StudioJsonUnmarshaller();
        return instance;
    }
}
