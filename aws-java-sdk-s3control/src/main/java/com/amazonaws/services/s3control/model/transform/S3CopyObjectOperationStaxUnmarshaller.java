/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * S3CopyObjectOperation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3CopyObjectOperationStaxUnmarshaller implements Unmarshaller<S3CopyObjectOperation, StaxUnmarshallerContext> {

    public S3CopyObjectOperation unmarshall(StaxUnmarshallerContext context) throws Exception {
        S3CopyObjectOperation s3CopyObjectOperation = new S3CopyObjectOperation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return s3CopyObjectOperation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TargetResource", targetDepth)) {
                    s3CopyObjectOperation.setTargetResource(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CannedAccessControlList", targetDepth)) {
                    s3CopyObjectOperation.setCannedAccessControlList(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessControlGrants", targetDepth)) {
                    s3CopyObjectOperation.withAccessControlGrants(new ArrayList<S3Grant>());
                    continue;
                }

                if (context.testExpression("AccessControlGrants/member", targetDepth)) {
                    s3CopyObjectOperation.withAccessControlGrants(S3GrantStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MetadataDirective", targetDepth)) {
                    s3CopyObjectOperation.setMetadataDirective(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ModifiedSinceConstraint", targetDepth)) {
                    s3CopyObjectOperation.setModifiedSinceConstraint(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("NewObjectMetadata", targetDepth)) {
                    s3CopyObjectOperation.setNewObjectMetadata(S3ObjectMetadataStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NewObjectTagging", targetDepth)) {
                    s3CopyObjectOperation.withNewObjectTagging(new ArrayList<S3Tag>());
                    continue;
                }

                if (context.testExpression("NewObjectTagging/member", targetDepth)) {
                    s3CopyObjectOperation.withNewObjectTagging(S3TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RedirectLocation", targetDepth)) {
                    s3CopyObjectOperation.setRedirectLocation(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RequesterPays", targetDepth)) {
                    s3CopyObjectOperation.setRequesterPays(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StorageClass", targetDepth)) {
                    s3CopyObjectOperation.setStorageClass(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UnModifiedSinceConstraint", targetDepth)) {
                    s3CopyObjectOperation.setUnModifiedSinceConstraint(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("SSEAwsKmsKeyId", targetDepth)) {
                    s3CopyObjectOperation.setSSEAwsKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetKeyPrefix", targetDepth)) {
                    s3CopyObjectOperation.setTargetKeyPrefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ObjectLockLegalHoldStatus", targetDepth)) {
                    s3CopyObjectOperation.setObjectLockLegalHoldStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ObjectLockMode", targetDepth)) {
                    s3CopyObjectOperation.setObjectLockMode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ObjectLockRetainUntilDate", targetDepth)) {
                    s3CopyObjectOperation.setObjectLockRetainUntilDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return s3CopyObjectOperation;
                }
            }
        }
    }

    private static S3CopyObjectOperationStaxUnmarshaller instance;

    public static S3CopyObjectOperationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3CopyObjectOperationStaxUnmarshaller();
        return instance;
    }
}
