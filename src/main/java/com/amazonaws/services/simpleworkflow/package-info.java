
/**
 * Synchronous and asynchronous client classes for accessing AmazonSimpleWorkflow.
 *
 * Amazon Simple Workflow Service <p>
 * The Amazon Simple Workflow Service API Reference is intended for
 * programmers who need detailed information about the Amazon SWF actions
 * and data types.
 * </p>
 * <p>
 * For an broader overview of the Amazon SWF programming model, please
 * go to the <a
 * ="http://docs.amazonwebservices.com/amazonswf/latest/developerguide/">
 * Amazon SWF Developer Guide </a> .
 * </p>
 * <p>
 * This section provides an overview of Amazon SWF actions.
 * </p>
 * <p>
 * <b>Action Categories</b>
 * </p>
 * <p>
 * The Amazon SWF actions can be grouped into the following major
 * categories.
 * </p>
 * 
 * <ul>
 * <li> <p>
 * Actions related to Activities
 * </p>
 * </li>
 * <li> <p>
 * Actions related to Deciders
 * </p>
 * </li>
 * <li> <p>
 * Actions related to Workflow Executions
 * </p>
 * </li>
 * <li> <p>
 * Actions related to Administration
 * </p>
 * </li>
 * <li> <p>
 * Actions related to Visibility
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Actions related to Activities</b>
 * </p>
 * <p>
 * The following are actions that are performed by activity workers:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * PollForActivityTask
 * </p>
 * </li>
 * <li> <p>
 * RespondActivityTaskCompleted
 * </p>
 * </li>
 * <li> <p>
 * RespondActivityTaskFailed
 * </p>
 * </li>
 * <li> <p>
 * RespondActivityTaskCanceled
 * </p>
 * </li>
 * <li> <p>
 * RecordActivityTaskHeartbeat
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Activity workers use the PollForActivityTask to get new activity
 * tasks. After a worker receives an activity task from Amazon SWF, it
 * performs the task and responds using RespondActivityTaskCompleted if
 * successful or RespondActivityTaskFailed if unsuccessful.
 * </p>
 * <p>
 * <b>Actions related to Deciders</b>
 * </p>
 * <p>
 * The following are actions that are performed by deciders:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * PollForDecisionTask
 * </p>
 * </li>
 * <li> <p>
 * RespondDecisionTaskCompleted
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Deciders use PollForDecisionTask to get decision tasks. After a
 * decider receives a decision task from Amazon SWF, it examines its
 * workflow execution history and decides what to do next. It calls
 * RespondDecisionTaskCompletedto complete the decision task and provide
 * zero or more next decisions.
 * </p>
 * <p>
 * <b>Actions related to Workflow Executions</b>
 * </p>
 * <p>
 * The following actions operate on a workflow execution:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RequestCancelWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * StartWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * SignalWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * TerminateWorkflowExecution
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Actions related to Administration</b>
 * </p>
 * <p>
 * Although you can perform administrative tasks from the Amazon SWF
 * console, you can use the actions in this section to automate functions
 * or build your own administrative tools.
 * </p>
 * <p>
 * <b>Activity Management</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RegisterActivityType
 * </p>
 * </li>
 * <li> <p>
 * DeprecateActivityType
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Workflow Management</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RegisterWorkflowType
 * </p>
 * </li>
 * <li> <p>
 * DeprecateWorkflowType
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Domain Management</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RegisterDomain
 * </p>
 * </li>
 * <li> <p>
 * DeprecateDomain
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Workflow Execution Management</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RequestCancelWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * TerminateWorkflowExecution
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Visibility Actions</b>
 * </p>
 * <p>
 * Although you can perform visibility actions from the Amazon SWF
 * console, you can use the actions in this section to build your own
 * console or administrative tools.
 * </p>
 * 
 * <ul>
 * 
 * </ul>
 * <p>
 * <b>Activity Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * ListActivityTypes
 * </p>
 * </li>
 * <li> <p>
 * DescribeActivity
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Workflow Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * ListWorkflowTypes
 * </p>
 * </li>
 * <li> <p>
 * DescribeWorkflowType
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Workflow Execution Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * DescribeWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * ListOpenWorkflowExecutions
 * </p>
 * </li>
 * <li> <p>
 * ListClosedWorkflowExecutions
 * </p>
 * </li>
 * <li> <p>
 * CountOpenWorkflowExecutions
 * </p>
 * </li>
 * <li> <p>
 * CountClosedWorkflowExecutions
 * </p>
 * </li>
 * <li> <p>
 * GetWorkflowExecutionHistory
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Domain Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * ListDomains
 * </p>
 * </li>
 * <li> <p>
 * DescribeDomain
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Task List Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * CountPendingActivityTasks
 * </p>
 * </li>
 * <li> <p>
 * CountPendingDecisionTasks
 * </p>
 * </li>
 * 
 * </ul>
 */
 package com.amazonaws.services.simpleworkflow;
        