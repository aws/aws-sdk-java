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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAuditMitigationActionsTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the task. You can use this identifier to check the status of the task or to cancel it.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * Specifies the audit findings to which the mitigation actions are applied. You can apply them to a type of audit
     * check, to all findings from an audit, or to a speecific set of findings.
     * </p>
     */
    private AuditMitigationActionsTaskTarget target;
    /**
     * <p>
     * For an audit check, specifies which mitigation actions to apply. Those actions must be defined in your AWS
     * account.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> auditCheckToActionsMapping;
    /**
     * <p>
     * Each audit mitigation task must have a unique client request token. If you try to start a new task with the same
     * token as a task that already exists, an exception occurs. If you omit this value, a unique client request token
     * is generated automatically.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * A unique identifier for the task. You can use this identifier to check the status of the task or to cancel it.
     * </p>
     * 
     * @param taskId
     *        A unique identifier for the task. You can use this identifier to check the status of the task or to cancel
     *        it.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * A unique identifier for the task. You can use this identifier to check the status of the task or to cancel it.
     * </p>
     * 
     * @return A unique identifier for the task. You can use this identifier to check the status of the task or to
     *         cancel it.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * A unique identifier for the task. You can use this identifier to check the status of the task or to cancel it.
     * </p>
     * 
     * @param taskId
     *        A unique identifier for the task. You can use this identifier to check the status of the task or to cancel
     *        it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAuditMitigationActionsTaskRequest withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * Specifies the audit findings to which the mitigation actions are applied. You can apply them to a type of audit
     * check, to all findings from an audit, or to a speecific set of findings.
     * </p>
     * 
     * @param target
     *        Specifies the audit findings to which the mitigation actions are applied. You can apply them to a type of
     *        audit check, to all findings from an audit, or to a speecific set of findings.
     */

    public void setTarget(AuditMitigationActionsTaskTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * Specifies the audit findings to which the mitigation actions are applied. You can apply them to a type of audit
     * check, to all findings from an audit, or to a speecific set of findings.
     * </p>
     * 
     * @return Specifies the audit findings to which the mitigation actions are applied. You can apply them to a type of
     *         audit check, to all findings from an audit, or to a speecific set of findings.
     */

    public AuditMitigationActionsTaskTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * Specifies the audit findings to which the mitigation actions are applied. You can apply them to a type of audit
     * check, to all findings from an audit, or to a speecific set of findings.
     * </p>
     * 
     * @param target
     *        Specifies the audit findings to which the mitigation actions are applied. You can apply them to a type of
     *        audit check, to all findings from an audit, or to a speecific set of findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAuditMitigationActionsTaskRequest withTarget(AuditMitigationActionsTaskTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * For an audit check, specifies which mitigation actions to apply. Those actions must be defined in your AWS
     * account.
     * </p>
     * 
     * @return For an audit check, specifies which mitigation actions to apply. Those actions must be defined in your
     *         AWS account.
     */

    public java.util.Map<String, java.util.List<String>> getAuditCheckToActionsMapping() {
        return auditCheckToActionsMapping;
    }

    /**
     * <p>
     * For an audit check, specifies which mitigation actions to apply. Those actions must be defined in your AWS
     * account.
     * </p>
     * 
     * @param auditCheckToActionsMapping
     *        For an audit check, specifies which mitigation actions to apply. Those actions must be defined in your AWS
     *        account.
     */

    public void setAuditCheckToActionsMapping(java.util.Map<String, java.util.List<String>> auditCheckToActionsMapping) {
        this.auditCheckToActionsMapping = auditCheckToActionsMapping;
    }

    /**
     * <p>
     * For an audit check, specifies which mitigation actions to apply. Those actions must be defined in your AWS
     * account.
     * </p>
     * 
     * @param auditCheckToActionsMapping
     *        For an audit check, specifies which mitigation actions to apply. Those actions must be defined in your AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAuditMitigationActionsTaskRequest withAuditCheckToActionsMapping(java.util.Map<String, java.util.List<String>> auditCheckToActionsMapping) {
        setAuditCheckToActionsMapping(auditCheckToActionsMapping);
        return this;
    }

    public StartAuditMitigationActionsTaskRequest addAuditCheckToActionsMappingEntry(String key, java.util.List<String> value) {
        if (null == this.auditCheckToActionsMapping) {
            this.auditCheckToActionsMapping = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.auditCheckToActionsMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.auditCheckToActionsMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AuditCheckToActionsMapping.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAuditMitigationActionsTaskRequest clearAuditCheckToActionsMappingEntries() {
        this.auditCheckToActionsMapping = null;
        return this;
    }

    /**
     * <p>
     * Each audit mitigation task must have a unique client request token. If you try to start a new task with the same
     * token as a task that already exists, an exception occurs. If you omit this value, a unique client request token
     * is generated automatically.
     * </p>
     * 
     * @param clientRequestToken
     *        Each audit mitigation task must have a unique client request token. If you try to start a new task with
     *        the same token as a task that already exists, an exception occurs. If you omit this value, a unique client
     *        request token is generated automatically.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each audit mitigation task must have a unique client request token. If you try to start a new task with the same
     * token as a task that already exists, an exception occurs. If you omit this value, a unique client request token
     * is generated automatically.
     * </p>
     * 
     * @return Each audit mitigation task must have a unique client request token. If you try to start a new task with
     *         the same token as a task that already exists, an exception occurs. If you omit this value, a unique
     *         client request token is generated automatically.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Each audit mitigation task must have a unique client request token. If you try to start a new task with the same
     * token as a task that already exists, an exception occurs. If you omit this value, a unique client request token
     * is generated automatically.
     * </p>
     * 
     * @param clientRequestToken
     *        Each audit mitigation task must have a unique client request token. If you try to start a new task with
     *        the same token as a task that already exists, an exception occurs. If you omit this value, a unique client
     *        request token is generated automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAuditMitigationActionsTaskRequest withClientRequestToken(String clientRequestToken) {
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
        if (getAuditCheckToActionsMapping() != null)
            sb.append("AuditCheckToActionsMapping: ").append(getAuditCheckToActionsMapping()).append(",");
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

        if (obj instanceof StartAuditMitigationActionsTaskRequest == false)
            return false;
        StartAuditMitigationActionsTaskRequest other = (StartAuditMitigationActionsTaskRequest) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getAuditCheckToActionsMapping() == null ^ this.getAuditCheckToActionsMapping() == null)
            return false;
        if (other.getAuditCheckToActionsMapping() != null && other.getAuditCheckToActionsMapping().equals(this.getAuditCheckToActionsMapping()) == false)
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
        hashCode = prime * hashCode + ((getAuditCheckToActionsMapping() == null) ? 0 : getAuditCheckToActionsMapping().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public StartAuditMitigationActionsTaskRequest clone() {
        return (StartAuditMitigationActionsTaskRequest) super.clone();
    }

}
