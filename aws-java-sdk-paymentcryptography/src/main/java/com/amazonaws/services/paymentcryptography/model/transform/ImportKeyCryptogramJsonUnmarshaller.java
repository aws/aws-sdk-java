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
package com.amazonaws.services.paymentcryptography.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.paymentcryptography.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImportKeyCryptogram JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportKeyCryptogramJsonUnmarshaller implements Unmarshaller<ImportKeyCryptogram, JsonUnmarshallerContext> {

    public ImportKeyCryptogram unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportKeyCryptogram importKeyCryptogram = new ImportKeyCryptogram();

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
                if (context.testExpression("KeyAttributes", targetDepth)) {
                    context.nextToken();
                    importKeyCryptogram.setKeyAttributes(KeyAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Exportable", targetDepth)) {
                    context.nextToken();
                    importKeyCryptogram.setExportable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("WrappedKeyCryptogram", targetDepth)) {
                    context.nextToken();
                    importKeyCryptogram.setWrappedKeyCryptogram(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImportToken", targetDepth)) {
                    context.nextToken();
                    importKeyCryptogram.setImportToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WrappingSpec", targetDepth)) {
                    context.nextToken();
                    importKeyCryptogram.setWrappingSpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return importKeyCryptogram;
    }

    private static ImportKeyCryptogramJsonUnmarshaller instance;

    public static ImportKeyCryptogramJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportKeyCryptogramJsonUnmarshaller();
        return instance;
    }
}
