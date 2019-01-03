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
package com.amazonaws.services.datasync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Options JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionsJsonUnmarshaller implements Unmarshaller<Options, JsonUnmarshallerContext> {

    public Options unmarshall(JsonUnmarshallerContext context) throws Exception {
        Options options = new Options();

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
                if (context.testExpression("VerifyMode", targetDepth)) {
                    context.nextToken();
                    options.setVerifyMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Atime", targetDepth)) {
                    context.nextToken();
                    options.setAtime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Mtime", targetDepth)) {
                    context.nextToken();
                    options.setMtime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Uid", targetDepth)) {
                    context.nextToken();
                    options.setUid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Gid", targetDepth)) {
                    context.nextToken();
                    options.setGid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreserveDeletedFiles", targetDepth)) {
                    context.nextToken();
                    options.setPreserveDeletedFiles(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreserveDevices", targetDepth)) {
                    context.nextToken();
                    options.setPreserveDevices(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PosixPermissions", targetDepth)) {
                    context.nextToken();
                    options.setPosixPermissions(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BytesPerSecond", targetDepth)) {
                    context.nextToken();
                    options.setBytesPerSecond(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return options;
    }

    private static OptionsJsonUnmarshaller instance;

    public static OptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OptionsJsonUnmarshaller();
        return instance;
    }
}
