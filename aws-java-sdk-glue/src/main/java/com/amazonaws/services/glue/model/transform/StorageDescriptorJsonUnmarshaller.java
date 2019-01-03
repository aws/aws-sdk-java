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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StorageDescriptor JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageDescriptorJsonUnmarshaller implements Unmarshaller<StorageDescriptor, JsonUnmarshallerContext> {

    public StorageDescriptor unmarshall(JsonUnmarshallerContext context) throws Exception {
        StorageDescriptor storageDescriptor = new StorageDescriptor();

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
                if (context.testExpression("Columns", targetDepth)) {
                    context.nextToken();
                    storageDescriptor.setColumns(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Location", targetDepth)) {
                    context.nextToken();
                    storageDescriptor.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputFormat", targetDepth)) {
                    context.nextToken();
                    storageDescriptor.setInputFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputFormat", targetDepth)) {
                    context.nextToken();
                    storageDescriptor.setOutputFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Compressed", targetDepth)) {
                    context.nextToken();
                    storageDescriptor.setCompressed(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfBuckets", targetDepth)) {
                    context.nextToken();
                    storageDescriptor.setNumberOfBuckets(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SerdeInfo", targetDepth)) {
                    context.nextToken();
                    storageDescriptor.setSerdeInfo(SerDeInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BucketColumns", targetDepth)) {
                    context.nextToken();
                    storageDescriptor.setBucketColumns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SortColumns", targetDepth)) {
                    context.nextToken();
                    storageDescriptor.setSortColumns(new ListUnmarshaller<Order>(OrderJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    storageDescriptor.setParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SkewedInfo", targetDepth)) {
                    context.nextToken();
                    storageDescriptor.setSkewedInfo(SkewedInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StoredAsSubDirectories", targetDepth)) {
                    context.nextToken();
                    storageDescriptor.setStoredAsSubDirectories(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return storageDescriptor;
    }

    private static StorageDescriptorJsonUnmarshaller instance;

    public static StorageDescriptorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StorageDescriptorJsonUnmarshaller();
        return instance;
    }
}
