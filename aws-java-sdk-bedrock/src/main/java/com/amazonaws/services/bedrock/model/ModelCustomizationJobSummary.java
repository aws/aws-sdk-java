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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about one customization job
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ModelCustomizationJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelCustomizationJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the customization job.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the base model.
     * </p>
     */
    private String baseModelArn;
    /**
     * <p>
     * Name of the customization job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * Status of the customization job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Time that the customization job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * Creation time of the custom model.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Time that the customization job ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the custom model.
     * </p>
     */
    private String customModelArn;
    /**
     * <p>
     * Name of the custom model.
     * </p>
     */
    private String customModelName;
    /**
     * <p>
     * Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a>.
     * </p>
     */
    private String customizationType;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the customization job.
     * </p>
     * 
     * @param jobArn
     *        Amazon Resource Name (ARN) of the customization job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the customization job.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the customization job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the customization job.
     * </p>
     * 
     * @param jobArn
     *        Amazon Resource Name (ARN) of the customization job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCustomizationJobSummary withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the base model.
     * </p>
     * 
     * @param baseModelArn
     *        Amazon Resource Name (ARN) of the base model.
     */

    public void setBaseModelArn(String baseModelArn) {
        this.baseModelArn = baseModelArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the base model.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the base model.
     */

    public String getBaseModelArn() {
        return this.baseModelArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the base model.
     * </p>
     * 
     * @param baseModelArn
     *        Amazon Resource Name (ARN) of the base model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCustomizationJobSummary withBaseModelArn(String baseModelArn) {
        setBaseModelArn(baseModelArn);
        return this;
    }

    /**
     * <p>
     * Name of the customization job.
     * </p>
     * 
     * @param jobName
     *        Name of the customization job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * Name of the customization job.
     * </p>
     * 
     * @return Name of the customization job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * Name of the customization job.
     * </p>
     * 
     * @param jobName
     *        Name of the customization job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCustomizationJobSummary withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * Status of the customization job.
     * </p>
     * 
     * @param status
     *        Status of the customization job.
     * @see ModelCustomizationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the customization job.
     * </p>
     * 
     * @return Status of the customization job.
     * @see ModelCustomizationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the customization job.
     * </p>
     * 
     * @param status
     *        Status of the customization job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCustomizationJobStatus
     */

    public ModelCustomizationJobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the customization job.
     * </p>
     * 
     * @param status
     *        Status of the customization job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCustomizationJobStatus
     */

    public ModelCustomizationJobSummary withStatus(ModelCustomizationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Time that the customization job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        Time that the customization job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Time that the customization job was last modified.
     * </p>
     * 
     * @return Time that the customization job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Time that the customization job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        Time that the customization job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCustomizationJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * Creation time of the custom model.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the custom model.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Creation time of the custom model.
     * </p>
     * 
     * @return Creation time of the custom model.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Creation time of the custom model.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the custom model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCustomizationJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Time that the customization job ended.
     * </p>
     * 
     * @param endTime
     *        Time that the customization job ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Time that the customization job ended.
     * </p>
     * 
     * @return Time that the customization job ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Time that the customization job ended.
     * </p>
     * 
     * @param endTime
     *        Time that the customization job ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCustomizationJobSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the custom model.
     * </p>
     * 
     * @param customModelArn
     *        Amazon Resource Name (ARN) of the custom model.
     */

    public void setCustomModelArn(String customModelArn) {
        this.customModelArn = customModelArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the custom model.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the custom model.
     */

    public String getCustomModelArn() {
        return this.customModelArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the custom model.
     * </p>
     * 
     * @param customModelArn
     *        Amazon Resource Name (ARN) of the custom model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCustomizationJobSummary withCustomModelArn(String customModelArn) {
        setCustomModelArn(customModelArn);
        return this;
    }

    /**
     * <p>
     * Name of the custom model.
     * </p>
     * 
     * @param customModelName
     *        Name of the custom model.
     */

    public void setCustomModelName(String customModelName) {
        this.customModelName = customModelName;
    }

    /**
     * <p>
     * Name of the custom model.
     * </p>
     * 
     * @return Name of the custom model.
     */

    public String getCustomModelName() {
        return this.customModelName;
    }

    /**
     * <p>
     * Name of the custom model.
     * </p>
     * 
     * @param customModelName
     *        Name of the custom model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCustomizationJobSummary withCustomModelName(String customModelName) {
        setCustomModelName(customModelName);
        return this;
    }

    /**
     * <p>
     * Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a>.
     * </p>
     * 
     * @param customizationType
     *        Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     *        information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     *        models</a>.
     * @see CustomizationType
     */

    public void setCustomizationType(String customizationType) {
        this.customizationType = customizationType;
    }

    /**
     * <p>
     * Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a>.
     * </p>
     * 
     * @return Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     *         information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     *         models</a>.
     * @see CustomizationType
     */

    public String getCustomizationType() {
        return this.customizationType;
    }

    /**
     * <p>
     * Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a>.
     * </p>
     * 
     * @param customizationType
     *        Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     *        information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     *        models</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationType
     */

    public ModelCustomizationJobSummary withCustomizationType(String customizationType) {
        setCustomizationType(customizationType);
        return this;
    }

    /**
     * <p>
     * Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a>.
     * </p>
     * 
     * @param customizationType
     *        Specifies whether to carry out continued pre-training of a model or whether to fine-tune it. For more
     *        information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     *        models</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationType
     */

    public ModelCustomizationJobSummary withCustomizationType(CustomizationType customizationType) {
        this.customizationType = customizationType.toString();
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
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getBaseModelArn() != null)
            sb.append("BaseModelArn: ").append(getBaseModelArn()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getCustomModelArn() != null)
            sb.append("CustomModelArn: ").append(getCustomModelArn()).append(",");
        if (getCustomModelName() != null)
            sb.append("CustomModelName: ").append(getCustomModelName()).append(",");
        if (getCustomizationType() != null)
            sb.append("CustomizationType: ").append(getCustomizationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelCustomizationJobSummary == false)
            return false;
        ModelCustomizationJobSummary other = (ModelCustomizationJobSummary) obj;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getBaseModelArn() == null ^ this.getBaseModelArn() == null)
            return false;
        if (other.getBaseModelArn() != null && other.getBaseModelArn().equals(this.getBaseModelArn()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getCustomModelArn() == null ^ this.getCustomModelArn() == null)
            return false;
        if (other.getCustomModelArn() != null && other.getCustomModelArn().equals(this.getCustomModelArn()) == false)
            return false;
        if (other.getCustomModelName() == null ^ this.getCustomModelName() == null)
            return false;
        if (other.getCustomModelName() != null && other.getCustomModelName().equals(this.getCustomModelName()) == false)
            return false;
        if (other.getCustomizationType() == null ^ this.getCustomizationType() == null)
            return false;
        if (other.getCustomizationType() != null && other.getCustomizationType().equals(this.getCustomizationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getBaseModelArn() == null) ? 0 : getBaseModelArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getCustomModelArn() == null) ? 0 : getCustomModelArn().hashCode());
        hashCode = prime * hashCode + ((getCustomModelName() == null) ? 0 : getCustomModelName().hashCode());
        hashCode = prime * hashCode + ((getCustomizationType() == null) ? 0 : getCustomizationType().hashCode());
        return hashCode;
    }

    @Override
    public ModelCustomizationJobSummary clone() {
        try {
            return (ModelCustomizationJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.ModelCustomizationJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
