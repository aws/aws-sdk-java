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
 * ElasticsearchDestinationUpdate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticsearchDestinationUpdateJsonUnmarshaller implements Unmarshaller<ElasticsearchDestinationUpdate, JsonUnmarshallerContext> {

    public ElasticsearchDestinationUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        ElasticsearchDestinationUpdate elasticsearchDestinationUpdate = new ElasticsearchDestinationUpdate();

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
                if (context.testExpression("RoleARN", targetDepth)) {
                    context.nextToken();
                    elasticsearchDestinationUpdate.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainARN", targetDepth)) {
                    context.nextToken();
                    elasticsearchDestinationUpdate.setDomainARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IndexName", targetDepth)) {
                    context.nextToken();
                    elasticsearchDestinationUpdate.setIndexName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TypeName", targetDepth)) {
                    context.nextToken();
                    elasticsearchDestinationUpdate.setTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IndexRotationPeriod", targetDepth)) {
                    context.nextToken();
                    elasticsearchDestinationUpdate.setIndexRotationPeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BufferingHints", targetDepth)) {
                    context.nextToken();
                    elasticsearchDestinationUpdate.setBufferingHints(ElasticsearchBufferingHintsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RetryOptions", targetDepth)) {
                    context.nextToken();
                    elasticsearchDestinationUpdate.setRetryOptions(ElasticsearchRetryOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3Update", targetDepth)) {
                    context.nextToken();
                    elasticsearchDestinationUpdate.setS3Update(S3DestinationUpdateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingConfiguration", targetDepth)) {
                    context.nextToken();
                    elasticsearchDestinationUpdate.setProcessingConfiguration(ProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchLoggingOptions", targetDepth)) {
                    context.nextToken();
                    elasticsearchDestinationUpdate.setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return elasticsearchDestinationUpdate;
    }

    private static ElasticsearchDestinationUpdateJsonUnmarshaller instance;

    public static ElasticsearchDestinationUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDestinationUpdateJsonUnmarshaller();
        return instance;
    }
}
