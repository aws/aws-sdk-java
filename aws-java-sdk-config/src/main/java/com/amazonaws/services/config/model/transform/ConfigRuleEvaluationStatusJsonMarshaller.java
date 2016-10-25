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
 * ConfigRuleEvaluationStatusMarshaller
 */
public class ConfigRuleEvaluationStatusJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ConfigRuleEvaluationStatus configRuleEvaluationStatus, StructuredJsonGenerator jsonGenerator) {

        if (configRuleEvaluationStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (configRuleEvaluationStatus.getConfigRuleName() != null) {
                jsonGenerator.writeFieldName("ConfigRuleName").writeValue(configRuleEvaluationStatus.getConfigRuleName());
            }
            if (configRuleEvaluationStatus.getConfigRuleArn() != null) {
                jsonGenerator.writeFieldName("ConfigRuleArn").writeValue(configRuleEvaluationStatus.getConfigRuleArn());
            }
            if (configRuleEvaluationStatus.getConfigRuleId() != null) {
                jsonGenerator.writeFieldName("ConfigRuleId").writeValue(configRuleEvaluationStatus.getConfigRuleId());
            }
            if (configRuleEvaluationStatus.getLastSuccessfulInvocationTime() != null) {
                jsonGenerator.writeFieldName("LastSuccessfulInvocationTime").writeValue(configRuleEvaluationStatus.getLastSuccessfulInvocationTime());
            }
            if (configRuleEvaluationStatus.getLastFailedInvocationTime() != null) {
                jsonGenerator.writeFieldName("LastFailedInvocationTime").writeValue(configRuleEvaluationStatus.getLastFailedInvocationTime());
            }
            if (configRuleEvaluationStatus.getLastSuccessfulEvaluationTime() != null) {
                jsonGenerator.writeFieldName("LastSuccessfulEvaluationTime").writeValue(configRuleEvaluationStatus.getLastSuccessfulEvaluationTime());
            }
            if (configRuleEvaluationStatus.getLastFailedEvaluationTime() != null) {
                jsonGenerator.writeFieldName("LastFailedEvaluationTime").writeValue(configRuleEvaluationStatus.getLastFailedEvaluationTime());
            }
            if (configRuleEvaluationStatus.getFirstActivatedTime() != null) {
                jsonGenerator.writeFieldName("FirstActivatedTime").writeValue(configRuleEvaluationStatus.getFirstActivatedTime());
            }
            if (configRuleEvaluationStatus.getLastErrorCode() != null) {
                jsonGenerator.writeFieldName("LastErrorCode").writeValue(configRuleEvaluationStatus.getLastErrorCode());
            }
            if (configRuleEvaluationStatus.getLastErrorMessage() != null) {
                jsonGenerator.writeFieldName("LastErrorMessage").writeValue(configRuleEvaluationStatus.getLastErrorMessage());
            }
            if (configRuleEvaluationStatus.getFirstEvaluationStarted() != null) {
                jsonGenerator.writeFieldName("FirstEvaluationStarted").writeValue(configRuleEvaluationStatus.getFirstEvaluationStarted());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConfigRuleEvaluationStatusJsonMarshaller instance;

    public static ConfigRuleEvaluationStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigRuleEvaluationStatusJsonMarshaller();
        return instance;
    }

}
