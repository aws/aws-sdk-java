/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDetectMitigationActionsTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are applied.
     * </p>
     */
    private DetectMitigationActionsTaskTarget target;
    /**
     * <p>
     * The actions to be performed when a device has unexpected behavior.
     * </p>
     */
    private java.util.List<String> actions;
    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     */
    private ViolationEventOccurrenceRange violationEventOccurrenceRange;
    /**
     * <p>
     * Specifies to list only active violations.
     * </p>
     */
    private Boolean includeOnlyActiveViolations;
    /**
     * <p>
     * Specifies to include suppressed alerts.
     * </p>
     */
    private Boolean includeSuppressedAlerts;
    /**
     * <p>
     * Each mitigation action task must have a unique client request token. If you try to create a new task with the
     * same token as a task that already exists, an exception occurs. If you omit this value, AWS SDKs will
     * automatically generate a unique client request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * 
     * @param taskId
     *        The unique identifier of the task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * 
     * @return The unique identifier of the task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * 
     * @param taskId
     *        The unique identifier of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDetectMitigationActionsTaskRequest withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are applied.
     * </p>
     * 
     * @param target
     *        Specifies the ML Detect findings to which the mitigation actions are applied.
     */

    public void setTarget(DetectMitigationActionsTaskTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are applied.
     * </p>
     * 
     * @return Specifies the ML Detect findings to which the mitigation actions are applied.
     */

    public DetectMitigationActionsTaskTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are applied.
     * </p>
     * 
     * @param target
     *        Specifies the ML Detect findings to which the mitigation actions are applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDetectMitigationActionsTaskRequest withTarget(DetectMitigationActionsTaskTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The actions to be performed when a device has unexpected behavior.
     * </p>
     * 
     * @return The actions to be performed when a device has unexpected behavior.
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions to be performed when a device has unexpected behavior.
     * </p>
     * 
     * @param actions
     *        The actions to be performed when a device has unexpected behavior.
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * The actions to be performed when a device has unexpected behavior.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions to be performed when a device has unexpected behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDetectMitigationActionsTaskRequest withActions(String... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to be performed when a device has unexpected behavior.
     * </p>
     * 
     * @param actions
     *        The actions to be performed when a device has unexpected behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDetectMitigationActionsTaskRequest withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     * 
     * @param violationEventOccurrenceRange
     *        Specifies the time period of which violation events occurred between.
     */

    public void setViolationEventOccurrenceRange(ViolationEventOccurrenceRange violationEventOccurrenceRange) {
        this.violationEventOccurrenceRange = violationEventOccurrenceRange;
    }

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     * 
     * @return Specifies the time period of which violation events occurred between.
     */

    public ViolationEventOccurrenceRange getViolationEventOccurrenceRange() {
        return this.violationEventOccurrenceRange;
    }

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     * 
     * @param violationEventOccurrenceRange
     *        Specifies the time period of which violation events occurred between.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDetectMitigationActionsTaskRequest withViolationEventOccurrenceRange(ViolationEventOccurrenceRange violationEventOccurrenceRange) {
        setViolationEventOccurrenceRange(violationEventOccurrenceRange);
        return this;
    }

    /**
     * <p>
     * Specifies to list only active violations.
     * </p>
     * 
     * @param includeOnlyActiveViolations
     *        Specifies to list only active violations.
     */

    public void setIncludeOnlyActiveViolations(Boolean includeOnlyActiveViolations) {
        this.includeOnlyActiveViolations = includeOnlyActiveViolations;
    }

    /**
     * <p>
     * Specifies to list only active violations.
     * </p>
     * 
     * @return Specifies to list only active violations.
     */

    public Boolean getIncludeOnlyActiveViolations() {
        return this.includeOnlyActiveViolations;
    }

    /**
     * <p>
     * Specifies to list only active violations.
     * </p>
     * 
     * @param includeOnlyActiveViolations
     *        Specifies to list only active violations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDetectMitigationActionsTaskRequest withIncludeOnlyActiveViolations(Boolean includeOnlyActiveViolations) {
        setIncludeOnlyActiveViolations(includeOnlyActiveViolations);
        return this;
    }

    /**
     * <p>
     * Specifies to list only active violations.
     * </p>
     * 
     * @return Specifies to list only active violations.
     */

    public Boolean isIncludeOnlyActiveViolations() {
        return this.includeOnlyActiveViolations;
    }

    /**
     * <p>
     * Specifies to include suppressed alerts.
     * </p>
     * 
     * @param includeSuppressedAlerts
     *        Specifies to include suppressed alerts.
     */

    public void setIncludeSuppressedAlerts(Boolean includeSuppressedAlerts) {
        this.includeSuppressedAlerts = includeSuppressedAlerts;
    }

    /**
     * <p>
     * Specifies to include suppressed alerts.
     * </p>
     * 
     * @return Specifies to include suppressed alerts.
     */

    public Boolean getIncludeSuppressedAlerts() {
        return this.includeSuppressedAlerts;
    }

    /**
     * <p>
     * Specifies to include suppressed alerts.
     * </p>
     * 
     * @param includeSuppressedAlerts
     *        Specifies to include suppressed alerts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDetectMitigationActionsTaskRequest withIncludeSuppressedAlerts(Boolean includeSuppressedAlerts) {
        setIncludeSuppressedAlerts(includeSuppressedAlerts);
        return this;
    }

    /**
     * <p>
     * Specifies to include suppressed alerts.
     * </p>
     * 
     * @return Specifies to include suppressed alerts.
     */

    public Boolean isIncludeSuppressedAlerts() {
        return this.includeSuppressedAlerts;
    }

    /**
     * <p>
     * Each mitigation action task must have a unique client request token. If you try to create a new task with the
     * same token as a task that already exists, an exception occurs. If you omit this value, AWS SDKs will
     * automatically generate a unique client request.
     * </p>
     * 
     * @param clientRequestToken
     *        Each mitigation action task must have a unique client request token. If you try to create a new task with
     *        the same token as a task that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *        automatically generate a unique client request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each mitigation action task must have a unique client request token. If you try to create a new task with the
     * same token as a task that already exists, an exception occurs. If you omit this value, AWS SDKs will
     * automatically generate a unique client request.
     * </p>
     * 
     * @return Each mitigation action task must have a unique client request token. If you try to create a new task with
     *         the same token as a task that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *         automatically generate a unique client request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Each mitigation action task must have a unique client request token. If you try to create a new task with the
     * same token as a task that already exists, an exception occurs. If you omit this value, AWS SDKs will
     * automatically generate a unique client request.
     * </p>
     * 
     * @param clientRequestToken
     *        Each mitigation action task must have a unique client request token. If you try to create a new task with
     *        the same token as a task that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *        automatically generate a unique client request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDetectMitigationActionsTaskRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getViolationEventOccurrenceRange() != null)
            sb.append("ViolationEventOccurrenceRange: ").append(getViolationEventOccurrenceRange()).append(",");
        if (getIncludeOnlyActiveViolations() != null)
            sb.append("IncludeOnlyActiveViolations: ").append(getIncludeOnlyActiveViolations()).append(",");
        if (getIncludeSuppressedAlerts() != null)
            sb.append("IncludeSuppressedAlerts: ").append(getIncludeSuppressedAlerts()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDetectMitigationActionsTaskRequest == false)
            return false;
        StartDetectMitigationActionsTaskRequest other = (StartDetectMitigationActionsTaskRequest) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getViolationEventOccurrenceRange() == null ^ this.getViolationEventOccurrenceRange() == null)
            return false;
        if (other.getViolationEventOccurrenceRange() != null
                && other.getViolationEventOccurrenceRange().equals(this.getViolationEventOccurrenceRange()) == false)
            return false;
        if (other.getIncludeOnlyActiveViolations() == null ^ this.getIncludeOnlyActiveViolations() == null)
            return false;
        if (other.getIncludeOnlyActiveViolations() != null && other.getIncludeOnlyActiveViolations().equals(this.getIncludeOnlyActiveViolations()) == false)
            return false;
        if (other.getIncludeSuppressedAlerts() == null ^ this.getIncludeSuppressedAlerts() == null)
            return false;
        if (other.getIncludeSuppressedAlerts() != null && other.getIncludeSuppressedAlerts().equals(this.getIncludeSuppressedAlerts()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getViolationEventOccurrenceRange() == null) ? 0 : getViolationEventOccurrenceRange().hashCode());
        hashCode = prime * hashCode + ((getIncludeOnlyActiveViolations() == null) ? 0 : getIncludeOnlyActiveViolations().hashCode());
        hashCode = prime * hashCode + ((getIncludeSuppressedAlerts() == null) ? 0 : getIncludeSuppressedAlerts().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public StartDetectMitigationActionsTaskRequest clone() {
        return (StartDetectMitigationActionsTaskRequest) super.clone();
    }

}
