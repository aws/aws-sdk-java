/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the action to be performed when a rule is triggered.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RuleAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of action that creates a rule.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * Information about the task action. This field is required if <code>TriggerEventSource</code> is one of the
     * following values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     */
    private TaskActionDefinition taskAction;
    /**
     * <p>
     * Information about the EventBridge action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     * <code>OnMetricDataUpdate</code>
     * </p>
     */
    private EventBridgeActionDefinition eventBridgeAction;
    /**
     * <p>
     * Information about the contact category action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> | <code>OnZendeskTicketCreate</code> |
     * <code>OnZendeskTicketStatusUpdate</code> | <code>OnSalesforceCaseCreate</code>
     * </p>
     */
    private AssignContactCategoryActionDefinition assignContactCategoryAction;
    /**
     * <p>
     * Information about the send notification action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     * <code>OnMetricDataUpdate</code>
     * </p>
     */
    private SendNotificationActionDefinition sendNotificationAction;
    /**
     * <p>
     * Information about the create case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code>.
     * </p>
     */
    private CreateCaseActionDefinition createCaseAction;
    /**
     * <p>
     * Information about the update case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnCaseCreate</code> | <code>OnCaseUpdate</code>.
     * </p>
     */
    private UpdateCaseActionDefinition updateCaseAction;
    /**
     * <p>
     * Information about the end associated tasks action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnCaseUpdate</code>.
     * </p>
     */
    private EndAssociatedTasksActionDefinition endAssociatedTasksAction;
    /**
     * <p>
     * Information about the submit automated evaluation action.
     * </p>
     */
    private SubmitAutoEvaluationActionDefinition submitAutoEvaluationAction;

    /**
     * <p>
     * The type of action that creates a rule.
     * </p>
     * 
     * @param actionType
     *        The type of action that creates a rule.
     * @see ActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of action that creates a rule.
     * </p>
     * 
     * @return The type of action that creates a rule.
     * @see ActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of action that creates a rule.
     * </p>
     * 
     * @param actionType
     *        The type of action that creates a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public RuleAction withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The type of action that creates a rule.
     * </p>
     * 
     * @param actionType
     *        The type of action that creates a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public RuleAction withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the task action. This field is required if <code>TriggerEventSource</code> is one of the
     * following values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     * 
     * @param taskAction
     *        Information about the task action. This field is required if <code>TriggerEventSource</code> is one of the
     *        following values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     *        <code>OnSalesforceCaseCreate</code>
     */

    public void setTaskAction(TaskActionDefinition taskAction) {
        this.taskAction = taskAction;
    }

    /**
     * <p>
     * Information about the task action. This field is required if <code>TriggerEventSource</code> is one of the
     * following values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     * 
     * @return Information about the task action. This field is required if <code>TriggerEventSource</code> is one of
     *         the following values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     *         <code>OnSalesforceCaseCreate</code>
     */

    public TaskActionDefinition getTaskAction() {
        return this.taskAction;
    }

    /**
     * <p>
     * Information about the task action. This field is required if <code>TriggerEventSource</code> is one of the
     * following values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     * 
     * @param taskAction
     *        Information about the task action. This field is required if <code>TriggerEventSource</code> is one of the
     *        following values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     *        <code>OnSalesforceCaseCreate</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withTaskAction(TaskActionDefinition taskAction) {
        setTaskAction(taskAction);
        return this;
    }

    /**
     * <p>
     * Information about the EventBridge action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     * <code>OnMetricDataUpdate</code>
     * </p>
     * 
     * @param eventBridgeAction
     *        Information about the EventBridge action.</p>
     *        <p>
     *        Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     *        <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     *        <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     *        <code>OnMetricDataUpdate</code>
     */

    public void setEventBridgeAction(EventBridgeActionDefinition eventBridgeAction) {
        this.eventBridgeAction = eventBridgeAction;
    }

    /**
     * <p>
     * Information about the EventBridge action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     * <code>OnMetricDataUpdate</code>
     * </p>
     * 
     * @return Information about the EventBridge action.</p>
     *         <p>
     *         Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     *         <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     *         <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     *         <code>OnMetricDataUpdate</code>
     */

    public EventBridgeActionDefinition getEventBridgeAction() {
        return this.eventBridgeAction;
    }

    /**
     * <p>
     * Information about the EventBridge action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     * <code>OnMetricDataUpdate</code>
     * </p>
     * 
     * @param eventBridgeAction
     *        Information about the EventBridge action.</p>
     *        <p>
     *        Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     *        <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     *        <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     *        <code>OnMetricDataUpdate</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withEventBridgeAction(EventBridgeActionDefinition eventBridgeAction) {
        setEventBridgeAction(eventBridgeAction);
        return this;
    }

    /**
     * <p>
     * Information about the contact category action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> | <code>OnZendeskTicketCreate</code> |
     * <code>OnZendeskTicketStatusUpdate</code> | <code>OnSalesforceCaseCreate</code>
     * </p>
     * 
     * @param assignContactCategoryAction
     *        Information about the contact category action.</p>
     *        <p>
     *        Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     *        <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     *        <code>OnPostChatAnalysisAvailable</code> | <code>OnZendeskTicketCreate</code> |
     *        <code>OnZendeskTicketStatusUpdate</code> | <code>OnSalesforceCaseCreate</code>
     */

    public void setAssignContactCategoryAction(AssignContactCategoryActionDefinition assignContactCategoryAction) {
        this.assignContactCategoryAction = assignContactCategoryAction;
    }

    /**
     * <p>
     * Information about the contact category action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> | <code>OnZendeskTicketCreate</code> |
     * <code>OnZendeskTicketStatusUpdate</code> | <code>OnSalesforceCaseCreate</code>
     * </p>
     * 
     * @return Information about the contact category action.</p>
     *         <p>
     *         Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     *         <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     *         <code>OnPostChatAnalysisAvailable</code> | <code>OnZendeskTicketCreate</code> |
     *         <code>OnZendeskTicketStatusUpdate</code> | <code>OnSalesforceCaseCreate</code>
     */

    public AssignContactCategoryActionDefinition getAssignContactCategoryAction() {
        return this.assignContactCategoryAction;
    }

    /**
     * <p>
     * Information about the contact category action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> | <code>OnZendeskTicketCreate</code> |
     * <code>OnZendeskTicketStatusUpdate</code> | <code>OnSalesforceCaseCreate</code>
     * </p>
     * 
     * @param assignContactCategoryAction
     *        Information about the contact category action.</p>
     *        <p>
     *        Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     *        <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     *        <code>OnPostChatAnalysisAvailable</code> | <code>OnZendeskTicketCreate</code> |
     *        <code>OnZendeskTicketStatusUpdate</code> | <code>OnSalesforceCaseCreate</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withAssignContactCategoryAction(AssignContactCategoryActionDefinition assignContactCategoryAction) {
        setAssignContactCategoryAction(assignContactCategoryAction);
        return this;
    }

    /**
     * <p>
     * Information about the send notification action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     * <code>OnMetricDataUpdate</code>
     * </p>
     * 
     * @param sendNotificationAction
     *        Information about the send notification action.</p>
     *        <p>
     *        Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     *        <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     *        <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     *        <code>OnMetricDataUpdate</code>
     */

    public void setSendNotificationAction(SendNotificationActionDefinition sendNotificationAction) {
        this.sendNotificationAction = sendNotificationAction;
    }

    /**
     * <p>
     * Information about the send notification action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     * <code>OnMetricDataUpdate</code>
     * </p>
     * 
     * @return Information about the send notification action.</p>
     *         <p>
     *         Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     *         <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     *         <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     *         <code>OnMetricDataUpdate</code>
     */

    public SendNotificationActionDefinition getSendNotificationAction() {
        return this.sendNotificationAction;
    }

    /**
     * <p>
     * Information about the send notification action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     * <code>OnMetricDataUpdate</code>
     * </p>
     * 
     * @param sendNotificationAction
     *        Information about the send notification action.</p>
     *        <p>
     *        Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     *        <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnRealTimeChatAnalysisAvailable</code> |
     *        <code>OnPostChatAnalysisAvailable</code> | <code>OnContactEvaluationSubmit</code> |
     *        <code>OnMetricDataUpdate</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withSendNotificationAction(SendNotificationActionDefinition sendNotificationAction) {
        setSendNotificationAction(sendNotificationAction);
        return this;
    }

    /**
     * <p>
     * Information about the create case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code>.
     * </p>
     * 
     * @param createCaseAction
     *        Information about the create case action.</p>
     *        <p>
     *        Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     *        <code>OnPostChatAnalysisAvailable</code>.
     */

    public void setCreateCaseAction(CreateCaseActionDefinition createCaseAction) {
        this.createCaseAction = createCaseAction;
    }

    /**
     * <p>
     * Information about the create case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code>.
     * </p>
     * 
     * @return Information about the create case action.</p>
     *         <p>
     *         Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     *         <code>OnPostChatAnalysisAvailable</code>.
     */

    public CreateCaseActionDefinition getCreateCaseAction() {
        return this.createCaseAction;
    }

    /**
     * <p>
     * Information about the create case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code>.
     * </p>
     * 
     * @param createCaseAction
     *        Information about the create case action.</p>
     *        <p>
     *        Supported only for <code>TriggerEventSource</code> values: <code>OnPostCallAnalysisAvailable</code> |
     *        <code>OnPostChatAnalysisAvailable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withCreateCaseAction(CreateCaseActionDefinition createCaseAction) {
        setCreateCaseAction(createCaseAction);
        return this;
    }

    /**
     * <p>
     * Information about the update case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnCaseCreate</code> | <code>OnCaseUpdate</code>.
     * </p>
     * 
     * @param updateCaseAction
     *        Information about the update case action.</p>
     *        <p>
     *        Supported only for <code>TriggerEventSource</code> values: <code>OnCaseCreate</code> |
     *        <code>OnCaseUpdate</code>.
     */

    public void setUpdateCaseAction(UpdateCaseActionDefinition updateCaseAction) {
        this.updateCaseAction = updateCaseAction;
    }

    /**
     * <p>
     * Information about the update case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnCaseCreate</code> | <code>OnCaseUpdate</code>.
     * </p>
     * 
     * @return Information about the update case action.</p>
     *         <p>
     *         Supported only for <code>TriggerEventSource</code> values: <code>OnCaseCreate</code> |
     *         <code>OnCaseUpdate</code>.
     */

    public UpdateCaseActionDefinition getUpdateCaseAction() {
        return this.updateCaseAction;
    }

    /**
     * <p>
     * Information about the update case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnCaseCreate</code> | <code>OnCaseUpdate</code>.
     * </p>
     * 
     * @param updateCaseAction
     *        Information about the update case action.</p>
     *        <p>
     *        Supported only for <code>TriggerEventSource</code> values: <code>OnCaseCreate</code> |
     *        <code>OnCaseUpdate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withUpdateCaseAction(UpdateCaseActionDefinition updateCaseAction) {
        setUpdateCaseAction(updateCaseAction);
        return this;
    }

    /**
     * <p>
     * Information about the end associated tasks action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnCaseUpdate</code>.
     * </p>
     * 
     * @param endAssociatedTasksAction
     *        Information about the end associated tasks action.</p>
     *        <p>
     *        Supported only for <code>TriggerEventSource</code> values: <code>OnCaseUpdate</code>.
     */

    public void setEndAssociatedTasksAction(EndAssociatedTasksActionDefinition endAssociatedTasksAction) {
        this.endAssociatedTasksAction = endAssociatedTasksAction;
    }

    /**
     * <p>
     * Information about the end associated tasks action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnCaseUpdate</code>.
     * </p>
     * 
     * @return Information about the end associated tasks action.</p>
     *         <p>
     *         Supported only for <code>TriggerEventSource</code> values: <code>OnCaseUpdate</code>.
     */

    public EndAssociatedTasksActionDefinition getEndAssociatedTasksAction() {
        return this.endAssociatedTasksAction;
    }

    /**
     * <p>
     * Information about the end associated tasks action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values: <code>OnCaseUpdate</code>.
     * </p>
     * 
     * @param endAssociatedTasksAction
     *        Information about the end associated tasks action.</p>
     *        <p>
     *        Supported only for <code>TriggerEventSource</code> values: <code>OnCaseUpdate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withEndAssociatedTasksAction(EndAssociatedTasksActionDefinition endAssociatedTasksAction) {
        setEndAssociatedTasksAction(endAssociatedTasksAction);
        return this;
    }

    /**
     * <p>
     * Information about the submit automated evaluation action.
     * </p>
     * 
     * @param submitAutoEvaluationAction
     *        Information about the submit automated evaluation action.
     */

    public void setSubmitAutoEvaluationAction(SubmitAutoEvaluationActionDefinition submitAutoEvaluationAction) {
        this.submitAutoEvaluationAction = submitAutoEvaluationAction;
    }

    /**
     * <p>
     * Information about the submit automated evaluation action.
     * </p>
     * 
     * @return Information about the submit automated evaluation action.
     */

    public SubmitAutoEvaluationActionDefinition getSubmitAutoEvaluationAction() {
        return this.submitAutoEvaluationAction;
    }

    /**
     * <p>
     * Information about the submit automated evaluation action.
     * </p>
     * 
     * @param submitAutoEvaluationAction
     *        Information about the submit automated evaluation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withSubmitAutoEvaluationAction(SubmitAutoEvaluationActionDefinition submitAutoEvaluationAction) {
        setSubmitAutoEvaluationAction(submitAutoEvaluationAction);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getTaskAction() != null)
            sb.append("TaskAction: ").append(getTaskAction()).append(",");
        if (getEventBridgeAction() != null)
            sb.append("EventBridgeAction: ").append(getEventBridgeAction()).append(",");
        if (getAssignContactCategoryAction() != null)
            sb.append("AssignContactCategoryAction: ").append(getAssignContactCategoryAction()).append(",");
        if (getSendNotificationAction() != null)
            sb.append("SendNotificationAction: ").append(getSendNotificationAction()).append(",");
        if (getCreateCaseAction() != null)
            sb.append("CreateCaseAction: ").append(getCreateCaseAction()).append(",");
        if (getUpdateCaseAction() != null)
            sb.append("UpdateCaseAction: ").append(getUpdateCaseAction()).append(",");
        if (getEndAssociatedTasksAction() != null)
            sb.append("EndAssociatedTasksAction: ").append(getEndAssociatedTasksAction()).append(",");
        if (getSubmitAutoEvaluationAction() != null)
            sb.append("SubmitAutoEvaluationAction: ").append(getSubmitAutoEvaluationAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleAction == false)
            return false;
        RuleAction other = (RuleAction) obj;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getTaskAction() == null ^ this.getTaskAction() == null)
            return false;
        if (other.getTaskAction() != null && other.getTaskAction().equals(this.getTaskAction()) == false)
            return false;
        if (other.getEventBridgeAction() == null ^ this.getEventBridgeAction() == null)
            return false;
        if (other.getEventBridgeAction() != null && other.getEventBridgeAction().equals(this.getEventBridgeAction()) == false)
            return false;
        if (other.getAssignContactCategoryAction() == null ^ this.getAssignContactCategoryAction() == null)
            return false;
        if (other.getAssignContactCategoryAction() != null && other.getAssignContactCategoryAction().equals(this.getAssignContactCategoryAction()) == false)
            return false;
        if (other.getSendNotificationAction() == null ^ this.getSendNotificationAction() == null)
            return false;
        if (other.getSendNotificationAction() != null && other.getSendNotificationAction().equals(this.getSendNotificationAction()) == false)
            return false;
        if (other.getCreateCaseAction() == null ^ this.getCreateCaseAction() == null)
            return false;
        if (other.getCreateCaseAction() != null && other.getCreateCaseAction().equals(this.getCreateCaseAction()) == false)
            return false;
        if (other.getUpdateCaseAction() == null ^ this.getUpdateCaseAction() == null)
            return false;
        if (other.getUpdateCaseAction() != null && other.getUpdateCaseAction().equals(this.getUpdateCaseAction()) == false)
            return false;
        if (other.getEndAssociatedTasksAction() == null ^ this.getEndAssociatedTasksAction() == null)
            return false;
        if (other.getEndAssociatedTasksAction() != null && other.getEndAssociatedTasksAction().equals(this.getEndAssociatedTasksAction()) == false)
            return false;
        if (other.getSubmitAutoEvaluationAction() == null ^ this.getSubmitAutoEvaluationAction() == null)
            return false;
        if (other.getSubmitAutoEvaluationAction() != null && other.getSubmitAutoEvaluationAction().equals(this.getSubmitAutoEvaluationAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getTaskAction() == null) ? 0 : getTaskAction().hashCode());
        hashCode = prime * hashCode + ((getEventBridgeAction() == null) ? 0 : getEventBridgeAction().hashCode());
        hashCode = prime * hashCode + ((getAssignContactCategoryAction() == null) ? 0 : getAssignContactCategoryAction().hashCode());
        hashCode = prime * hashCode + ((getSendNotificationAction() == null) ? 0 : getSendNotificationAction().hashCode());
        hashCode = prime * hashCode + ((getCreateCaseAction() == null) ? 0 : getCreateCaseAction().hashCode());
        hashCode = prime * hashCode + ((getUpdateCaseAction() == null) ? 0 : getUpdateCaseAction().hashCode());
        hashCode = prime * hashCode + ((getEndAssociatedTasksAction() == null) ? 0 : getEndAssociatedTasksAction().hashCode());
        hashCode = prime * hashCode + ((getSubmitAutoEvaluationAction() == null) ? 0 : getSubmitAutoEvaluationAction().hashCode());
        return hashCode;
    }

    @Override
    public RuleAction clone() {
        try {
            return (RuleAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RuleActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
