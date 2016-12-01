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
package com.amazonaws.services.shield.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.shield.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * SubResourceSummaryMarshaller
 */
public class SubResourceSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(SubResourceSummary subResourceSummary, StructuredJsonGenerator jsonGenerator) {

        if (subResourceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (subResourceSummary.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(subResourceSummary.getType());
            }
            if (subResourceSummary.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(subResourceSummary.getId());
            }

            java.util.List<SummarizedAttackVector> attackVectorsList = subResourceSummary.getAttackVectors();
            if (attackVectorsList != null) {
                jsonGenerator.writeFieldName("AttackVectors");
                jsonGenerator.writeStartArray();
                for (SummarizedAttackVector attackVectorsListValue : attackVectorsList) {
                    if (attackVectorsListValue != null) {

                        SummarizedAttackVectorJsonMarshaller.getInstance().marshall(attackVectorsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<SummarizedCounter> countersList = subResourceSummary.getCounters();
            if (countersList != null) {
                jsonGenerator.writeFieldName("Counters");
                jsonGenerator.writeStartArray();
                for (SummarizedCounter countersListValue : countersList) {
                    if (countersListValue != null) {

                        SummarizedCounterJsonMarshaller.getInstance().marshall(countersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SubResourceSummaryJsonMarshaller instance;

    public static SubResourceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SubResourceSummaryJsonMarshaller();
        return instance;
    }

}
