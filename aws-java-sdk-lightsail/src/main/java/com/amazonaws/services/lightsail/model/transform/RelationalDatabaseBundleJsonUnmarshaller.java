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
 * RelationalDatabaseBundle JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseBundleJsonUnmarshaller implements Unmarshaller<RelationalDatabaseBundle, JsonUnmarshallerContext> {

    public RelationalDatabaseBundle unmarshall(JsonUnmarshallerContext context) throws Exception {
        RelationalDatabaseBundle relationalDatabaseBundle = new RelationalDatabaseBundle();

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
                if (context.testExpression("bundleId", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBundle.setBundleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBundle.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("price", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBundle.setPrice(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("ramSizeInGb", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBundle.setRamSizeInGb(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("diskSizeInGb", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBundle.setDiskSizeInGb(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("transferPerMonthInGb", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBundle.setTransferPerMonthInGb(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("cpuCount", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBundle.setCpuCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("isEncrypted", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBundle.setIsEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("isActive", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseBundle.setIsActive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return relationalDatabaseBundle;
    }

    private static RelationalDatabaseBundleJsonUnmarshaller instance;

    public static RelationalDatabaseBundleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseBundleJsonUnmarshaller();
        return instance;
    }
}
