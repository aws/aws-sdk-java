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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateLanguageModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLanguageModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The language code of the text you've used to create a custom language model.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model you've used to create a custom language model.
     * </p>
     */
    private String baseModelName;
    /**
     * <p>
     * The name you've chosen for your custom language model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The data access role and Amazon S3 prefixes you've chosen to create your custom language model.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * The status of the custom language model. When the status is <code>COMPLETED</code> the model is ready to use.
     * </p>
     */
    private String modelStatus;

    /**
     * <p>
     * The language code of the text you've used to create a custom language model.
     * </p>
     * 
     * @param languageCode
     *        The language code of the text you've used to create a custom language model.
     * @see CLMLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the text you've used to create a custom language model.
     * </p>
     * 
     * @return The language code of the text you've used to create a custom language model.
     * @see CLMLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code of the text you've used to create a custom language model.
     * </p>
     * 
     * @param languageCode
     *        The language code of the text you've used to create a custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CLMLanguageCode
     */

    public CreateLanguageModelResult withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the text you've used to create a custom language model.
     * </p>
     * 
     * @param languageCode
     *        The language code of the text you've used to create a custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CLMLanguageCode
     */

    public CreateLanguageModelResult withLanguageCode(CLMLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model you've used to create a custom language model.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model you've used to create a custom language
     *        model.
     * @see BaseModelName
     */

    public void setBaseModelName(String baseModelName) {
        this.baseModelName = baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model you've used to create a custom language model.
     * </p>
     * 
     * @return The Amazon Transcribe standard language model, or base model you've used to create a custom language
     *         model.
     * @see BaseModelName
     */

    public String getBaseModelName() {
        return this.baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model you've used to create a custom language model.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model you've used to create a custom language
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaseModelName
     */

    public CreateLanguageModelResult withBaseModelName(String baseModelName) {
        setBaseModelName(baseModelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model you've used to create a custom language model.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model you've used to create a custom language
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaseModelName
     */

    public CreateLanguageModelResult withBaseModelName(BaseModelName baseModelName) {
        this.baseModelName = baseModelName.toString();
        return this;
    }

    /**
     * <p>
     * The name you've chosen for your custom language model.
     * </p>
     * 
     * @param modelName
     *        The name you've chosen for your custom language model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name you've chosen for your custom language model.
     * </p>
     * 
     * @return The name you've chosen for your custom language model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name you've chosen for your custom language model.
     * </p>
     * 
     * @param modelName
     *        The name you've chosen for your custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLanguageModelResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The data access role and Amazon S3 prefixes you've chosen to create your custom language model.
     * </p>
     * 
     * @param inputDataConfig
     *        The data access role and Amazon S3 prefixes you've chosen to create your custom language model.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The data access role and Amazon S3 prefixes you've chosen to create your custom language model.
     * </p>
     * 
     * @return The data access role and Amazon S3 prefixes you've chosen to create your custom language model.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The data access role and Amazon S3 prefixes you've chosen to create your custom language model.
     * </p>
     * 
     * @param inputDataConfig
     *        The data access role and Amazon S3 prefixes you've chosen to create your custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLanguageModelResult withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The status of the custom language model. When the status is <code>COMPLETED</code> the model is ready to use.
     * </p>
     * 
     * @param modelStatus
     *        The status of the custom language model. When the status is <code>COMPLETED</code> the model is ready to
     *        use.
     * @see ModelStatus
     */

    public void setModelStatus(String modelStatus) {
        this.modelStatus = modelStatus;
    }

    /**
     * <p>
     * The status of the custom language model. When the status is <code>COMPLETED</code> the model is ready to use.
     * </p>
     * 
     * @return The status of the custom language model. When the status is <code>COMPLETED</code> the model is ready to
     *         use.
     * @see ModelStatus
     */

    public String getModelStatus() {
        return this.modelStatus;
    }

    /**
     * <p>
     * The status of the custom language model. When the status is <code>COMPLETED</code> the model is ready to use.
     * </p>
     * 
     * @param modelStatus
     *        The status of the custom language model. When the status is <code>COMPLETED</code> the model is ready to
     *        use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public CreateLanguageModelResult withModelStatus(String modelStatus) {
        setModelStatus(modelStatus);
        return this;
    }

    /**
     * <p>
     * The status of the custom language model. When the status is <code>COMPLETED</code> the model is ready to use.
     * </p>
     * 
     * @param modelStatus
     *        The status of the custom language model. When the status is <code>COMPLETED</code> the model is ready to
     *        use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public CreateLanguageModelResult withModelStatus(ModelStatus modelStatus) {
        this.modelStatus = modelStatus.toString();
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getBaseModelName() != null)
            sb.append("BaseModelName: ").append(getBaseModelName()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getModelStatus() != null)
            sb.append("ModelStatus: ").append(getModelStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLanguageModelResult == false)
            return false;
        CreateLanguageModelResult other = (CreateLanguageModelResult) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getBaseModelName() == null ^ this.getBaseModelName() == null)
            return false;
        if (other.getBaseModelName() != null && other.getBaseModelName().equals(this.getBaseModelName()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getModelStatus() == null ^ this.getModelStatus() == null)
            return false;
        if (other.getModelStatus() != null && other.getModelStatus().equals(this.getModelStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getBaseModelName() == null) ? 0 : getBaseModelName().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getModelStatus() == null) ? 0 : getModelStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateLanguageModelResult clone() {
        try {
            return (CreateLanguageModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
