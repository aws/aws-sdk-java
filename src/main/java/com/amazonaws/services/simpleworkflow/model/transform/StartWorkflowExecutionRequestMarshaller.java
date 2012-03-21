/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

import static com.amazonaws.http.HttpMethodName.POST;

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
        request.addHeader("Content-Type", "application/x-amz-json-1.0");
        request.setHttpMethod(POST);

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
            if (startWorkflowExecutionRequest != null) {
                WorkflowType workflowTypeWorkflowType = startWorkflowExecutionRequest.getWorkflowType();
                if (workflowTypeWorkflowType != null) {
                    jsonWriter.key("workflowType").object();
                    if (workflowTypeWorkflowType.getName() != null) {
                        jsonWriter.key("name").value(workflowTypeWorkflowType.getName());
                    }
                    if (workflowTypeWorkflowType.getVersion() != null) {
                        jsonWriter.key("version").value(workflowTypeWorkflowType.getVersion());
                    }
                    jsonWriter.endObject();
                }
            }
            if (startWorkflowExecutionRequest != null) {
                TaskList taskListTaskList = startWorkflowExecutionRequest.getTaskList();
                if (taskListTaskList != null) {
                    jsonWriter.key("taskList").object();
                    if (taskListTaskList.getName() != null) {
                        jsonWriter.key("name").value(taskListTaskList.getName());
                    }
                    jsonWriter.endObject();
                }
            }
            if (startWorkflowExecutionRequest.getInput() != null) {
                jsonWriter.key("input").value(startWorkflowExecutionRequest.getInput());
            }
            if (startWorkflowExecutionRequest.getExecutionStartToCloseTimeout() != null) {
                jsonWriter.key("executionStartToCloseTimeout").value(startWorkflowExecutionRequest.getExecutionStartToCloseTimeout());
            }
            if (startWorkflowExecutionRequest != null) {
                java.util.List<String> tagListList = startWorkflowExecutionRequest.getTagList();
                int tagListListIndex = 0;
                if (tagListList != null && tagListList.size() > 0) {
                    jsonWriter.key("tagList").array();
                    for (String tagListListValue : tagListList) {
                        if (tagListListValue != null) {
                            jsonWriter.value(tagListListValue);
                        } else jsonWriter.value(null);
                        tagListListIndex++;
                    }
                    jsonWriter.endArray();
                }
            }
            if (startWorkflowExecutionRequest.getTaskStartToCloseTimeout() != null) {
                jsonWriter.key("taskStartToCloseTimeout").value(startWorkflowExecutionRequest.getTaskStartToCloseTimeout());
            }
            if (startWorkflowExecutionRequest.getChildPolicy() != null) {
                jsonWriter.key("childPolicy").value(startWorkflowExecutionRequest.getChildPolicy());
            }

    	    jsonWriter.endObject();

    	    String snippet = stringWriter.toString();
    	    byte[] content = snippet.getBytes("UTF-8");
        	request.setContent(new StringInputStream(snippet));
	        request.addHeader("Content-Length", Integer.toString(content.length));
            return request;
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }
}
