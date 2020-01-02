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
package com.amazonaws.services.licensemanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LicenseOperationFailure JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseOperationFailureJsonUnmarshaller implements Unmarshaller<LicenseOperationFailure, JsonUnmarshallerContext> {

    public LicenseOperationFailure unmarshall(JsonUnmarshallerContext context) throws Exception {
        LicenseOperationFailure licenseOperationFailure = new LicenseOperationFailure();

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
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    licenseOperationFailure.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    licenseOperationFailure.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    context.nextToken();
                    licenseOperationFailure.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureTime", targetDepth)) {
                    context.nextToken();
                    licenseOperationFailure.setFailureTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OperationName", targetDepth)) {
                    context.nextToken();
                    licenseOperationFailure.setOperationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceOwnerId", targetDepth)) {
                    context.nextToken();
                    licenseOperationFailure.setResourceOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OperationRequestedBy", targetDepth)) {
                    context.nextToken();
                    licenseOperationFailure.setOperationRequestedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetadataList", targetDepth)) {
                    context.nextToken();
                    licenseOperationFailure.setMetadataList(new ListUnmarshaller<Metadata>(MetadataJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return licenseOperationFailure;
    }

    private static LicenseOperationFailureJsonUnmarshaller instance;

    public static LicenseOperationFailureJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LicenseOperationFailureJsonUnmarshaller();
        return instance;
    }
}
