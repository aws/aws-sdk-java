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
 * AttackDetailMarshaller
 */
public class AttackDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AttackDetail attackDetail, StructuredJsonGenerator jsonGenerator) {

        if (attackDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (attackDetail.getAttackId() != null) {
                jsonGenerator.writeFieldName("AttackId").writeValue(attackDetail.getAttackId());
            }
            if (attackDetail.getResourceArn() != null) {
                jsonGenerator.writeFieldName("ResourceArn").writeValue(attackDetail.getResourceArn());
            }

            java.util.List<SubResourceSummary> subResourcesList = attackDetail.getSubResources();
            if (subResourcesList != null) {
                jsonGenerator.writeFieldName("SubResources");
                jsonGenerator.writeStartArray();
                for (SubResourceSummary subResourcesListValue : subResourcesList) {
                    if (subResourcesListValue != null) {

                        SubResourceSummaryJsonMarshaller.getInstance().marshall(subResourcesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (attackDetail.getStartTime() != null) {
                jsonGenerator.writeFieldName("StartTime").writeValue(attackDetail.getStartTime());
            }
            if (attackDetail.getEndTime() != null) {
                jsonGenerator.writeFieldName("EndTime").writeValue(attackDetail.getEndTime());
            }

            java.util.List<SummarizedCounter> attackCountersList = attackDetail.getAttackCounters();
            if (attackCountersList != null) {
                jsonGenerator.writeFieldName("AttackCounters");
                jsonGenerator.writeStartArray();
                for (SummarizedCounter attackCountersListValue : attackCountersList) {
                    if (attackCountersListValue != null) {

                        SummarizedCounterJsonMarshaller.getInstance().marshall(attackCountersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Mitigation> mitigationsList = attackDetail.getMitigations();
            if (mitigationsList != null) {
                jsonGenerator.writeFieldName("Mitigations");
                jsonGenerator.writeStartArray();
                for (Mitigation mitigationsListValue : mitigationsList) {
                    if (mitigationsListValue != null) {

                        MitigationJsonMarshaller.getInstance().marshall(mitigationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AttackDetailJsonMarshaller instance;

    public static AttackDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttackDetailJsonMarshaller();
        return instance;
    }

}
