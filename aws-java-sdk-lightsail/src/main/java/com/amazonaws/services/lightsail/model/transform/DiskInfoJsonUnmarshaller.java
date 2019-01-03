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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DiskInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiskInfoJsonUnmarshaller implements Unmarshaller<DiskInfo, JsonUnmarshallerContext> {

    public DiskInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        DiskInfo diskInfo = new DiskInfo();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    diskInfo.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("path", targetDepth)) {
                    context.nextToken();
                    diskInfo.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sizeInGb", targetDepth)) {
                    context.nextToken();
                    diskInfo.setSizeInGb(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("isSystemDisk", targetDepth)) {
                    context.nextToken();
                    diskInfo.setIsSystemDisk(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return diskInfo;
    }

    private static DiskInfoJsonUnmarshaller instance;

    public static DiskInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DiskInfoJsonUnmarshaller();
        return instance;
    }
}
