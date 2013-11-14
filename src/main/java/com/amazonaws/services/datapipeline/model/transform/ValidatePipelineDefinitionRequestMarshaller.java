/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

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
 * Validate Pipeline Definition Request Marshaller
 */
public class ValidatePipelineDefinitionRequestMarshaller implements Marshaller<Request<ValidatePipelineDefinitionRequest>, ValidatePipelineDefinitionRequest> {

    

    public Request<ValidatePipelineDefinitionRequest> marshall(ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest) {
    if (validatePipelineDefinitionRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<ValidatePipelineDefinitionRequest> request = new DefaultRequest<ValidatePipelineDefinitionRequest>(validatePipelineDefinitionRequest, "DataPipeline");
        String target = "DataPipeline.ValidatePipelineDefinition";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.1");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = ""; 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);


        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          
            
          jsonWriter.object();
          
            if (validatePipelineDefinitionRequest.getPipelineId() != null) {
                jsonWriter.key("pipelineId").value(validatePipelineDefinitionRequest.getPipelineId());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject> pipelineObjectsList = (com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject>)(validatePipelineDefinitionRequest.getPipelineObjects());
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

          jsonWriter.endObject();
          

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes("UTF-8");
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        

        return request;
    }
}
