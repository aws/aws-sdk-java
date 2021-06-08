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
package com.amazonaws.services.codeartifact.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PackageVersionDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageVersionDescriptionJsonUnmarshaller implements Unmarshaller<PackageVersionDescription, JsonUnmarshallerContext> {

    public PackageVersionDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        PackageVersionDescription packageVersionDescription = new PackageVersionDescription();

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
                if (context.testExpression("format", targetDepth)) {
                    context.nextToken();
                    packageVersionDescription.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("namespace", targetDepth)) {
                    context.nextToken();
                    packageVersionDescription.setNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("packageName", targetDepth)) {
                    context.nextToken();
                    packageVersionDescription.setPackageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    packageVersionDescription.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    packageVersionDescription.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("summary", targetDepth)) {
                    context.nextToken();
                    packageVersionDescription.setSummary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("homePage", targetDepth)) {
                    context.nextToken();
                    packageVersionDescription.setHomePage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceCodeRepository", targetDepth)) {
                    context.nextToken();
                    packageVersionDescription.setSourceCodeRepository(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("publishedTime", targetDepth)) {
                    context.nextToken();
                    packageVersionDescription.setPublishedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("licenses", targetDepth)) {
                    context.nextToken();
                    packageVersionDescription.setLicenses(new ListUnmarshaller<LicenseInfo>(LicenseInfoJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("revision", targetDepth)) {
                    context.nextToken();
                    packageVersionDescription.setRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    packageVersionDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return packageVersionDescription;
    }

    private static PackageVersionDescriptionJsonUnmarshaller instance;

    public static PackageVersionDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PackageVersionDescriptionJsonUnmarshaller();
        return instance;
    }
}
