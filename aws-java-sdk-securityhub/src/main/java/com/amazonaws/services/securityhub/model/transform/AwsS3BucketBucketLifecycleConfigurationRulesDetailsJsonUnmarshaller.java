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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsS3BucketBucketLifecycleConfigurationRulesDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketBucketLifecycleConfigurationRulesDetailsJsonUnmarshaller implements
        Unmarshaller<AwsS3BucketBucketLifecycleConfigurationRulesDetails, JsonUnmarshallerContext> {

    public AwsS3BucketBucketLifecycleConfigurationRulesDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsS3BucketBucketLifecycleConfigurationRulesDetails awsS3BucketBucketLifecycleConfigurationRulesDetails = new AwsS3BucketBucketLifecycleConfigurationRulesDetails();

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
                if (context.testExpression("AbortIncompleteMultipartUpload", targetDepth)) {
                    context.nextToken();
                    awsS3BucketBucketLifecycleConfigurationRulesDetails
                            .setAbortIncompleteMultipartUpload(AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetailsJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("ExpirationDate", targetDepth)) {
                    context.nextToken();
                    awsS3BucketBucketLifecycleConfigurationRulesDetails.setExpirationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpirationInDays", targetDepth)) {
                    context.nextToken();
                    awsS3BucketBucketLifecycleConfigurationRulesDetails.setExpirationInDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ExpiredObjectDeleteMarker", targetDepth)) {
                    context.nextToken();
                    awsS3BucketBucketLifecycleConfigurationRulesDetails
                            .setExpiredObjectDeleteMarker(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Filter", targetDepth)) {
                    context.nextToken();
                    awsS3BucketBucketLifecycleConfigurationRulesDetails.setFilter(AwsS3BucketBucketLifecycleConfigurationRulesFilterDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("ID", targetDepth)) {
                    context.nextToken();
                    awsS3BucketBucketLifecycleConfigurationRulesDetails.setID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NoncurrentVersionExpirationInDays", targetDepth)) {
                    context.nextToken();
                    awsS3BucketBucketLifecycleConfigurationRulesDetails.setNoncurrentVersionExpirationInDays(context.getUnmarshaller(Integer.class).unmarshall(
                            context));
                }
                if (context.testExpression("NoncurrentVersionTransitions", targetDepth)) {
                    context.nextToken();
                    awsS3BucketBucketLifecycleConfigurationRulesDetails
                            .setNoncurrentVersionTransitions(new ListUnmarshaller<AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails>(
                                    AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Prefix", targetDepth)) {
                    context.nextToken();
                    awsS3BucketBucketLifecycleConfigurationRulesDetails.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsS3BucketBucketLifecycleConfigurationRulesDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Transitions", targetDepth)) {
                    context.nextToken();
                    awsS3BucketBucketLifecycleConfigurationRulesDetails
                            .setTransitions(new ListUnmarshaller<AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails>(
                                    AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsS3BucketBucketLifecycleConfigurationRulesDetails;
    }

    private static AwsS3BucketBucketLifecycleConfigurationRulesDetailsJsonUnmarshaller instance;

    public static AwsS3BucketBucketLifecycleConfigurationRulesDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsS3BucketBucketLifecycleConfigurationRulesDetailsJsonUnmarshaller();
        return instance;
    }
}
