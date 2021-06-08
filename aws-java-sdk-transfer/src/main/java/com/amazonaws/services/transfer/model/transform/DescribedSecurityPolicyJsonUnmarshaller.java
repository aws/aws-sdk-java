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
package com.amazonaws.services.transfer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribedSecurityPolicy JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedSecurityPolicyJsonUnmarshaller implements Unmarshaller<DescribedSecurityPolicy, JsonUnmarshallerContext> {

    public DescribedSecurityPolicy unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribedSecurityPolicy describedSecurityPolicy = new DescribedSecurityPolicy();

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
                if (context.testExpression("Fips", targetDepth)) {
                    context.nextToken();
                    describedSecurityPolicy.setFips(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SecurityPolicyName", targetDepth)) {
                    context.nextToken();
                    describedSecurityPolicy.setSecurityPolicyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SshCiphers", targetDepth)) {
                    context.nextToken();
                    describedSecurityPolicy.setSshCiphers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SshKexs", targetDepth)) {
                    context.nextToken();
                    describedSecurityPolicy.setSshKexs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SshMacs", targetDepth)) {
                    context.nextToken();
                    describedSecurityPolicy.setSshMacs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("TlsCiphers", targetDepth)) {
                    context.nextToken();
                    describedSecurityPolicy.setTlsCiphers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describedSecurityPolicy;
    }

    private static DescribedSecurityPolicyJsonUnmarshaller instance;

    public static DescribedSecurityPolicyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribedSecurityPolicyJsonUnmarshaller();
        return instance;
    }
}
