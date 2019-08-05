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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used in MitigationActionParams, this information identifies the target findings to which the mitigation actions are
 * applied. Only one entry appears.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditMitigationActionsTaskTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the task will apply a mitigation action to findings from a specific audit, this value uniquely identifies the
     * audit.
     * </p>
     */
    private String auditTaskId;
    /**
     * <p>
     * If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies those
     * findings.
     * </p>
     */
    private java.util.List<String> findingIds;
    /**
     * <p>
     * Specifies a filter in the form of an audit check and set of reason codes that identify the findings from the
     * audit to which the audit mitigation actions task apply.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> auditCheckToReasonCodeFilter;

    /**
     * <p>
     * If the task will apply a mitigation action to findings from a specific audit, this value uniquely identifies the
     * audit.
     * </p>
     * 
     * @param auditTaskId
     *        If the task will apply a mitigation action to findings from a specific audit, this value uniquely
     *        identifies the audit.
     */

    public void setAuditTaskId(String auditTaskId) {
        this.auditTaskId = auditTaskId;
    }

    /**
     * <p>
     * If the task will apply a mitigation action to findings from a specific audit, this value uniquely identifies the
     * audit.
     * </p>
     * 
     * @return If the task will apply a mitigation action to findings from a specific audit, this value uniquely
     *         identifies the audit.
     */

    public String getAuditTaskId() {
        return this.auditTaskId;
    }

    /**
     * <p>
     * If the task will apply a mitigation action to findings from a specific audit, this value uniquely identifies the
     * audit.
     * </p>
     * 
     * @param auditTaskId
     *        If the task will apply a mitigation action to findings from a specific audit, this value uniquely
     *        identifies the audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionsTaskTarget withAuditTaskId(String auditTaskId) {
        setAuditTaskId(auditTaskId);
        return this;
    }

    /**
     * <p>
     * If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies those
     * findings.
     * </p>
     * 
     * @return If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies
     *         those findings.
     */

    public java.util.List<String> getFindingIds() {
        return findingIds;
    }

    /**
     * <p>
     * If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies those
     * findings.
     * </p>
     * 
     * @param findingIds
     *        If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies
     *        those findings.
     */

    public void setFindingIds(java.util.Collection<String> findingIds) {
        if (findingIds == null) {
            this.findingIds = null;
            return;
        }

        this.findingIds = new java.util.ArrayList<String>(findingIds);
    }

    /**
     * <p>
     * If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies those
     * findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingIds(java.util.Collection)} or {@link #withFindingIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param findingIds
     *        If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies
     *        those findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionsTaskTarget withFindingIds(String... findingIds) {
        if (this.findingIds == null) {
            setFindingIds(new java.util.ArrayList<String>(findingIds.length));
        }
        for (String ele : findingIds) {
            this.findingIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies those
     * findings.
     * </p>
     * 
     * @param findingIds
     *        If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies
     *        those findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionsTaskTarget withFindingIds(java.util.Collection<String> findingIds) {
        setFindingIds(findingIds);
        return this;
    }

    /**
     * <p>
     * Specifies a filter in the form of an audit check and set of reason codes that identify the findings from the
     * audit to which the audit mitigation actions task apply.
     * </p>
     * 
     * @return Specifies a filter in the form of an audit check and set of reason codes that identify the findings from
     *         the audit to which the audit mitigation actions task apply.
     */

    public java.util.Map<String, java.util.List<String>> getAuditCheckToReasonCodeFilter() {
        return auditCheckToReasonCodeFilter;
    }

    /**
     * <p>
     * Specifies a filter in the form of an audit check and set of reason codes that identify the findings from the
     * audit to which the audit mitigation actions task apply.
     * </p>
     * 
     * @param auditCheckToReasonCodeFilter
     *        Specifies a filter in the form of an audit check and set of reason codes that identify the findings from
     *        the audit to which the audit mitigation actions task apply.
     */

    public void setAuditCheckToReasonCodeFilter(java.util.Map<String, java.util.List<String>> auditCheckToReasonCodeFilter) {
        this.auditCheckToReasonCodeFilter = auditCheckToReasonCodeFilter;
    }

    /**
     * <p>
     * Specifies a filter in the form of an audit check and set of reason codes that identify the findings from the
     * audit to which the audit mitigation actions task apply.
     * </p>
     * 
     * @param auditCheckToReasonCodeFilter
     *        Specifies a filter in the form of an audit check and set of reason codes that identify the findings from
     *        the audit to which the audit mitigation actions task apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionsTaskTarget withAuditCheckToReasonCodeFilter(java.util.Map<String, java.util.List<String>> auditCheckToReasonCodeFilter) {
        setAuditCheckToReasonCodeFilter(auditCheckToReasonCodeFilter);
        return this;
    }

    public AuditMitigationActionsTaskTarget addAuditCheckToReasonCodeFilterEntry(String key, java.util.List<String> value) {
        if (null == this.auditCheckToReasonCodeFilter) {
            this.auditCheckToReasonCodeFilter = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.auditCheckToReasonCodeFilter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.auditCheckToReasonCodeFilter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AuditCheckToReasonCodeFilter.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditMitigationActionsTaskTarget clearAuditCheckToReasonCodeFilterEntries() {
        this.auditCheckToReasonCodeFilter = null;
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
        if (getAuditTaskId() != null)
            sb.append("AuditTaskId: ").append(getAuditTaskId()).append(",");
        if (getFindingIds() != null)
            sb.append("FindingIds: ").append(getFindingIds()).append(",");
        if (getAuditCheckToReasonCodeFilter() != null)
            sb.append("AuditCheckToReasonCodeFilter: ").append(getAuditCheckToReasonCodeFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditMitigationActionsTaskTarget == false)
            return false;
        AuditMitigationActionsTaskTarget other = (AuditMitigationActionsTaskTarget) obj;
        if (other.getAuditTaskId() == null ^ this.getAuditTaskId() == null)
            return false;
        if (other.getAuditTaskId() != null && other.getAuditTaskId().equals(this.getAuditTaskId()) == false)
            return false;
        if (other.getFindingIds() == null ^ this.getFindingIds() == null)
            return false;
        if (other.getFindingIds() != null && other.getFindingIds().equals(this.getFindingIds()) == false)
            return false;
        if (other.getAuditCheckToReasonCodeFilter() == null ^ this.getAuditCheckToReasonCodeFilter() == null)
            return false;
        if (other.getAuditCheckToReasonCodeFilter() != null && other.getAuditCheckToReasonCodeFilter().equals(this.getAuditCheckToReasonCodeFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuditTaskId() == null) ? 0 : getAuditTaskId().hashCode());
        hashCode = prime * hashCode + ((getFindingIds() == null) ? 0 : getFindingIds().hashCode());
        hashCode = prime * hashCode + ((getAuditCheckToReasonCodeFilter() == null) ? 0 : getAuditCheckToReasonCodeFilter().hashCode());
        return hashCode;
    }

    @Override
    public AuditMitigationActionsTaskTarget clone() {
        try {
            return (AuditMitigationActionsTaskTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AuditMitigationActionsTaskTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
