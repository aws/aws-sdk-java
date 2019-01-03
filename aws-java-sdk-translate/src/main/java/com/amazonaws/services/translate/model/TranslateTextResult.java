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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TranslateText" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranslateTextResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The the translated text. The maximum length of this text is 5kb.
     * </p>
     */
    private String translatedText;
    /**
     * <p>
     * The language code for the language of the source text.
     * </p>
     */
    private String sourceLanguageCode;
    /**
     * <p>
     * The language code for the language of the target text.
     * </p>
     */
    private String targetLanguageCode;
    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon Translate for the translated text
     * response.
     * </p>
     */
    private java.util.List<AppliedTerminology> appliedTerminologies;

    /**
     * <p>
     * The the translated text. The maximum length of this text is 5kb.
     * </p>
     * 
     * @param translatedText
     *        The the translated text. The maximum length of this text is 5kb.
     */

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }

    /**
     * <p>
     * The the translated text. The maximum length of this text is 5kb.
     * </p>
     * 
     * @return The the translated text. The maximum length of this text is 5kb.
     */

    public String getTranslatedText() {
        return this.translatedText;
    }

    /**
     * <p>
     * The the translated text. The maximum length of this text is 5kb.
     * </p>
     * 
     * @param translatedText
     *        The the translated text. The maximum length of this text is 5kb.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextResult withTranslatedText(String translatedText) {
        setTranslatedText(translatedText);
        return this;
    }

    /**
     * <p>
     * The language code for the language of the source text.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code for the language of the source text.
     */

    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the source text.
     * </p>
     * 
     * @return The language code for the language of the source text.
     */

    public String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the source text.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code for the language of the source text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextResult withSourceLanguageCode(String sourceLanguageCode) {
        setSourceLanguageCode(sourceLanguageCode);
        return this;
    }

    /**
     * <p>
     * The language code for the language of the target text.
     * </p>
     * 
     * @param targetLanguageCode
     *        The language code for the language of the target text.
     */

    public void setTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the target text.
     * </p>
     * 
     * @return The language code for the language of the target text.
     */

    public String getTargetLanguageCode() {
        return this.targetLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the target text.
     * </p>
     * 
     * @param targetLanguageCode
     *        The language code for the language of the target text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextResult withTargetLanguageCode(String targetLanguageCode) {
        setTargetLanguageCode(targetLanguageCode);
        return this;
    }

    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon Translate for the translated text
     * response.
     * </p>
     * 
     * @return The names of the custom terminologies applied to the input text by Amazon Translate for the translated
     *         text response.
     */

    public java.util.List<AppliedTerminology> getAppliedTerminologies() {
        return appliedTerminologies;
    }

    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon Translate for the translated text
     * response.
     * </p>
     * 
     * @param appliedTerminologies
     *        The names of the custom terminologies applied to the input text by Amazon Translate for the translated
     *        text response.
     */

    public void setAppliedTerminologies(java.util.Collection<AppliedTerminology> appliedTerminologies) {
        if (appliedTerminologies == null) {
            this.appliedTerminologies = null;
            return;
        }

        this.appliedTerminologies = new java.util.ArrayList<AppliedTerminology>(appliedTerminologies);
    }

    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon Translate for the translated text
     * response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppliedTerminologies(java.util.Collection)} or {@link #withAppliedTerminologies(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param appliedTerminologies
     *        The names of the custom terminologies applied to the input text by Amazon Translate for the translated
     *        text response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextResult withAppliedTerminologies(AppliedTerminology... appliedTerminologies) {
        if (this.appliedTerminologies == null) {
            setAppliedTerminologies(new java.util.ArrayList<AppliedTerminology>(appliedTerminologies.length));
        }
        for (AppliedTerminology ele : appliedTerminologies) {
            this.appliedTerminologies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon Translate for the translated text
     * response.
     * </p>
     * 
     * @param appliedTerminologies
     *        The names of the custom terminologies applied to the input text by Amazon Translate for the translated
     *        text response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextResult withAppliedTerminologies(java.util.Collection<AppliedTerminology> appliedTerminologies) {
        setAppliedTerminologies(appliedTerminologies);
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
        if (getTranslatedText() != null)
            sb.append("TranslatedText: ").append(getTranslatedText()).append(",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: ").append(getSourceLanguageCode()).append(",");
        if (getTargetLanguageCode() != null)
            sb.append("TargetLanguageCode: ").append(getTargetLanguageCode()).append(",");
        if (getAppliedTerminologies() != null)
            sb.append("AppliedTerminologies: ").append(getAppliedTerminologies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranslateTextResult == false)
            return false;
        TranslateTextResult other = (TranslateTextResult) obj;
        if (other.getTranslatedText() == null ^ this.getTranslatedText() == null)
            return false;
        if (other.getTranslatedText() != null && other.getTranslatedText().equals(this.getTranslatedText()) == false)
            return false;
        if (other.getSourceLanguageCode() == null ^ this.getSourceLanguageCode() == null)
            return false;
        if (other.getSourceLanguageCode() != null && other.getSourceLanguageCode().equals(this.getSourceLanguageCode()) == false)
            return false;
        if (other.getTargetLanguageCode() == null ^ this.getTargetLanguageCode() == null)
            return false;
        if (other.getTargetLanguageCode() != null && other.getTargetLanguageCode().equals(this.getTargetLanguageCode()) == false)
            return false;
        if (other.getAppliedTerminologies() == null ^ this.getAppliedTerminologies() == null)
            return false;
        if (other.getAppliedTerminologies() != null && other.getAppliedTerminologies().equals(this.getAppliedTerminologies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranslatedText() == null) ? 0 : getTranslatedText().hashCode());
        hashCode = prime * hashCode + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTargetLanguageCode() == null) ? 0 : getTargetLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getAppliedTerminologies() == null) ? 0 : getAppliedTerminologies().hashCode());
        return hashCode;
    }

    @Override
    public TranslateTextResult clone() {
        try {
            return (TranslateTextResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
