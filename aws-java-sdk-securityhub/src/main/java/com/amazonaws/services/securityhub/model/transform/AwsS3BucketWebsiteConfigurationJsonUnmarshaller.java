/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsS3BucketWebsiteConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketWebsiteConfigurationJsonUnmarshaller implements Unmarshaller<AwsS3BucketWebsiteConfiguration, JsonUnmarshallerContext> {

    public AwsS3BucketWebsiteConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsS3BucketWebsiteConfiguration awsS3BucketWebsiteConfiguration = new AwsS3BucketWebsiteConfiguration();

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
                if (context.testExpression("ErrorDocument", targetDepth)) {
                    context.nextToken();
                    awsS3BucketWebsiteConfiguration.setErrorDocument(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IndexDocumentSuffix", targetDepth)) {
                    context.nextToken();
                    awsS3BucketWebsiteConfiguration.setIndexDocumentSuffix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RedirectAllRequestsTo", targetDepth)) {
                    context.nextToken();
                    awsS3BucketWebsiteConfiguration.setRedirectAllRequestsTo(AwsS3BucketWebsiteConfigurationRedirectToJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("RoutingRules", targetDepth)) {
                    context.nextToken();
                    awsS3BucketWebsiteConfiguration.setRoutingRules(new ListUnmarshaller<AwsS3BucketWebsiteConfigurationRoutingRule>(
                            AwsS3BucketWebsiteConfigurationRoutingRuleJsonUnmarshaller.getInstance())

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

        return awsS3BucketWebsiteConfiguration;
    }

    private static AwsS3BucketWebsiteConfigurationJsonUnmarshaller instance;

    public static AwsS3BucketWebsiteConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsS3BucketWebsiteConfigurationJsonUnmarshaller();
        return instance;
    }
}
