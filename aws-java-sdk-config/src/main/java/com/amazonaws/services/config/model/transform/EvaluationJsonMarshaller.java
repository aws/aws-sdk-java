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
package com.amazonaws.services.config.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EvaluationMarshaller
 */
public class EvaluationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Evaluation evaluation, StructuredJsonGenerator jsonGenerator) {

        if (evaluation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (evaluation.getComplianceResourceType() != null) {
                jsonGenerator.writeFieldName("ComplianceResourceType").writeValue(evaluation.getComplianceResourceType());
            }
            if (evaluation.getComplianceResourceId() != null) {
                jsonGenerator.writeFieldName("ComplianceResourceId").writeValue(evaluation.getComplianceResourceId());
            }
            if (evaluation.getComplianceType() != null) {
                jsonGenerator.writeFieldName("ComplianceType").writeValue(evaluation.getComplianceType());
            }
            if (evaluation.getAnnotation() != null) {
                jsonGenerator.writeFieldName("Annotation").writeValue(evaluation.getAnnotation());
            }
            if (evaluation.getOrderingTimestamp() != null) {
                jsonGenerator.writeFieldName("OrderingTimestamp").writeValue(evaluation.getOrderingTimestamp());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EvaluationJsonMarshaller instance;

    public static EvaluationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationJsonMarshaller();
        return instance;
    }

}
