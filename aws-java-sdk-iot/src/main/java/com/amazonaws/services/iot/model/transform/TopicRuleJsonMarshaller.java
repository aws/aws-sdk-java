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
package com.amazonaws.services.iot.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * TopicRuleMarshaller
 */
public class TopicRuleJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TopicRule topicRule, StructuredJsonGenerator jsonGenerator) {

        if (topicRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (topicRule.getRuleName() != null) {
                jsonGenerator.writeFieldName("ruleName").writeValue(topicRule.getRuleName());
            }
            if (topicRule.getSql() != null) {
                jsonGenerator.writeFieldName("sql").writeValue(topicRule.getSql());
            }
            if (topicRule.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(topicRule.getDescription());
            }
            if (topicRule.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(topicRule.getCreatedAt());
            }

            java.util.List<Action> actionsList = topicRule.getActions();
            if (actionsList != null) {
                jsonGenerator.writeFieldName("actions");
                jsonGenerator.writeStartArray();
                for (Action actionsListValue : actionsList) {
                    if (actionsListValue != null) {

                        ActionJsonMarshaller.getInstance().marshall(actionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (topicRule.getRuleDisabled() != null) {
                jsonGenerator.writeFieldName("ruleDisabled").writeValue(topicRule.getRuleDisabled());
            }
            if (topicRule.getAwsIotSqlVersion() != null) {
                jsonGenerator.writeFieldName("awsIotSqlVersion").writeValue(topicRule.getAwsIotSqlVersion());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TopicRuleJsonMarshaller instance;

    public static TopicRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TopicRuleJsonMarshaller();
        return instance;
    }

}
