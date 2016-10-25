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
 * ConfigRuleMarshaller
 */
public class ConfigRuleJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ConfigRule configRule, StructuredJsonGenerator jsonGenerator) {

        if (configRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (configRule.getConfigRuleName() != null) {
                jsonGenerator.writeFieldName("ConfigRuleName").writeValue(configRule.getConfigRuleName());
            }
            if (configRule.getConfigRuleArn() != null) {
                jsonGenerator.writeFieldName("ConfigRuleArn").writeValue(configRule.getConfigRuleArn());
            }
            if (configRule.getConfigRuleId() != null) {
                jsonGenerator.writeFieldName("ConfigRuleId").writeValue(configRule.getConfigRuleId());
            }
            if (configRule.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(configRule.getDescription());
            }
            if (configRule.getScope() != null) {
                jsonGenerator.writeFieldName("Scope");
                ScopeJsonMarshaller.getInstance().marshall(configRule.getScope(), jsonGenerator);
            }
            if (configRule.getSource() != null) {
                jsonGenerator.writeFieldName("Source");
                SourceJsonMarshaller.getInstance().marshall(configRule.getSource(), jsonGenerator);
            }
            if (configRule.getInputParameters() != null) {
                jsonGenerator.writeFieldName("InputParameters").writeValue(configRule.getInputParameters());
            }
            if (configRule.getMaximumExecutionFrequency() != null) {
                jsonGenerator.writeFieldName("MaximumExecutionFrequency").writeValue(configRule.getMaximumExecutionFrequency());
            }
            if (configRule.getConfigRuleState() != null) {
                jsonGenerator.writeFieldName("ConfigRuleState").writeValue(configRule.getConfigRuleState());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConfigRuleJsonMarshaller instance;

    public static ConfigRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigRuleJsonMarshaller();
        return instance;
    }

}
