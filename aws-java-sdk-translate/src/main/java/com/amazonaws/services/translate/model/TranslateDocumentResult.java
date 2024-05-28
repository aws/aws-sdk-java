/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TranslateDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranslateDocumentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The document containing the translated content. The document format matches the source document format.
     * </p>
     */
    private TranslatedDocument translatedDocument;
    /**
     * <p>
     * The language code of the source document.
     * </p>
     */
    private String sourceLanguageCode;
    /**
     * <p>
     * The language code of the translated document.
     * </p>
     */
    private String targetLanguageCode;
    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon Translate to produce the translated
     * text document.
     * </p>
     */
    private java.util.List<AppliedTerminology> appliedTerminologies;

    private TranslationSettings appliedSettings;

    /**
     * <p>
     * The document containing the translated content. The document format matches the source document format.
     * </p>
     * 
     * @param translatedDocument
     *        The document containing the translated content. The document format matches the source document format.
     */

    public void setTranslatedDocument(TranslatedDocument translatedDocument) {
        this.translatedDocument = translatedDocument;
    }

    /**
     * <p>
     * The document containing the translated content. The document format matches the source document format.
     * </p>
     * 
     * @return The document containing the translated content. The document format matches the source document format.
     */

    public TranslatedDocument getTranslatedDocument() {
        return this.translatedDocument;
    }

    /**
     * <p>
     * The document containing the translated content. The document format matches the source document format.
     * </p>
     * 
     * @param translatedDocument
     *        The document containing the translated content. The document format matches the source document format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateDocumentResult withTranslatedDocument(TranslatedDocument translatedDocument) {
        setTranslatedDocument(translatedDocument);
        return this;
    }

    /**
     * <p>
     * The language code of the source document.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code of the source document.
     */

    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code of the source document.
     * </p>
     * 
     * @return The language code of the source document.
     */

    public String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /**
     * <p>
     * The language code of the source document.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code of the source document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateDocumentResult withSourceLanguageCode(String sourceLanguageCode) {
        setSourceLanguageCode(sourceLanguageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the translated document.
     * </p>
     * 
     * @param targetLanguageCode
     *        The language code of the translated document.
     */

    public void setTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * <p>
     * The language code of the translated document.
     * </p>
     * 
     * @return The language code of the translated document.
     */

    public String getTargetLanguageCode() {
        return this.targetLanguageCode;
    }

    /**
     * <p>
     * The language code of the translated document.
     * </p>
     * 
     * @param targetLanguageCode
     *        The language code of the translated document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateDocumentResult withTargetLanguageCode(String targetLanguageCode) {
        setTargetLanguageCode(targetLanguageCode);
        return this;
    }

    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon Translate to produce the translated
     * text document.
     * </p>
     * 
     * @return The names of the custom terminologies applied to the input text by Amazon Translate to produce the
     *         translated text document.
     */

    public java.util.List<AppliedTerminology> getAppliedTerminologies() {
        return appliedTerminologies;
    }

    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon Translate to produce the translated
     * text document.
     * </p>
     * 
     * @param appliedTerminologies
     *        The names of the custom terminologies applied to the input text by Amazon Translate to produce the
     *        translated text document.
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
     * The names of the custom terminologies applied to the input text by Amazon Translate to produce the translated
     * text document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppliedTerminologies(java.util.Collection)} or {@link #withAppliedTerminologies(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param appliedTerminologies
     *        The names of the custom terminologies applied to the input text by Amazon Translate to produce the
     *        translated text document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateDocumentResult withAppliedTerminologies(AppliedTerminology... appliedTerminologies) {
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
     * The names of the custom terminologies applied to the input text by Amazon Translate to produce the translated
     * text document.
     * </p>
     * 
     * @param appliedTerminologies
     *        The names of the custom terminologies applied to the input text by Amazon Translate to produce the
     *        translated text document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateDocumentResult withAppliedTerminologies(java.util.Collection<AppliedTerminology> appliedTerminologies) {
        setAppliedTerminologies(appliedTerminologies);
        return this;
    }

    /**
     * @param appliedSettings
     */

    public void setAppliedSettings(TranslationSettings appliedSettings) {
        this.appliedSettings = appliedSettings;
    }

    /**
     * @return
     */

    public TranslationSettings getAppliedSettings() {
        return this.appliedSettings;
    }

    /**
     * @param appliedSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateDocumentResult withAppliedSettings(TranslationSettings appliedSettings) {
        setAppliedSettings(appliedSettings);
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
        if (getTranslatedDocument() != null)
            sb.append("TranslatedDocument: ").append(getTranslatedDocument()).append(",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: ").append(getSourceLanguageCode()).append(",");
        if (getTargetLanguageCode() != null)
            sb.append("TargetLanguageCode: ").append(getTargetLanguageCode()).append(",");
        if (getAppliedTerminologies() != null)
            sb.append("AppliedTerminologies: ").append(getAppliedTerminologies()).append(",");
        if (getAppliedSettings() != null)
            sb.append("AppliedSettings: ").append(getAppliedSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranslateDocumentResult == false)
            return false;
        TranslateDocumentResult other = (TranslateDocumentResult) obj;
        if (other.getTranslatedDocument() == null ^ this.getTranslatedDocument() == null)
            return false;
        if (other.getTranslatedDocument() != null && other.getTranslatedDocument().equals(this.getTranslatedDocument()) == false)
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
        if (other.getAppliedSettings() == null ^ this.getAppliedSettings() == null)
            return false;
        if (other.getAppliedSettings() != null && other.getAppliedSettings().equals(this.getAppliedSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranslatedDocument() == null) ? 0 : getTranslatedDocument().hashCode());
        hashCode = prime * hashCode + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTargetLanguageCode() == null) ? 0 : getTargetLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getAppliedTerminologies() == null) ? 0 : getAppliedTerminologies().hashCode());
        hashCode = prime * hashCode + ((getAppliedSettings() == null) ? 0 : getAppliedSettings().hashCode());
        return hashCode;
    }

    @Override
    public TranslateDocumentResult clone() {
        try {
            return (TranslateDocumentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
