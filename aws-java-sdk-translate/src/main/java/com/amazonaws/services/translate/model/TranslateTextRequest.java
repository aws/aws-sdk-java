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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TranslateText" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranslateTextRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The text to translate. The text string can be a maximum of 5,000 bytes long. Depending on your character set,
     * this may be fewer than 5,000 characters.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The TerminologyNames list that is taken as input to the TranslateText request. This has a minimum length of 0 and
     * a maximum length of 1.
     * </p>
     */
    private java.util.List<String> terminologyNames;
    /**
     * <p>
     * The language code for the language of the source text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in the
     * <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call Amazon
     * Comprehend to determine the source language.
     * </p>
     */
    private String sourceLanguageCode;
    /**
     * <p>
     * The language code requested for the language of the target text. The language must be a language supported by
     * Amazon Translate.
     * </p>
     */
    private String targetLanguageCode;

    /**
     * <p>
     * The text to translate. The text string can be a maximum of 5,000 bytes long. Depending on your character set,
     * this may be fewer than 5,000 characters.
     * </p>
     * 
     * @param text
     *        The text to translate. The text string can be a maximum of 5,000 bytes long. Depending on your character
     *        set, this may be fewer than 5,000 characters.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text to translate. The text string can be a maximum of 5,000 bytes long. Depending on your character set,
     * this may be fewer than 5,000 characters.
     * </p>
     * 
     * @return The text to translate. The text string can be a maximum of 5,000 bytes long. Depending on your character
     *         set, this may be fewer than 5,000 characters.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text to translate. The text string can be a maximum of 5,000 bytes long. Depending on your character set,
     * this may be fewer than 5,000 characters.
     * </p>
     * 
     * @param text
     *        The text to translate. The text string can be a maximum of 5,000 bytes long. Depending on your character
     *        set, this may be fewer than 5,000 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextRequest withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The TerminologyNames list that is taken as input to the TranslateText request. This has a minimum length of 0 and
     * a maximum length of 1.
     * </p>
     * 
     * @return The TerminologyNames list that is taken as input to the TranslateText request. This has a minimum length
     *         of 0 and a maximum length of 1.
     */

    public java.util.List<String> getTerminologyNames() {
        return terminologyNames;
    }

    /**
     * <p>
     * The TerminologyNames list that is taken as input to the TranslateText request. This has a minimum length of 0 and
     * a maximum length of 1.
     * </p>
     * 
     * @param terminologyNames
     *        The TerminologyNames list that is taken as input to the TranslateText request. This has a minimum length
     *        of 0 and a maximum length of 1.
     */

    public void setTerminologyNames(java.util.Collection<String> terminologyNames) {
        if (terminologyNames == null) {
            this.terminologyNames = null;
            return;
        }

        this.terminologyNames = new java.util.ArrayList<String>(terminologyNames);
    }

    /**
     * <p>
     * The TerminologyNames list that is taken as input to the TranslateText request. This has a minimum length of 0 and
     * a maximum length of 1.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerminologyNames(java.util.Collection)} or {@link #withTerminologyNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param terminologyNames
     *        The TerminologyNames list that is taken as input to the TranslateText request. This has a minimum length
     *        of 0 and a maximum length of 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextRequest withTerminologyNames(String... terminologyNames) {
        if (this.terminologyNames == null) {
            setTerminologyNames(new java.util.ArrayList<String>(terminologyNames.length));
        }
        for (String ele : terminologyNames) {
            this.terminologyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The TerminologyNames list that is taken as input to the TranslateText request. This has a minimum length of 0 and
     * a maximum length of 1.
     * </p>
     * 
     * @param terminologyNames
     *        The TerminologyNames list that is taken as input to the TranslateText request. This has a minimum length
     *        of 0 and a maximum length of 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextRequest withTerminologyNames(java.util.Collection<String> terminologyNames) {
        setTerminologyNames(terminologyNames);
        return this;
    }

    /**
     * <p>
     * The language code for the language of the source text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in the
     * <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call Amazon
     * Comprehend to determine the source language.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code for the language of the source text. The language must be a language supported by Amazon
     *        Translate. </p>
     *        <p>
     *        To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in
     *        the <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call
     *        Amazon Comprehend to determine the source language.
     */

    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the source text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in the
     * <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call Amazon
     * Comprehend to determine the source language.
     * </p>
     * 
     * @return The language code for the language of the source text. The language must be a language supported by
     *         Amazon Translate. </p>
     *         <p>
     *         To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in
     *         the <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call
     *         Amazon Comprehend to determine the source language.
     */

    public String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the source text. The language must be a language supported by Amazon
     * Translate.
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in the
     * <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call Amazon
     * Comprehend to determine the source language.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code for the language of the source text. The language must be a language supported by Amazon
     *        Translate. </p>
     *        <p>
     *        To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in
     *        the <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call
     *        Amazon Comprehend to determine the source language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextRequest withSourceLanguageCode(String sourceLanguageCode) {
        setSourceLanguageCode(sourceLanguageCode);
        return this;
    }

    /**
     * <p>
     * The language code requested for the language of the target text. The language must be a language supported by
     * Amazon Translate.
     * </p>
     * 
     * @param targetLanguageCode
     *        The language code requested for the language of the target text. The language must be a language supported
     *        by Amazon Translate.
     */

    public void setTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * <p>
     * The language code requested for the language of the target text. The language must be a language supported by
     * Amazon Translate.
     * </p>
     * 
     * @return The language code requested for the language of the target text. The language must be a language
     *         supported by Amazon Translate.
     */

    public String getTargetLanguageCode() {
        return this.targetLanguageCode;
    }

    /**
     * <p>
     * The language code requested for the language of the target text. The language must be a language supported by
     * Amazon Translate.
     * </p>
     * 
     * @param targetLanguageCode
     *        The language code requested for the language of the target text. The language must be a language supported
     *        by Amazon Translate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextRequest withTargetLanguageCode(String targetLanguageCode) {
        setTargetLanguageCode(targetLanguageCode);
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
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getTerminologyNames() != null)
            sb.append("TerminologyNames: ").append(getTerminologyNames()).append(",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: ").append(getSourceLanguageCode()).append(",");
        if (getTargetLanguageCode() != null)
            sb.append("TargetLanguageCode: ").append(getTargetLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranslateTextRequest == false)
            return false;
        TranslateTextRequest other = (TranslateTextRequest) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getTerminologyNames() == null ^ this.getTerminologyNames() == null)
            return false;
        if (other.getTerminologyNames() != null && other.getTerminologyNames().equals(this.getTerminologyNames()) == false)
            return false;
        if (other.getSourceLanguageCode() == null ^ this.getSourceLanguageCode() == null)
            return false;
        if (other.getSourceLanguageCode() != null && other.getSourceLanguageCode().equals(this.getSourceLanguageCode()) == false)
            return false;
        if (other.getTargetLanguageCode() == null ^ this.getTargetLanguageCode() == null)
            return false;
        if (other.getTargetLanguageCode() != null && other.getTargetLanguageCode().equals(this.getTargetLanguageCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getTerminologyNames() == null) ? 0 : getTerminologyNames().hashCode());
        hashCode = prime * hashCode + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTargetLanguageCode() == null) ? 0 : getTargetLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public TranslateTextRequest clone() {
        return (TranslateTextRequest) super.clone();
    }

}
