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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the specific model version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ModelVersionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model that this model version is a version of.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model that this model version is a version of.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The version of the model.
     * </p>
     */
    private Long modelVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     */
    private String modelVersionArn;
    /**
     * <p>
     * The time when this model version was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The current status of the model version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates how this model version was generated.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the model
     * quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>. Otherwise, the value
     * is <code>QUALITY_THRESHOLD_MET</code>.
     * </p>
     * <p>
     * If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code> is
     * <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by adding labels
     * to the input dataset and retraining the model.
     * </p>
     * <p>
     * For information about improving the quality of a model, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with Amazon
     * Lookout for Equipment</a>.
     * </p>
     */
    private String modelQuality;

    /**
     * <p>
     * The name of the model that this model version is a version of.
     * </p>
     * 
     * @param modelName
     *        The name of the model that this model version is a version of.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model that this model version is a version of.
     * </p>
     * 
     * @return The name of the model that this model version is a version of.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model that this model version is a version of.
     * </p>
     * 
     * @param modelName
     *        The name of the model that this model version is a version of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionSummary withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model that this model version is a version of.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the model that this model version is a version of.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model that this model version is a version of.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model that this model version is a version of.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model that this model version is a version of.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the model that this model version is a version of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionSummary withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model.
     */

    public void setModelVersion(Long modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @return The version of the model.
     */

    public Long getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionSummary withModelVersion(Long modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * 
     * @param modelVersionArn
     *        The Amazon Resource Name (ARN) of the model version.
     */

    public void setModelVersionArn(String modelVersionArn) {
        this.modelVersionArn = modelVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model version.
     */

    public String getModelVersionArn() {
        return this.modelVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version.
     * </p>
     * 
     * @param modelVersionArn
     *        The Amazon Resource Name (ARN) of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionSummary withModelVersionArn(String modelVersionArn) {
        setModelVersionArn(modelVersionArn);
        return this;
    }

    /**
     * <p>
     * The time when this model version was created.
     * </p>
     * 
     * @param createdAt
     *        The time when this model version was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when this model version was created.
     * </p>
     * 
     * @return The time when this model version was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when this model version was created.
     * </p>
     * 
     * @param createdAt
     *        The time when this model version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @param status
     *        The current status of the model version.
     * @see ModelVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @return The current status of the model version.
     * @see ModelVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @param status
     *        The current status of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionStatus
     */

    public ModelVersionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the model version.
     * </p>
     * 
     * @param status
     *        The current status of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionStatus
     */

    public ModelVersionSummary withStatus(ModelVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates how this model version was generated.
     * </p>
     * 
     * @param sourceType
     *        Indicates how this model version was generated.
     * @see ModelVersionSourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Indicates how this model version was generated.
     * </p>
     * 
     * @return Indicates how this model version was generated.
     * @see ModelVersionSourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * Indicates how this model version was generated.
     * </p>
     * 
     * @param sourceType
     *        Indicates how this model version was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionSourceType
     */

    public ModelVersionSummary withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Indicates how this model version was generated.
     * </p>
     * 
     * @param sourceType
     *        Indicates how this model version was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionSourceType
     */

    public ModelVersionSummary withSourceType(ModelVersionSourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the model
     * quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>. Otherwise, the value
     * is <code>QUALITY_THRESHOLD_MET</code>.
     * </p>
     * <p>
     * If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code> is
     * <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by adding labels
     * to the input dataset and retraining the model.
     * </p>
     * <p>
     * For information about improving the quality of a model, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with Amazon
     * Lookout for Equipment</a>.
     * </p>
     * 
     * @param modelQuality
     *        Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the
     *        model quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>.
     *        Otherwise, the value is <code>QUALITY_THRESHOLD_MET</code>. </p>
     *        <p>
     *        If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code>
     *        is <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by
     *        adding labels to the input dataset and retraining the model.
     *        </p>
     *        <p>
     *        For information about improving the quality of a model, see <a
     *        href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with
     *        Amazon Lookout for Equipment</a>.
     * @see ModelQuality
     */

    public void setModelQuality(String modelQuality) {
        this.modelQuality = modelQuality;
    }

    /**
     * <p>
     * Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the model
     * quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>. Otherwise, the value
     * is <code>QUALITY_THRESHOLD_MET</code>.
     * </p>
     * <p>
     * If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code> is
     * <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by adding labels
     * to the input dataset and retraining the model.
     * </p>
     * <p>
     * For information about improving the quality of a model, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with Amazon
     * Lookout for Equipment</a>.
     * </p>
     * 
     * @return Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the
     *         model quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>.
     *         Otherwise, the value is <code>QUALITY_THRESHOLD_MET</code>. </p>
     *         <p>
     *         If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code>
     *         is <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by
     *         adding labels to the input dataset and retraining the model.
     *         </p>
     *         <p>
     *         For information about improving the quality of a model, see <a
     *         href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices
     *         with Amazon Lookout for Equipment</a>.
     * @see ModelQuality
     */

    public String getModelQuality() {
        return this.modelQuality;
    }

    /**
     * <p>
     * Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the model
     * quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>. Otherwise, the value
     * is <code>QUALITY_THRESHOLD_MET</code>.
     * </p>
     * <p>
     * If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code> is
     * <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by adding labels
     * to the input dataset and retraining the model.
     * </p>
     * <p>
     * For information about improving the quality of a model, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with Amazon
     * Lookout for Equipment</a>.
     * </p>
     * 
     * @param modelQuality
     *        Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the
     *        model quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>.
     *        Otherwise, the value is <code>QUALITY_THRESHOLD_MET</code>. </p>
     *        <p>
     *        If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code>
     *        is <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by
     *        adding labels to the input dataset and retraining the model.
     *        </p>
     *        <p>
     *        For information about improving the quality of a model, see <a
     *        href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with
     *        Amazon Lookout for Equipment</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelQuality
     */

    public ModelVersionSummary withModelQuality(String modelQuality) {
        setModelQuality(modelQuality);
        return this;
    }

    /**
     * <p>
     * Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the model
     * quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>. Otherwise, the value
     * is <code>QUALITY_THRESHOLD_MET</code>.
     * </p>
     * <p>
     * If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code> is
     * <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by adding labels
     * to the input dataset and retraining the model.
     * </p>
     * <p>
     * For information about improving the quality of a model, see <a
     * href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with Amazon
     * Lookout for Equipment</a>.
     * </p>
     * 
     * @param modelQuality
     *        Provides a quality assessment for a model that uses labels. If Lookout for Equipment determines that the
     *        model quality is poor based on training metrics, the value is <code>POOR_QUALITY_DETECTED</code>.
     *        Otherwise, the value is <code>QUALITY_THRESHOLD_MET</code>. </p>
     *        <p>
     *        If the model is unlabeled, the model quality can't be assessed and the value of <code>ModelQuality</code>
     *        is <code>CANNOT_DETERMINE_QUALITY</code>. In this situation, you can get a model quality assessment by
     *        adding labels to the input dataset and retraining the model.
     *        </p>
     *        <p>
     *        For information about improving the quality of a model, see <a
     *        href="https://docs.aws.amazon.com/lookout-for-equipment/latest/ug/best-practices.html">Best practices with
     *        Amazon Lookout for Equipment</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelQuality
     */

    public ModelVersionSummary withModelQuality(ModelQuality modelQuality) {
        this.modelQuality = modelQuality.toString();
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getModelVersionArn() != null)
            sb.append("ModelVersionArn: ").append(getModelVersionArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getModelQuality() != null)
            sb.append("ModelQuality: ").append(getModelQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelVersionSummary == false)
            return false;
        ModelVersionSummary other = (ModelVersionSummary) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getModelVersionArn() == null ^ this.getModelVersionArn() == null)
            return false;
        if (other.getModelVersionArn() != null && other.getModelVersionArn().equals(this.getModelVersionArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getModelQuality() == null ^ this.getModelQuality() == null)
            return false;
        if (other.getModelQuality() != null && other.getModelQuality().equals(this.getModelQuality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getModelVersionArn() == null) ? 0 : getModelVersionArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getModelQuality() == null) ? 0 : getModelQuality().hashCode());
        return hashCode;
    }

    @Override
    public ModelVersionSummary clone() {
        try {
            return (ModelVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.ModelVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
