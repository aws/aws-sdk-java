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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure used to describe a custom language model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/LanguageModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LanguageModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the custom language model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The time the custom language model was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The most recent time the custom language model was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The language code you used to create your custom language model.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to create the custom language model.
     * </p>
     */
    private String baseModelName;
    /**
     * <p>
     * The creation status of a custom language model. When the status is <code>COMPLETED</code> the model is ready for
     * use.
     * </p>
     */
    private String modelStatus;
    /**
     * <p>
     * Whether the base model used for the custom language model is up to date. If this field is <code>true</code> then
     * you are running the most up-to-date version of the base model in your custom language model.
     * </p>
     */
    private Boolean upgradeAvailability;
    /**
     * <p>
     * The reason why the custom language model couldn't be created.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The data access role and Amazon S3 prefixes for the input files used to train the custom language model.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    /**
     * <p>
     * The name of the custom language model.
     * </p>
     * 
     * @param modelName
     *        The name of the custom language model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the custom language model.
     * </p>
     * 
     * @return The name of the custom language model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the custom language model.
     * </p>
     * 
     * @param modelName
     *        The name of the custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageModel withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The time the custom language model was created.
     * </p>
     * 
     * @param createTime
     *        The time the custom language model was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time the custom language model was created.
     * </p>
     * 
     * @return The time the custom language model was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time the custom language model was created.
     * </p>
     * 
     * @param createTime
     *        The time the custom language model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageModel withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The most recent time the custom language model was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time the custom language model was modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time the custom language model was modified.
     * </p>
     * 
     * @return The most recent time the custom language model was modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time the custom language model was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time the custom language model was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageModel withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The language code you used to create your custom language model.
     * </p>
     * 
     * @param languageCode
     *        The language code you used to create your custom language model.
     * @see CLMLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code you used to create your custom language model.
     * </p>
     * 
     * @return The language code you used to create your custom language model.
     * @see CLMLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code you used to create your custom language model.
     * </p>
     * 
     * @param languageCode
     *        The language code you used to create your custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CLMLanguageCode
     */

    public LanguageModel withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code you used to create your custom language model.
     * </p>
     * 
     * @param languageCode
     *        The language code you used to create your custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CLMLanguageCode
     */

    public LanguageModel withLanguageCode(CLMLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to create the custom language model.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model used to create the custom language model.
     * @see BaseModelName
     */

    public void setBaseModelName(String baseModelName) {
        this.baseModelName = baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to create the custom language model.
     * </p>
     * 
     * @return The Amazon Transcribe standard language model, or base model used to create the custom language model.
     * @see BaseModelName
     */

    public String getBaseModelName() {
        return this.baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to create the custom language model.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model used to create the custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaseModelName
     */

    public LanguageModel withBaseModelName(String baseModelName) {
        setBaseModelName(baseModelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to create the custom language model.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model used to create the custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaseModelName
     */

    public LanguageModel withBaseModelName(BaseModelName baseModelName) {
        this.baseModelName = baseModelName.toString();
        return this;
    }

    /**
     * <p>
     * The creation status of a custom language model. When the status is <code>COMPLETED</code> the model is ready for
     * use.
     * </p>
     * 
     * @param modelStatus
     *        The creation status of a custom language model. When the status is <code>COMPLETED</code> the model is
     *        ready for use.
     * @see ModelStatus
     */

    public void setModelStatus(String modelStatus) {
        this.modelStatus = modelStatus;
    }

    /**
     * <p>
     * The creation status of a custom language model. When the status is <code>COMPLETED</code> the model is ready for
     * use.
     * </p>
     * 
     * @return The creation status of a custom language model. When the status is <code>COMPLETED</code> the model is
     *         ready for use.
     * @see ModelStatus
     */

    public String getModelStatus() {
        return this.modelStatus;
    }

    /**
     * <p>
     * The creation status of a custom language model. When the status is <code>COMPLETED</code> the model is ready for
     * use.
     * </p>
     * 
     * @param modelStatus
     *        The creation status of a custom language model. When the status is <code>COMPLETED</code> the model is
     *        ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public LanguageModel withModelStatus(String modelStatus) {
        setModelStatus(modelStatus);
        return this;
    }

    /**
     * <p>
     * The creation status of a custom language model. When the status is <code>COMPLETED</code> the model is ready for
     * use.
     * </p>
     * 
     * @param modelStatus
     *        The creation status of a custom language model. When the status is <code>COMPLETED</code> the model is
     *        ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public LanguageModel withModelStatus(ModelStatus modelStatus) {
        this.modelStatus = modelStatus.toString();
        return this;
    }

    /**
     * <p>
     * Whether the base model used for the custom language model is up to date. If this field is <code>true</code> then
     * you are running the most up-to-date version of the base model in your custom language model.
     * </p>
     * 
     * @param upgradeAvailability
     *        Whether the base model used for the custom language model is up to date. If this field is
     *        <code>true</code> then you are running the most up-to-date version of the base model in your custom
     *        language model.
     */

    public void setUpgradeAvailability(Boolean upgradeAvailability) {
        this.upgradeAvailability = upgradeAvailability;
    }

    /**
     * <p>
     * Whether the base model used for the custom language model is up to date. If this field is <code>true</code> then
     * you are running the most up-to-date version of the base model in your custom language model.
     * </p>
     * 
     * @return Whether the base model used for the custom language model is up to date. If this field is
     *         <code>true</code> then you are running the most up-to-date version of the base model in your custom
     *         language model.
     */

    public Boolean getUpgradeAvailability() {
        return this.upgradeAvailability;
    }

    /**
     * <p>
     * Whether the base model used for the custom language model is up to date. If this field is <code>true</code> then
     * you are running the most up-to-date version of the base model in your custom language model.
     * </p>
     * 
     * @param upgradeAvailability
     *        Whether the base model used for the custom language model is up to date. If this field is
     *        <code>true</code> then you are running the most up-to-date version of the base model in your custom
     *        language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageModel withUpgradeAvailability(Boolean upgradeAvailability) {
        setUpgradeAvailability(upgradeAvailability);
        return this;
    }

    /**
     * <p>
     * Whether the base model used for the custom language model is up to date. If this field is <code>true</code> then
     * you are running the most up-to-date version of the base model in your custom language model.
     * </p>
     * 
     * @return Whether the base model used for the custom language model is up to date. If this field is
     *         <code>true</code> then you are running the most up-to-date version of the base model in your custom
     *         language model.
     */

    public Boolean isUpgradeAvailability() {
        return this.upgradeAvailability;
    }

    /**
     * <p>
     * The reason why the custom language model couldn't be created.
     * </p>
     * 
     * @param failureReason
     *        The reason why the custom language model couldn't be created.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why the custom language model couldn't be created.
     * </p>
     * 
     * @return The reason why the custom language model couldn't be created.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason why the custom language model couldn't be created.
     * </p>
     * 
     * @param failureReason
     *        The reason why the custom language model couldn't be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageModel withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The data access role and Amazon S3 prefixes for the input files used to train the custom language model.
     * </p>
     * 
     * @param inputDataConfig
     *        The data access role and Amazon S3 prefixes for the input files used to train the custom language model.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The data access role and Amazon S3 prefixes for the input files used to train the custom language model.
     * </p>
     * 
     * @return The data access role and Amazon S3 prefixes for the input files used to train the custom language model.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The data access role and Amazon S3 prefixes for the input files used to train the custom language model.
     * </p>
     * 
     * @param inputDataConfig
     *        The data access role and Amazon S3 prefixes for the input files used to train the custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageModel withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getBaseModelName() != null)
            sb.append("BaseModelName: ").append(getBaseModelName()).append(",");
        if (getModelStatus() != null)
            sb.append("ModelStatus: ").append(getModelStatus()).append(",");
        if (getUpgradeAvailability() != null)
            sb.append("UpgradeAvailability: ").append(getUpgradeAvailability()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LanguageModel == false)
            return false;
        LanguageModel other = (LanguageModel) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getBaseModelName() == null ^ this.getBaseModelName() == null)
            return false;
        if (other.getBaseModelName() != null && other.getBaseModelName().equals(this.getBaseModelName()) == false)
            return false;
        if (other.getModelStatus() == null ^ this.getModelStatus() == null)
            return false;
        if (other.getModelStatus() != null && other.getModelStatus().equals(this.getModelStatus()) == false)
            return false;
        if (other.getUpgradeAvailability() == null ^ this.getUpgradeAvailability() == null)
            return false;
        if (other.getUpgradeAvailability() != null && other.getUpgradeAvailability().equals(this.getUpgradeAvailability()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getBaseModelName() == null) ? 0 : getBaseModelName().hashCode());
        hashCode = prime * hashCode + ((getModelStatus() == null) ? 0 : getModelStatus().hashCode());
        hashCode = prime * hashCode + ((getUpgradeAvailability() == null) ? 0 : getUpgradeAvailability().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        return hashCode;
    }

    @Override
    public LanguageModel clone() {
        try {
            return (LanguageModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.LanguageModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
