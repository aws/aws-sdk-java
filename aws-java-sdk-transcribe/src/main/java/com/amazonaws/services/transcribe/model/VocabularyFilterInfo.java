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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a custom vocabulary filter, including the language of the filter, when it was last
 * modified, and its name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/VocabularyFilterInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VocabularyFilterInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique name, chosen by you, for your custom vocabulary filter. This name is case sensitive, cannot contain
     * spaces, and must be unique within an Amazon Web Services account.
     * </p>
     */
    private String vocabularyFilterName;
    /**
     * <p>
     * The language code that represents the language of the entries in your vocabulary filter. Each custom vocabulary
     * filter must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For example,
     * if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The date and time the specified custom vocabulary filter was last modified.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * A unique name, chosen by you, for your custom vocabulary filter. This name is case sensitive, cannot contain
     * spaces, and must be unique within an Amazon Web Services account.
     * </p>
     * 
     * @param vocabularyFilterName
     *        A unique name, chosen by you, for your custom vocabulary filter. This name is case sensitive, cannot
     *        contain spaces, and must be unique within an Amazon Web Services account.
     */

    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your custom vocabulary filter. This name is case sensitive, cannot contain
     * spaces, and must be unique within an Amazon Web Services account.
     * </p>
     * 
     * @return A unique name, chosen by you, for your custom vocabulary filter. This name is case sensitive, cannot
     *         contain spaces, and must be unique within an Amazon Web Services account.
     */

    public String getVocabularyFilterName() {
        return this.vocabularyFilterName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your custom vocabulary filter. This name is case sensitive, cannot contain
     * spaces, and must be unique within an Amazon Web Services account.
     * </p>
     * 
     * @param vocabularyFilterName
     *        A unique name, chosen by you, for your custom vocabulary filter. This name is case sensitive, cannot
     *        contain spaces, and must be unique within an Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VocabularyFilterInfo withVocabularyFilterName(String vocabularyFilterName) {
        setVocabularyFilterName(vocabularyFilterName);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your vocabulary filter. Each custom vocabulary
     * filter must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For example,
     * if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in your vocabulary filter. Each custom
     *        vocabulary filter must contain terms in only one language.</p>
     *        <p>
     *        A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For
     *        example, if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only
     *        apply this filter to files that contain English audio.
     *        </p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your vocabulary filter. Each custom vocabulary
     * filter must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For example,
     * if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * 
     * @return The language code that represents the language of the entries in your vocabulary filter. Each custom
     *         vocabulary filter must contain terms in only one language.</p>
     *         <p>
     *         A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For
     *         example, if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only
     *         apply this filter to files that contain English audio.
     *         </p>
     *         <p>
     *         For a list of supported languages and their associated language codes, refer to the <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *         table.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your vocabulary filter. Each custom vocabulary
     * filter must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For example,
     * if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in your vocabulary filter. Each custom
     *        vocabulary filter must contain terms in only one language.</p>
     *        <p>
     *        A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For
     *        example, if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only
     *        apply this filter to files that contain English audio.
     *        </p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public VocabularyFilterInfo withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your vocabulary filter. Each custom vocabulary
     * filter must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For example,
     * if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in your vocabulary filter. Each custom
     *        vocabulary filter must contain terms in only one language.</p>
     *        <p>
     *        A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For
     *        example, if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only
     *        apply this filter to files that contain English audio.
     *        </p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public VocabularyFilterInfo withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the specified custom vocabulary filter was last modified.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the specified custom vocabulary filter was last modified.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the specified custom vocabulary filter was last modified.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified custom vocabulary filter was last modified.</p>
     *         <p>
     *         Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the specified custom vocabulary filter was last modified.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the specified custom vocabulary filter was last modified.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
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
