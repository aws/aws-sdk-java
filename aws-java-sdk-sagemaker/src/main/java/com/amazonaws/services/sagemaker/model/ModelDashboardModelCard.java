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
 * The model card for a model displayed in the Amazon SageMaker Model Dashboard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelDashboardModelCard" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDashboardModelCard implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a model card.
     * </p>
     */
    private String modelCardArn;
    /**
     * <p>
     * The name of a model card.
     * </p>
     */
    private String modelCardName;
    /**
     * <p>
     * The model card version.
     * </p>
     */
    private Integer modelCardVersion;
    /**
     * <p>
     * The model card status.
     * </p>
     */
    private String modelCardStatus;
    /**
     * <p>
     * The KMS Key ID (<code>KMSKeyId</code>) for encryption of model card information.
     * </p>
     */
    private ModelCardSecurityConfig securityConfig;
    /**
     * <p>
     * A timestamp that indicates when the model card was created.
     * </p>
     */
    private java.util.Date creationTime;

    private UserContext createdBy;
    /**
     * <p>
     * A timestamp that indicates when the model card was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private UserContext lastModifiedBy;
    /**
     * <p>
     * The tags associated with a model card.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * For models created in SageMaker, this is the model ARN. For models created outside of SageMaker, this is a
     * user-customized string.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * A model card's risk rating. Can be low, medium, or high.
     * </p>
     */
    private String riskRating;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a model card.
     * </p>
     * 
     * @param modelCardArn
     *        The Amazon Resource Name (ARN) for a model card.
     */

    public void setModelCardArn(String modelCardArn) {
        this.modelCardArn = modelCardArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a model card.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for a model card.
     */

    public String getModelCardArn() {
        return this.modelCardArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a model card.
     * </p>
     * 
     * @param modelCardArn
     *        The Amazon Resource Name (ARN) for a model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModelCard withModelCardArn(String modelCardArn) {
        setModelCardArn(modelCardArn);
        return this;
    }

    /**
     * <p>
     * The name of a model card.
     * </p>
     * 
     * @param modelCardName
     *        The name of a model card.
     */

    public void setModelCardName(String modelCardName) {
        this.modelCardName = modelCardName;
    }

    /**
     * <p>
     * The name of a model card.
     * </p>
     * 
     * @return The name of a model card.
     */

    public String getModelCardName() {
        return this.modelCardName;
    }

    /**
     * <p>
     * The name of a model card.
     * </p>
     * 
     * @param modelCardName
     *        The name of a model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModelCard withModelCardName(String modelCardName) {
        setModelCardName(modelCardName);
        return this;
    }

    /**
     * <p>
     * The model card version.
     * </p>
     * 
     * @param modelCardVersion
     *        The model card version.
     */

    public void setModelCardVersion(Integer modelCardVersion) {
        this.modelCardVersion = modelCardVersion;
    }

    /**
     * <p>
     * The model card version.
     * </p>
     * 
     * @return The model card version.
     */

    public Integer getModelCardVersion() {
        return this.modelCardVersion;
    }

    /**
     * <p>
     * The model card version.
     * </p>
     * 
     * @param modelCardVersion
     *        The model card version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModelCard withModelCardVersion(Integer modelCardVersion) {
        setModelCardVersion(modelCardVersion);
        return this;
    }

    /**
     * <p>
     * The model card status.
     * </p>
     * 
     * @param modelCardStatus
     *        The model card status.
     * @see ModelCardStatus
     */

    public void setModelCardStatus(String modelCardStatus) {
        this.modelCardStatus = modelCardStatus;
    }

    /**
     * <p>
     * The model card status.
     * </p>
     * 
     * @return The model card status.
     * @see ModelCardStatus
     */

    public String getModelCardStatus() {
        return this.modelCardStatus;
    }

    /**
     * <p>
     * The model card status.
     * </p>
     * 
     * @param modelCardStatus
     *        The model card status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardStatus
     */

    public ModelDashboardModelCard withModelCardStatus(String modelCardStatus) {
        setModelCardStatus(modelCardStatus);
        return this;
    }

    /**
     * <p>
     * The model card status.
     * </p>
     * 
     * @param modelCardStatus
     *        The model card status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardStatus
     */

    public ModelDashboardModelCard withModelCardStatus(ModelCardStatus modelCardStatus) {
        this.modelCardStatus = modelCardStatus.toString();
        return this;
    }

    /**
     * <p>
     * The KMS Key ID (<code>KMSKeyId</code>) for encryption of model card information.
     * </p>
     * 
     * @param securityConfig
     *        The KMS Key ID (<code>KMSKeyId</code>) for encryption of model card information.
     */

    public void setSecurityConfig(ModelCardSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    /**
     * <p>
     * The KMS Key ID (<code>KMSKeyId</code>) for encryption of model card information.
     * </p>
     * 
     * @return The KMS Key ID (<code>KMSKeyId</code>) for encryption of model card information.
     */

    public ModelCardSecurityConfig getSecurityConfig() {
        return this.securityConfig;
    }

    /**
     * <p>
     * The KMS Key ID (<code>KMSKeyId</code>) for encryption of model card information.
     * </p>
     * 
     * @param securityConfig
     *        The KMS Key ID (<code>KMSKeyId</code>) for encryption of model card information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModelCard withSecurityConfig(ModelCardSecurityConfig securityConfig) {
        setSecurityConfig(securityConfig);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the model card was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the model card was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the model card was created.
     * </p>
     * 
     * @return A timestamp that indicates when the model card was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the model card was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the model card was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModelCard withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModelCard withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the model card was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates when the model card was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the model card was last updated.
     * </p>
     * 
     * @return A timestamp that indicates when the model card was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the model card was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates when the model card was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModelCard withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param lastModifiedBy
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModelCard withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The tags associated with a model card.
     * </p>
     * 
     * @return The tags associated with a model card.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with a model card.
     * </p>
     * 
     * @param tags
     *        The tags associated with a model card.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with a model card.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with a model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModelCard withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with a model card.
     * </p>
     * 
     * @param tags
     *        The tags associated with a model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModelCard withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * For models created in SageMaker, this is the model ARN. For models created outside of SageMaker, this is a
     * user-customized string.
     * </p>
     * 
     * @param modelId
     *        For models created in SageMaker, this is the model ARN. For models created outside of SageMaker, this is a
     *        user-customized string.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * For models created in SageMaker, this is the model ARN. For models created outside of SageMaker, this is a
     * user-customized string.
     * </p>
     * 
     * @return For models created in SageMaker, this is the model ARN. For models created outside of SageMaker, this is
     *         a user-customized string.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * For models created in SageMaker, this is the model ARN. For models created outside of SageMaker, this is a
     * user-customized string.
     * </p>
     * 
     * @param modelId
     *        For models created in SageMaker, this is the model ARN. For models created outside of SageMaker, this is a
     *        user-customized string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModelCard withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * A model card's risk rating. Can be low, medium, or high.
     * </p>
     * 
     * @param riskRating
     *        A model card's risk rating. Can be low, medium, or high.
     */

    public void setRiskRating(String riskRating) {
        this.riskRating = riskRating;
    }

    /**
     * <p>
     * A model card's risk rating. Can be low, medium, or high.
     * </p>
     * 
     * @return A model card's risk rating. Can be low, medium, or high.
     */

    public String getRiskRating() {
        return this.riskRating;
    }

    /**
     * <p>
     * A model card's risk rating. Can be low, medium, or high.
     * </p>
     * 
     * @param riskRating
     *        A model card's risk rating. Can be low, medium, or high.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardModelCard withRiskRating(String riskRating) {
        setRiskRating(riskRating);
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
        if (getModelCardArn() != null)
            sb.append("ModelCardArn: ").append(getModelCardArn()).append(",");
        if (getModelCardName() != null)
            sb.append("ModelCardName: ").append(getModelCardName()).append(",");
        if (getModelCardVersion() != null)
            sb.append("ModelCardVersion: ").append(getModelCardVersion()).append(",");
        if (getModelCardStatus() != null)
            sb.append("ModelCardStatus: ").append(getModelCardStatus()).append(",");
        if (getSecurityConfig() != null)
            sb.append("SecurityConfig: ").append(getSecurityConfig()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId()).append(",");
        if (getRiskRating() != null)
            sb.append("RiskRating: ").append(getRiskRating());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelDashboardModelCard == false)
            return false;
        ModelDashboardModelCard other = (ModelDashboardModelCard) obj;
        if (other.getModelCardArn() == null ^ this.getModelCardArn() == null)
            return false;
        if (other.getModelCardArn() != null && other.getModelCardArn().equals(this.getModelCardArn()) == false)
            return false;
        if (other.getModelCardName() == null ^ this.getModelCardName() == null)
            return false;
        if (other.getModelCardName() != null && other.getModelCardName().equals(this.getModelCardName()) == false)
            return false;
        if (other.getModelCardVersion() == null ^ this.getModelCardVersion() == null)
            return false;
        if (other.getModelCardVersion() != null && other.getModelCardVersion().equals(this.getModelCardVersion()) == false)
            return false;
        if (other.getModelCardStatus() == null ^ this.getModelCardStatus() == null)
            return false;
        if (other.getModelCardStatus() != null && other.getModelCardStatus().equals(this.getModelCardStatus()) == false)
            return false;
        if (other.getSecurityConfig() == null ^ this.getSecurityConfig() == null)
            return false;
        if (other.getSecurityConfig() != null && other.getSecurityConfig().equals(this.getSecurityConfig()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getRiskRating() == null ^ this.getRiskRating() == null)
            return false;
        if (other.getRiskRating() != null && other.getRiskRating().equals(this.getRiskRating()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelCardArn() == null) ? 0 : getModelCardArn().hashCode());
        hashCode = prime * hashCode + ((getModelCardName() == null) ? 0 : getModelCardName().hashCode());
        hashCode = prime * hashCode + ((getModelCardVersion() == null) ? 0 : getModelCardVersion().hashCode());
        hashCode = prime * hashCode + ((getModelCardStatus() == null) ? 0 : getModelCardStatus().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfig() == null) ? 0 : getSecurityConfig().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getRiskRating() == null) ? 0 : getRiskRating().hashCode());
        return hashCode;
    }

    @Override
    public ModelDashboardModelCard clone() {
        try {
            return (ModelDashboardModelCard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelDashboardModelCardMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
