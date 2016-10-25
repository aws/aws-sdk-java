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
package com.amazonaws.services.waf.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RuleMarshaller
 */
public class RuleJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Rule rule, StructuredJsonGenerator jsonGenerator) {

        if (rule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (rule.getRuleId() != null) {
                jsonGenerator.writeFieldName("RuleId").writeValue(rule.getRuleId());
            }
            if (rule.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(rule.getName());
            }
            if (rule.getMetricName() != null) {
                jsonGenerator.writeFieldName("MetricName").writeValue(rule.getMetricName());
            }

            java.util.List<Predicate> predicatesList = rule.getPredicates();
            if (predicatesList != null) {
                jsonGenerator.writeFieldName("Predicates");
                jsonGenerator.writeStartArray();
                for (Predicate predicatesListValue : predicatesList) {
                    if (predicatesListValue != null) {

                        PredicateJsonMarshaller.getInstance().marshall(predicatesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RuleJsonMarshaller instance;

    public static RuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleJsonMarshaller();
        return instance;
    }

}
