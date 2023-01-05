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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the Amazon SageMaker Model Card export job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelCardExportJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelCardExportJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model card export job.
     * </p>
     */
    private String modelCardExportJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card export job.
     * </p>
     */
    private String modelCardExportJobArn;
    /**
     * <p>
     * The completion status of the model card export job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the model card that the export job exports.
     * </p>
     */
    private String modelCardName;
    /**
     * <p>
     * The version of the model card that the export job exports.
     * </p>
     */
    private Integer modelCardVersion;
    /**
     * <p>
     * The date and time that the model card export job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time that the model card export job was last modified..
     * </p>
     */
    private java.util.Date lastModifiedAt;

    /**
     * <p>
     * The name of the model card export job.
     * </p>
     * 
     * @param modelCardExportJobName
     *        The name of the model card export job.
     */

    public void setModelCardExportJobName(String modelCardExportJobName) {
        this.modelCardExportJobName = modelCardExportJobName;
    }

    /**
     * <p>
     * The name of the model card export job.
     * </p>
     * 
     * @return The name of the model card export job.
     */

    public String getModelCardExportJobName() {
        return this.modelCardExportJobName;
    }

    /**
     * <p>
     * The name of the model card export job.
     * </p>
     * 
     * @param modelCardExportJobName
     *        The name of the model card export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCardExportJobSummary withModelCardExportJobName(String modelCardExportJobName) {
        setModelCardExportJobName(modelCardExportJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card export job.
     * </p>
     * 
     * @param modelCardExportJobArn
     *        The Amazon Resource Name (ARN) of the model card export job.
     */

    public void setModelCardExportJobArn(String modelCardExportJobArn) {
        this.modelCardExportJobArn = modelCardExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card export job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model card export job.
     */

    public String getModelCardExportJobArn() {
        return this.modelCardExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card export job.
     * </p>
     * 
     * @param modelCardExportJobArn
     *        The Amazon Resource Name (ARN) of the model card export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCardExportJobSummary withModelCardExportJobArn(String modelCardExportJobArn) {
        setModelCardExportJobArn(modelCardExportJobArn);
        return this;
    }

    /**
     * <p>
     * The completion status of the model card export job.
     * </p>
     * 
     * @param status
     *        The completion status of the model card export job.
     * @see ModelCardExportJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The completion status of the model card export job.
     * </p>
     * 
     * @return The completion status of the model card export job.
     * @see ModelCardExportJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The completion status of the model card export job.
     * </p>
     * 
     * @param status
     *        The completion status of the model card export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardExportJobStatus
     */

    public ModelCardExportJobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The completion status of the model card export job.
     * </p>
     * 
     * @param status
     *        The completion status of the model card export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardExportJobStatus
     */

    public ModelCardExportJobSummary withStatus(ModelCardExportJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of the model card that the export job exports.
     * </p>
     * 
     * @param modelCardName
     *        The name of the model card that the export job exports.
     */

    public void setModelCardName(String modelCardName) {
        this.modelCardName = modelCardName;
    }

    /**
     * <p>
     * The name of the model card that the export job exports.
     * </p>
     * 
     * @return The name of the model card that the export job exports.
     */

    public String getModelCardName() {
        return this.modelCardName;
    }

    /**
     * <p>
     * The name of the model card that the export job exports.
     * </p>
     * 
     * @param modelCardName
     *        The name of the model card that the export job exports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCardExportJobSummary withModelCardName(String modelCardName) {
        setModelCardName(modelCardName);
        return this;
    }

    /**
     * <p>
     * The version of the model card that the export job exports.
     * </p>
     * 
     * @param modelCardVersion
     *        The version of the model card that the export job exports.
     */

    public void setModelCardVersion(Integer modelCardVersion) {
        this.modelCardVersion = modelCardVersion;
    }

    /**
     * <p>
     * The version of the model card that the export job exports.
     * </p>
     * 
     * @return The version of the model card that the export job exports.
     */

    public Integer getModelCardVersion() {
        return this.modelCardVersion;
    }

    /**
     * <p>
     * The version of the model card that the export job exports.
     * </p>
     * 
     * @param modelCardVersion
     *        The version of the model card that the export job exports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCardExportJobSummary withModelCardVersion(Integer modelCardVersion) {
        setModelCardVersion(modelCardVersion);
        return this;
    }

    /**
     * <p>
     * The date and time that the model card export job was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the model card export job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the model card export job was created.
     * </p>
     * 
     * @return The date and time that the model card export job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the model card export job was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the model card export job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCardExportJobSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time that the model card export job was last modified..
     * </p>
     * 
     * @param lastModifiedAt
     *        The date and time that the model card export job was last modified..
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * The date and time that the model card export job was last modified..
     * </p>
     * 
     * @return The date and time that the model card export job was last modified..
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * The date and time that the model card export job was last modified..
     * </p>
     * 
     * @param lastModifiedAt
     *        The date and time that the model card export job was last modified..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCardExportJobSummary withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
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
        if (getModelCardExportJobName() != null)
            sb.append("ModelCardExportJobName: ").append(getModelCardExportJobName()).append(",");
        if (getModelCardExportJobArn() != null)
            sb.append("ModelCardExportJobArn: ").append(getModelCardExportJobArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getModelCardName() != null)
            sb.append("ModelCardName: ").append(getModelCardName()).append(",");
        if (getModelCardVersion() != null)
            sb.append("ModelCardVersion: ").append(getModelCardVersion()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelCardExportJobSummary == false)
            return false;
        ModelCardExportJobSummary other = (ModelCardExportJobSummary) obj;
        if (other.getModelCardExportJobName() == null ^ this.getModelCardExportJobName() == null)
            return false;
        if (other.getModelCardExportJobName() != null && other.getModelCardExportJobName().equals(this.getModelCardExportJobName()) == false)
            return false;
        if (other.getModelCardExportJobArn() == null ^ this.getModelCardExportJobArn() == null)
            return false;
        if (other.getModelCardExportJobArn() != null && other.getModelCardExportJobArn().equals(this.getModelCardExportJobArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getModelCardName() == null ^ this.getModelCardName() == null)
            return false;
        if (other.getModelCardName() != null && other.getModelCardName().equals(this.getModelCardName()) == false)
            return false;
        if (other.getModelCardVersion() == null ^ this.getModelCardVersion() == null)
            return false;
        if (other.getModelCardVersion() != null && other.getModelCardVersion().equals(this.getModelCardVersion()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelCardExportJobName() == null) ? 0 : getModelCardExportJobName().hashCode());
        hashCode = prime * hashCode + ((getModelCardExportJobArn() == null) ? 0 : getModelCardExportJobArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getModelCardName() == null) ? 0 : getModelCardName().hashCode());
        hashCode = prime * hashCode + ((getModelCardVersion() == null) ? 0 : getModelCardVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        return hashCode;
    }

    @Override
    public ModelCardExportJobSummary clone() {
        try {
            return (ModelCardExportJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelCardExportJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
