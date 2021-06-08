/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MatchingBucket JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchingBucketJsonUnmarshaller implements Unmarshaller<MatchingBucket, JsonUnmarshallerContext> {

    public MatchingBucket unmarshall(JsonUnmarshallerContext context) throws Exception {
        MatchingBucket matchingBucket = new MatchingBucket();

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
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    matchingBucket.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bucketName", targetDepth)) {
                    context.nextToken();
                    matchingBucket.setBucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("classifiableObjectCount", targetDepth)) {
                    context.nextToken();
                    matchingBucket.setClassifiableObjectCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("classifiableSizeInBytes", targetDepth)) {
                    context.nextToken();
                    matchingBucket.setClassifiableSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("jobDetails", targetDepth)) {
                    context.nextToken();
                    matchingBucket.setJobDetails(JobDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("objectCount", targetDepth)) {
                    context.nextToken();
                    matchingBucket.setObjectCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("objectCountByEncryptionType", targetDepth)) {
                    context.nextToken();
                    matchingBucket.setObjectCountByEncryptionType(ObjectCountByEncryptionTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sizeInBytes", targetDepth)) {
                    context.nextToken();
                    matchingBucket.setSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("sizeInBytesCompressed", targetDepth)) {
                    context.nextToken();
                    matchingBucket.setSizeInBytesCompressed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("unclassifiableObjectCount", targetDepth)) {
                    context.nextToken();
                    matchingBucket.setUnclassifiableObjectCount(ObjectLevelStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("unclassifiableObjectSizeInBytes", targetDepth)) {
                    context.nextToken();
                    matchingBucket.setUnclassifiableObjectSizeInBytes(ObjectLevelStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return matchingBucket;
    }

    private static MatchingBucketJsonUnmarshaller instance;

    public static MatchingBucketJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MatchingBucketJsonUnmarshaller();
        return instance;
    }
}
