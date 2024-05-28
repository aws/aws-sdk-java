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
package com.amazonaws.services.tnb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.tnb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ValidateSolFunctionPackageContentMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateSolFunctionPackageContentMetadataJsonUnmarshaller implements
        Unmarshaller<ValidateSolFunctionPackageContentMetadata, JsonUnmarshallerContext> {

    public ValidateSolFunctionPackageContentMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        ValidateSolFunctionPackageContentMetadata validateSolFunctionPackageContentMetadata = new ValidateSolFunctionPackageContentMetadata();

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
                if (context.testExpression("vnfd", targetDepth)) {
                    context.nextToken();
                    validateSolFunctionPackageContentMetadata.setVnfd(FunctionArtifactMetaJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return validateSolFunctionPackageContentMetadata;
    }

    private static ValidateSolFunctionPackageContentMetadataJsonUnmarshaller instance;

    public static ValidateSolFunctionPackageContentMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ValidateSolFunctionPackageContentMetadataJsonUnmarshaller();
        return instance;
    }
}
