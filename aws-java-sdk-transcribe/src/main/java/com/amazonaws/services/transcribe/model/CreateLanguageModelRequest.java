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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateLanguageModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLanguageModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language of the input text you're using to train your custom language model.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to create your custom language model.
     * </p>
     * <p>
     * If you want to use your custom language model to transcribe audio with a sample rate of 16 kHz or greater, choose
     * <code>Wideband</code>.
     * </p>
     * <p>
     * If you want to use your custom language model to transcribe audio with a sample rate that is less than 16 kHz,
     * choose <code>Narrowband</code>.
     * </p>
     */
    private String baseModelName;
    /**
     * <p>
     * The name you choose for your custom language model when you create it.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * Contains the data access role and the Amazon S3 prefixes to read the required input files to create a custom
     * language model.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    /**
     * <p>
     * The language of the input text you're using to train your custom language model.
     * </p>
     * 
     * @param languageCode
     *        The language of the input text you're using to train your custom language model.
     * @see CLMLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input text you're using to train your custom language model.
     * </p>
     * 
     * @return The language of the input text you're using to train your custom language model.
     * @see CLMLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language of the input text you're using to train your custom language model.
     * </p>
     * 
     * @param languageCode
     *        The language of the input text you're using to train your custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CLMLanguageCode
     */

    public CreateLanguageModelRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language of the input text you're using to train your custom language model.
     * </p>
     * 
     * @param languageCode
     *        The language of the input text you're using to train your custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CLMLanguageCode
     */

    public CreateLanguageModelRequest withLanguageCode(CLMLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to create your custom language model.
     * </p>
     * <p>
     * If you want to use your custom language model to transcribe audio with a sample rate of 16 kHz or greater, choose
     * <code>Wideband</code>.
     * </p>
     * <p>
     * If you want to use your custom language model to transcribe audio with a sample rate that is less than 16 kHz,
     * choose <code>Narrowband</code>.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model used to create your custom language
     *        model.</p>
     *        <p>
     *        If you want to use your custom language model to transcribe audio with a sample rate of 16 kHz or greater,
     *        choose <code>Wideband</code>.
     *        </p>
     *        <p>
     *        If you want to use your custom language model to transcribe audio with a sample rate that is less than 16
     *        kHz, choose <code>Narrowband</code>.
     * @see BaseModelName
     */

    public void setBaseModelName(String baseModelName) {
        this.baseModelName = baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to create your custom language model.
     * </p>
     * <p>
     * If you want to use your custom language model to transcribe audio with a sample rate of 16 kHz or greater, choose
     * <code>Wideband</code>.
     * </p>
     * <p>
     * If you want to use your custom language model to transcribe audio with a sample rate that is less than 16 kHz,
     * choose <code>Narrowband</code>.
     * </p>
     * 
     * @return The Amazon Transcribe standard language model, or base model used to create your custom language
     *         model.</p>
     *         <p>
     *         If you want to use your custom language model to transcribe audio with a sample rate of 16 kHz or
     *         greater, choose <code>Wideband</code>.
     *         </p>
     *         <p>
     *         If you want to use your custom language model to transcribe audio with a sample rate that is less than 16
     *         kHz, choose <code>Narrowband</code>.
     * @see BaseModelName
     */

    public String getBaseModelName() {
        return this.baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to create your custom language model.
     * </p>
     * <p>
     * If you want to use your custom language model to transcribe audio with a sample rate of 16 kHz or greater, choose
     * <code>Wideband</code>.
     * </p>
     * <p>
     * If you want to use your custom language model to transcribe audio with a sample rate that is less than 16 kHz,
     * choose <code>Narrowband</code>.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model used to create your custom language
     *        model.</p>
     *        <p>
     *        If you want to use your custom language model to transcribe audio with a sample rate of 16 kHz or greater,
     *        choose <code>Wideband</code>.
     *        </p>
     *        <p>
     *        If you want to use your custom language model to transcribe audio with a sample rate that is less than 16
     *        kHz, choose <code>Narrowband</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaseModelName
     */

    public CreateLanguageModelRequest withBaseModelName(String baseModelName) {
        setBaseModelName(baseModelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to create your custom language model.
     * </p>
     * <p>
     * If you want to use your custom language model to transcribe audio with a sample rate of 16 kHz or greater, choose
     * <code>Wideband</code>.
     * </p>
     * <p>
     * If you want to use your custom language model to transcribe audio with a sample rate that is less than 16 kHz,
     * choose <code>Narrowband</code>.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model used to create your custom language
     *        model.</p>
     *        <p>
     *        If you want to use your custom language model to transcribe audio with a sample rate of 16 kHz or greater,
     *        choose <code>Wideband</code>.
     *        </p>
     *        <p>
     *        If you want to use your custom language model to transcribe audio with a sample rate that is less than 16
     *        kHz, choose <code>Narrowband</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaseModelName
     */

    public CreateLanguageModelRequest withBaseModelName(BaseModelName baseModelName) {
        this.baseModelName = baseModelName.toString();
        return this;
    }

    /**
     * <p>
     * The name you choose for your custom language model when you create it.
     * </p>
     * 
     * @param modelName
     *        The name you choose for your custom language model when you create it.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name you choose for your custom language model when you create it.
     * </p>
     * 
     * @return The name you choose for your custom language model when you create it.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name you choose for your custom language model when you create it.
     * </p>
     * 
     * @param modelName
     *        The name you choose for your custom language model when you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLanguageModelRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * Contains the data access role and the Amazon S3 prefixes to read the required input files to create a custom
     * language model.
     * </p>
     * 
     * @param inputDataConfig
     *        Contains the data access role and the Amazon S3 prefixes to read the required input files to create a
     *        custom language model.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Contains the data access role and the Amazon S3 prefixes to read the required input files to create a custom
     * language model.
     * </p>
     * 
     * @return Contains the data access role and the Amazon S3 prefixes to read the required input files to create a
     *         custom language model.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * Contains the data access role and the Amazon S3 prefixes to read the required input files to create a custom
     * language model.
     * </p>
     * 
     * @param inputDataConfig
     *        Contains the data access role and the Amazon S3 prefixes to read the required input files to create a
     *        custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLanguageModelRequest withInputDataConfig(InputDataConfig inputDataConfig) {
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getBaseModelName() != null)
            sb.append("BaseModelName: ").append(getBaseModelName()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
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

        if (obj instanceof CreateLanguageModelRequest == false)
            return false;
        CreateLanguageModelRequest other = (CreateLanguageModelRequest) obj;
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
        return hashCode;
    }

    @Override
    public CreateLanguageModelRequest clone() {
        return (CreateLanguageModelRequest) super.clone();
    }

}
