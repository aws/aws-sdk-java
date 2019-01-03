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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Patch JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchJsonUnmarshaller implements Unmarshaller<Patch, JsonUnmarshallerContext> {

    public Patch unmarshall(JsonUnmarshallerContext context) throws Exception {
        Patch patch = new Patch();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    patch.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReleaseDate", targetDepth)) {
                    context.nextToken();
                    patch.setReleaseDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    patch.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    patch.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentUrl", targetDepth)) {
                    context.nextToken();
                    patch.setContentUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Vendor", targetDepth)) {
                    context.nextToken();
                    patch.setVendor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductFamily", targetDepth)) {
                    context.nextToken();
                    patch.setProductFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Product", targetDepth)) {
                    context.nextToken();
                    patch.setProduct(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Classification", targetDepth)) {
                    context.nextToken();
                    patch.setClassification(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MsrcSeverity", targetDepth)) {
                    context.nextToken();
                    patch.setMsrcSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KbNumber", targetDepth)) {
                    context.nextToken();
                    patch.setKbNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MsrcNumber", targetDepth)) {
                    context.nextToken();
                    patch.setMsrcNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Language", targetDepth)) {
                    context.nextToken();
                    patch.setLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return patch;
    }

    private static PatchJsonUnmarshaller instance;

    public static PatchJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PatchJsonUnmarshaller();
        return instance;
    }
}
