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
package com.amazonaws.services.appstream.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Image JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageJsonUnmarshaller implements Unmarshaller<Image, JsonUnmarshallerContext> {

    public Image unmarshall(JsonUnmarshallerContext context) throws Exception {
        Image image = new Image();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    image.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    image.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BaseImageArn", targetDepth)) {
                    context.nextToken();
                    image.setBaseImageArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    image.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    image.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Visibility", targetDepth)) {
                    context.nextToken();
                    image.setVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageBuilderSupported", targetDepth)) {
                    context.nextToken();
                    image.setImageBuilderSupported(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Platform", targetDepth)) {
                    context.nextToken();
                    image.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    image.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateChangeReason", targetDepth)) {
                    context.nextToken();
                    image.setStateChangeReason(ImageStateChangeReasonJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Applications", targetDepth)) {
                    context.nextToken();
                    image.setApplications(new ListUnmarshaller<Application>(ApplicationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    image.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("PublicBaseImageReleasedDate", targetDepth)) {
                    context.nextToken();
                    image.setPublicBaseImageReleasedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AppstreamAgentVersion", targetDepth)) {
                    context.nextToken();
                    image.setAppstreamAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImagePermissions", targetDepth)) {
                    context.nextToken();
                    image.setImagePermissions(ImagePermissionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return image;
    }

    private static ImageJsonUnmarshaller instance;

    public static ImageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageJsonUnmarshaller();
        return instance;
    }
}
