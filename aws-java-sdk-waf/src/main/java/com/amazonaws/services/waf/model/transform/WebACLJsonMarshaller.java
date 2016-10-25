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
 * WebACLMarshaller
 */
public class WebACLJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(WebACL webACL, StructuredJsonGenerator jsonGenerator) {

        if (webACL == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (webACL.getWebACLId() != null) {
                jsonGenerator.writeFieldName("WebACLId").writeValue(webACL.getWebACLId());
            }
            if (webACL.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(webACL.getName());
            }
            if (webACL.getMetricName() != null) {
                jsonGenerator.writeFieldName("MetricName").writeValue(webACL.getMetricName());
            }
            if (webACL.getDefaultAction() != null) {
                jsonGenerator.writeFieldName("DefaultAction");
                WafActionJsonMarshaller.getInstance().marshall(webACL.getDefaultAction(), jsonGenerator);
            }

            java.util.List<ActivatedRule> rulesList = webACL.getRules();
            if (rulesList != null) {
                jsonGenerator.writeFieldName("Rules");
                jsonGenerator.writeStartArray();
                for (ActivatedRule rulesListValue : rulesList) {
                    if (rulesListValue != null) {

                        ActivatedRuleJsonMarshaller.getInstance().marshall(rulesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WebACLJsonMarshaller instance;

    public static WebACLJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WebACLJsonMarshaller();
        return instance;
    }

}
