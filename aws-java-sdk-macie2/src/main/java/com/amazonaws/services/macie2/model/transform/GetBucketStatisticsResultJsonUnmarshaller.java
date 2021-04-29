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
 * GetBucketStatisticsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBucketStatisticsResultJsonUnmarshaller implements Unmarshaller<GetBucketStatisticsResult, JsonUnmarshallerContext> {

    public GetBucketStatisticsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBucketStatisticsResult getBucketStatisticsResult = new GetBucketStatisticsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getBucketStatisticsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("bucketCount", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setBucketCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("bucketCountByEffectivePermission", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setBucketCountByEffectivePermission(BucketCountByEffectivePermissionJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("bucketCountByEncryptionType", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setBucketCountByEncryptionType(BucketCountByEncryptionTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("bucketCountByObjectEncryptionRequirement", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setBucketCountByObjectEncryptionRequirement(BucketCountPolicyAllowsUnencryptedObjectUploadsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("bucketCountBySharedAccessType", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setBucketCountBySharedAccessType(BucketCountBySharedAccessTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("classifiableObjectCount", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setClassifiableObjectCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("classifiableSizeInBytes", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setClassifiableSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdated", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("objectCount", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setObjectCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("sizeInBytes", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("sizeInBytesCompressed", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setSizeInBytesCompressed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("unclassifiableObjectCount", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setUnclassifiableObjectCount(ObjectLevelStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("unclassifiableObjectSizeInBytes", targetDepth)) {
                    context.nextToken();
                    getBucketStatisticsResult.setUnclassifiableObjectSizeInBytes(ObjectLevelStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getBucketStatisticsResult;
    }

    private static GetBucketStatisticsResultJsonUnmarshaller instance;

    public static GetBucketStatisticsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBucketStatisticsResultJsonUnmarshaller();
        return instance;
    }
}
