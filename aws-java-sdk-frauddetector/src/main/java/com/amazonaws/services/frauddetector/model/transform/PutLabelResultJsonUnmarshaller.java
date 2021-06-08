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
package com.amazonaws.services.frauddetector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PutLabelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLabelResultJsonUnmarshaller implements Unmarshaller<PutLabelResult, JsonUnmarshallerContext> {

    public PutLabelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutLabelResult putLabelResult = new PutLabelResult();

        return putLabelResult;
    }

    private static PutLabelResultJsonUnmarshaller instance;

    public static PutLabelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutLabelResultJsonUnmarshaller();
        return instance;
    }
}
