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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateDefaultVocabulary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateDefaultVocabularyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The identifier of the custom vocabulary. If this is empty, the default is set to none.
     * </p>
     */
    private String vocabularyId;

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

    public AssociateDefaultVocabularyRequest withInstanceId(String instanceId) {
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

    public AssociateDefaultVocabularyRequest withLanguageCode(String languageCode) {
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

    public AssociateDefaultVocabularyRequest withLanguageCode(VocabularyLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary. If this is empty, the default is set to none.
     * </p>
     * 
     * @param vocabularyId
     *        The identifier of the custom vocabulary. If this is empty, the default is set to none.
     */

    public void setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary. If this is empty, the default is set to none.
     * </p>
     * 
     * @return The identifier of the custom vocabulary. If this is empty, the default is set to none.
     */

    public String getVocabularyId() {
        return this.vocabularyId;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary. If this is empty, the default is set to none.
     * </p>
     * 
     * @param vocabularyId
     *        The identifier of the custom vocabulary. If this is empty, the default is set to none.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDefaultVocabularyRequest withVocabularyId(String vocabularyId) {
        setVocabularyId(vocabularyId);
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
            sb.append("VocabularyId: ").append(getVocabularyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateDefaultVocabularyRequest == false)
            return false;
        AssociateDefaultVocabularyRequest other = (AssociateDefaultVocabularyRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getVocabularyId() == null) ? 0 : getVocabularyId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateDefaultVocabularyRequest clone() {
        return (AssociateDefaultVocabularyRequest) super.clone();
    }

}
