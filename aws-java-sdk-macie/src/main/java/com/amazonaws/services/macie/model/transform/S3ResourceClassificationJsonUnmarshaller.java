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
package com.amazonaws.services.macie.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * S3ResourceClassification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ResourceClassificationJsonUnmarshaller implements Unmarshaller<S3ResourceClassification, JsonUnmarshallerContext> {

    public S3ResourceClassification unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3ResourceClassification s3ResourceClassification = new S3ResourceClassification();

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
                if (context.testExpression("bucketName", targetDepth)) {
                    context.nextToken();
                    s3ResourceClassification.setBucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("prefix", targetDepth)) {
                    context.nextToken();
                    s3ResourceClassification.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("classificationType", targetDepth)) {
                    context.nextToken();
                    s3ResourceClassification.setClassificationType(ClassificationTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3ResourceClassification;
    }

    private static S3ResourceClassificationJsonUnmarshaller instance;

    public static S3ResourceClassificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3ResourceClassificationJsonUnmarshaller();
        return instance;
    }
}
