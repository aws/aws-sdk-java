/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An annotation import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/AnnotationImportJobItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnnotationImportJobItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When the job completed.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * When the job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The job's destination annotation store.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * The job's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The job's service role ARN.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The job's left normalization setting.
     * </p>
     */
    private Boolean runLeftNormalization;
    /**
     * <p>
     * The job's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * When the job was updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * When the job completed.
     * </p>
     * 
     * @param completionTime
     *        When the job completed.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * When the job completed.
     * </p>
     * 
     * @return When the job completed.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * When the job completed.
     * </p>
     * 
     * @param completionTime
     *        When the job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnnotationImportJobItem withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @param creationTime
     *        When the job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @return When the job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @param creationTime
     *        When the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnnotationImportJobItem withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The job's destination annotation store.
     * </p>
     * 
     * @param destinationName
     *        The job's destination annotation store.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The job's destination annotation store.
     * </p>
     * 
     * @return The job's destination annotation store.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * The job's destination annotation store.
     * </p>
     * 
     * @param destinationName
     *        The job's destination annotation store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnnotationImportJobItem withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @param id
     *        The job's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @return The job's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @param id
     *        The job's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnnotationImportJobItem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The job's service role ARN.
     * </p>
     * 
     * @param roleArn
     *        The job's service role ARN.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The job's service role ARN.
     * </p>
     * 
     * @return The job's service role ARN.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The job's service role ARN.
     * </p>
     * 
     * @param roleArn
     *        The job's service role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnnotationImportJobItem withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The job's left normalization setting.
     * </p>
     * 
     * @param runLeftNormalization
     *        The job's left normalization setting.
     */

    public void setRunLeftNormalization(Boolean runLeftNormalization) {
        this.runLeftNormalization = runLeftNormalization;
    }

    /**
     * <p>
     * The job's left normalization setting.
     * </p>
     * 
     * @return The job's left normalization setting.
     */

    public Boolean getRunLeftNormalization() {
        return this.runLeftNormalization;
    }

    /**
     * <p>
     * The job's left normalization setting.
     * </p>
     * 
     * @param runLeftNormalization
     *        The job's left normalization setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnnotationImportJobItem withRunLeftNormalization(Boolean runLeftNormalization) {
        setRunLeftNormalization(runLeftNormalization);
        return this;
    }

    /**
     * <p>
     * The job's left normalization setting.
     * </p>
     * 
     * @return The job's left normalization setting.
     */

    public Boolean isRunLeftNormalization() {
        return this.runLeftNormalization;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @return The job's status.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public AnnotationImportJobItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public AnnotationImportJobItem withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * When the job was updated.
     * </p>
     * 
     * @param updateTime
     *        When the job was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * When the job was updated.
     * </p>
     * 
     * @return When the job was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * When the job was updated.
     * </p>
     * 
     * @param updateTime
     *        When the job was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnnotationImportJobItem withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRunLeftNormalization() != null)
            sb.append("RunLeftNormalization: ").append(getRunLeftNormalization()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnnotationImportJobItem == false)
            return false;
        AnnotationImportJobItem other = (AnnotationImportJobItem) obj;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRunLeftNormalization() == null ^ this.getRunLeftNormalization() == null)
            return false;
        if (other.getRunLeftNormalization() != null && other.getRunLeftNormalization().equals(this.getRunLeftNormalization()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRunLeftNormalization() == null) ? 0 : getRunLeftNormalization().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public AnnotationImportJobItem clone() {
        try {
            return (AnnotationImportJobItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.AnnotationImportJobItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
