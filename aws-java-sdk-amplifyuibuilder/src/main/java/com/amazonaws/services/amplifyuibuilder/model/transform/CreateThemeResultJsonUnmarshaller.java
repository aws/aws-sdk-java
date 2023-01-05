/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplifyuibuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateThemeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateThemeResultJsonUnmarshaller implements Unmarshaller<CreateThemeResult, JsonUnmarshallerContext> {

    public CreateThemeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateThemeResult createThemeResult = new CreateThemeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createThemeResult;
        }

        while (true) {
            if (token == null)
                break;

            createThemeResult.setEntity(ThemeJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return createThemeResult;
    }

    private static CreateThemeResultJsonUnmarshaller instance;

    public static CreateThemeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateThemeResultJsonUnmarshaller();
        return instance;
    }
}
