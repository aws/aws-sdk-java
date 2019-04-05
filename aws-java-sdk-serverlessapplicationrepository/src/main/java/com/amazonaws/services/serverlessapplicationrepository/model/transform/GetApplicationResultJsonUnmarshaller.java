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
package com.amazonaws.services.serverlessapplicationrepository.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.serverlessapplicationrepository.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetApplicationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationResultJsonUnmarshaller implements Unmarshaller<GetApplicationResult, JsonUnmarshallerContext> {

    public GetApplicationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetApplicationResult getApplicationResult = new GetApplicationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getApplicationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("applicationId", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("author", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setAuthor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("homePageUrl", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setHomePageUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("labels", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setLabels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("licenseUrl", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setLicenseUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("readmeUrl", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setReadmeUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("spdxLicenseId", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setSpdxLicenseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    getApplicationResult.setVersion(VersionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getApplicationResult;
    }

    private static GetApplicationResultJsonUnmarshaller instance;

    public static GetApplicationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetApplicationResultJsonUnmarshaller();
        return instance;
    }
}
