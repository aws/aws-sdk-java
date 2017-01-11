/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.*;

/**
 * MergeShardsResult JSON Unmarshaller
 */
public class MergeShardsResultJsonUnmarshaller implements Unmarshaller<MergeShardsResult, JsonUnmarshallerContext> {

    public MergeShardsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        MergeShardsResult mergeShardsResult = new MergeShardsResult();

        return mergeShardsResult;
    }

    private static MergeShardsResultJsonUnmarshaller instance;

    public static MergeShardsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MergeShardsResultJsonUnmarshaller();
        return instance;
    }
}
