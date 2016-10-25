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

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * ReplaceTopicRuleRequest Marshaller
 */
public class ReplaceTopicRuleRequestMarshaller implements Marshaller<Request<ReplaceTopicRuleRequest>, ReplaceTopicRuleRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ReplaceTopicRuleRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ReplaceTopicRuleRequest> marshall(ReplaceTopicRuleRequest replaceTopicRuleRequest) {

        if (replaceTopicRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReplaceTopicRuleRequest> request = new DefaultRequest<ReplaceTopicRuleRequest>(replaceTopicRuleRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/rules/{ruleName}";

        uriResourcePath = uriResourcePath.replace("{ruleName}",
                (replaceTopicRuleRequest.getRuleName() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(replaceTopicRuleRequest.getRuleName()), false)
                        : "");
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            TopicRulePayload topicRulePayload = replaceTopicRuleRequest.getTopicRulePayload();
            if (topicRulePayload != null) {
                jsonGenerator.writeStartObject();
                if (topicRulePayload.getSql() != null) {
                    jsonGenerator.writeFieldName("sql").writeValue(topicRulePayload.getSql());
                }
                if (topicRulePayload.getDescription() != null) {
                    jsonGenerator.writeFieldName("description").writeValue(topicRulePayload.getDescription());
                }

                java.util.List<Action> actionsList = topicRulePayload.getActions();
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
                if (topicRulePayload.getRuleDisabled() != null) {
                    jsonGenerator.writeFieldName("ruleDisabled").writeValue(topicRulePayload.getRuleDisabled());
                }
                if (topicRulePayload.getAwsIotSqlVersion() != null) {
                    jsonGenerator.writeFieldName("awsIotSqlVersion").writeValue(topicRulePayload.getAwsIotSqlVersion());
                }
                jsonGenerator.writeEndObject();
            }

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
