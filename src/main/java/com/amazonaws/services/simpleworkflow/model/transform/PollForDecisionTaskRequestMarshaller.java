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
 * Poll For Decision Task Request Marshaller
 */
public class PollForDecisionTaskRequestMarshaller implements Marshaller<Request<PollForDecisionTaskRequest>, PollForDecisionTaskRequest> {

    public Request<PollForDecisionTaskRequest> marshall(PollForDecisionTaskRequest pollForDecisionTaskRequest) {
		if (pollForDecisionTaskRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<PollForDecisionTaskRequest> request = new DefaultRequest<PollForDecisionTaskRequest>(pollForDecisionTaskRequest, "AmazonSimpleWorkflow");
        String target = "SimpleWorkflowService.PollForDecisionTask";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");
        request.setHttpMethod(POST);

        try {
        	StringWriter stringWriter = new StringWriter();
        	JSONWriter jsonWriter = new JSONWriter(stringWriter);
        	jsonWriter.object();
	        
            if (pollForDecisionTaskRequest.getDomain() != null) {
                jsonWriter.key("domain").value(pollForDecisionTaskRequest.getDomain());
            }
            if (pollForDecisionTaskRequest != null) {
                TaskList taskListTaskList = pollForDecisionTaskRequest.getTaskList();
                if (taskListTaskList != null) {
                    jsonWriter.key("taskList").object();
                    if (taskListTaskList.getName() != null) {
                        jsonWriter.key("name").value(taskListTaskList.getName());
                    }
                    jsonWriter.endObject();
                }
            }
            if (pollForDecisionTaskRequest.getIdentity() != null) {
                jsonWriter.key("identity").value(pollForDecisionTaskRequest.getIdentity());
            }
            if (pollForDecisionTaskRequest.getNextPageToken() != null) {
                jsonWriter.key("nextPageToken").value(pollForDecisionTaskRequest.getNextPageToken());
            }
            if (pollForDecisionTaskRequest.getMaximumPageSize() != null) {
                jsonWriter.key("maximumPageSize").value(pollForDecisionTaskRequest.getMaximumPageSize());
            }
            if (pollForDecisionTaskRequest.isReverseOrder() != null) {
                jsonWriter.key("reverseOrder").value(pollForDecisionTaskRequest.isReverseOrder());
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
