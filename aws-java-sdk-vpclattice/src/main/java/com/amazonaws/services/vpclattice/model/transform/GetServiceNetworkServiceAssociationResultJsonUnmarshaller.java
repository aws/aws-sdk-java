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
 * GetServiceNetworkServiceAssociationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceNetworkServiceAssociationResultJsonUnmarshaller implements
        Unmarshaller<GetServiceNetworkServiceAssociationResult, JsonUnmarshallerContext> {

    public GetServiceNetworkServiceAssociationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetServiceNetworkServiceAssociationResult getServiceNetworkServiceAssociationResult = new GetServiceNetworkServiceAssociationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getServiceNetworkServiceAssociationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customDomainName", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setCustomDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dnsEntry", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setDnsEntry(DnsEntryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("failureCode", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureMessage", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceArn", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setServiceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceId", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setServiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceName", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceNetworkArn", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setServiceNetworkArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceNetworkId", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setServiceNetworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceNetworkName", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setServiceNetworkName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkServiceAssociationResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getServiceNetworkServiceAssociationResult;
    }

    private static GetServiceNetworkServiceAssociationResultJsonUnmarshaller instance;

    public static GetServiceNetworkServiceAssociationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetServiceNetworkServiceAssociationResultJsonUnmarshaller();
        return instance;
    }
}
