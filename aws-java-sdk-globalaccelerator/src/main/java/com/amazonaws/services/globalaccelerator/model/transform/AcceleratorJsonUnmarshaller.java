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
package com.amazonaws.services.globalaccelerator.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.globalaccelerator.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Accelerator JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceleratorJsonUnmarshaller implements Unmarshaller<Accelerator, JsonUnmarshallerContext> {

    public Accelerator unmarshall(JsonUnmarshallerContext context) throws Exception {
        Accelerator accelerator = new Accelerator();

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
                if (context.testExpression("AcceleratorArn", targetDepth)) {
                    context.nextToken();
                    accelerator.setAcceleratorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    accelerator.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpAddressType", targetDepth)) {
                    context.nextToken();
                    accelerator.setIpAddressType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    accelerator.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IpSets", targetDepth)) {
                    context.nextToken();
                    accelerator.setIpSets(new ListUnmarshaller<IpSet>(IpSetJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    accelerator.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    accelerator.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    accelerator.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return accelerator;
    }

    private static AcceleratorJsonUnmarshaller instance;

    public static AcceleratorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AcceleratorJsonUnmarshaller();
        return instance;
    }
}
