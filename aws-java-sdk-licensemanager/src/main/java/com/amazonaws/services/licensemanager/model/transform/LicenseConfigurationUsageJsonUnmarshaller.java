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
package com.amazonaws.services.licensemanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LicenseConfigurationUsage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseConfigurationUsageJsonUnmarshaller implements Unmarshaller<LicenseConfigurationUsage, JsonUnmarshallerContext> {

    public LicenseConfigurationUsage unmarshall(JsonUnmarshallerContext context) throws Exception {
        LicenseConfigurationUsage licenseConfigurationUsage = new LicenseConfigurationUsage();

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
                    licenseConfigurationUsage.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    licenseConfigurationUsage.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceStatus", targetDepth)) {
                    context.nextToken();
                    licenseConfigurationUsage.setResourceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceOwnerId", targetDepth)) {
                    context.nextToken();
                    licenseConfigurationUsage.setResourceOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationTime", targetDepth)) {
                    context.nextToken();
                    licenseConfigurationUsage.setAssociationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ConsumedLicenses", targetDepth)) {
                    context.nextToken();
                    licenseConfigurationUsage.setConsumedLicenses(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return licenseConfigurationUsage;
    }

    private static LicenseConfigurationUsageJsonUnmarshaller instance;

    public static LicenseConfigurationUsageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LicenseConfigurationUsageJsonUnmarshaller();
        return instance;
    }
}
