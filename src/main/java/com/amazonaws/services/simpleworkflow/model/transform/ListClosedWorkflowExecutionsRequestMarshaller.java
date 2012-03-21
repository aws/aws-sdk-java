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
 * List Closed Workflow Executions Request Marshaller
 */
public class ListClosedWorkflowExecutionsRequestMarshaller implements Marshaller<Request<ListClosedWorkflowExecutionsRequest>, ListClosedWorkflowExecutionsRequest> {

    public Request<ListClosedWorkflowExecutionsRequest> marshall(ListClosedWorkflowExecutionsRequest listClosedWorkflowExecutionsRequest) {
		if (listClosedWorkflowExecutionsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ListClosedWorkflowExecutionsRequest> request = new DefaultRequest<ListClosedWorkflowExecutionsRequest>(listClosedWorkflowExecutionsRequest, "AmazonSimpleWorkflow");
        String target = "SimpleWorkflowService.ListClosedWorkflowExecutions";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");
        request.setHttpMethod(POST);

        try {
        	StringWriter stringWriter = new StringWriter();
        	JSONWriter jsonWriter = new JSONWriter(stringWriter);
        	jsonWriter.object();
	        
            if (listClosedWorkflowExecutionsRequest.getDomain() != null) {
                jsonWriter.key("domain").value(listClosedWorkflowExecutionsRequest.getDomain());
            }
            if (listClosedWorkflowExecutionsRequest != null) {
                ExecutionTimeFilter executionTimeFilterStartTimeFilter = listClosedWorkflowExecutionsRequest.getStartTimeFilter();
                if (executionTimeFilterStartTimeFilter != null) {
                    jsonWriter.key("startTimeFilter").object();
                    if (executionTimeFilterStartTimeFilter.getOldestDate() != null) {
                        jsonWriter.key("oldestDate").value(executionTimeFilterStartTimeFilter.getOldestDate());
                    }
                    if (executionTimeFilterStartTimeFilter.getLatestDate() != null) {
                        jsonWriter.key("latestDate").value(executionTimeFilterStartTimeFilter.getLatestDate());
                    }
                    jsonWriter.endObject();
                }
            }
            if (listClosedWorkflowExecutionsRequest != null) {
                ExecutionTimeFilter executionTimeFilterCloseTimeFilter = listClosedWorkflowExecutionsRequest.getCloseTimeFilter();
                if (executionTimeFilterCloseTimeFilter != null) {
                    jsonWriter.key("closeTimeFilter").object();
                    if (executionTimeFilterCloseTimeFilter.getOldestDate() != null) {
                        jsonWriter.key("oldestDate").value(executionTimeFilterCloseTimeFilter.getOldestDate());
                    }
                    if (executionTimeFilterCloseTimeFilter.getLatestDate() != null) {
                        jsonWriter.key("latestDate").value(executionTimeFilterCloseTimeFilter.getLatestDate());
                    }
                    jsonWriter.endObject();
                }
            }
            if (listClosedWorkflowExecutionsRequest != null) {
                WorkflowExecutionFilter workflowExecutionFilterExecutionFilter = listClosedWorkflowExecutionsRequest.getExecutionFilter();
                if (workflowExecutionFilterExecutionFilter != null) {
                    jsonWriter.key("executionFilter").object();
                    if (workflowExecutionFilterExecutionFilter.getWorkflowId() != null) {
                        jsonWriter.key("workflowId").value(workflowExecutionFilterExecutionFilter.getWorkflowId());
                    }
                    jsonWriter.endObject();
                }
            }
            if (listClosedWorkflowExecutionsRequest != null) {
                CloseStatusFilter closeStatusFilterCloseStatusFilter = listClosedWorkflowExecutionsRequest.getCloseStatusFilter();
                if (closeStatusFilterCloseStatusFilter != null) {
                    jsonWriter.key("closeStatusFilter").object();
                    if (closeStatusFilterCloseStatusFilter.getStatus() != null) {
                        jsonWriter.key("status").value(closeStatusFilterCloseStatusFilter.getStatus());
                    }
                    jsonWriter.endObject();
                }
            }
            if (listClosedWorkflowExecutionsRequest != null) {
                WorkflowTypeFilter workflowTypeFilterTypeFilter = listClosedWorkflowExecutionsRequest.getTypeFilter();
                if (workflowTypeFilterTypeFilter != null) {
                    jsonWriter.key("typeFilter").object();
                    if (workflowTypeFilterTypeFilter.getName() != null) {
                        jsonWriter.key("name").value(workflowTypeFilterTypeFilter.getName());
                    }
                    if (workflowTypeFilterTypeFilter.getVersion() != null) {
                        jsonWriter.key("version").value(workflowTypeFilterTypeFilter.getVersion());
                    }
                    jsonWriter.endObject();
                }
            }
            if (listClosedWorkflowExecutionsRequest != null) {
                TagFilter tagFilterTagFilter = listClosedWorkflowExecutionsRequest.getTagFilter();
                if (tagFilterTagFilter != null) {
                    jsonWriter.key("tagFilter").object();
                    if (tagFilterTagFilter.getTag() != null) {
                        jsonWriter.key("tag").value(tagFilterTagFilter.getTag());
                    }
                    jsonWriter.endObject();
                }
            }
            if (listClosedWorkflowExecutionsRequest.getNextPageToken() != null) {
                jsonWriter.key("nextPageToken").value(listClosedWorkflowExecutionsRequest.getNextPageToken());
            }
            if (listClosedWorkflowExecutionsRequest.getMaximumPageSize() != null) {
                jsonWriter.key("maximumPageSize").value(listClosedWorkflowExecutionsRequest.getMaximumPageSize());
            }
            if (listClosedWorkflowExecutionsRequest.isReverseOrder() != null) {
                jsonWriter.key("reverseOrder").value(listClosedWorkflowExecutionsRequest.isReverseOrder());
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
