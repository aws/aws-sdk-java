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
package com.amazonaws.services.directory.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Trust JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustJsonUnmarshaller implements Unmarshaller<Trust, JsonUnmarshallerContext> {

    public Trust unmarshall(JsonUnmarshallerContext context) throws Exception {
        Trust trust = new Trust();

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
                if (context.testExpression("DirectoryId", targetDepth)) {
                    context.nextToken();
                    trust.setDirectoryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrustId", targetDepth)) {
                    context.nextToken();
                    trust.setTrustId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RemoteDomainName", targetDepth)) {
                    context.nextToken();
                    trust.setRemoteDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrustType", targetDepth)) {
                    context.nextToken();
                    trust.setTrustType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrustDirection", targetDepth)) {
                    context.nextToken();
                    trust.setTrustDirection(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrustState", targetDepth)) {
                    context.nextToken();
                    trust.setTrustState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDateTime", targetDepth)) {
                    context.nextToken();
                    trust.setCreatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    trust.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StateLastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    trust.setStateLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrustStateReason", targetDepth)) {
                    context.nextToken();
                    trust.setTrustStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelectiveAuth", targetDepth)) {
                    context.nextToken();
                    trust.setSelectiveAuth(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return trust;
    }

    private static TrustJsonUnmarshaller instance;

    public static TrustJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrustJsonUnmarshaller();
        return instance;
    }
}
