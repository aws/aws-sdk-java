/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.support.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * TrustedAdvisorCheckResultMarshaller
 */
public class TrustedAdvisorCheckResultJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(TrustedAdvisorCheckResult trustedAdvisorCheckResult,
            JSONWriter jsonWriter) {
        if (trustedAdvisorCheckResult == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (trustedAdvisorCheckResult.getCheckId() != null) {
                jsonWriter.key("checkId").value(
                        trustedAdvisorCheckResult.getCheckId());
            }

            if (trustedAdvisorCheckResult.getTimestamp() != null) {
                jsonWriter.key("timestamp").value(
                        trustedAdvisorCheckResult.getTimestamp());
            }

            if (trustedAdvisorCheckResult.getStatus() != null) {
                jsonWriter.key("status").value(
                        trustedAdvisorCheckResult.getStatus());
            }

            if (trustedAdvisorCheckResult.getResourcesSummary() != null) {
                jsonWriter.key("resourcesSummary");
                TrustedAdvisorResourcesSummaryJsonMarshaller
                        .getInstance()
                        .marshall(
                                trustedAdvisorCheckResult.getResourcesSummary(),
                                jsonWriter);
            }

            if (trustedAdvisorCheckResult.getCategorySpecificSummary() != null) {
                jsonWriter.key("categorySpecificSummary");
                TrustedAdvisorCategorySpecificSummaryJsonMarshaller
                        .getInstance()
                        .marshall(
                                trustedAdvisorCheckResult
                                        .getCategorySpecificSummary(),
                                jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<TrustedAdvisorResourceDetail> flaggedResourcesList = (com.amazonaws.internal.SdkInternalList<TrustedAdvisorResourceDetail>) trustedAdvisorCheckResult
                    .getFlaggedResources();
            if (!flaggedResourcesList.isEmpty()
                    || !flaggedResourcesList.isAutoConstruct()) {
                jsonWriter.key("flaggedResources");
                jsonWriter.array();
                for (TrustedAdvisorResourceDetail flaggedResourcesListValue : flaggedResourcesList) {
                    if (flaggedResourcesListValue != null) {

                        TrustedAdvisorResourceDetailJsonMarshaller
                                .getInstance().marshall(
                                        flaggedResourcesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TrustedAdvisorCheckResultJsonMarshaller instance;

    public static TrustedAdvisorCheckResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorCheckResultJsonMarshaller();
        return instance;
    }

}
