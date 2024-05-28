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
package com.amazonaws.services.repostspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.repostspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSpaceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSpaceResultJsonUnmarshaller implements Unmarshaller<GetSpaceResult, JsonUnmarshallerContext> {

    public GetSpaceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSpaceResult getSpaceResult = new GetSpaceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSpaceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientId", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configurationStatus", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setConfigurationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contentSize", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setContentSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("createDateTime", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setCreateDateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("customerRoleArn", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setCustomerRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deleteDateTime", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setDeleteDateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("groupAdmins", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setGroupAdmins(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("randomDomain", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setRandomDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("spaceId", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setSpaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storageLimit", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setStorageLimit(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("tier", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setTier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userAdmins", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setUserAdmins(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("userCount", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setUserCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("userKMSKey", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setUserKMSKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vanityDomain", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setVanityDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vanityDomainStatus", targetDepth)) {
                    context.nextToken();
                    getSpaceResult.setVanityDomainStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSpaceResult;
    }

    private static GetSpaceResultJsonUnmarshaller instance;

    public static GetSpaceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSpaceResultJsonUnmarshaller();
        return instance;
    }
}
