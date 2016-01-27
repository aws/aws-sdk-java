/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model.transform;

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
import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Register Workflow Type Request Marshaller
 */
public class RegisterWorkflowTypeRequestMarshaller implements Marshaller<Request<RegisterWorkflowTypeRequest>, RegisterWorkflowTypeRequest> {

    public Request<RegisterWorkflowTypeRequest> marshall(RegisterWorkflowTypeRequest registerWorkflowTypeRequest) {
        if (registerWorkflowTypeRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterWorkflowTypeRequest> request = new DefaultRequest<RegisterWorkflowTypeRequest>(registerWorkflowTypeRequest, "AmazonSimpleWorkflow");
        String target = "SimpleWorkflowService.RegisterWorkflowType";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (registerWorkflowTypeRequest.getDomain() != null) {
                jsonWriter.key("domain").value(registerWorkflowTypeRequest.getDomain());
            }
            if (registerWorkflowTypeRequest.getName() != null) {
                jsonWriter.key("name").value(registerWorkflowTypeRequest.getName());
            }
            if (registerWorkflowTypeRequest.getVersion() != null) {
                jsonWriter.key("version").value(registerWorkflowTypeRequest.getVersion());
            }
            if (registerWorkflowTypeRequest.getDescription() != null) {
                jsonWriter.key("description").value(registerWorkflowTypeRequest.getDescription());
            }
            if (registerWorkflowTypeRequest.getDefaultTaskStartToCloseTimeout() != null) {
                jsonWriter.key("defaultTaskStartToCloseTimeout").value(registerWorkflowTypeRequest.getDefaultTaskStartToCloseTimeout());
            }
            if (registerWorkflowTypeRequest.getDefaultExecutionStartToCloseTimeout() != null) {
                jsonWriter.key("defaultExecutionStartToCloseTimeout").value(registerWorkflowTypeRequest.getDefaultExecutionStartToCloseTimeout());
            }
            TaskList defaultTaskList = registerWorkflowTypeRequest.getDefaultTaskList();
            if (defaultTaskList != null) {

                jsonWriter.key("defaultTaskList");
                jsonWriter.object();

                if (defaultTaskList.getName() != null) {
                    jsonWriter.key("name").value(defaultTaskList.getName());
                }
                jsonWriter.endObject();
            }
            if (registerWorkflowTypeRequest.getDefaultTaskPriority() != null) {
                jsonWriter.key("defaultTaskPriority").value(registerWorkflowTypeRequest.getDefaultTaskPriority());
            }
            if (registerWorkflowTypeRequest.getDefaultChildPolicy() != null) {
                jsonWriter.key("defaultChildPolicy").value(registerWorkflowTypeRequest.getDefaultChildPolicy());
            }
            if (registerWorkflowTypeRequest.getDefaultLambdaRole() != null) {
                jsonWriter.key("defaultLambdaRole").value(registerWorkflowTypeRequest.getDefaultLambdaRole());
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.0");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
