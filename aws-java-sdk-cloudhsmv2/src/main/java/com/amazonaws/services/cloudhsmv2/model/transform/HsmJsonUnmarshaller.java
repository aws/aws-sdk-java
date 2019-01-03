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
package com.amazonaws.services.cloudhsmv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsmv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Hsm JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HsmJsonUnmarshaller implements Unmarshaller<Hsm, JsonUnmarshallerContext> {

    public Hsm unmarshall(JsonUnmarshallerContext context) throws Exception {
        Hsm hsm = new Hsm();

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
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    hsm.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterId", targetDepth)) {
                    context.nextToken();
                    hsm.setClusterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    hsm.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EniId", targetDepth)) {
                    context.nextToken();
                    hsm.setEniId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EniIp", targetDepth)) {
                    context.nextToken();
                    hsm.setEniIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HsmId", targetDepth)) {
                    context.nextToken();
                    hsm.setHsmId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    hsm.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateMessage", targetDepth)) {
                    context.nextToken();
                    hsm.setStateMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hsm;
    }

    private static HsmJsonUnmarshaller instance;

    public static HsmJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HsmJsonUnmarshaller();
        return instance;
    }
}
