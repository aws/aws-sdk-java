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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImageRecipe JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageRecipeJsonUnmarshaller implements Unmarshaller<ImageRecipe, JsonUnmarshallerContext> {

    public ImageRecipe unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImageRecipe imageRecipe = new ImageRecipe();

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
                    imageRecipe.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    imageRecipe.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    imageRecipe.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    imageRecipe.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owner", targetDepth)) {
                    context.nextToken();
                    imageRecipe.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    imageRecipe.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("components", targetDepth)) {
                    context.nextToken();
                    imageRecipe.setComponents(new ListUnmarshaller<ComponentConfiguration>(ComponentConfigurationJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("parentImage", targetDepth)) {
                    context.nextToken();
                    imageRecipe.setParentImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("blockDeviceMappings", targetDepth)) {
                    context.nextToken();
                    imageRecipe.setBlockDeviceMappings(new ListUnmarshaller<InstanceBlockDeviceMapping>(InstanceBlockDeviceMappingJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("dateCreated", targetDepth)) {
                    context.nextToken();
                    imageRecipe.setDateCreated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    imageRecipe.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return imageRecipe;
    }

    private static ImageRecipeJsonUnmarshaller instance;

    public static ImageRecipeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageRecipeJsonUnmarshaller();
        return instance;
    }
}
