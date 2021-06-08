/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The assignment of a control set to a delegate for review.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/Delegation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delegation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the delegation.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the associated assessment.
     * </p>
     */
    private String assessmentName;
    /**
     * <p>
     * The identifier for the associated assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The status of the delegation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The type of customer persona.
     * </p>
     * <note>
     * <p>
     * In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be <code>RESOURCE_OWNER</code>.
     * </p>
     * </note>
     */
    private String roleType;
    /**
     * <p>
     * Specifies when the delegation was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Specifies when the delegation was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The identifier for the associated control set.
     * </p>
     */
    private String controlSetId;
    /**
     * <p>
     * The comment related to the delegation.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The IAM user or role that created the delegation.
     * </p>
     */
    private String createdBy;

    /**
     * <p>
     * The unique identifier for the delegation.
     * </p>
     * 
     * @param id
     *        The unique identifier for the delegation.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the delegation.
     * </p>
     * 
     * @return The unique identifier for the delegation.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the delegation.
     * </p>
     * 
     * @param id
     *        The unique identifier for the delegation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delegation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the associated assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name of the associated assessment.
     */

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    /**
     * <p>
     * The name of the associated assessment.
     * </p>
     * 
     * @return The name of the associated assessment.
     */

    public String getAssessmentName() {
        return this.assessmentName;
    }

    /**
     * <p>
     * The name of the associated assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name of the associated assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delegation withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
    }

    /**
     * <p>
     * The identifier for the associated assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the associated assessment.
     */

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    /**
     * <p>
     * The identifier for the associated assessment.
     * </p>
     * 
     * @return The identifier for the associated assessment.
     */

    public String getAssessmentId() {
        return this.assessmentId;
    }

    /**
     * <p>
     * The identifier for the associated assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the associated assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delegation withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The status of the delegation.
     * </p>
     * 
     * @param status
     *        The status of the delegation.
     * @see DelegationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the delegation.
     * </p>
     * 
     * @return The status of the delegation.
     * @see DelegationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the delegation.
     * </p>
     * 
     * @param status
     *        The status of the delegation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DelegationStatus
     */

    public Delegation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the delegation.
     * </p>
     * 
     * @param status
     *        The status of the delegation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DelegationStatus
     */

    public Delegation withStatus(DelegationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delegation withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The type of customer persona.
     * </p>
     * <note>
     * <p>
     * In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be <code>RESOURCE_OWNER</code>.
     * </p>
     * </note>
     * 
     * @param roleType
     *        The type of customer persona. </p> <note>
     *        <p>
     *        In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *        </p>
     *        <p>
     *        In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *        </p>
     *        <p>
     *        In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be
     *        <code>RESOURCE_OWNER</code>.
     *        </p>
     * @see RoleType
     */

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    /**
     * <p>
     * The type of customer persona.
     * </p>
     * <note>
     * <p>
     * In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be <code>RESOURCE_OWNER</code>.
     * </p>
     * </note>
     * 
     * @return The type of customer persona. </p> <note>
     *         <p>
     *         In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *         </p>
     *         <p>
     *         In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *         </p>
     *         <p>
     *         In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be
     *         <code>RESOURCE_OWNER</code>.
     *         </p>
     * @see RoleType
     */

    public String getRoleType() {
        return this.roleType;
    }

    /**
     * <p>
     * The type of customer persona.
     * </p>
     * <note>
     * <p>
     * In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be <code>RESOURCE_OWNER</code>.
     * </p>
     * </note>
     * 
     * @param roleType
     *        The type of customer persona. </p> <note>
     *        <p>
     *        In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *        </p>
     *        <p>
     *        In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *        </p>
     *        <p>
     *        In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be
     *        <code>RESOURCE_OWNER</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoleType
     */

    public Delegation withRoleType(String roleType) {
        setRoleType(roleType);
        return this;
    }

    /**
     * <p>
     * The type of customer persona.
     * </p>
     * <note>
     * <p>
     * In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     * </p>
     * <p>
     * In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be <code>RESOURCE_OWNER</code>.
     * </p>
     * </note>
     * 
     * @param roleType
     *        The type of customer persona. </p> <note>
     *        <p>
     *        In <code>CreateAssessment</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *        </p>
     *        <p>
     *        In <code>UpdateSettings</code>, <code>roleType</code> can only be <code>PROCESS_OWNER</code>.
     *        </p>
     *        <p>
     *        In <code>BatchCreateDelegationByAssessment</code>, <code>roleType</code> can only be
     *        <code>RESOURCE_OWNER</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoleType
     */

    public Delegation withRoleType(RoleType roleType) {
        this.roleType = roleType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies when the delegation was created.
     * </p>
     * 
     * @param creationTime
     *        Specifies when the delegation was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Specifies when the delegation was created.
     * </p>
     * 
     * @return Specifies when the delegation was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Specifies when the delegation was created.
     * </p>
     * 
     * @param creationTime
     *        Specifies when the delegation was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delegation withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Specifies when the delegation was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        Specifies when the delegation was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * Specifies when the delegation was last updated.
     * </p>
     * 
     * @return Specifies when the delegation was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * Specifies when the delegation was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        Specifies when the delegation was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delegation withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The identifier for the associated control set.
     * </p>
     * 
     * @param controlSetId
     *        The identifier for the associated control set.
     */

    public void setControlSetId(String controlSetId) {
        this.controlSetId = controlSetId;
    }

    /**
     * <p>
     * The identifier for the associated control set.
     * </p>
     * 
     * @return The identifier for the associated control set.
     */

    public String getControlSetId() {
        return this.controlSetId;
    }

    /**
     * <p>
     * The identifier for the associated control set.
     * </p>
     * 
     * @param controlSetId
     *        The identifier for the associated control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delegation withControlSetId(String controlSetId) {
        setControlSetId(controlSetId);
        return this;
    }

    /**
     * <p>
     * The comment related to the delegation.
     * </p>
     * 
     * @param comment
     *        The comment related to the delegation.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The comment related to the delegation.
     * </p>
     * 
     * @return The comment related to the delegation.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The comment related to the delegation.
     * </p>
     * 
     * @param comment
     *        The comment related to the delegation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delegation withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The IAM user or role that created the delegation.
     * </p>
     * 
     * @param createdBy
     *        The IAM user or role that created the delegation.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The IAM user or role that created the delegation.
     * </p>
     * 
     * @return The IAM user or role that created the delegation.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The IAM user or role that created the delegation.
     * </p>
     * 
     * @param createdBy
     *        The IAM user or role that created the delegation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delegation withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getAssessmentName() != null)
            sb.append("AssessmentName: ").append(getAssessmentName()).append(",");
        if (getAssessmentId() != null)
            sb.append("AssessmentId: ").append(getAssessmentId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRoleType() != null)
            sb.append("RoleType: ").append(getRoleType()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getControlSetId() != null)
            sb.append("ControlSetId: ").append(getControlSetId()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Delegation == false)
            return false;
        Delegation other = (Delegation) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAssessmentName() == null ^ this.getAssessmentName() == null)
            return false;
        if (other.getAssessmentName() != null && other.getAssessmentName().equals(this.getAssessmentName()) == false)
            return false;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRoleType() == null ^ this.getRoleType() == null)
            return false;
        if (other.getRoleType() != null && other.getRoleType().equals(this.getRoleType()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getControlSetId() == null ^ this.getControlSetId() == null)
            return false;
        if (other.getControlSetId() != null && other.getControlSetId().equals(this.getControlSetId()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAssessmentName() == null) ? 0 : getAssessmentName().hashCode());
        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRoleType() == null) ? 0 : getRoleType().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getControlSetId() == null) ? 0 : getControlSetId().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        return hashCode;
    }

    @Override
    public Delegation clone() {
        try {
            return (Delegation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.DelegationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
