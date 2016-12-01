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
 * AttackSummaryMarshaller
 */
public class AttackSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AttackSummary attackSummary, StructuredJsonGenerator jsonGenerator) {

        if (attackSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (attackSummary.getAttackId() != null) {
                jsonGenerator.writeFieldName("AttackId").writeValue(attackSummary.getAttackId());
            }
            if (attackSummary.getResourceArn() != null) {
                jsonGenerator.writeFieldName("ResourceArn").writeValue(attackSummary.getResourceArn());
            }
            if (attackSummary.getStartTime() != null) {
                jsonGenerator.writeFieldName("StartTime").writeValue(attackSummary.getStartTime());
            }
            if (attackSummary.getEndTime() != null) {
                jsonGenerator.writeFieldName("EndTime").writeValue(attackSummary.getEndTime());
            }

            java.util.List<AttackVectorDescription> attackVectorsList = attackSummary.getAttackVectors();
            if (attackVectorsList != null) {
                jsonGenerator.writeFieldName("AttackVectors");
                jsonGenerator.writeStartArray();
                for (AttackVectorDescription attackVectorsListValue : attackVectorsList) {
                    if (attackVectorsListValue != null) {

                        AttackVectorDescriptionJsonMarshaller.getInstance().marshall(attackVectorsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AttackSummaryJsonMarshaller instance;

    public static AttackSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttackSummaryJsonMarshaller();
        return instance;
    }

}
