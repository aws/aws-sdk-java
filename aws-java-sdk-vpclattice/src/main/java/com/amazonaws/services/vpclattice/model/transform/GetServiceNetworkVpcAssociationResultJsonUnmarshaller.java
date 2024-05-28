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
 * GetServiceNetworkVpcAssociationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceNetworkVpcAssociationResultJsonUnmarshaller implements Unmarshaller<GetServiceNetworkVpcAssociationResult, JsonUnmarshallerContext> {

    public GetServiceNetworkVpcAssociationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetServiceNetworkVpcAssociationResult getServiceNetworkVpcAssociationResult = new GetServiceNetworkVpcAssociationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getServiceNetworkVpcAssociationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureCode", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureMessage", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("securityGroupIds", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("serviceNetworkArn", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setServiceNetworkArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceNetworkId", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setServiceNetworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceNetworkName", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setServiceNetworkName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcId", targetDepth)) {
                    context.nextToken();
                    getServiceNetworkVpcAssociationResult.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getServiceNetworkVpcAssociationResult;
    }

    private static GetServiceNetworkVpcAssociationResultJsonUnmarshaller instance;

    public static GetServiceNetworkVpcAssociationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetServiceNetworkVpcAssociationResultJsonUnmarshaller();
        return instance;
    }
}
