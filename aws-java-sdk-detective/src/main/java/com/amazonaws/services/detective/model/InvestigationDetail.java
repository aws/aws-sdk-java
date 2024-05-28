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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the investigation related to a potential security event identified by Detective.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/InvestigationDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvestigationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     */
    private String investigationId;
    /**
     * <p>
     * Severity based on the likelihood and impact of the indicators of compromise discovered in the investigation.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * Status based on the completion status of the investigation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates you have completed reviewing the
     * investigation.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The time stamp of the creation time of the investigation report. The value is an UTC ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     * </p>
     */
    private String entityArn;
    /**
     * <p>
     * Type of entity. For example, Amazon Web Services accounts, such as IAM user and role.
     * </p>
     */
    private String entityType;

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     * 
     * @param investigationId
     *        The investigation ID of the investigation report.
     */

    public void setInvestigationId(String investigationId) {
        this.investigationId = investigationId;
    }

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     * 
     * @return The investigation ID of the investigation report.
     */

    public String getInvestigationId() {
        return this.investigationId;
    }

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     * 
     * @param investigationId
     *        The investigation ID of the investigation report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvestigationDetail withInvestigationId(String investigationId) {
        setInvestigationId(investigationId);
        return this;
    }

    /**
     * <p>
     * Severity based on the likelihood and impact of the indicators of compromise discovered in the investigation.
     * </p>
     * 
     * @param severity
     *        Severity based on the likelihood and impact of the indicators of compromise discovered in the
     *        investigation.
     * @see Severity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * Severity based on the likelihood and impact of the indicators of compromise discovered in the investigation.
     * </p>
     * 
     * @return Severity based on the likelihood and impact of the indicators of compromise discovered in the
     *         investigation.
     * @see Severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * Severity based on the likelihood and impact of the indicators of compromise discovered in the investigation.
     * </p>
     * 
     * @param severity
     *        Severity based on the likelihood and impact of the indicators of compromise discovered in the
     *        investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public InvestigationDetail withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * Severity based on the likelihood and impact of the indicators of compromise discovered in the investigation.
     * </p>
     * 
     * @param severity
     *        Severity based on the likelihood and impact of the indicators of compromise discovered in the
     *        investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public InvestigationDetail withSeverity(Severity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * Status based on the completion status of the investigation.
     * </p>
     * 
     * @param status
     *        Status based on the completion status of the investigation.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status based on the completion status of the investigation.
     * </p>
     * 
     * @return Status based on the completion status of the investigation.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status based on the completion status of the investigation.
     * </p>
     * 
     * @param status
     *        Status based on the completion status of the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public InvestigationDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status based on the completion status of the investigation.
     * </p>
     * 
     * @param status
     *        Status based on the completion status of the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public InvestigationDetail withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates you have completed reviewing the
     * investigation.
     * </p>
     * 
     * @param state
     *        The current state of the investigation. An archived investigation indicates you have completed reviewing
     *        the investigation.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates you have completed reviewing the
     * investigation.
     * </p>
     * 
     * @return The current state of the investigation. An archived investigation indicates you have completed reviewing
     *         the investigation.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates you have completed reviewing the
     * investigation.
     * </p>
     * 
     * @param state
     *        The current state of the investigation. An archived investigation indicates you have completed reviewing
     *        the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public InvestigationDetail withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates you have completed reviewing the
     * investigation.
     * </p>
     * 
     * @param state
     *        The current state of the investigation. An archived investigation indicates you have completed reviewing
     *        the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public InvestigationDetail withState(State state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time stamp of the creation time of the investigation report. The value is an UTC ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param createdTime
     *        The time stamp of the creation time of the investigation report. The value is an UTC ISO8601 formatted
     *        string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time stamp of the creation time of the investigation report. The value is an UTC ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @return The time stamp of the creation time of the investigation report. The value is an UTC ISO8601 formatted
     *         string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time stamp of the creation time of the investigation report. The value is an UTC ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param createdTime
     *        The time stamp of the creation time of the investigation report. The value is an UTC ISO8601 formatted
     *        string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvestigationDetail withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     * </p>
     * 
     * @param entityArn
     *        The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     */

    public void setEntityArn(String entityArn) {
        this.entityArn = entityArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     */

    public String getEntityArn() {
        return this.entityArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     * </p>
     * 
     * @param entityArn
     *        The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvestigationDetail withEntityArn(String entityArn) {
        setEntityArn(entityArn);
        return this;
    }

    /**
     * <p>
     * Type of entity. For example, Amazon Web Services accounts, such as IAM user and role.
     * </p>
     * 
     * @param entityType
     *        Type of entity. For example, Amazon Web Services accounts, such as IAM user and role.
     * @see EntityType
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * Type of entity. For example, Amazon Web Services accounts, such as IAM user and role.
     * </p>
     * 
     * @return Type of entity. For example, Amazon Web Services accounts, such as IAM user and role.
     * @see EntityType
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * Type of entity. For example, Amazon Web Services accounts, such as IAM user and role.
     * </p>
     * 
     * @param entityType
     *        Type of entity. For example, Amazon Web Services accounts, such as IAM user and role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public InvestigationDetail withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * Type of entity. For example, Amazon Web Services accounts, such as IAM user and role.
     * </p>
     * 
     * @param entityType
     *        Type of entity. For example, Amazon Web Services accounts, such as IAM user and role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public InvestigationDetail withEntityType(EntityType entityType) {
        this.entityType = entityType.toString();
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
        if (getInvestigationId() != null)
            sb.append("InvestigationId: ").append(getInvestigationId()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getEntityArn() != null)
            sb.append("EntityArn: ").append(getEntityArn()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvestigationDetail == false)
            return false;
        InvestigationDetail other = (InvestigationDetail) obj;
        if (other.getInvestigationId() == null ^ this.getInvestigationId() == null)
            return false;
        if (other.getInvestigationId() != null && other.getInvestigationId().equals(this.getInvestigationId()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEntityArn() == null ^ this.getEntityArn() == null)
            return false;
        if (other.getEntityArn() != null && other.getEntityArn().equals(this.getEntityArn()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvestigationId() == null) ? 0 : getInvestigationId().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getEntityArn() == null) ? 0 : getEntityArn().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        return hashCode;
    }

    @Override
    public InvestigationDetail clone() {
        try {
            return (InvestigationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.InvestigationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
