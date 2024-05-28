/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DataLakeResource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeResourceJsonUnmarshaller implements Unmarshaller<DataLakeResource, JsonUnmarshallerContext> {

    public DataLakeResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataLakeResource dataLakeResource = new DataLakeResource();

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
                if (context.testExpression("createStatus", targetDepth)) {
                    context.nextToken();
                    dataLakeResource.setCreateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataLakeArn", targetDepth)) {
                    context.nextToken();
                    dataLakeResource.setDataLakeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encryptionConfiguration", targetDepth)) {
                    context.nextToken();
                    dataLakeResource.setEncryptionConfiguration(DataLakeEncryptionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lifecycleConfiguration", targetDepth)) {
                    context.nextToken();
                    dataLakeResource.setLifecycleConfiguration(DataLakeLifecycleConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    dataLakeResource.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationConfiguration", targetDepth)) {
                    context.nextToken();
                    dataLakeResource.setReplicationConfiguration(DataLakeReplicationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("s3BucketArn", targetDepth)) {
                    context.nextToken();
                    dataLakeResource.setS3BucketArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updateStatus", targetDepth)) {
                    context.nextToken();
                    dataLakeResource.setUpdateStatus(DataLakeUpdateStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataLakeResource;
    }

    private static DataLakeResourceJsonUnmarshaller instance;

    public static DataLakeResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataLakeResourceJsonUnmarshaller();
        return instance;
    }
}
