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
package com.amazonaws.services.accessanalyzer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * S3BucketConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketConfigurationJsonUnmarshaller implements Unmarshaller<S3BucketConfiguration, JsonUnmarshallerContext> {

    public S3BucketConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3BucketConfiguration s3BucketConfiguration = new S3BucketConfiguration();

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
                if (context.testExpression("accessPoints", targetDepth)) {
                    context.nextToken();
                    s3BucketConfiguration.setAccessPoints(new MapUnmarshaller<String, S3AccessPointConfiguration>(context.getUnmarshaller(String.class),
                            S3AccessPointConfigurationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("bucketAclGrants", targetDepth)) {
                    context.nextToken();
                    s3BucketConfiguration.setBucketAclGrants(new ListUnmarshaller<S3BucketAclGrantConfiguration>(S3BucketAclGrantConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("bucketPolicy", targetDepth)) {
                    context.nextToken();
                    s3BucketConfiguration.setBucketPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bucketPublicAccessBlock", targetDepth)) {
                    context.nextToken();
                    s3BucketConfiguration.setBucketPublicAccessBlock(S3PublicAccessBlockConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3BucketConfiguration;
    }

    private static S3BucketConfigurationJsonUnmarshaller instance;

    public static S3BucketConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3BucketConfigurationJsonUnmarshaller();
        return instance;
    }
}
