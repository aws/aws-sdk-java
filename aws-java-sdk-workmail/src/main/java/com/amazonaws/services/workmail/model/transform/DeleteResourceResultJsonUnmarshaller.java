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
package com.amazonaws.services.workmail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeleteResourceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteResourceResultJsonUnmarshaller implements Unmarshaller<DeleteResourceResult, JsonUnmarshallerContext> {

    public DeleteResourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteResourceResult deleteResourceResult = new DeleteResourceResult();

        return deleteResourceResult;
    }

    private static DeleteResourceResultJsonUnmarshaller instance;

    public static DeleteResourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteResourceResultJsonUnmarshaller();
        return instance;
    }
}
