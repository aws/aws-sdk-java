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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationImportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAnnotationImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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

    private FormatOptions formatOptions;
    /**
     * <p>
     * The job's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The job's imported items.
     * </p>
     */
    private java.util.List<AnnotationImportItemDetail> items;
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
     * The job's status message.
     * </p>
     */
    private String statusMessage;
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

    public GetAnnotationImportJobResult withCompletionTime(java.util.Date completionTime) {
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

    public GetAnnotationImportJobResult withCreationTime(java.util.Date creationTime) {
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

    public GetAnnotationImportJobResult withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * @param formatOptions
     */

    public void setFormatOptions(FormatOptions formatOptions) {
        this.formatOptions = formatOptions;
    }

    /**
     * @return
     */

    public FormatOptions getFormatOptions() {
        return this.formatOptions;
    }

    /**
     * @param formatOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationImportJobResult withFormatOptions(FormatOptions formatOptions) {
        setFormatOptions(formatOptions);
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

    public GetAnnotationImportJobResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The job's imported items.
     * </p>
     * 
     * @return The job's imported items.
     */

    public java.util.List<AnnotationImportItemDetail> getItems() {
        return items;
    }

    /**
     * <p>
     * The job's imported items.
     * </p>
     * 
     * @param items
     *        The job's imported items.
     */

    public void setItems(java.util.Collection<AnnotationImportItemDetail> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<AnnotationImportItemDetail>(items);
    }

    /**
     * <p>
     * The job's imported items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The job's imported items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationImportJobResult withItems(AnnotationImportItemDetail... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<AnnotationImportItemDetail>(items.length));
        }
        for (AnnotationImportItemDetail ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The job's imported items.
     * </p>
     * 
     * @param items
     *        The job's imported items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationImportJobResult withItems(java.util.Collection<AnnotationImportItemDetail> items) {
        setItems(items);
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

    public GetAnnotationImportJobResult withRoleArn(String roleArn) {
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

    public GetAnnotationImportJobResult withRunLeftNormalization(Boolean runLeftNormalization) {
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

    public GetAnnotationImportJobResult withStatus(String status) {
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

    public GetAnnotationImportJobResult withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The job's status message.
     * </p>
     * 
     * @param statusMessage
     *        The job's status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The job's status message.
     * </p>
     * 
     * @return The job's status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The job's status message.
     * </p>
     * 
     * @param statusMessage
     *        The job's status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnnotationImportJobResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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

    public GetAnnotationImportJobResult withUpdateTime(java.util.Date updateTime) {
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
        if (getFormatOptions() != null)
            sb.append("FormatOptions: ").append(getFormatOptions()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRunLeftNormalization() != null)
            sb.append("RunLeftNormalization: ").append(getRunLeftNormalization()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
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

        if (obj instanceof GetAnnotationImportJobResult == false)
            return false;
        GetAnnotationImportJobResult other = (GetAnnotationImportJobResult) obj;
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
        if (other.getFormatOptions() == null ^ this.getFormatOptions() == null)
            return false;
        if (other.getFormatOptions() != null && other.getFormatOptions().equals(this.getFormatOptions()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
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
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
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
        hashCode = prime * hashCode + ((getFormatOptions() == null) ? 0 : getFormatOptions().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRunLeftNormalization() == null) ? 0 : getRunLeftNormalization().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetAnnotationImportJobResult clone() {
        try {
            return (GetAnnotationImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
