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
package com.amazonaws.services.deadline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.deadline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeleteQueueEnvironmentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteQueueEnvironmentResultJsonUnmarshaller implements Unmarshaller<DeleteQueueEnvironmentResult, JsonUnmarshallerContext> {

    public DeleteQueueEnvironmentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteQueueEnvironmentResult deleteQueueEnvironmentResult = new DeleteQueueEnvironmentResult();

        return deleteQueueEnvironmentResult;
    }

    private static DeleteQueueEnvironmentResultJsonUnmarshaller instance;

    public static DeleteQueueEnvironmentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteQueueEnvironmentResultJsonUnmarshaller();
        return instance;
    }
}
