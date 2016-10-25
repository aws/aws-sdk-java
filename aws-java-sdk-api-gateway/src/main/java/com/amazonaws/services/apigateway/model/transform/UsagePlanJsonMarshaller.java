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
package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UsagePlanMarshaller
 */
public class UsagePlanJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(UsagePlan usagePlan, StructuredJsonGenerator jsonGenerator) {

        if (usagePlan == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (usagePlan.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(usagePlan.getId());
            }
            if (usagePlan.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(usagePlan.getName());
            }
            if (usagePlan.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(usagePlan.getDescription());
            }

            java.util.List<ApiStage> apiStagesList = usagePlan.getApiStages();
            if (apiStagesList != null) {
                jsonGenerator.writeFieldName("apiStages");
                jsonGenerator.writeStartArray();
                for (ApiStage apiStagesListValue : apiStagesList) {
                    if (apiStagesListValue != null) {

                        ApiStageJsonMarshaller.getInstance().marshall(apiStagesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (usagePlan.getThrottle() != null) {
                jsonGenerator.writeFieldName("throttle");
                ThrottleSettingsJsonMarshaller.getInstance().marshall(usagePlan.getThrottle(), jsonGenerator);
            }
            if (usagePlan.getQuota() != null) {
                jsonGenerator.writeFieldName("quota");
                QuotaSettingsJsonMarshaller.getInstance().marshall(usagePlan.getQuota(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static UsagePlanJsonMarshaller instance;

    public static UsagePlanJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UsagePlanJsonMarshaller();
        return instance;
    }

}
