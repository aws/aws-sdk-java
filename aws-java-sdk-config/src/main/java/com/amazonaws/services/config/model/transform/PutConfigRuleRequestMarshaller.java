/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Put Config Rule Request Marshaller
 */
public class PutConfigRuleRequestMarshaller implements Marshaller<Request<PutConfigRuleRequest>, PutConfigRuleRequest> {

    public Request<PutConfigRuleRequest> marshall(PutConfigRuleRequest putConfigRuleRequest) {
        if (putConfigRuleRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutConfigRuleRequest> request = new DefaultRequest<PutConfigRuleRequest>(putConfigRuleRequest, "AmazonConfig");
        String target = "StarlingDoveService.PutConfigRule";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            ConfigRule configRule = putConfigRuleRequest.getConfigRule();
            if (configRule != null) {

                jsonWriter.key("ConfigRule");
                jsonWriter.object();

                if (configRule.getConfigRuleName() != null) {
                    jsonWriter.key("ConfigRuleName").value(configRule.getConfigRuleName());
                }
                if (configRule.getConfigRuleArn() != null) {
                    jsonWriter.key("ConfigRuleArn").value(configRule.getConfigRuleArn());
                }
                if (configRule.getConfigRuleId() != null) {
                    jsonWriter.key("ConfigRuleId").value(configRule.getConfigRuleId());
                }
                if (configRule.getDescription() != null) {
                    jsonWriter.key("Description").value(configRule.getDescription());
                }
                Scope scope = configRule.getScope();
                if (scope != null) {

                    jsonWriter.key("Scope");
                    jsonWriter.object();

                    com.amazonaws.internal.ListWithAutoConstructFlag<String> complianceResourceTypesList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(scope.getComplianceResourceTypes());
                    if (complianceResourceTypesList != null && !(complianceResourceTypesList.isAutoConstruct() && complianceResourceTypesList.isEmpty())) {

                        jsonWriter.key("ComplianceResourceTypes");
                        jsonWriter.array();

                        for (String complianceResourceTypesListValue : complianceResourceTypesList) {
                            if (complianceResourceTypesListValue != null) {
                                jsonWriter.value(complianceResourceTypesListValue);
                            }
                        }
                        jsonWriter.endArray();
                    }
                    if (scope.getTagKey() != null) {
                        jsonWriter.key("TagKey").value(scope.getTagKey());
                    }
                    if (scope.getTagValue() != null) {
                        jsonWriter.key("TagValue").value(scope.getTagValue());
                    }
                    if (scope.getComplianceResourceId() != null) {
                        jsonWriter.key("ComplianceResourceId").value(scope.getComplianceResourceId());
                    }
                    jsonWriter.endObject();
                }
                Source source = configRule.getSource();
                if (source != null) {

                    jsonWriter.key("Source");
                    jsonWriter.object();

                    if (source.getOwner() != null) {
                        jsonWriter.key("Owner").value(source.getOwner());
                    }
                    if (source.getSourceIdentifier() != null) {
                        jsonWriter.key("SourceIdentifier").value(source.getSourceIdentifier());
                    }

                    com.amazonaws.internal.ListWithAutoConstructFlag<SourceDetail> sourceDetailsList = (com.amazonaws.internal.ListWithAutoConstructFlag<SourceDetail>)(source.getSourceDetails());
                    if (sourceDetailsList != null && !(sourceDetailsList.isAutoConstruct() && sourceDetailsList.isEmpty())) {

                        jsonWriter.key("SourceDetails");
                        jsonWriter.array();

                        for (SourceDetail sourceDetailsListValue : sourceDetailsList) {
                            if (sourceDetailsListValue != null) {
                                jsonWriter.object();
                                if (sourceDetailsListValue.getEventSource() != null) {
                                    jsonWriter.key("EventSource").value(sourceDetailsListValue.getEventSource());
                                }
                                if (sourceDetailsListValue.getMessageType() != null) {
                                    jsonWriter.key("MessageType").value(sourceDetailsListValue.getMessageType());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                if (configRule.getInputParameters() != null) {
                    jsonWriter.key("InputParameters").value(configRule.getInputParameters());
                }
                if (configRule.getMaximumExecutionFrequency() != null) {
                    jsonWriter.key("MaximumExecutionFrequency").value(configRule.getMaximumExecutionFrequency());
                }
                if (configRule.getConfigRuleState() != null) {
                    jsonWriter.key("ConfigRuleState").value(configRule.getConfigRuleState());
                }
                jsonWriter.endObject();
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
