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
package com.amazonaws.services.securitylake.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securitylake.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LakeConfigurationResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LakeConfigurationResponseJsonUnmarshaller implements Unmarshaller<LakeConfigurationResponse, JsonUnmarshallerContext> {

    public LakeConfigurationResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        LakeConfigurationResponse lakeConfigurationResponse = new LakeConfigurationResponse();

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
                if (context.testExpression("encryptionKey", targetDepth)) {
                    context.nextToken();
                    lakeConfigurationResponse.setEncryptionKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationDestinationRegions", targetDepth)) {
                    context.nextToken();
                    lakeConfigurationResponse.setReplicationDestinationRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("replicationRoleArn", targetDepth)) {
                    context.nextToken();
                    lakeConfigurationResponse.setReplicationRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("retentionSettings", targetDepth)) {
                    context.nextToken();
                    lakeConfigurationResponse.setRetentionSettings(new ListUnmarshaller<RetentionSetting>(RetentionSettingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("s3BucketArn", targetDepth)) {
                    context.nextToken();
                    lakeConfigurationResponse.setS3BucketArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    lakeConfigurationResponse.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tagsMap", targetDepth)) {
                    context.nextToken();
                    lakeConfigurationResponse.setTagsMap(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return lakeConfigurationResponse;
    }

    private static LakeConfigurationResponseJsonUnmarshaller instance;

    public static LakeConfigurationResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LakeConfigurationResponseJsonUnmarshaller();
        return instance;
    }
}
