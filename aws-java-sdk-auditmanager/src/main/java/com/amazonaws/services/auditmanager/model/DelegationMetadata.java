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
 * The metadata associated with the specified delegation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DelegationMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DelegationMetadata implements Serializable, Cloneable, StructuredPojo {

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
     * The unique identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The current status of the delgation.
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
     * Specifies when the delegation was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Specifies the name of the control set delegated for review.
     * </p>
     */
    private String controlSetName;

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

    public DelegationMetadata withId(String id) {
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

    public DelegationMetadata withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The unique identifier for the specified assessment.
     */

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    /**
     * <p>
     * The unique identifier for the specified assessment.
     * </p>
     * 
     * @return The unique identifier for the specified assessment.
     */

    public String getAssessmentId() {
        return this.assessmentId;
    }

    /**
     * <p>
     * The unique identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The unique identifier for the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegationMetadata withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The current status of the delgation.
     * </p>
     * 
     * @param status
     *        The current status of the delgation.
     * @see DelegationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the delgation.
     * </p>
     * 
     * @return The current status of the delgation.
     * @see DelegationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the delgation.
     * </p>
     * 
     * @param status
     *        The current status of the delgation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DelegationStatus
     */

    public DelegationMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the delgation.
     * </p>
     * 
     * @param status
     *        The current status of the delgation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DelegationStatus
     */

    public DelegationMetadata withStatus(DelegationStatus status) {
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

    public DelegationMetadata withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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

    public DelegationMetadata withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the control set delegated for review.
     * </p>
     * 
     * @param controlSetName
     *        Specifies the name of the control set delegated for review.
     */

    public void setControlSetName(String controlSetName) {
        this.controlSetName = controlSetName;
    }

    /**
     * <p>
     * Specifies the name of the control set delegated for review.
     * </p>
     * 
     * @return Specifies the name of the control set delegated for review.
     */

    public String getControlSetName() {
        return this.controlSetName;
    }

    /**
     * <p>
     * Specifies the name of the control set delegated for review.
     * </p>
     * 
     * @param controlSetName
     *        Specifies the name of the control set delegated for review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegationMetadata withControlSetName(String controlSetName) {
        setControlSetName(controlSetName);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getControlSetName() != null)
            sb.append("ControlSetName: ").append(getControlSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DelegationMetadata == false)
            return false;
        DelegationMetadata other = (DelegationMetadata) obj;
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getControlSetName() == null ^ this.getControlSetName() == null)
            return false;
        if (other.getControlSetName() != null && other.getControlSetName().equals(this.getControlSetName()) == false)
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
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getControlSetName() == null) ? 0 : getControlSetName().hashCode());
        return hashCode;
    }

    @Override
    public DelegationMetadata clone() {
        try {
            return (DelegationMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.DelegationMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
