/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.repostspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.repostspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SpaceData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpaceDataJsonUnmarshaller implements Unmarshaller<SpaceData, JsonUnmarshallerContext> {

    public SpaceData unmarshall(JsonUnmarshallerContext context) throws Exception {
        SpaceData spaceData = new SpaceData();

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
                    spaceData.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configurationStatus", targetDepth)) {
                    context.nextToken();
                    spaceData.setConfigurationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contentSize", targetDepth)) {
                    context.nextToken();
                    spaceData.setContentSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("createDateTime", targetDepth)) {
                    context.nextToken();
                    spaceData.setCreateDateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("deleteDateTime", targetDepth)) {
                    context.nextToken();
                    spaceData.setDeleteDateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    spaceData.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    spaceData.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("randomDomain", targetDepth)) {
                    context.nextToken();
                    spaceData.setRandomDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("spaceId", targetDepth)) {
                    context.nextToken();
                    spaceData.setSpaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    spaceData.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storageLimit", targetDepth)) {
                    context.nextToken();
                    spaceData.setStorageLimit(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("tier", targetDepth)) {
                    context.nextToken();
                    spaceData.setTier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userCount", targetDepth)) {
                    context.nextToken();
                    spaceData.setUserCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("userKMSKey", targetDepth)) {
                    context.nextToken();
                    spaceData.setUserKMSKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vanityDomain", targetDepth)) {
                    context.nextToken();
                    spaceData.setVanityDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vanityDomainStatus", targetDepth)) {
                    context.nextToken();
                    spaceData.setVanityDomainStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return spaceData;
    }

    private static SpaceDataJsonUnmarshaller instance;

    public static SpaceDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SpaceDataJsonUnmarshaller();
        return instance;
    }
}
