/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datapipeline.model.transform;

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
import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Put Pipeline Definition Request Marshaller
 */
public class PutPipelineDefinitionRequestMarshaller implements Marshaller<Request<PutPipelineDefinitionRequest>, PutPipelineDefinitionRequest> {

    public Request<PutPipelineDefinitionRequest> marshall(PutPipelineDefinitionRequest putPipelineDefinitionRequest) {
        if (putPipelineDefinitionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutPipelineDefinitionRequest> request = new DefaultRequest<PutPipelineDefinitionRequest>(putPipelineDefinitionRequest, "DataPipeline");
        String target = "DataPipeline.PutPipelineDefinition";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (putPipelineDefinitionRequest.getPipelineId() != null) {
                jsonWriter.key("pipelineId").value(putPipelineDefinitionRequest.getPipelineId());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject> pipelineObjectsList = (com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject>)(putPipelineDefinitionRequest.getPipelineObjects());
            if (pipelineObjectsList != null && !(pipelineObjectsList.isAutoConstruct() && pipelineObjectsList.isEmpty())) {

                jsonWriter.key("pipelineObjects");
                jsonWriter.array();

                for (PipelineObject pipelineObjectsListValue : pipelineObjectsList) {
                    if (pipelineObjectsListValue != null) {
                        jsonWriter.object();
                        if (pipelineObjectsListValue.getId() != null) {
                            jsonWriter.key("id").value(pipelineObjectsListValue.getId());
                        }
                        if (pipelineObjectsListValue.getName() != null) {
                            jsonWriter.key("name").value(pipelineObjectsListValue.getName());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<Field> fieldsList = (com.amazonaws.internal.ListWithAutoConstructFlag<Field>)(pipelineObjectsListValue.getFields());
                        if (fieldsList != null && !(fieldsList.isAutoConstruct() && fieldsList.isEmpty())) {

                            jsonWriter.key("fields");
                            jsonWriter.array();

                            for (Field fieldsListValue : fieldsList) {
                                if (fieldsListValue != null) {
                                    jsonWriter.object();
                                    if (fieldsListValue.getKey() != null) {
                                        jsonWriter.key("key").value(fieldsListValue.getKey());
                                    }
                                    if (fieldsListValue.getStringValue() != null) {
                                        jsonWriter.key("stringValue").value(fieldsListValue.getStringValue());
                                    }
                                    if (fieldsListValue.getRefValue() != null) {
                                        jsonWriter.key("refValue").value(fieldsListValue.getRefValue());
                                    }
                                    jsonWriter.endObject();
                                }
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject> parameterObjectsList = (com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject>)(putPipelineDefinitionRequest.getParameterObjects());
            if (parameterObjectsList != null && !(parameterObjectsList.isAutoConstruct() && parameterObjectsList.isEmpty())) {

                jsonWriter.key("parameterObjects");
                jsonWriter.array();

                for (ParameterObject parameterObjectsListValue : parameterObjectsList) {
                    if (parameterObjectsListValue != null) {
                        jsonWriter.object();
                        if (parameterObjectsListValue.getId() != null) {
                            jsonWriter.key("id").value(parameterObjectsListValue.getId());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<ParameterAttribute> attributesList = (com.amazonaws.internal.ListWithAutoConstructFlag<ParameterAttribute>)(parameterObjectsListValue.getAttributes());
                        if (attributesList != null && !(attributesList.isAutoConstruct() && attributesList.isEmpty())) {

                            jsonWriter.key("attributes");
                            jsonWriter.array();

                            for (ParameterAttribute attributesListValue : attributesList) {
                                if (attributesListValue != null) {
                                    jsonWriter.object();
                                    if (attributesListValue.getKey() != null) {
                                        jsonWriter.key("key").value(attributesListValue.getKey());
                                    }
                                    if (attributesListValue.getStringValue() != null) {
                                        jsonWriter.key("stringValue").value(attributesListValue.getStringValue());
                                    }
                                    jsonWriter.endObject();
                                }
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue> parameterValuesList = (com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue>)(putPipelineDefinitionRequest.getParameterValues());
            if (parameterValuesList != null && !(parameterValuesList.isAutoConstruct() && parameterValuesList.isEmpty())) {

                jsonWriter.key("parameterValues");
                jsonWriter.array();

                for (ParameterValue parameterValuesListValue : parameterValuesList) {
                    if (parameterValuesListValue != null) {
                        jsonWriter.object();
                        if (parameterValuesListValue.getId() != null) {
                            jsonWriter.key("id").value(parameterValuesListValue.getId());
                        }
                        if (parameterValuesListValue.getStringValue() != null) {
                            jsonWriter.key("stringValue").value(parameterValuesListValue.getStringValue());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
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
