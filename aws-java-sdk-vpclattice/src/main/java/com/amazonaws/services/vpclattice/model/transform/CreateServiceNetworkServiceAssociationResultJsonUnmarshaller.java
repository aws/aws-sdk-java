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
package com.amazonaws.services.vpclattice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.vpclattice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateServiceNetworkServiceAssociationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceNetworkServiceAssociationResultJsonUnmarshaller implements
        Unmarshaller<CreateServiceNetworkServiceAssociationResult, JsonUnmarshallerContext> {

    public CreateServiceNetworkServiceAssociationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateServiceNetworkServiceAssociationResult createServiceNetworkServiceAssociationResult = new CreateServiceNetworkServiceAssociationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createServiceNetworkServiceAssociationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    createServiceNetworkServiceAssociationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    createServiceNetworkServiceAssociationResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customDomainName", targetDepth)) {
                    context.nextToken();
                    createServiceNetworkServiceAssociationResult.setCustomDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dnsEntry", targetDepth)) {
                    context.nextToken();
                    createServiceNetworkServiceAssociationResult.setDnsEntry(DnsEntryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createServiceNetworkServiceAssociationResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    createServiceNetworkServiceAssociationResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createServiceNetworkServiceAssociationResult;
    }

    private static CreateServiceNetworkServiceAssociationResultJsonUnmarshaller instance;

    public static CreateServiceNetworkServiceAssociationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateServiceNetworkServiceAssociationResultJsonUnmarshaller();
        return instance;
    }
}
