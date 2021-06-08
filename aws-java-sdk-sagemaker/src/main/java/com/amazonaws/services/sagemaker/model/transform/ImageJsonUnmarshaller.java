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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
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
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    image.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    image.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    image.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    image.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageArn", targetDepth)) {
                    context.nextToken();
                    image.setImageArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageName", targetDepth)) {
                    context.nextToken();
                    image.setImageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageStatus", targetDepth)) {
                    context.nextToken();
                    image.setImageStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    image.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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
