/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * FailureDetailsMarshaller
 */
public class FailureDetailsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FailureDetails failureDetails, StructuredJsonGenerator jsonGenerator) {

        if (failureDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (failureDetails.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(failureDetails.getType());
            }
            if (failureDetails.getMessage() != null) {
                jsonGenerator.writeFieldName("message").writeValue(failureDetails.getMessage());
            }
            if (failureDetails.getExternalExecutionId() != null) {
                jsonGenerator.writeFieldName("externalExecutionId").writeValue(failureDetails.getExternalExecutionId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FailureDetailsJsonMarshaller instance;

    public static FailureDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FailureDetailsJsonMarshaller();
        return instance;
    }

}
