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
package com.amazonaws.services.support.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * TrustedAdvisorCheckResultMarshaller
 */
public class TrustedAdvisorCheckResultJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TrustedAdvisorCheckResult trustedAdvisorCheckResult, StructuredJsonGenerator jsonGenerator) {

        if (trustedAdvisorCheckResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (trustedAdvisorCheckResult.getCheckId() != null) {
                jsonGenerator.writeFieldName("checkId").writeValue(trustedAdvisorCheckResult.getCheckId());
            }
            if (trustedAdvisorCheckResult.getTimestamp() != null) {
                jsonGenerator.writeFieldName("timestamp").writeValue(trustedAdvisorCheckResult.getTimestamp());
            }
            if (trustedAdvisorCheckResult.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(trustedAdvisorCheckResult.getStatus());
            }
            if (trustedAdvisorCheckResult.getResourcesSummary() != null) {
                jsonGenerator.writeFieldName("resourcesSummary");
                TrustedAdvisorResourcesSummaryJsonMarshaller.getInstance().marshall(trustedAdvisorCheckResult.getResourcesSummary(), jsonGenerator);
            }
            if (trustedAdvisorCheckResult.getCategorySpecificSummary() != null) {
                jsonGenerator.writeFieldName("categorySpecificSummary");
                TrustedAdvisorCategorySpecificSummaryJsonMarshaller.getInstance().marshall(trustedAdvisorCheckResult.getCategorySpecificSummary(),
                        jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<TrustedAdvisorResourceDetail> flaggedResourcesList = (com.amazonaws.internal.SdkInternalList<TrustedAdvisorResourceDetail>) trustedAdvisorCheckResult
                    .getFlaggedResources();
            if (!flaggedResourcesList.isEmpty() || !flaggedResourcesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("flaggedResources");
                jsonGenerator.writeStartArray();
                for (TrustedAdvisorResourceDetail flaggedResourcesListValue : flaggedResourcesList) {
                    if (flaggedResourcesListValue != null) {

                        TrustedAdvisorResourceDetailJsonMarshaller.getInstance().marshall(flaggedResourcesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TrustedAdvisorCheckResultJsonMarshaller instance;

    public static TrustedAdvisorCheckResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorCheckResultJsonMarshaller();
        return instance;
    }

}
