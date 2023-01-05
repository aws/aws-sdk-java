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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a default vocabulary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DefaultVocabulary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultVocabulary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     */
    private String vocabularyId;
    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     */
    private String vocabularyName;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultVocabulary withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries. For a list of languages and their corresponding language
     *        codes, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is
     *        Amazon Transcribe?</a>
     * @see VocabularyLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     * 
     * @return The language code of the vocabulary entries. For a list of languages and their corresponding language
     *         codes, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is
     *         Amazon Transcribe?</a>
     * @see VocabularyLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries. For a list of languages and their corresponding language
     *        codes, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is
     *        Amazon Transcribe?</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyLanguageCode
     */

    public DefaultVocabulary withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries. For a list of languages and their corresponding language
     *        codes, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is
     *        Amazon Transcribe?</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyLanguageCode
     */

    public DefaultVocabulary withLanguageCode(VocabularyLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * 
     * @param vocabularyId
     *        The identifier of the custom vocabulary.
     */

    public void setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * 
     * @return The identifier of the custom vocabulary.
     */

    public String getVocabularyId() {
        return this.vocabularyId;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * 
     * @param vocabularyId
     *        The identifier of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultVocabulary withVocabularyId(String vocabularyId) {
        setVocabularyId(vocabularyId);
        return this;
    }

    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     * 
     * @param vocabularyName
     *        A unique name of the custom vocabulary.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     * 
     * @return A unique name of the custom vocabulary.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     * 
     * @param vocabularyName
     *        A unique name of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultVocabulary withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getVocabularyId() != null)
            sb.append("VocabularyId: ").append(getVocabularyId()).append(",");
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultVocabulary == false)
            return false;
        DefaultVocabulary other = (DefaultVocabulary) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getVocabularyId() == null ^ this.getVocabularyId() == null)
            return false;
        if (other.getVocabularyId() != null && other.getVocabularyId().equals(this.getVocabularyId()) == false)
            return false;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getVocabularyId() == null) ? 0 : getVocabularyId().hashCode());
        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        return hashCode;
    }

    @Override
    public DefaultVocabulary clone() {
        try {
            return (DefaultVocabulary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.DefaultVocabularyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
