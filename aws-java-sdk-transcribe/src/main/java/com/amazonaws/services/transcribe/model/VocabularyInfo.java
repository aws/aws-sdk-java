/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about a custom vocabulary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/VocabularyInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VocabularyInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the vocabulary.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The date and time that the vocabulary was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The processing state of the vocabulary. If the state is <code>READY</code> you can use the vocabulary in a
     * <code>StartTranscriptionJob</code> request.
     * </p>
     */
    private String vocabularyState;

    /**
     * <p>
     * The name of the vocabulary.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary.
     * </p>
     * 
     * @return The name of the vocabulary.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VocabularyInfo withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * 
     * @return The language code of the vocabulary entries.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public VocabularyInfo withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public VocabularyInfo withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the vocabulary was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last modified.
     * </p>
     * 
     * @return The date and time that the vocabulary was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the vocabulary was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VocabularyInfo withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The processing state of the vocabulary. If the state is <code>READY</code> you can use the vocabulary in a
     * <code>StartTranscriptionJob</code> request.
     * </p>
     * 
     * @param vocabularyState
     *        The processing state of the vocabulary. If the state is <code>READY</code> you can use the vocabulary in a
     *        <code>StartTranscriptionJob</code> request.
     * @see VocabularyState
     */

    public void setVocabularyState(String vocabularyState) {
        this.vocabularyState = vocabularyState;
    }

    /**
     * <p>
     * The processing state of the vocabulary. If the state is <code>READY</code> you can use the vocabulary in a
     * <code>StartTranscriptionJob</code> request.
     * </p>
     * 
     * @return The processing state of the vocabulary. If the state is <code>READY</code> you can use the vocabulary in
     *         a <code>StartTranscriptionJob</code> request.
     * @see VocabularyState
     */

    public String getVocabularyState() {
        return this.vocabularyState;
    }

    /**
     * <p>
     * The processing state of the vocabulary. If the state is <code>READY</code> you can use the vocabulary in a
     * <code>StartTranscriptionJob</code> request.
     * </p>
     * 
     * @param vocabularyState
     *        The processing state of the vocabulary. If the state is <code>READY</code> you can use the vocabulary in a
     *        <code>StartTranscriptionJob</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public VocabularyInfo withVocabularyState(String vocabularyState) {
        setVocabularyState(vocabularyState);
        return this;
    }

    /**
     * <p>
     * The processing state of the vocabulary. If the state is <code>READY</code> you can use the vocabulary in a
     * <code>StartTranscriptionJob</code> request.
     * </p>
     * 
     * @param vocabularyState
     *        The processing state of the vocabulary. If the state is <code>READY</code> you can use the vocabulary in a
     *        <code>StartTranscriptionJob</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public VocabularyInfo withVocabularyState(VocabularyState vocabularyState) {
        this.vocabularyState = vocabularyState.toString();
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
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getVocabularyState() != null)
            sb.append("VocabularyState: ").append(getVocabularyState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VocabularyInfo == false)
            return false;
        VocabularyInfo other = (VocabularyInfo) obj;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getVocabularyState() == null ^ this.getVocabularyState() == null)
            return false;
        if (other.getVocabularyState() != null && other.getVocabularyState().equals(this.getVocabularyState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getVocabularyState() == null) ? 0 : getVocabularyState().hashCode());
        return hashCode;
    }

    @Override
    public VocabularyInfo clone() {
        try {
            return (VocabularyInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.VocabularyInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
