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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeleteKxVolumeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteKxVolumeResultJsonUnmarshaller implements Unmarshaller<DeleteKxVolumeResult, JsonUnmarshallerContext> {

    public DeleteKxVolumeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteKxVolumeResult deleteKxVolumeResult = new DeleteKxVolumeResult();

        return deleteKxVolumeResult;
    }

    private static DeleteKxVolumeResultJsonUnmarshaller instance;

    public static DeleteKxVolumeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteKxVolumeResultJsonUnmarshaller();
        return instance;
    }
}
