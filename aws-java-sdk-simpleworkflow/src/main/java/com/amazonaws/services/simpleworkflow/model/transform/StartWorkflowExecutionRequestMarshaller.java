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
 * Start Workflow Execution Request Marshaller
 */
public class StartWorkflowExecutionRequestMarshaller implements Marshaller<Request<StartWorkflowExecutionRequest>, StartWorkflowExecutionRequest> {

    public Request<StartWorkflowExecutionRequest> marshall(StartWorkflowExecutionRequest startWorkflowExecutionRequest) {
        if (startWorkflowExecutionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartWorkflowExecutionRequest> request = new DefaultRequest<StartWorkflowExecutionRequest>(startWorkflowExecutionRequest, "AmazonSimpleWorkflow");
        String target = "SimpleWorkflowService.StartWorkflowExecution";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (startWorkflowExecutionRequest.getDomain() != null) {
                jsonWriter.key("domain").value(startWorkflowExecutionRequest.getDomain());
            }
            if (startWorkflowExecutionRequest.getWorkflowId() != null) {
                jsonWriter.key("workflowId").value(startWorkflowExecutionRequest.getWorkflowId());
            }
            WorkflowType workflowType = startWorkflowExecutionRequest.getWorkflowType();
            if (workflowType != null) {

                jsonWriter.key("workflowType");
                jsonWriter.object();

                if (workflowType.getName() != null) {
                    jsonWriter.key("name").value(workflowType.getName());
                }
                if (workflowType.getVersion() != null) {
                    jsonWriter.key("version").value(workflowType.getVersion());
                }
                jsonWriter.endObject();
            }
            TaskList taskList = startWorkflowExecutionRequest.getTaskList();
            if (taskList != null) {

                jsonWriter.key("taskList");
                jsonWriter.object();

                if (taskList.getName() != null) {
                    jsonWriter.key("name").value(taskList.getName());
                }
                jsonWriter.endObject();
            }
            if (startWorkflowExecutionRequest.getTaskPriority() != null) {
                jsonWriter.key("taskPriority").value(startWorkflowExecutionRequest.getTaskPriority());
            }
            if (startWorkflowExecutionRequest.getInput() != null) {
                jsonWriter.key("input").value(startWorkflowExecutionRequest.getInput());
            }
            if (startWorkflowExecutionRequest.getExecutionStartToCloseTimeout() != null) {
                jsonWriter.key("executionStartToCloseTimeout").value(startWorkflowExecutionRequest.getExecutionStartToCloseTimeout());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagListList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(startWorkflowExecutionRequest.getTagList());
            if (tagListList != null && !(tagListList.isAutoConstruct() && tagListList.isEmpty())) {

                jsonWriter.key("tagList");
                jsonWriter.array();

                for (String tagListListValue : tagListList) {
                    if (tagListListValue != null) {
                        jsonWriter.value(tagListListValue);
                    }
                }
                jsonWriter.endArray();
            }
            if (startWorkflowExecutionRequest.getTaskStartToCloseTimeout() != null) {
                jsonWriter.key("taskStartToCloseTimeout").value(startWorkflowExecutionRequest.getTaskStartToCloseTimeout());
            }
            if (startWorkflowExecutionRequest.getChildPolicy() != null) {
                jsonWriter.key("childPolicy").value(startWorkflowExecutionRequest.getChildPolicy());
            }
            if (startWorkflowExecutionRequest.getLambdaRole() != null) {
                jsonWriter.key("lambdaRole").value(startWorkflowExecutionRequest.getLambdaRole());
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
