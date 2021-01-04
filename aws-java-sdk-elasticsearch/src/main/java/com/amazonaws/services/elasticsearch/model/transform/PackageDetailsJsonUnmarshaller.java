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
package com.amazonaws.services.elasticsearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PackageDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageDetailsJsonUnmarshaller implements Unmarshaller<PackageDetails, JsonUnmarshallerContext> {

    public PackageDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        PackageDetails packageDetails = new PackageDetails();

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
                if (context.testExpression("PackageID", targetDepth)) {
                    context.nextToken();
                    packageDetails.setPackageID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageName", targetDepth)) {
                    context.nextToken();
                    packageDetails.setPackageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageType", targetDepth)) {
                    context.nextToken();
                    packageDetails.setPackageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageDescription", targetDepth)) {
                    context.nextToken();
                    packageDetails.setPackageDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageStatus", targetDepth)) {
                    context.nextToken();
                    packageDetails.setPackageStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    packageDetails.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    packageDetails.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AvailablePackageVersion", targetDepth)) {
                    context.nextToken();
                    packageDetails.setAvailablePackageVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorDetails", targetDepth)) {
                    context.nextToken();
                    packageDetails.setErrorDetails(ErrorDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return packageDetails;
    }

    private static PackageDetailsJsonUnmarshaller instance;

    public static PackageDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PackageDetailsJsonUnmarshaller();
        return instance;
    }
}
