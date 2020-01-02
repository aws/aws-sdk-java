/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about a vocabulary filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/VocabularyFilterInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VocabularyFilterInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the vocabulary filter. The name must be unique in the account that holds the filter.
     * </p>
     */
    private String vocabularyFilterName;
    /**
     * <p>
     * The language code of the words in the vocabulary filter.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The date and time that the vocabulary was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of the vocabulary filter. The name must be unique in the account that holds the filter.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter. The name must be unique in the account that holds the filter.
     */

    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter. The name must be unique in the account that holds the filter.
     * </p>
     * 
     * @return The name of the vocabulary filter. The name must be unique in the account that holds the filter.
     */

    public String getVocabularyFilterName() {
        return this.vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter. The name must be unique in the account that holds the filter.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter. The name must be unique in the account that holds the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VocabularyFilterInfo withVocabularyFilterName(String vocabularyFilterName) {
        setVocabularyFilterName(vocabularyFilterName);
        return this;
    }

    /**
     * <p>
     * The language code of the words in the vocabulary filter.
     * </p>
     * 
     * @param languageCode
     *        The language code of the words in the vocabulary filter.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the words in the vocabulary filter.
     * </p>
     * 
     * @return The language code of the words in the vocabulary filter.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code of the words in the vocabulary filter.
     * </p>
     * 
     * @param languageCode
     *        The language code of the words in the vocabulary filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public VocabularyFilterInfo withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the words in the vocabulary filter.
     * </p>
     * 
     * @param languageCode
     *        The language code of the words in the vocabulary filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public VocabularyFilterInfo withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the vocabulary was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last updated.
     * </p>
     * 
     * @return The date and time that the vocabulary was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the vocabulary was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VocabularyFilterInfo withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: ").append(getVocabularyFilterName()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VocabularyFilterInfo == false)
            return false;
        VocabularyFilterInfo other = (VocabularyFilterInfo) obj;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public VocabularyFilterInfo clone() {
        try {
            return (VocabularyFilterInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.VocabularyFilterInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
