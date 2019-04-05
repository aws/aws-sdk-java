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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OrcSerDe JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrcSerDeJsonUnmarshaller implements Unmarshaller<OrcSerDe, JsonUnmarshallerContext> {

    public OrcSerDe unmarshall(JsonUnmarshallerContext context) throws Exception {
        OrcSerDe orcSerDe = new OrcSerDe();

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
                if (context.testExpression("StripeSizeBytes", targetDepth)) {
                    context.nextToken();
                    orcSerDe.setStripeSizeBytes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BlockSizeBytes", targetDepth)) {
                    context.nextToken();
                    orcSerDe.setBlockSizeBytes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RowIndexStride", targetDepth)) {
                    context.nextToken();
                    orcSerDe.setRowIndexStride(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EnablePadding", targetDepth)) {
                    context.nextToken();
                    orcSerDe.setEnablePadding(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PaddingTolerance", targetDepth)) {
                    context.nextToken();
                    orcSerDe.setPaddingTolerance(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Compression", targetDepth)) {
                    context.nextToken();
                    orcSerDe.setCompression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BloomFilterColumns", targetDepth)) {
                    context.nextToken();
                    orcSerDe.setBloomFilterColumns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("BloomFilterFalsePositiveProbability", targetDepth)) {
                    context.nextToken();
                    orcSerDe.setBloomFilterFalsePositiveProbability(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("DictionaryKeyThreshold", targetDepth)) {
                    context.nextToken();
                    orcSerDe.setDictionaryKeyThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("FormatVersion", targetDepth)) {
                    context.nextToken();
                    orcSerDe.setFormatVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return orcSerDe;
    }

    private static OrcSerDeJsonUnmarshaller instance;

    public static OrcSerDeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrcSerDeJsonUnmarshaller();
        return instance;
    }
}
