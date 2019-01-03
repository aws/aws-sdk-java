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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResourceDataSyncS3Destination JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDataSyncS3DestinationJsonUnmarshaller implements Unmarshaller<ResourceDataSyncS3Destination, JsonUnmarshallerContext> {

    public ResourceDataSyncS3Destination unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceDataSyncS3Destination resourceDataSyncS3Destination = new ResourceDataSyncS3Destination();

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
                if (context.testExpression("BucketName", targetDepth)) {
                    context.nextToken();
                    resourceDataSyncS3Destination.setBucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Prefix", targetDepth)) {
                    context.nextToken();
                    resourceDataSyncS3Destination.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SyncFormat", targetDepth)) {
                    context.nextToken();
                    resourceDataSyncS3Destination.setSyncFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    context.nextToken();
                    resourceDataSyncS3Destination.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AWSKMSKeyARN", targetDepth)) {
                    context.nextToken();
                    resourceDataSyncS3Destination.setAWSKMSKeyARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return resourceDataSyncS3Destination;
    }

    private static ResourceDataSyncS3DestinationJsonUnmarshaller instance;

    public static ResourceDataSyncS3DestinationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceDataSyncS3DestinationJsonUnmarshaller();
        return instance;
    }
}
