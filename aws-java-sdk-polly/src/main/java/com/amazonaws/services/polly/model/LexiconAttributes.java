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
package com.amazonaws.services.polly.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata describing the lexicon such as the number of lexemes, language code, and so on. For more
 * information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing Lexicons</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/LexiconAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LexiconAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Phonetic alphabet used in the lexicon. Valid values are <code>ipa</code> and <code>x-sampa</code>.
     * </p>
     */
    private String alphabet;
    /**
     * <p>
     * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all
     * English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Date lexicon was last modified (a timestamp value).
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the lexicon.
     * </p>
     */
    private String lexiconArn;
    /**
     * <p>
     * Number of lexemes in the lexicon.
     * </p>
     */
    private Integer lexemesCount;
    /**
     * <p>
     * Total size of the lexicon, in characters.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * Phonetic alphabet used in the lexicon. Valid values are <code>ipa</code> and <code>x-sampa</code>.
     * </p>
     * 
     * @param alphabet
     *        Phonetic alphabet used in the lexicon. Valid values are <code>ipa</code> and <code>x-sampa</code>.
     */

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    /**
     * <p>
     * Phonetic alphabet used in the lexicon. Valid values are <code>ipa</code> and <code>x-sampa</code>.
     * </p>
     * 
     * @return Phonetic alphabet used in the lexicon. Valid values are <code>ipa</code> and <code>x-sampa</code>.
     */

    public String getAlphabet() {
        return this.alphabet;
    }

    /**
     * <p>
     * Phonetic alphabet used in the lexicon. Valid values are <code>ipa</code> and <code>x-sampa</code>.
     * </p>
     * 
     * @param alphabet
     *        Phonetic alphabet used in the lexicon. Valid values are <code>ipa</code> and <code>x-sampa</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexiconAttributes withAlphabet(String alphabet) {
        setAlphabet(alphabet);
        return this;
    }

    /**
     * <p>
     * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all
     * English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     * </p>
     * 
     * @param languageCode
     *        Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to
     *        all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all
     * English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     * </p>
     * 
     * @return Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied
     *         to all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all
     * English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     * </p>
     * 
     * @param languageCode
     *        Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to
     *        all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public LexiconAttributes withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all
     * English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     * </p>
     * 
     * @param languageCode
     *        Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to
     *        all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     * @see LanguageCode
     */

    public void setLanguageCode(LanguageCode languageCode) {
        withLanguageCode(languageCode);
    }

    /**
     * <p>
     * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all
     * English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     * </p>
     * 
     * @param languageCode
     *        Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to
     *        all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public LexiconAttributes withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Date lexicon was last modified (a timestamp value).
     * </p>
     * 
     * @param lastModified
     *        Date lexicon was last modified (a timestamp value).
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * Date lexicon was last modified (a timestamp value).
     * </p>
     * 
     * @return Date lexicon was last modified (a timestamp value).
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * Date lexicon was last modified (a timestamp value).
     * </p>
     * 
     * @param lastModified
     *        Date lexicon was last modified (a timestamp value).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexiconAttributes withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the lexicon.
     * </p>
     * 
     * @param lexiconArn
     *        Amazon Resource Name (ARN) of the lexicon.
     */

    public void setLexiconArn(String lexiconArn) {
        this.lexiconArn = lexiconArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the lexicon.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the lexicon.
     */

    public String getLexiconArn() {
        return this.lexiconArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the lexicon.
     * </p>
     * 
     * @param lexiconArn
     *        Amazon Resource Name (ARN) of the lexicon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexiconAttributes withLexiconArn(String lexiconArn) {
        setLexiconArn(lexiconArn);
        return this;
    }

    /**
     * <p>
     * Number of lexemes in the lexicon.
     * </p>
     * 
     * @param lexemesCount
     *        Number of lexemes in the lexicon.
     */

    public void setLexemesCount(Integer lexemesCount) {
        this.lexemesCount = lexemesCount;
    }

    /**
     * <p>
     * Number of lexemes in the lexicon.
     * </p>
     * 
     * @return Number of lexemes in the lexicon.
     */

    public Integer getLexemesCount() {
        return this.lexemesCount;
    }

    /**
     * <p>
     * Number of lexemes in the lexicon.
     * </p>
     * 
     * @param lexemesCount
     *        Number of lexemes in the lexicon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexiconAttributes withLexemesCount(Integer lexemesCount) {
        setLexemesCount(lexemesCount);
        return this;
    }

    /**
     * <p>
     * Total size of the lexicon, in characters.
     * </p>
     * 
     * @param size
     *        Total size of the lexicon, in characters.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * Total size of the lexicon, in characters.
     * </p>
     * 
     * @return Total size of the lexicon, in characters.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * Total size of the lexicon, in characters.
     * </p>
     * 
     * @param size
     *        Total size of the lexicon, in characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexiconAttributes withSize(Integer size) {
        setSize(size);
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
        if (getAlphabet() != null)
            sb.append("Alphabet: ").append(getAlphabet()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getLexiconArn() != null)
            sb.append("LexiconArn: ").append(getLexiconArn()).append(",");
        if (getLexemesCount() != null)
            sb.append("LexemesCount: ").append(getLexemesCount()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LexiconAttributes == false)
            return false;
        LexiconAttributes other = (LexiconAttributes) obj;
        if (other.getAlphabet() == null ^ this.getAlphabet() == null)
            return false;
        if (other.getAlphabet() != null && other.getAlphabet().equals(this.getAlphabet()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getLexiconArn() == null ^ this.getLexiconArn() == null)
            return false;
        if (other.getLexiconArn() != null && other.getLexiconArn().equals(this.getLexiconArn()) == false)
            return false;
        if (other.getLexemesCount() == null ^ this.getLexemesCount() == null)
            return false;
        if (other.getLexemesCount() != null && other.getLexemesCount().equals(this.getLexemesCount()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlphabet() == null) ? 0 : getAlphabet().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getLexiconArn() == null) ? 0 : getLexiconArn().hashCode());
        hashCode = prime * hashCode + ((getLexemesCount() == null) ? 0 : getLexemesCount().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public LexiconAttributes clone() {
        try {
            return (LexiconAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.polly.model.transform.LexiconAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
