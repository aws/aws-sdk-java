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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VcenterClient JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VcenterClientJsonUnmarshaller implements Unmarshaller<VcenterClient, JsonUnmarshallerContext> {

    public VcenterClient unmarshall(JsonUnmarshallerContext context) throws Exception {
        VcenterClient vcenterClient = new VcenterClient();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    vcenterClient.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datacenterName", targetDepth)) {
                    context.nextToken();
                    vcenterClient.setDatacenterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostname", targetDepth)) {
                    context.nextToken();
                    vcenterClient.setHostname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastSeenDatetime", targetDepth)) {
                    context.nextToken();
                    vcenterClient.setLastSeenDatetime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceServerTags", targetDepth)) {
                    context.nextToken();
                    vcenterClient.setSourceServerTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    vcenterClient.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("vcenterClientID", targetDepth)) {
                    context.nextToken();
                    vcenterClient.setVcenterClientID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vcenterUUID", targetDepth)) {
                    context.nextToken();
                    vcenterClient.setVcenterUUID(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return vcenterClient;
    }

    private static VcenterClientJsonUnmarshaller instance;

    public static VcenterClientJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VcenterClientJsonUnmarshaller();
        return instance;
    }
}
