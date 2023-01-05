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
package com.amazonaws.services.groundstation.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.groundstation.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeEphemerisResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEphemerisResultJsonUnmarshaller implements Unmarshaller<DescribeEphemerisResult, JsonUnmarshallerContext> {

    public DescribeEphemerisResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeEphemerisResult describeEphemerisResult = new DescribeEphemerisResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeEphemerisResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    describeEphemerisResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("enabled", targetDepth)) {
                    context.nextToken();
                    describeEphemerisResult.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ephemerisId", targetDepth)) {
                    context.nextToken();
                    describeEphemerisResult.setEphemerisId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("invalidReason", targetDepth)) {
                    context.nextToken();
                    describeEphemerisResult.setInvalidReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    describeEphemerisResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("priority", targetDepth)) {
                    context.nextToken();
                    describeEphemerisResult.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("satelliteId", targetDepth)) {
                    context.nextToken();
                    describeEphemerisResult.setSatelliteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    describeEphemerisResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suppliedData", targetDepth)) {
                    context.nextToken();
                    describeEphemerisResult.setSuppliedData(EphemerisTypeDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    describeEphemerisResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeEphemerisResult;
    }

    private static DescribeEphemerisResultJsonUnmarshaller instance;

    public static DescribeEphemerisResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEphemerisResultJsonUnmarshaller();
        return instance;
    }
}
