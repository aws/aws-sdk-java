/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon SWF.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SwfActions implements Action {

    /** Represents any action executed on Amazon SWF. */
    AllSwfActions("swf:*"),

    /** Action for the CountClosedWorkflowExecutions operation. */
    CountClosedWorkflowExecutions("swf:CountClosedWorkflowExecutions"),
    /** Action for the CountOpenWorkflowExecutions operation. */
    CountOpenWorkflowExecutions("swf:CountOpenWorkflowExecutions"),
    /** Action for the CountPendingActivityTasks operation. */
    CountPendingActivityTasks("swf:CountPendingActivityTasks"),
    /** Action for the CountPendingDecisionTasks operation. */
    CountPendingDecisionTasks("swf:CountPendingDecisionTasks"),
    /** Action for the DeprecateActivityType operation. */
    DeprecateActivityType("swf:DeprecateActivityType"),
    /** Action for the DeprecateDomain operation. */
    DeprecateDomain("swf:DeprecateDomain"),
    /** Action for the DeprecateWorkflowType operation. */
    DeprecateWorkflowType("swf:DeprecateWorkflowType"),
    /** Action for the DescribeActivityType operation. */
    DescribeActivityType("swf:DescribeActivityType"),
    /** Action for the DescribeDomain operation. */
    DescribeDomain("swf:DescribeDomain"),
    /** Action for the DescribeWorkflowExecution operation. */
    DescribeWorkflowExecution("swf:DescribeWorkflowExecution"),
    /** Action for the DescribeWorkflowType operation. */
    DescribeWorkflowType("swf:DescribeWorkflowType"),
    /** Action for the GetWorkflowExecutionHistory operation. */
    GetWorkflowExecutionHistory("swf:GetWorkflowExecutionHistory"),
    /** Action for the ListActivityTypes operation. */
    ListActivityTypes("swf:ListActivityTypes"),
    /** Action for the ListClosedWorkflowExecutions operation. */
    ListClosedWorkflowExecutions("swf:ListClosedWorkflowExecutions"),
    /** Action for the ListDomains operation. */
    ListDomains("swf:ListDomains"),
    /** Action for the ListOpenWorkflowExecutions operation. */
    ListOpenWorkflowExecutions("swf:ListOpenWorkflowExecutions"),
    /** Action for the ListWorkflowTypes operation. */
    ListWorkflowTypes("swf:ListWorkflowTypes"),
    /** Action for the PollForActivityTask operation. */
    PollForActivityTask("swf:PollForActivityTask"),
    /** Action for the PollForDecisionTask operation. */
    PollForDecisionTask("swf:PollForDecisionTask"),
    /** Action for the RecordActivityTaskHeartbeat operation. */
    RecordActivityTaskHeartbeat("swf:RecordActivityTaskHeartbeat"),
    /** Action for the RegisterActivityType operation. */
    RegisterActivityType("swf:RegisterActivityType"),
    /** Action for the RegisterDomain operation. */
    RegisterDomain("swf:RegisterDomain"),
    /** Action for the RegisterWorkflowType operation. */
    RegisterWorkflowType("swf:RegisterWorkflowType"),
    /** Action for the RequestCancelWorkflowExecution operation. */
    RequestCancelWorkflowExecution("swf:RequestCancelWorkflowExecution"),
    /** Action for the RespondActivityTaskCanceled operation. */
    RespondActivityTaskCanceled("swf:RespondActivityTaskCanceled"),
    /** Action for the RespondActivityTaskCompleted operation. */
    RespondActivityTaskCompleted("swf:RespondActivityTaskCompleted"),
    /** Action for the RespondActivityTaskFailed operation. */
    RespondActivityTaskFailed("swf:RespondActivityTaskFailed"),
    /** Action for the RespondDecisionTaskCompleted operation. */
    RespondDecisionTaskCompleted("swf:RespondDecisionTaskCompleted"),
    /** Action for the SignalWorkflowExecution operation. */
    SignalWorkflowExecution("swf:SignalWorkflowExecution"),
    /** Action for the StartWorkflowExecution operation. */
    StartWorkflowExecution("swf:StartWorkflowExecution"),
    /** Action for the TerminateWorkflowExecution operation. */
    TerminateWorkflowExecution("swf:TerminateWorkflowExecution"),

    ;

    private final String action;

    private SwfActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
