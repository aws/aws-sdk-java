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
package com.amazonaws.services.customerprofiles.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetProfileObjectTypeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProfileObjectTypeResultJsonUnmarshaller implements Unmarshaller<GetProfileObjectTypeResult, JsonUnmarshallerContext> {

    public GetProfileObjectTypeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetProfileObjectTypeResult getProfileObjectTypeResult = new GetProfileObjectTypeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getProfileObjectTypeResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ObjectTypeName", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeResult.setObjectTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateId", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeResult.setTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpirationDays", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeResult.setExpirationDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionKey", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeResult.setEncryptionKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllowProfileCreation", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeResult.setAllowProfileCreation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Fields", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeResult.setFields(new MapUnmarshaller<String, ObjectTypeField>(context.getUnmarshaller(String.class),
                            ObjectTypeFieldJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Keys", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeResult.setKeys(new MapUnmarshaller<String, java.util.List<ObjectTypeKey>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<ObjectTypeKey>(ObjectTypeKeyJsonUnmarshaller.getInstance())

                    ).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return getProfileObjectTypeResult;
    }

    private static GetProfileObjectTypeResultJsonUnmarshaller instance;

    public static GetProfileObjectTypeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetProfileObjectTypeResultJsonUnmarshaller();
        return instance;
    }
}
