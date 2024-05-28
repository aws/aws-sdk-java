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
package com.amazonaws.services.marketplacecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.marketplacecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EntityDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityDetailJsonUnmarshaller implements Unmarshaller<EntityDetail, JsonUnmarshallerContext> {

    public EntityDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        EntityDetail entityDetail = new EntityDetail();

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
                if (context.testExpression("EntityType", targetDepth)) {
                    context.nextToken();
                    entityDetail.setEntityType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EntityArn", targetDepth)) {
                    context.nextToken();
                    entityDetail.setEntityArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EntityIdentifier", targetDepth)) {
                    context.nextToken();
                    entityDetail.setEntityIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    entityDetail.setLastModifiedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return entityDetail;
    }

    private static EntityDetailJsonUnmarshaller instance;

    public static EntityDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntityDetailJsonUnmarshaller();
        return instance;
    }
}
