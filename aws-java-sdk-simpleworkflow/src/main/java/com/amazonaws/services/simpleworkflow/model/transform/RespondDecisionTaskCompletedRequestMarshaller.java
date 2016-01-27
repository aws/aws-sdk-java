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

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (respondDecisionTaskCompletedRequest.getTaskToken() != null) {
                jsonWriter.key("taskToken").value(respondDecisionTaskCompletedRequest.getTaskToken());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<Decision> decisionsList = (com.amazonaws.internal.ListWithAutoConstructFlag<Decision>)(respondDecisionTaskCompletedRequest.getDecisions());
            if (decisionsList != null && !(decisionsList.isAutoConstruct() && decisionsList.isEmpty())) {

                jsonWriter.key("decisions");
                jsonWriter.array();

                for (Decision decisionsListValue : decisionsList) {
                    if (decisionsListValue != null) {
                        jsonWriter.object();
                        if (decisionsListValue.getDecisionType() != null) {
                            jsonWriter.key("decisionType").value(decisionsListValue.getDecisionType());
                        }
                        ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes = decisionsListValue.getScheduleActivityTaskDecisionAttributes();
                        if (scheduleActivityTaskDecisionAttributes != null) {

                            jsonWriter.key("scheduleActivityTaskDecisionAttributes");
                            jsonWriter.object();

                            ActivityType activityType = scheduleActivityTaskDecisionAttributes.getActivityType();
                            if (activityType != null) {

                                jsonWriter.key("activityType");
                                jsonWriter.object();

                                if (activityType.getName() != null) {
                                    jsonWriter.key("name").value(activityType.getName());
                                }
                                if (activityType.getVersion() != null) {
                                    jsonWriter.key("version").value(activityType.getVersion());
                                }
                                jsonWriter.endObject();
                            }
                            if (scheduleActivityTaskDecisionAttributes.getActivityId() != null) {
                                jsonWriter.key("activityId").value(scheduleActivityTaskDecisionAttributes.getActivityId());
                            }
                            if (scheduleActivityTaskDecisionAttributes.getControl() != null) {
                                jsonWriter.key("control").value(scheduleActivityTaskDecisionAttributes.getControl());
                            }
                            if (scheduleActivityTaskDecisionAttributes.getInput() != null) {
                                jsonWriter.key("input").value(scheduleActivityTaskDecisionAttributes.getInput());
                            }
                            if (scheduleActivityTaskDecisionAttributes.getScheduleToCloseTimeout() != null) {
                                jsonWriter.key("scheduleToCloseTimeout").value(scheduleActivityTaskDecisionAttributes.getScheduleToCloseTimeout());
                            }
                            TaskList taskList = scheduleActivityTaskDecisionAttributes.getTaskList();
                            if (taskList != null) {

                                jsonWriter.key("taskList");
                                jsonWriter.object();

                                if (taskList.getName() != null) {
                                    jsonWriter.key("name").value(taskList.getName());
                                }
                                jsonWriter.endObject();
                            }
                            if (scheduleActivityTaskDecisionAttributes.getTaskPriority() != null) {
                                jsonWriter.key("taskPriority").value(scheduleActivityTaskDecisionAttributes.getTaskPriority());
                            }
                            if (scheduleActivityTaskDecisionAttributes.getScheduleToStartTimeout() != null) {
                                jsonWriter.key("scheduleToStartTimeout").value(scheduleActivityTaskDecisionAttributes.getScheduleToStartTimeout());
                            }
                            if (scheduleActivityTaskDecisionAttributes.getStartToCloseTimeout() != null) {
                                jsonWriter.key("startToCloseTimeout").value(scheduleActivityTaskDecisionAttributes.getStartToCloseTimeout());
                            }
                            if (scheduleActivityTaskDecisionAttributes.getHeartbeatTimeout() != null) {
                                jsonWriter.key("heartbeatTimeout").value(scheduleActivityTaskDecisionAttributes.getHeartbeatTimeout());
                            }
                            jsonWriter.endObject();
                        }
                        RequestCancelActivityTaskDecisionAttributes requestCancelActivityTaskDecisionAttributes = decisionsListValue.getRequestCancelActivityTaskDecisionAttributes();
                        if (requestCancelActivityTaskDecisionAttributes != null) {

                            jsonWriter.key("requestCancelActivityTaskDecisionAttributes");
                            jsonWriter.object();

                            if (requestCancelActivityTaskDecisionAttributes.getActivityId() != null) {
                                jsonWriter.key("activityId").value(requestCancelActivityTaskDecisionAttributes.getActivityId());
                            }
                            jsonWriter.endObject();
                        }
                        CompleteWorkflowExecutionDecisionAttributes completeWorkflowExecutionDecisionAttributes = decisionsListValue.getCompleteWorkflowExecutionDecisionAttributes();
                        if (completeWorkflowExecutionDecisionAttributes != null) {

                            jsonWriter.key("completeWorkflowExecutionDecisionAttributes");
                            jsonWriter.object();

                            if (completeWorkflowExecutionDecisionAttributes.getResult() != null) {
                                jsonWriter.key("result").value(completeWorkflowExecutionDecisionAttributes.getResult());
                            }
                            jsonWriter.endObject();
                        }
                        FailWorkflowExecutionDecisionAttributes failWorkflowExecutionDecisionAttributes = decisionsListValue.getFailWorkflowExecutionDecisionAttributes();
                        if (failWorkflowExecutionDecisionAttributes != null) {

                            jsonWriter.key("failWorkflowExecutionDecisionAttributes");
                            jsonWriter.object();

                            if (failWorkflowExecutionDecisionAttributes.getReason() != null) {
                                jsonWriter.key("reason").value(failWorkflowExecutionDecisionAttributes.getReason());
                            }
                            if (failWorkflowExecutionDecisionAttributes.getDetails() != null) {
                                jsonWriter.key("details").value(failWorkflowExecutionDecisionAttributes.getDetails());
                            }
                            jsonWriter.endObject();
                        }
                        CancelWorkflowExecutionDecisionAttributes cancelWorkflowExecutionDecisionAttributes = decisionsListValue.getCancelWorkflowExecutionDecisionAttributes();
                        if (cancelWorkflowExecutionDecisionAttributes != null) {

                            jsonWriter.key("cancelWorkflowExecutionDecisionAttributes");
                            jsonWriter.object();

                            if (cancelWorkflowExecutionDecisionAttributes.getDetails() != null) {
                                jsonWriter.key("details").value(cancelWorkflowExecutionDecisionAttributes.getDetails());
                            }
                            jsonWriter.endObject();
                        }
                        ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributes = decisionsListValue.getContinueAsNewWorkflowExecutionDecisionAttributes();
                        if (continueAsNewWorkflowExecutionDecisionAttributes != null) {

                            jsonWriter.key("continueAsNewWorkflowExecutionDecisionAttributes");
                            jsonWriter.object();

                            if (continueAsNewWorkflowExecutionDecisionAttributes.getInput() != null) {
                                jsonWriter.key("input").value(continueAsNewWorkflowExecutionDecisionAttributes.getInput());
                            }
                            if (continueAsNewWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout() != null) {
                                jsonWriter.key("executionStartToCloseTimeout").value(continueAsNewWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout());
                            }
                            TaskList taskList = continueAsNewWorkflowExecutionDecisionAttributes.getTaskList();
                            if (taskList != null) {

                                jsonWriter.key("taskList");
                                jsonWriter.object();

                                if (taskList.getName() != null) {
                                    jsonWriter.key("name").value(taskList.getName());
                                }
                                jsonWriter.endObject();
                            }
                            if (continueAsNewWorkflowExecutionDecisionAttributes.getTaskPriority() != null) {
                                jsonWriter.key("taskPriority").value(continueAsNewWorkflowExecutionDecisionAttributes.getTaskPriority());
                            }
                            if (continueAsNewWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout() != null) {
                                jsonWriter.key("taskStartToCloseTimeout").value(continueAsNewWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout());
                            }
                            if (continueAsNewWorkflowExecutionDecisionAttributes.getChildPolicy() != null) {
                                jsonWriter.key("childPolicy").value(continueAsNewWorkflowExecutionDecisionAttributes.getChildPolicy());
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagListList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(continueAsNewWorkflowExecutionDecisionAttributes.getTagList());
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
                            if (continueAsNewWorkflowExecutionDecisionAttributes.getWorkflowTypeVersion() != null) {
                                jsonWriter.key("workflowTypeVersion").value(continueAsNewWorkflowExecutionDecisionAttributes.getWorkflowTypeVersion());
                            }
                            if (continueAsNewWorkflowExecutionDecisionAttributes.getLambdaRole() != null) {
                                jsonWriter.key("lambdaRole").value(continueAsNewWorkflowExecutionDecisionAttributes.getLambdaRole());
                            }
                            jsonWriter.endObject();
                        }
                        RecordMarkerDecisionAttributes recordMarkerDecisionAttributes = decisionsListValue.getRecordMarkerDecisionAttributes();
                        if (recordMarkerDecisionAttributes != null) {

                            jsonWriter.key("recordMarkerDecisionAttributes");
                            jsonWriter.object();

                            if (recordMarkerDecisionAttributes.getMarkerName() != null) {
                                jsonWriter.key("markerName").value(recordMarkerDecisionAttributes.getMarkerName());
                            }
                            if (recordMarkerDecisionAttributes.getDetails() != null) {
                                jsonWriter.key("details").value(recordMarkerDecisionAttributes.getDetails());
                            }
                            jsonWriter.endObject();
                        }
                        StartTimerDecisionAttributes startTimerDecisionAttributes = decisionsListValue.getStartTimerDecisionAttributes();
                        if (startTimerDecisionAttributes != null) {

                            jsonWriter.key("startTimerDecisionAttributes");
                            jsonWriter.object();

                            if (startTimerDecisionAttributes.getTimerId() != null) {
                                jsonWriter.key("timerId").value(startTimerDecisionAttributes.getTimerId());
                            }
                            if (startTimerDecisionAttributes.getControl() != null) {
                                jsonWriter.key("control").value(startTimerDecisionAttributes.getControl());
                            }
                            if (startTimerDecisionAttributes.getStartToFireTimeout() != null) {
                                jsonWriter.key("startToFireTimeout").value(startTimerDecisionAttributes.getStartToFireTimeout());
                            }
                            jsonWriter.endObject();
                        }
                        CancelTimerDecisionAttributes cancelTimerDecisionAttributes = decisionsListValue.getCancelTimerDecisionAttributes();
                        if (cancelTimerDecisionAttributes != null) {

                            jsonWriter.key("cancelTimerDecisionAttributes");
                            jsonWriter.object();

                            if (cancelTimerDecisionAttributes.getTimerId() != null) {
                                jsonWriter.key("timerId").value(cancelTimerDecisionAttributes.getTimerId());
                            }
                            jsonWriter.endObject();
                        }
                        SignalExternalWorkflowExecutionDecisionAttributes signalExternalWorkflowExecutionDecisionAttributes = decisionsListValue.getSignalExternalWorkflowExecutionDecisionAttributes();
                        if (signalExternalWorkflowExecutionDecisionAttributes != null) {

                            jsonWriter.key("signalExternalWorkflowExecutionDecisionAttributes");
                            jsonWriter.object();

                            if (signalExternalWorkflowExecutionDecisionAttributes.getWorkflowId() != null) {
                                jsonWriter.key("workflowId").value(signalExternalWorkflowExecutionDecisionAttributes.getWorkflowId());
                            }
                            if (signalExternalWorkflowExecutionDecisionAttributes.getRunId() != null) {
                                jsonWriter.key("runId").value(signalExternalWorkflowExecutionDecisionAttributes.getRunId());
                            }
                            if (signalExternalWorkflowExecutionDecisionAttributes.getSignalName() != null) {
                                jsonWriter.key("signalName").value(signalExternalWorkflowExecutionDecisionAttributes.getSignalName());
                            }
                            if (signalExternalWorkflowExecutionDecisionAttributes.getInput() != null) {
                                jsonWriter.key("input").value(signalExternalWorkflowExecutionDecisionAttributes.getInput());
                            }
                            if (signalExternalWorkflowExecutionDecisionAttributes.getControl() != null) {
                                jsonWriter.key("control").value(signalExternalWorkflowExecutionDecisionAttributes.getControl());
                            }
                            jsonWriter.endObject();
                        }
                        RequestCancelExternalWorkflowExecutionDecisionAttributes requestCancelExternalWorkflowExecutionDecisionAttributes = decisionsListValue.getRequestCancelExternalWorkflowExecutionDecisionAttributes();
                        if (requestCancelExternalWorkflowExecutionDecisionAttributes != null) {

                            jsonWriter.key("requestCancelExternalWorkflowExecutionDecisionAttributes");
                            jsonWriter.object();

                            if (requestCancelExternalWorkflowExecutionDecisionAttributes.getWorkflowId() != null) {
                                jsonWriter.key("workflowId").value(requestCancelExternalWorkflowExecutionDecisionAttributes.getWorkflowId());
                            }
                            if (requestCancelExternalWorkflowExecutionDecisionAttributes.getRunId() != null) {
                                jsonWriter.key("runId").value(requestCancelExternalWorkflowExecutionDecisionAttributes.getRunId());
                            }
                            if (requestCancelExternalWorkflowExecutionDecisionAttributes.getControl() != null) {
                                jsonWriter.key("control").value(requestCancelExternalWorkflowExecutionDecisionAttributes.getControl());
                            }
                            jsonWriter.endObject();
                        }
                        StartChildWorkflowExecutionDecisionAttributes startChildWorkflowExecutionDecisionAttributes = decisionsListValue.getStartChildWorkflowExecutionDecisionAttributes();
                        if (startChildWorkflowExecutionDecisionAttributes != null) {

                            jsonWriter.key("startChildWorkflowExecutionDecisionAttributes");
                            jsonWriter.object();

                            WorkflowType workflowType = startChildWorkflowExecutionDecisionAttributes.getWorkflowType();
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
                            if (startChildWorkflowExecutionDecisionAttributes.getWorkflowId() != null) {
                                jsonWriter.key("workflowId").value(startChildWorkflowExecutionDecisionAttributes.getWorkflowId());
                            }
                            if (startChildWorkflowExecutionDecisionAttributes.getControl() != null) {
                                jsonWriter.key("control").value(startChildWorkflowExecutionDecisionAttributes.getControl());
                            }
                            if (startChildWorkflowExecutionDecisionAttributes.getInput() != null) {
                                jsonWriter.key("input").value(startChildWorkflowExecutionDecisionAttributes.getInput());
                            }
                            if (startChildWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout() != null) {
                                jsonWriter.key("executionStartToCloseTimeout").value(startChildWorkflowExecutionDecisionAttributes.getExecutionStartToCloseTimeout());
                            }
                            TaskList taskList = startChildWorkflowExecutionDecisionAttributes.getTaskList();
                            if (taskList != null) {

                                jsonWriter.key("taskList");
                                jsonWriter.object();

                                if (taskList.getName() != null) {
                                    jsonWriter.key("name").value(taskList.getName());
                                }
                                jsonWriter.endObject();
                            }
                            if (startChildWorkflowExecutionDecisionAttributes.getTaskPriority() != null) {
                                jsonWriter.key("taskPriority").value(startChildWorkflowExecutionDecisionAttributes.getTaskPriority());
                            }
                            if (startChildWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout() != null) {
                                jsonWriter.key("taskStartToCloseTimeout").value(startChildWorkflowExecutionDecisionAttributes.getTaskStartToCloseTimeout());
                            }
                            if (startChildWorkflowExecutionDecisionAttributes.getChildPolicy() != null) {
                                jsonWriter.key("childPolicy").value(startChildWorkflowExecutionDecisionAttributes.getChildPolicy());
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagListList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(startChildWorkflowExecutionDecisionAttributes.getTagList());
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
                            if (startChildWorkflowExecutionDecisionAttributes.getLambdaRole() != null) {
                                jsonWriter.key("lambdaRole").value(startChildWorkflowExecutionDecisionAttributes.getLambdaRole());
                            }
                            jsonWriter.endObject();
                        }
                        ScheduleLambdaFunctionDecisionAttributes scheduleLambdaFunctionDecisionAttributes = decisionsListValue.getScheduleLambdaFunctionDecisionAttributes();
                        if (scheduleLambdaFunctionDecisionAttributes != null) {

                            jsonWriter.key("scheduleLambdaFunctionDecisionAttributes");
                            jsonWriter.object();

                            if (scheduleLambdaFunctionDecisionAttributes.getId() != null) {
                                jsonWriter.key("id").value(scheduleLambdaFunctionDecisionAttributes.getId());
                            }
                            if (scheduleLambdaFunctionDecisionAttributes.getName() != null) {
                                jsonWriter.key("name").value(scheduleLambdaFunctionDecisionAttributes.getName());
                            }
                            if (scheduleLambdaFunctionDecisionAttributes.getInput() != null) {
                                jsonWriter.key("input").value(scheduleLambdaFunctionDecisionAttributes.getInput());
                            }
                            if (scheduleLambdaFunctionDecisionAttributes.getStartToCloseTimeout() != null) {
                                jsonWriter.key("startToCloseTimeout").value(scheduleLambdaFunctionDecisionAttributes.getStartToCloseTimeout());
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }
            if (respondDecisionTaskCompletedRequest.getExecutionContext() != null) {
                jsonWriter.key("executionContext").value(respondDecisionTaskCompletedRequest.getExecutionContext());
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
