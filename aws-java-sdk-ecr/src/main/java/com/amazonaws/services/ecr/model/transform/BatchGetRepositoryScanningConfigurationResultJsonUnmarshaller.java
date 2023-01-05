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
package com.amazonaws.services.ecr.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchGetRepositoryScanningConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetRepositoryScanningConfigurationResultJsonUnmarshaller implements
        Unmarshaller<BatchGetRepositoryScanningConfigurationResult, JsonUnmarshallerContext> {

    public BatchGetRepositoryScanningConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchGetRepositoryScanningConfigurationResult batchGetRepositoryScanningConfigurationResult = new BatchGetRepositoryScanningConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return batchGetRepositoryScanningConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("scanningConfigurations", targetDepth)) {
                    context.nextToken();
                    batchGetRepositoryScanningConfigurationResult.setScanningConfigurations(new ListUnmarshaller<RepositoryScanningConfiguration>(
                            RepositoryScanningConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("failures", targetDepth)) {
                    context.nextToken();
                    batchGetRepositoryScanningConfigurationResult.setFailures(new ListUnmarshaller<RepositoryScanningConfigurationFailure>(
                            RepositoryScanningConfigurationFailureJsonUnmarshaller.getInstance())

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

        return batchGetRepositoryScanningConfigurationResult;
    }

    private static BatchGetRepositoryScanningConfigurationResultJsonUnmarshaller instance;

    public static BatchGetRepositoryScanningConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetRepositoryScanningConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
