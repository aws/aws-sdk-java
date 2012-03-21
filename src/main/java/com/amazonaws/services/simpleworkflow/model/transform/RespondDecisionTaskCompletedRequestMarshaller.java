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
 * Respond Decision Task Completed Request Marshaller
 */
public class RespondDecisionTaskCompletedRequestMarshaller implements Marshaller<Request<RespondDecisionTaskCompletedRequest>, RespondDecisionTaskCompletedRequest> {

    public Request<RespondDecisionTaskCompletedRequest> marshall(RespondDecisionTaskCompletedRequest respondDecisionTaskCompletedRequest) {
		if (respondDecisionTaskCompletedRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<RespondDecisionTaskCompletedRequest> request = new DefaultRequest<RespondDecisionTaskCompletedRequest>(respondDecisionTaskCompletedRequest, "AmazonSimpleWorkflow");
        String target = "SimpleWorkflowService.RespondDecisionTaskCompleted";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");
        request.setHttpMethod(POST);

        try {
        	StringWriter stringWriter = new StringWriter();
        	JSONWriter jsonWriter = new JSONWriter(stringWriter);
        	jsonWriter.object();
	        
            if (respondDecisionTaskCompletedRequest.getTaskToken() != null) {
                jsonWriter.key("taskToken").value(respondDecisionTaskCompletedRequest.getTaskToken());
            }

            if (respondDecisionTaskCompletedRequest != null) {
                java.util.List<Decision> decisionsList = respondDecisionTaskCompletedRequest.getDecisions();
                if (decisionsList != null && decisionsList.size() > 0) {
                    int decisionsListIndex = 1;
                    jsonWriter.key("decisions").array();
                    for (Decision decisionsListValue : decisionsList) {



                        jsonWriter.object();
                        if (decisionsListValue.getDecisionType() != null) {
                            jsonWriter.key("decisionType").value(decisionsListValue.getDecisionType());
                        }
                        if (decisionsListValue != null) {
                            ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes = decisionsListValue.getScheduleActivityTaskDecisionAttributes();
                            if (scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes != null) {
                                jsonWriter.key("scheduleActivityTaskDecisionAttributes").object();
                                if (scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes != null) {
                                    ActivityType activityTypeActivityType = scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getActivityType();
                                    if (activityTypeActivityType != null) {
                                        jsonWriter.key("activityType").object();
                                        if (activityTypeActivityType.getName() != null) {
                                            jsonWriter.key("name").value(activityTypeActivityType.getName());
                                        }
                                        if (activityTypeActivityType.getVersion() != null) {
                                            jsonWriter.key("version").value(activityTypeActivityType.getVersion());
                                        }
                                        jsonWriter.endObject();
                                    }
                                }
                                if (scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getActivityId() != null) {
                                    jsonWriter.key("activityId").value(scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getActivityId());
                                }
                                if (scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getControl() != null) {
                                    jsonWriter.key("control").value(scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getControl());
                                }
                                if (scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getInput() != null) {
                                    jsonWriter.key("input").value(scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getInput());
                                }
                                if (scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getScheduleToCloseTimeout() != null) {
                                    jsonWriter.key("scheduleToCloseTimeout").value(scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getScheduleToCloseTimeout());
                                }
                                if (scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes != null) {
                                    TaskList taskListTaskList = scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getTaskList();
                                    if (taskListTaskList != null) {
                                        jsonWriter.key("taskList").object();
                                        if (taskListTaskList.getName() != null) {
                                            jsonWriter.key("name").value(taskListTaskList.getName());
                                        }
                                        jsonWriter.endObject();
                                    }
                                }
                                if (scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getScheduleToStartTimeout() != null) {
                                    jsonWriter.key("scheduleToStartTimeout").value(scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getScheduleToStartTimeout());
                                }
                                if (scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getStartToCloseTimeout() != null) {
                                    jsonWriter.key("startToCloseTimeout").value(scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getStartToCloseTimeout());
                                }
                                if (scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getHeartbeatTimeout() != null) {
                                    jsonWriter.key("heartbeatTimeout").value(scheduleActivityTaskDecisionAttributesScheduleActivityTaskDecisionAttributes.getHeartbeatTimeout());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        if (decisionsListValue != null) {
                            RequestCancelActivityTaskDecisionAttributes requestCancelActivityTaskDecisionAttributesRequestCancelActivityTaskDecisionAttributes = decisionsListValue.getRequestCancelActivityTaskDecisionAttributes();
                            if (requestCancelActivityTaskDecisionAttributesRequestCancelActivityTaskDecisionAttributes != null) {
                                jsonWriter.key("requestCancelActivityTaskDecisionAttributes").object();
                                if (requestCancelActivityTaskDecisionAttributesRequestCancelActivityTaskDecisionAttributes.getActivityId() != null) {
                                    jsonWriter.key("activityId").value(requestCancelActivityTaskDecisionAttributesRequestCancelActivityTaskDecisionAttributes.getActivityId());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        if (decisionsListValue != null) {
                            CompleteWorkflowExecutionDecisionAttributes completeWorkflowExecutionDecisionAttributesCompleteWorkflowExecutionDecisionAttributes = decisionsListValue.getCompleteWorkflowExecutionDecisionAttributes();
                            if (completeWorkflowExecutionDecisionAttributesCompleteWorkflowExecutionDecisionAttributes != null) {
                                jsonWriter.key("completeWorkflowExecutionDecisionAttributes").object();
                                if (completeWorkflowExecutionDecisionAttributesCompleteWorkflowExecutionDecisionAttributes.getResult() != null) {
                                    jsonWriter.key("result").value(completeWorkflowExecutionDecisionAttributesCompleteWorkflowExecutionDecisionAttributes.getResult());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        if (decisionsListValue != null) {
                            FailWorkflowExecutionDecisionAttributes failWorkflowExecutionDecisionAttributesFailWorkflowExecutionDecisionAttributes = decisionsListValue.getFailWorkflowExecutionDecisionAttributes();
                            if (failWorkflowExecutionDecisionAttributesFailWorkflowExecutionDecisionAttributes != null) {
                                jsonWriter.key("failWorkflowExecutionDecisionAttributes").object();
                                if (failWorkflowExecutionDecisionAttributesFailWorkflowExecutionDecisionAttributes.getReason() != null) {
                                    jsonWriter.key("reason").value(failWorkflowExecutionDecisionAttributesFailWorkflowExecutionDecisionAttributes.getReason());
                                }
                                if (failWorkflowExecutionDecisionAttributesFailWorkflowExecutionDecisionAttributes.getDetails() != null) {
                                    jsonWriter.key("details").value(failWorkflowExecutionDecisionAttributesFailWorkflowExecutionDecisionAttributes.getDetails());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        if (decisionsListValue != null) {
                            CancelWorkflowExecutionDecisionAttributes cancelWorkflowExecutionDecisionAttributesCancelWorkflowExecutionDecisionAttributes = decisionsListValue.getCancelWorkflowExecutionDecisionAttributes();
                            if (cancelWorkflowExecutionDecisionAttributesCancelWorkflowExecutionDecisionAttributes != null) {
                                jsonWriter.key("cancelWorkflowExecutionDecisionAttributes").object();
                                if (cancelWorkflowExecutionDecisionAttributesCancelWorkflowExecutionDecisionAttributes.getDetails() != null) {
                                    jsonWriter.key("details").value(cancelWorkflowExecutionDecisionAttributesCancelWorkflowExecutionDecisionAttributes.getDetails());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        if (decisionsListValue != null) {
                            ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes = decisionsListValue.getContinueAsNewWorkflowExecutionDecisionAttributes();
                            if (continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes != null) {
                                jsonWriter.key("continueAsNewWorkflowExecutionDecisionAttributes").object();
                                if (continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes.getInput() != null) {
                                    jsonWriter.key("input").value(continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes.getInput());
                                }
                                if (continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout() != null) {
                                    jsonWriter.key("executionStartToCloseTimeout").value(continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout());
                                }
                                if (continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes != null) {
                                    TaskList taskListTaskList = continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes.getTaskList();
                                    if (taskListTaskList != null) {
                                        jsonWriter.key("taskList").object();
                                        if (taskListTaskList.getName() != null) {
                                            jsonWriter.key("name").value(taskListTaskList.getName());
                                        }
                                        jsonWriter.endObject();
                                    }
                                }
                                if (continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout() != null) {
                                    jsonWriter.key("taskStartToCloseTimeout").value(continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout());
                                }
                                if (continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes.getChildPolicy() != null) {
                                    jsonWriter.key("childPolicy").value(continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes.getChildPolicy());
                                }
                                if (continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes != null) {
                                    java.util.List<String> tagListList = continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes.getTagList();
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
                                if (continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes.getWorkflowTypeVersion() != null) {
                                    jsonWriter.key("workflowTypeVersion").value(continueAsNewWorkflowExecutionDecisionAttributesContinueAsNewWorkflowExecutionDecisionAttributes.getWorkflowTypeVersion());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        if (decisionsListValue != null) {
                            RecordMarkerDecisionAttributes recordMarkerDecisionAttributesRecordMarkerDecisionAttributes = decisionsListValue.getRecordMarkerDecisionAttributes();
                            if (recordMarkerDecisionAttributesRecordMarkerDecisionAttributes != null) {
                                jsonWriter.key("recordMarkerDecisionAttributes").object();
                                if (recordMarkerDecisionAttributesRecordMarkerDecisionAttributes.getMarkerName() != null) {
                                    jsonWriter.key("markerName").value(recordMarkerDecisionAttributesRecordMarkerDecisionAttributes.getMarkerName());
                                }
                                if (recordMarkerDecisionAttributesRecordMarkerDecisionAttributes.getDetails() != null) {
                                    jsonWriter.key("details").value(recordMarkerDecisionAttributesRecordMarkerDecisionAttributes.getDetails());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        if (decisionsListValue != null) {
                            StartTimerDecisionAttributes startTimerDecisionAttributesStartTimerDecisionAttributes = decisionsListValue.getStartTimerDecisionAttributes();
                            if (startTimerDecisionAttributesStartTimerDecisionAttributes != null) {
                                jsonWriter.key("startTimerDecisionAttributes").object();
                                if (startTimerDecisionAttributesStartTimerDecisionAttributes.getTimerId() != null) {
                                    jsonWriter.key("timerId").value(startTimerDecisionAttributesStartTimerDecisionAttributes.getTimerId());
                                }
                                if (startTimerDecisionAttributesStartTimerDecisionAttributes.getControl() != null) {
                                    jsonWriter.key("control").value(startTimerDecisionAttributesStartTimerDecisionAttributes.getControl());
                                }
                                if (startTimerDecisionAttributesStartTimerDecisionAttributes.getStartToFireTimeout() != null) {
                                    jsonWriter.key("startToFireTimeout").value(startTimerDecisionAttributesStartTimerDecisionAttributes.getStartToFireTimeout());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        if (decisionsListValue != null) {
                            CancelTimerDecisionAttributes cancelTimerDecisionAttributesCancelTimerDecisionAttributes = decisionsListValue.getCancelTimerDecisionAttributes();
                            if (cancelTimerDecisionAttributesCancelTimerDecisionAttributes != null) {
                                jsonWriter.key("cancelTimerDecisionAttributes").object();
                                if (cancelTimerDecisionAttributesCancelTimerDecisionAttributes.getTimerId() != null) {
                                    jsonWriter.key("timerId").value(cancelTimerDecisionAttributesCancelTimerDecisionAttributes.getTimerId());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        if (decisionsListValue != null) {
                            SignalExternalWorkflowExecutionDecisionAttributes signalExternalWorkflowExecutionDecisionAttributesSignalExternalWorkflowExecutionDecisionAttributes = decisionsListValue.getSignalExternalWorkflowExecutionDecisionAttributes();
                            if (signalExternalWorkflowExecutionDecisionAttributesSignalExternalWorkflowExecutionDecisionAttributes != null) {
                                jsonWriter.key("signalExternalWorkflowExecutionDecisionAttributes").object();
                                if (signalExternalWorkflowExecutionDecisionAttributesSignalExternalWorkflowExecutionDecisionAttributes.getWorkflowId() != null) {
                                    jsonWriter.key("workflowId").value(signalExternalWorkflowExecutionDecisionAttributesSignalExternalWorkflowExecutionDecisionAttributes.getWorkflowId());
                                }
                                if (signalExternalWorkflowExecutionDecisionAttributesSignalExternalWorkflowExecutionDecisionAttributes.getRunId() != null) {
                                    jsonWriter.key("runId").value(signalExternalWorkflowExecutionDecisionAttributesSignalExternalWorkflowExecutionDecisionAttributes.getRunId());
                                }
                                if (signalExternalWorkflowExecutionDecisionAttributesSignalExternalWorkflowExecutionDecisionAttributes.getSignalName() != null) {
                                    jsonWriter.key("signalName").value(signalExternalWorkflowExecutionDecisionAttributesSignalExternalWorkflowExecutionDecisionAttributes.getSignalName());
                                }
                                if (signalExternalWorkflowExecutionDecisionAttributesSignalExternalWorkflowExecutionDecisionAttributes.getInput() != null) {
                                    jsonWriter.key("input").value(signalExternalWorkflowExecutionDecisionAttributesSignalExternalWorkflowExecutionDecisionAttributes.getInput());
                                }
                                if (signalExternalWorkflowExecutionDecisionAttributesSignalExternalWorkflowExecutionDecisionAttributes.getControl() != null) {
                                    jsonWriter.key("control").value(signalExternalWorkflowExecutionDecisionAttributesSignalExternalWorkflowExecutionDecisionAttributes.getControl());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        if (decisionsListValue != null) {
                            RequestCancelExternalWorkflowExecutionDecisionAttributes requestCancelExternalWorkflowExecutionDecisionAttributesRequestCancelExternalWorkflowExecutionDecisionAttributes = decisionsListValue.getRequestCancelExternalWorkflowExecutionDecisionAttributes();
                            if (requestCancelExternalWorkflowExecutionDecisionAttributesRequestCancelExternalWorkflowExecutionDecisionAttributes != null) {
                                jsonWriter.key("requestCancelExternalWorkflowExecutionDecisionAttributes").object();
                                if (requestCancelExternalWorkflowExecutionDecisionAttributesRequestCancelExternalWorkflowExecutionDecisionAttributes.getWorkflowId() != null) {
                                    jsonWriter.key("workflowId").value(requestCancelExternalWorkflowExecutionDecisionAttributesRequestCancelExternalWorkflowExecutionDecisionAttributes.getWorkflowId());
                                }
                                if (requestCancelExternalWorkflowExecutionDecisionAttributesRequestCancelExternalWorkflowExecutionDecisionAttributes.getRunId() != null) {
                                    jsonWriter.key("runId").value(requestCancelExternalWorkflowExecutionDecisionAttributesRequestCancelExternalWorkflowExecutionDecisionAttributes.getRunId());
                                }
                                if (requestCancelExternalWorkflowExecutionDecisionAttributesRequestCancelExternalWorkflowExecutionDecisionAttributes.getControl() != null) {
                                    jsonWriter.key("control").value(requestCancelExternalWorkflowExecutionDecisionAttributesRequestCancelExternalWorkflowExecutionDecisionAttributes.getControl());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        if (decisionsListValue != null) {
                            StartChildWorkflowExecutionDecisionAttributes startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes = decisionsListValue.getStartChildWorkflowExecutionDecisionAttributes();
                            if (startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes != null) {
                                jsonWriter.key("startChildWorkflowExecutionDecisionAttributes").object();
                                if (startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes != null) {
                                    WorkflowType workflowTypeWorkflowType = startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getWorkflowType();
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
                                if (startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getWorkflowId() != null) {
                                    jsonWriter.key("workflowId").value(startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getWorkflowId());
                                }
                                if (startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getControl() != null) {
                                    jsonWriter.key("control").value(startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getControl());
                                }
                                if (startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getInput() != null) {
                                    jsonWriter.key("input").value(startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getInput());
                                }
                                if (startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout() != null) {
                                    jsonWriter.key("executionStartToCloseTimeout").value(startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout());
                                }
                                if (startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes != null) {
                                    TaskList taskListTaskList = startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getTaskList();
                                    if (taskListTaskList != null) {
                                        jsonWriter.key("taskList").object();
                                        if (taskListTaskList.getName() != null) {
                                            jsonWriter.key("name").value(taskListTaskList.getName());
                                        }
                                        jsonWriter.endObject();
                                    }
                                }
                                if (startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout() != null) {
                                    jsonWriter.key("taskStartToCloseTimeout").value(startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout());
                                }
                                if (startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getChildPolicy() != null) {
                                    jsonWriter.key("childPolicy").value(startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getChildPolicy());
                                }
                                if (startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes != null) {
                                    java.util.List<String> tagListList = startChildWorkflowExecutionDecisionAttributesStartChildWorkflowExecutionDecisionAttributes.getTagList();
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
                                jsonWriter.endObject();
                            }
                        }
                        jsonWriter.endObject();

                        decisionsListIndex++;
                    }
                    jsonWriter.endArray();
                }
            }
            if (respondDecisionTaskCompletedRequest.getExecutionContext() != null) {
                jsonWriter.key("executionContext").value(respondDecisionTaskCompletedRequest.getExecutionContext());
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
