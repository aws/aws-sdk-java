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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * StepSummaryMarshaller
 */
public class StepSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StepSummary stepSummary, StructuredJsonGenerator jsonGenerator) {

        if (stepSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (stepSummary.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(stepSummary.getId());
            }
            if (stepSummary.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(stepSummary.getName());
            }
            if (stepSummary.getConfig() != null) {
                jsonGenerator.writeFieldName("Config");
                HadoopStepConfigJsonMarshaller.getInstance().marshall(stepSummary.getConfig(), jsonGenerator);
            }
            if (stepSummary.getActionOnFailure() != null) {
                jsonGenerator.writeFieldName("ActionOnFailure").writeValue(stepSummary.getActionOnFailure());
            }
            if (stepSummary.getStatus() != null) {
                jsonGenerator.writeFieldName("Status");
                StepStatusJsonMarshaller.getInstance().marshall(stepSummary.getStatus(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StepSummaryJsonMarshaller instance;

    public static StepSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepSummaryJsonMarshaller();
        return instance;
    }

}
