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

package com.amazonaws.services.config.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ConfigRuleEvaluationStatusMarshaller
 */
public class ConfigRuleEvaluationStatusJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ConfigRuleEvaluationStatus configRuleEvaluationStatus,
            JSONWriter jsonWriter) {
        if (configRuleEvaluationStatus == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (configRuleEvaluationStatus.getConfigRuleName() != null) {
                jsonWriter.key("ConfigRuleName").value(
                        configRuleEvaluationStatus.getConfigRuleName());
            }

            if (configRuleEvaluationStatus.getConfigRuleArn() != null) {
                jsonWriter.key("ConfigRuleArn").value(
                        configRuleEvaluationStatus.getConfigRuleArn());
            }

            if (configRuleEvaluationStatus.getConfigRuleId() != null) {
                jsonWriter.key("ConfigRuleId").value(
                        configRuleEvaluationStatus.getConfigRuleId());
            }

            if (configRuleEvaluationStatus.getLastSuccessfulInvocationTime() != null) {
                jsonWriter.key("LastSuccessfulInvocationTime").value(
                        configRuleEvaluationStatus
                                .getLastSuccessfulInvocationTime());
            }

            if (configRuleEvaluationStatus.getLastFailedInvocationTime() != null) {
                jsonWriter.key("LastFailedInvocationTime").value(
                        configRuleEvaluationStatus
                                .getLastFailedInvocationTime());
            }

            if (configRuleEvaluationStatus.getLastSuccessfulEvaluationTime() != null) {
                jsonWriter.key("LastSuccessfulEvaluationTime").value(
                        configRuleEvaluationStatus
                                .getLastSuccessfulEvaluationTime());
            }

            if (configRuleEvaluationStatus.getLastFailedEvaluationTime() != null) {
                jsonWriter.key("LastFailedEvaluationTime").value(
                        configRuleEvaluationStatus
                                .getLastFailedEvaluationTime());
            }

            if (configRuleEvaluationStatus.getFirstActivatedTime() != null) {
                jsonWriter.key("FirstActivatedTime").value(
                        configRuleEvaluationStatus.getFirstActivatedTime());
            }

            if (configRuleEvaluationStatus.getLastErrorCode() != null) {
                jsonWriter.key("LastErrorCode").value(
                        configRuleEvaluationStatus.getLastErrorCode());
            }

            if (configRuleEvaluationStatus.getLastErrorMessage() != null) {
                jsonWriter.key("LastErrorMessage").value(
                        configRuleEvaluationStatus.getLastErrorMessage());
            }

            if (configRuleEvaluationStatus.getFirstEvaluationStarted() != null) {
                jsonWriter.key("FirstEvaluationStarted").value(
                        configRuleEvaluationStatus.getFirstEvaluationStarted());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConfigRuleEvaluationStatusJsonMarshaller instance;

    public static ConfigRuleEvaluationStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigRuleEvaluationStatusJsonMarshaller();
        return instance;
    }

}
