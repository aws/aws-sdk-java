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

package com.amazonaws.services.waf.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * WebACLMarshaller
 */
public class WebACLJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(WebACL webACL, JSONWriter jsonWriter) {
        if (webACL == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (webACL.getWebACLId() != null) {
                jsonWriter.key("WebACLId").value(webACL.getWebACLId());
            }

            if (webACL.getName() != null) {
                jsonWriter.key("Name").value(webACL.getName());
            }

            if (webACL.getMetricName() != null) {
                jsonWriter.key("MetricName").value(webACL.getMetricName());
            }

            if (webACL.getDefaultAction() != null) {
                jsonWriter.key("DefaultAction");
                WafActionJsonMarshaller.getInstance().marshall(
                        webACL.getDefaultAction(), jsonWriter);
            }

            java.util.List<ActivatedRule> rulesList = webACL.getRules();
            if (rulesList != null) {
                jsonWriter.key("Rules");
                jsonWriter.array();
                for (ActivatedRule rulesListValue : rulesList) {
                    if (rulesListValue != null) {

                        ActivatedRuleJsonMarshaller.getInstance().marshall(
                                rulesListValue, jsonWriter);
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

    private static WebACLJsonMarshaller instance;

    public static WebACLJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WebACLJsonMarshaller();
        return instance;
    }

}
