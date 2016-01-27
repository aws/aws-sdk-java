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

package com.amazonaws.services.cloudwatchevents.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RuleMarshaller
 */
public class RuleJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Rule rule, JSONWriter jsonWriter) {
        if (rule == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (rule.getName() != null) {
                jsonWriter.key("Name").value(rule.getName());
            }

            if (rule.getArn() != null) {
                jsonWriter.key("Arn").value(rule.getArn());
            }

            if (rule.getEventPattern() != null) {
                jsonWriter.key("EventPattern").value(rule.getEventPattern());
            }

            if (rule.getState() != null) {
                jsonWriter.key("State").value(rule.getState());
            }

            if (rule.getDescription() != null) {
                jsonWriter.key("Description").value(rule.getDescription());
            }

            if (rule.getScheduleExpression() != null) {
                jsonWriter.key("ScheduleExpression").value(
                        rule.getScheduleExpression());
            }

            if (rule.getRoleArn() != null) {
                jsonWriter.key("RoleArn").value(rule.getRoleArn());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RuleJsonMarshaller instance;

    public static RuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleJsonMarshaller();
        return instance;
    }

}
