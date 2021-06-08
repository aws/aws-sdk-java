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
package com.amazonaws.services.licensemanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Grant JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantJsonUnmarshaller implements Unmarshaller<Grant, JsonUnmarshallerContext> {

    public Grant unmarshall(JsonUnmarshallerContext context) throws Exception {
        Grant grant = new Grant();

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
                if (context.testExpression("GrantArn", targetDepth)) {
                    context.nextToken();
                    grant.setGrantArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GrantName", targetDepth)) {
                    context.nextToken();
                    grant.setGrantName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParentArn", targetDepth)) {
                    context.nextToken();
                    grant.setParentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseArn", targetDepth)) {
                    context.nextToken();
                    grant.setLicenseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GranteePrincipalArn", targetDepth)) {
                    context.nextToken();
                    grant.setGranteePrincipalArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HomeRegion", targetDepth)) {
                    context.nextToken();
                    grant.setHomeRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GrantStatus", targetDepth)) {
                    context.nextToken();
                    grant.setGrantStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    context.nextToken();
                    grant.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    grant.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GrantedOperations", targetDepth)) {
                    context.nextToken();
                    grant.setGrantedOperations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return grant;
    }

    private static GrantJsonUnmarshaller instance;

    public static GrantJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GrantJsonUnmarshaller();
        return instance;
    }
}
