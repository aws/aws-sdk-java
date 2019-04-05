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
package com.amazonaws.services.cloudhsm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeHapgResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHapgResultJsonUnmarshaller implements Unmarshaller<DescribeHapgResult, JsonUnmarshallerContext> {

    public DescribeHapgResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeHapgResult describeHapgResult = new DescribeHapgResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeHapgResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("HapgArn", targetDepth)) {
                    context.nextToken();
                    describeHapgResult.setHapgArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HapgSerial", targetDepth)) {
                    context.nextToken();
                    describeHapgResult.setHapgSerial(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HsmsLastActionFailed", targetDepth)) {
                    context.nextToken();
                    describeHapgResult.setHsmsLastActionFailed(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("HsmsPendingDeletion", targetDepth)) {
                    context.nextToken();
                    describeHapgResult.setHsmsPendingDeletion(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("HsmsPendingRegistration", targetDepth)) {
                    context.nextToken();
                    describeHapgResult.setHsmsPendingRegistration(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Label", targetDepth)) {
                    context.nextToken();
                    describeHapgResult.setLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTimestamp", targetDepth)) {
                    context.nextToken();
                    describeHapgResult.setLastModifiedTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PartitionSerialList", targetDepth)) {
                    context.nextToken();
                    describeHapgResult.setPartitionSerialList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    describeHapgResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeHapgResult;
    }

    private static DescribeHapgResultJsonUnmarshaller instance;

    public static DescribeHapgResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHapgResultJsonUnmarshaller();
        return instance;
    }
}
