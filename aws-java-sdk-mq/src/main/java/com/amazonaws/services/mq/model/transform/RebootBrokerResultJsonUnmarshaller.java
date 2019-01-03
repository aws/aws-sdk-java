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
package com.amazonaws.services.mq.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mq.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RebootBrokerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RebootBrokerResultJsonUnmarshaller implements Unmarshaller<RebootBrokerResult, JsonUnmarshallerContext> {

    public RebootBrokerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RebootBrokerResult rebootBrokerResult = new RebootBrokerResult();

        return rebootBrokerResult;
    }

    private static RebootBrokerResultJsonUnmarshaller instance;

    public static RebootBrokerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RebootBrokerResultJsonUnmarshaller();
        return instance;
    }
}
