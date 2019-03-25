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
package com.amazonaws.services.fms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Policy JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyJsonUnmarshaller implements Unmarshaller<Policy, JsonUnmarshallerContext> {

    public Policy unmarshall(JsonUnmarshallerContext context) throws Exception {
        Policy policy = new Policy();

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
                if (context.testExpression("PolicyId", targetDepth)) {
                    context.nextToken();
                    policy.setPolicyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PolicyName", targetDepth)) {
                    context.nextToken();
                    policy.setPolicyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PolicyUpdateToken", targetDepth)) {
                    context.nextToken();
                    policy.setPolicyUpdateToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityServicePolicyData", targetDepth)) {
                    context.nextToken();
                    policy.setSecurityServicePolicyData(SecurityServicePolicyDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    policy.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceTypeList", targetDepth)) {
                    context.nextToken();
                    policy.setResourceTypeList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ResourceTags", targetDepth)) {
                    context.nextToken();
                    policy.setResourceTags(new ListUnmarshaller<ResourceTag>(ResourceTagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ExcludeResourceTags", targetDepth)) {
                    context.nextToken();
                    policy.setExcludeResourceTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RemediationEnabled", targetDepth)) {
                    context.nextToken();
                    policy.setRemediationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeMap", targetDepth)) {
                    context.nextToken();
                    policy.setIncludeMap(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("ExcludeMap", targetDepth)) {
                    context.nextToken();
                    policy.setExcludeMap(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return policy;
    }

    private static PolicyJsonUnmarshaller instance;

    public static PolicyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PolicyJsonUnmarshaller();
        return instance;
    }
}
