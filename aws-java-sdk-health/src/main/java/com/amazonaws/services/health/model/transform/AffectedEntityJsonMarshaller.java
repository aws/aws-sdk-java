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
package com.amazonaws.services.health.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.health.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AffectedEntityMarshaller
 */
public class AffectedEntityJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AffectedEntity affectedEntity, StructuredJsonGenerator jsonGenerator) {

        if (affectedEntity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (affectedEntity.getEntityArn() != null) {
                jsonGenerator.writeFieldName("entityArn").writeValue(affectedEntity.getEntityArn());
            }
            if (affectedEntity.getEventArn() != null) {
                jsonGenerator.writeFieldName("eventArn").writeValue(affectedEntity.getEventArn());
            }
            if (affectedEntity.getEntityValue() != null) {
                jsonGenerator.writeFieldName("entityValue").writeValue(affectedEntity.getEntityValue());
            }
            if (affectedEntity.getAwsAccountId() != null) {
                jsonGenerator.writeFieldName("awsAccountId").writeValue(affectedEntity.getAwsAccountId());
            }
            if (affectedEntity.getLastUpdatedTime() != null) {
                jsonGenerator.writeFieldName("lastUpdatedTime").writeValue(affectedEntity.getLastUpdatedTime());
            }
            if (affectedEntity.getStatusCode() != null) {
                jsonGenerator.writeFieldName("statusCode").writeValue(affectedEntity.getStatusCode());
            }

            java.util.Map<String, String> tagsMap = affectedEntity.getTags();
            if (tagsMap != null) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> tagsMapValue : tagsMap.entrySet()) {
                    if (tagsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(tagsMapValue.getKey());

                        jsonGenerator.writeValue(tagsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AffectedEntityJsonMarshaller instance;

    public static AffectedEntityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AffectedEntityJsonMarshaller();
        return instance;
    }

}
