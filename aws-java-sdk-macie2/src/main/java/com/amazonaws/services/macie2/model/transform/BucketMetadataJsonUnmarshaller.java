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
 * BucketMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketMetadataJsonUnmarshaller implements Unmarshaller<BucketMetadata, JsonUnmarshallerContext> {

    public BucketMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        BucketMetadata bucketMetadata = new BucketMetadata();

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
                    bucketMetadata.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("allowsUnencryptedObjectUploads", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setAllowsUnencryptedObjectUploads(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bucketArn", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setBucketArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bucketCreatedAt", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setBucketCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("bucketName", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setBucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("classifiableObjectCount", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setClassifiableObjectCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("classifiableSizeInBytes", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setClassifiableSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("jobDetails", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setJobDetails(JobDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastUpdated", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("objectCount", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setObjectCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("objectCountByEncryptionType", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setObjectCountByEncryptionType(ObjectCountByEncryptionTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("publicAccess", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setPublicAccess(BucketPublicAccessJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationDetails", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setReplicationDetails(ReplicationDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serverSideEncryption", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setServerSideEncryption(BucketServerSideEncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sharedAccess", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setSharedAccess(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sizeInBytes", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("sizeInBytesCompressed", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setSizeInBytesCompressed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setTags(new ListUnmarshaller<KeyValuePair>(KeyValuePairJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("unclassifiableObjectCount", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setUnclassifiableObjectCount(ObjectLevelStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("unclassifiableObjectSizeInBytes", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setUnclassifiableObjectSizeInBytes(ObjectLevelStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("versioning", targetDepth)) {
                    context.nextToken();
                    bucketMetadata.setVersioning(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return bucketMetadata;
    }

    private static BucketMetadataJsonUnmarshaller instance;

    public static BucketMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BucketMetadataJsonUnmarshaller();
        return instance;
    }
}
