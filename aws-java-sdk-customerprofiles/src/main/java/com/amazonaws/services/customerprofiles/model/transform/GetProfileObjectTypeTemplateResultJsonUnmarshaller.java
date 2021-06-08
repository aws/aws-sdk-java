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
 * GetProfileObjectTypeTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProfileObjectTypeTemplateResultJsonUnmarshaller implements Unmarshaller<GetProfileObjectTypeTemplateResult, JsonUnmarshallerContext> {

    public GetProfileObjectTypeTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetProfileObjectTypeTemplateResult getProfileObjectTypeTemplateResult = new GetProfileObjectTypeTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getProfileObjectTypeTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TemplateId", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeTemplateResult.setTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceName", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeTemplateResult.setSourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceObject", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeTemplateResult.setSourceObject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllowProfileCreation", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeTemplateResult.setAllowProfileCreation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Fields", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeTemplateResult.setFields(new MapUnmarshaller<String, ObjectTypeField>(context.getUnmarshaller(String.class),
                            ObjectTypeFieldJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Keys", targetDepth)) {
                    context.nextToken();
                    getProfileObjectTypeTemplateResult.setKeys(new MapUnmarshaller<String, java.util.List<ObjectTypeKey>>(
                            context.getUnmarshaller(String.class), new ListUnmarshaller<ObjectTypeKey>(ObjectTypeKeyJsonUnmarshaller.getInstance())

                    ).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getProfileObjectTypeTemplateResult;
    }

    private static GetProfileObjectTypeTemplateResultJsonUnmarshaller instance;

    public static GetProfileObjectTypeTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetProfileObjectTypeTemplateResultJsonUnmarshaller();
        return instance;
    }
}
