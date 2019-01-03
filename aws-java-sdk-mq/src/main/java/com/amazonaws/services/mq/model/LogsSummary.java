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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The list of information about logs currently enabled and pending to be deployed for the specified broker.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/LogsSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogsSummary implements Serializable, Cloneable, StructuredPojo {

    /** Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged. */
    private Boolean audit;
    /** The location of the CloudWatch Logs log group where audit logs are sent. */
    private String auditLogGroup;
    /** Enables general logging. */
    private Boolean general;
    /** The location of the CloudWatch Logs log group where general logs are sent. */
    private String generalLogGroup;
    /** The list of information about logs pending to be deployed for the specified broker. */
    private PendingLogs pending;

    /**
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     * 
     * @param audit
     *        Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     */

    public void setAudit(Boolean audit) {
        this.audit = audit;
    }

    /**
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     * 
     * @return Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     */

    public Boolean getAudit() {
        return this.audit;
    }

    /**
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     * 
     * @param audit
     *        Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsSummary withAudit(Boolean audit) {
        setAudit(audit);
        return this;
    }

    /**
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     * 
     * @return Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     */

    public Boolean isAudit() {
        return this.audit;
    }

    /**
     * The location of the CloudWatch Logs log group where audit logs are sent.
     * 
     * @param auditLogGroup
     *        The location of the CloudWatch Logs log group where audit logs are sent.
     */

    public void setAuditLogGroup(String auditLogGroup) {
        this.auditLogGroup = auditLogGroup;
    }

    /**
     * The location of the CloudWatch Logs log group where audit logs are sent.
     * 
     * @return The location of the CloudWatch Logs log group where audit logs are sent.
     */

    public String getAuditLogGroup() {
        return this.auditLogGroup;
    }

    /**
     * The location of the CloudWatch Logs log group where audit logs are sent.
     * 
     * @param auditLogGroup
     *        The location of the CloudWatch Logs log group where audit logs are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsSummary withAuditLogGroup(String auditLogGroup) {
        setAuditLogGroup(auditLogGroup);
        return this;
    }

    /**
     * Enables general logging.
     * 
     * @param general
     *        Enables general logging.
     */

    public void setGeneral(Boolean general) {
        this.general = general;
    }

    /**
     * Enables general logging.
     * 
     * @return Enables general logging.
     */

    public Boolean getGeneral() {
        return this.general;
    }

    /**
     * Enables general logging.
     * 
     * @param general
     *        Enables general logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsSummary withGeneral(Boolean general) {
        setGeneral(general);
        return this;
    }

    /**
     * Enables general logging.
     * 
     * @return Enables general logging.
     */

    public Boolean isGeneral() {
        return this.general;
    }

    /**
     * The location of the CloudWatch Logs log group where general logs are sent.
     * 
     * @param generalLogGroup
     *        The location of the CloudWatch Logs log group where general logs are sent.
     */

    public void setGeneralLogGroup(String generalLogGroup) {
        this.generalLogGroup = generalLogGroup;
    }

    /**
     * The location of the CloudWatch Logs log group where general logs are sent.
     * 
     * @return The location of the CloudWatch Logs log group where general logs are sent.
     */

    public String getGeneralLogGroup() {
        return this.generalLogGroup;
    }

    /**
     * The location of the CloudWatch Logs log group where general logs are sent.
     * 
     * @param generalLogGroup
     *        The location of the CloudWatch Logs log group where general logs are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsSummary withGeneralLogGroup(String generalLogGroup) {
        setGeneralLogGroup(generalLogGroup);
        return this;
    }

    /**
     * The list of information about logs pending to be deployed for the specified broker.
     * 
     * @param pending
     *        The list of information about logs pending to be deployed for the specified broker.
     */

    public void setPending(PendingLogs pending) {
        this.pending = pending;
    }

    /**
     * The list of information about logs pending to be deployed for the specified broker.
     * 
     * @return The list of information about logs pending to be deployed for the specified broker.
     */

    public PendingLogs getPending() {
        return this.pending;
    }

    /**
     * The list of information about logs pending to be deployed for the specified broker.
     * 
     * @param pending
     *        The list of information about logs pending to be deployed for the specified broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsSummary withPending(PendingLogs pending) {
        setPending(pending);
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
        if (getAudit() != null)
            sb.append("Audit: ").append(getAudit()).append(",");
        if (getAuditLogGroup() != null)
            sb.append("AuditLogGroup: ").append(getAuditLogGroup()).append(",");
        if (getGeneral() != null)
            sb.append("General: ").append(getGeneral()).append(",");
        if (getGeneralLogGroup() != null)
            sb.append("GeneralLogGroup: ").append(getGeneralLogGroup()).append(",");
        if (getPending() != null)
            sb.append("Pending: ").append(getPending());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogsSummary == false)
            return false;
        LogsSummary other = (LogsSummary) obj;
        if (other.getAudit() == null ^ this.getAudit() == null)
            return false;
        if (other.getAudit() != null && other.getAudit().equals(this.getAudit()) == false)
            return false;
        if (other.getAuditLogGroup() == null ^ this.getAuditLogGroup() == null)
            return false;
        if (other.getAuditLogGroup() != null && other.getAuditLogGroup().equals(this.getAuditLogGroup()) == false)
            return false;
        if (other.getGeneral() == null ^ this.getGeneral() == null)
            return false;
        if (other.getGeneral() != null && other.getGeneral().equals(this.getGeneral()) == false)
            return false;
        if (other.getGeneralLogGroup() == null ^ this.getGeneralLogGroup() == null)
            return false;
        if (other.getGeneralLogGroup() != null && other.getGeneralLogGroup().equals(this.getGeneralLogGroup()) == false)
            return false;
        if (other.getPending() == null ^ this.getPending() == null)
            return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudit() == null) ? 0 : getAudit().hashCode());
        hashCode = prime * hashCode + ((getAuditLogGroup() == null) ? 0 : getAuditLogGroup().hashCode());
        hashCode = prime * hashCode + ((getGeneral() == null) ? 0 : getGeneral().hashCode());
        hashCode = prime * hashCode + ((getGeneralLogGroup() == null) ? 0 : getGeneralLogGroup().hashCode());
        hashCode = prime * hashCode + ((getPending() == null) ? 0 : getPending().hashCode());
        return hashCode;
    }

    @Override
    public LogsSummary clone() {
        try {
            return (LogsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.LogsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
