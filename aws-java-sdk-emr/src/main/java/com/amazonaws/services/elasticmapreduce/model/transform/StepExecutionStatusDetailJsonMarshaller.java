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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.json.*;

/**
 * StepExecutionStatusDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepExecutionStatusDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StepExecutionStatusDetail stepExecutionStatusDetail, StructuredJsonGenerator jsonGenerator) {

        if (stepExecutionStatusDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (stepExecutionStatusDetail.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(stepExecutionStatusDetail.getState());
            }
            if (stepExecutionStatusDetail.getCreationDateTime() != null) {
                jsonGenerator.writeFieldName("CreationDateTime").writeValue(stepExecutionStatusDetail.getCreationDateTime());
            }
            if (stepExecutionStatusDetail.getStartDateTime() != null) {
                jsonGenerator.writeFieldName("StartDateTime").writeValue(stepExecutionStatusDetail.getStartDateTime());
            }
            if (stepExecutionStatusDetail.getEndDateTime() != null) {
                jsonGenerator.writeFieldName("EndDateTime").writeValue(stepExecutionStatusDetail.getEndDateTime());
            }
            if (stepExecutionStatusDetail.getLastStateChangeReason() != null) {
                jsonGenerator.writeFieldName("LastStateChangeReason").writeValue(stepExecutionStatusDetail.getLastStateChangeReason());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StepExecutionStatusDetailJsonMarshaller instance;

    public static StepExecutionStatusDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepExecutionStatusDetailJsonMarshaller();
        return instance;
    }

}
