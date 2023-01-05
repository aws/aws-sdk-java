/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftserverless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.redshiftserverless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Workgroup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkgroupJsonUnmarshaller implements Unmarshaller<Workgroup, JsonUnmarshallerContext> {

    public Workgroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        Workgroup workgroup = new Workgroup();

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
                if (context.testExpression("baseCapacity", targetDepth)) {
                    context.nextToken();
                    workgroup.setBaseCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("configParameters", targetDepth)) {
                    context.nextToken();
                    workgroup.setConfigParameters(new ListUnmarshaller<ConfigParameter>(ConfigParameterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    workgroup.setCreationDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("endpoint", targetDepth)) {
                    context.nextToken();
                    workgroup.setEndpoint(EndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("enhancedVpcRouting", targetDepth)) {
                    context.nextToken();
                    workgroup.setEnhancedVpcRouting(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("namespaceName", targetDepth)) {
                    context.nextToken();
                    workgroup.setNamespaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("port", targetDepth)) {
                    context.nextToken();
                    workgroup.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("publiclyAccessible", targetDepth)) {
                    context.nextToken();
                    workgroup.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("securityGroupIds", targetDepth)) {
                    context.nextToken();
                    workgroup.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    workgroup.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subnetIds", targetDepth)) {
                    context.nextToken();
                    workgroup.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("workgroupArn", targetDepth)) {
                    context.nextToken();
                    workgroup.setWorkgroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workgroupId", targetDepth)) {
                    context.nextToken();
                    workgroup.setWorkgroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workgroupName", targetDepth)) {
                    context.nextToken();
                    workgroup.setWorkgroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workgroup;
    }

    private static WorkgroupJsonUnmarshaller instance;

    public static WorkgroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkgroupJsonUnmarshaller();
        return instance;
    }
}
