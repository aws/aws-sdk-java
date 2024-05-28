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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/GetInvestigation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInvestigationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     */
    private String investigationId;
    /**
     * <p>
     * The unique Amazon Resource Name (ARN). Detective supports IAM user ARNs and IAM role ARNs.
     * </p>
     */
    private String entityArn;
    /**
     * <p>
     * Type of entity. For example, Amazon Web Services accounts, such as an IAM user and/or IAM role.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The creation time of the investigation report in UTC time stamp format.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The start date and time used to set the scope time within which you want to generate the investigation report.
     * The value is an UTC ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     */
    private java.util.Date scopeStartTime;
    /**
     * <p>
     * The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For example,
     * <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     */
    private java.util.Date scopeEndTime;
    /**
     * <p>
     * The status based on the completion status of the investigation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The severity assigned is based on the likelihood and impact of the indicators of compromise discovered in the
     * investigation.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates that you have completed reviewing the
     * investigation.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The Amazon Resource Name (ARN) of the behavior graph.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the behavior graph.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The Amazon Resource Name (ARN) of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvestigationResult withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

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

    public GetInvestigationResult withInvestigationId(String investigationId) {
        setInvestigationId(investigationId);
        return this;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN). Detective supports IAM user ARNs and IAM role ARNs.
     * </p>
     * 
     * @param entityArn
     *        The unique Amazon Resource Name (ARN). Detective supports IAM user ARNs and IAM role ARNs.
     */

    public void setEntityArn(String entityArn) {
        this.entityArn = entityArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN). Detective supports IAM user ARNs and IAM role ARNs.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN). Detective supports IAM user ARNs and IAM role ARNs.
     */

    public String getEntityArn() {
        return this.entityArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN). Detective supports IAM user ARNs and IAM role ARNs.
     * </p>
     * 
     * @param entityArn
     *        The unique Amazon Resource Name (ARN). Detective supports IAM user ARNs and IAM role ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvestigationResult withEntityArn(String entityArn) {
        setEntityArn(entityArn);
        return this;
    }

    /**
     * <p>
     * Type of entity. For example, Amazon Web Services accounts, such as an IAM user and/or IAM role.
     * </p>
     * 
     * @param entityType
     *        Type of entity. For example, Amazon Web Services accounts, such as an IAM user and/or IAM role.
     * @see EntityType
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * Type of entity. For example, Amazon Web Services accounts, such as an IAM user and/or IAM role.
     * </p>
     * 
     * @return Type of entity. For example, Amazon Web Services accounts, such as an IAM user and/or IAM role.
     * @see EntityType
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * Type of entity. For example, Amazon Web Services accounts, such as an IAM user and/or IAM role.
     * </p>
     * 
     * @param entityType
     *        Type of entity. For example, Amazon Web Services accounts, such as an IAM user and/or IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public GetInvestigationResult withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * Type of entity. For example, Amazon Web Services accounts, such as an IAM user and/or IAM role.
     * </p>
     * 
     * @param entityType
     *        Type of entity. For example, Amazon Web Services accounts, such as an IAM user and/or IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public GetInvestigationResult withEntityType(EntityType entityType) {
        this.entityType = entityType.toString();
        return this;
    }

    /**
     * <p>
     * The creation time of the investigation report in UTC time stamp format.
     * </p>
     * 
     * @param createdTime
     *        The creation time of the investigation report in UTC time stamp format.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The creation time of the investigation report in UTC time stamp format.
     * </p>
     * 
     * @return The creation time of the investigation report in UTC time stamp format.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The creation time of the investigation report in UTC time stamp format.
     * </p>
     * 
     * @param createdTime
     *        The creation time of the investigation report in UTC time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvestigationResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The start date and time used to set the scope time within which you want to generate the investigation report.
     * The value is an UTC ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param scopeStartTime
     *        The start date and time used to set the scope time within which you want to generate the investigation
     *        report. The value is an UTC ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public void setScopeStartTime(java.util.Date scopeStartTime) {
        this.scopeStartTime = scopeStartTime;
    }

    /**
     * <p>
     * The start date and time used to set the scope time within which you want to generate the investigation report.
     * The value is an UTC ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @return The start date and time used to set the scope time within which you want to generate the investigation
     *         report. The value is an UTC ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public java.util.Date getScopeStartTime() {
        return this.scopeStartTime;
    }

    /**
     * <p>
     * The start date and time used to set the scope time within which you want to generate the investigation report.
     * The value is an UTC ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param scopeStartTime
     *        The start date and time used to set the scope time within which you want to generate the investigation
     *        report. The value is an UTC ISO8601 formatted string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvestigationResult withScopeStartTime(java.util.Date scopeStartTime) {
        setScopeStartTime(scopeStartTime);
        return this;
    }

    /**
     * <p>
     * The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For example,
     * <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param scopeEndTime
     *        The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For example,
     *        <code>2021-08-18T16:35:56.284Z</code>.
     */

    public void setScopeEndTime(java.util.Date scopeEndTime) {
        this.scopeEndTime = scopeEndTime;
    }

    /**
     * <p>
     * The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For example,
     * <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @return The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For
     *         example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public java.util.Date getScopeEndTime() {
        return this.scopeEndTime;
    }

    /**
     * <p>
     * The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For example,
     * <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param scopeEndTime
     *        The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For example,
     *        <code>2021-08-18T16:35:56.284Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvestigationResult withScopeEndTime(java.util.Date scopeEndTime) {
        setScopeEndTime(scopeEndTime);
        return this;
    }

    /**
     * <p>
     * The status based on the completion status of the investigation.
     * </p>
     * 
     * @param status
     *        The status based on the completion status of the investigation.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status based on the completion status of the investigation.
     * </p>
     * 
     * @return The status based on the completion status of the investigation.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status based on the completion status of the investigation.
     * </p>
     * 
     * @param status
     *        The status based on the completion status of the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GetInvestigationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status based on the completion status of the investigation.
     * </p>
     * 
     * @param status
     *        The status based on the completion status of the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GetInvestigationResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The severity assigned is based on the likelihood and impact of the indicators of compromise discovered in the
     * investigation.
     * </p>
     * 
     * @param severity
     *        The severity assigned is based on the likelihood and impact of the indicators of compromise discovered in
     *        the investigation.
     * @see Severity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity assigned is based on the likelihood and impact of the indicators of compromise discovered in the
     * investigation.
     * </p>
     * 
     * @return The severity assigned is based on the likelihood and impact of the indicators of compromise discovered in
     *         the investigation.
     * @see Severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity assigned is based on the likelihood and impact of the indicators of compromise discovered in the
     * investigation.
     * </p>
     * 
     * @param severity
     *        The severity assigned is based on the likelihood and impact of the indicators of compromise discovered in
     *        the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public GetInvestigationResult withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity assigned is based on the likelihood and impact of the indicators of compromise discovered in the
     * investigation.
     * </p>
     * 
     * @param severity
     *        The severity assigned is based on the likelihood and impact of the indicators of compromise discovered in
     *        the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public GetInvestigationResult withSeverity(Severity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates that you have completed reviewing the
     * investigation.
     * </p>
     * 
     * @param state
     *        The current state of the investigation. An archived investigation indicates that you have completed
     *        reviewing the investigation.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates that you have completed reviewing the
     * investigation.
     * </p>
     * 
     * @return The current state of the investigation. An archived investigation indicates that you have completed
     *         reviewing the investigation.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates that you have completed reviewing the
     * investigation.
     * </p>
     * 
     * @param state
     *        The current state of the investigation. An archived investigation indicates that you have completed
     *        reviewing the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public GetInvestigationResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates that you have completed reviewing the
     * investigation.
     * </p>
     * 
     * @param state
     *        The current state of the investigation. An archived investigation indicates that you have completed
     *        reviewing the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public GetInvestigationResult withState(State state) {
        this.state = state.toString();
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
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
        if (getInvestigationId() != null)
            sb.append("InvestigationId: ").append(getInvestigationId()).append(",");
        if (getEntityArn() != null)
            sb.append("EntityArn: ").append(getEntityArn()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getScopeStartTime() != null)
            sb.append("ScopeStartTime: ").append(getScopeStartTime()).append(",");
        if (getScopeEndTime() != null)
            sb.append("ScopeEndTime: ").append(getScopeEndTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInvestigationResult == false)
            return false;
        GetInvestigationResult other = (GetInvestigationResult) obj;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getInvestigationId() == null ^ this.getInvestigationId() == null)
            return false;
        if (other.getInvestigationId() != null && other.getInvestigationId().equals(this.getInvestigationId()) == false)
            return false;
        if (other.getEntityArn() == null ^ this.getEntityArn() == null)
            return false;
        if (other.getEntityArn() != null && other.getEntityArn().equals(this.getEntityArn()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getScopeStartTime() == null ^ this.getScopeStartTime() == null)
            return false;
        if (other.getScopeStartTime() != null && other.getScopeStartTime().equals(this.getScopeStartTime()) == false)
            return false;
        if (other.getScopeEndTime() == null ^ this.getScopeEndTime() == null)
            return false;
        if (other.getScopeEndTime() != null && other.getScopeEndTime().equals(this.getScopeEndTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getInvestigationId() == null) ? 0 : getInvestigationId().hashCode());
        hashCode = prime * hashCode + ((getEntityArn() == null) ? 0 : getEntityArn().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getScopeStartTime() == null) ? 0 : getScopeStartTime().hashCode());
        hashCode = prime * hashCode + ((getScopeEndTime() == null) ? 0 : getScopeEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public GetInvestigationResult clone() {
        try {
            return (GetInvestigationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
