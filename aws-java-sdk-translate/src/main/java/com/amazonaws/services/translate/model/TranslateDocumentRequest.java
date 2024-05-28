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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TranslateDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranslateDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The content and content type for the document to be translated. The document size must not exceed 100 KB.
     * </p>
     */
    private Document document;
    /**
     * <p>
     * The name of a terminology list file to add to the translation job. This file provides source terms and the
     * desired translation for each term. A terminology list can contain a maximum of 256 terms. You can use one custom
     * terminology resource in your translation request.
     * </p>
     * <p>
     * Use the <a>ListTerminologies</a> operation to get the available terminology lists.
     * </p>
     * <p>
     * For more information about custom terminology lists, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html">Custom terminology</a>.
     * </p>
     */
    private java.util.List<String> terminologyNames;
    /**
     * <p>
     * The language code for the language of the source text. For a list of supported language codes, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in the
     * <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html">Amazon Comprehend</a> to
     * determine the source language.
     * </p>
     * <note>
     * <p>
     * If you specify <code>auto</code>, you must send the <code>TranslateDocument</code> request in a region that
     * supports Amazon Comprehend. Otherwise, the request returns an error indicating that autodetect is not supported.
     * </p>
     * </note>
     */
    private String sourceLanguageCode;
    /**
     * <p>
     * The language code requested for the translated document. For a list of supported language codes, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.
     * </p>
     */
    private String targetLanguageCode;
    /**
     * <p>
     * Settings to configure your translation output. You can configure the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Brevity: not supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * Formality: sets the formality level of the output text.
     * </p>
     * </li>
     * <li>
     * <p>
     * Profanity: masks profane words and phrases in your translation output.
     * </p>
     * </li>
     * </ul>
     */
    private TranslationSettings settings;

    /**
     * <p>
     * The content and content type for the document to be translated. The document size must not exceed 100 KB.
     * </p>
     * 
     * @param document
     *        The content and content type for the document to be translated. The document size must not exceed 100 KB.
     */

    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     * <p>
     * The content and content type for the document to be translated. The document size must not exceed 100 KB.
     * </p>
     * 
     * @return The content and content type for the document to be translated. The document size must not exceed 100 KB.
     */

    public Document getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The content and content type for the document to be translated. The document size must not exceed 100 KB.
     * </p>
     * 
     * @param document
     *        The content and content type for the document to be translated. The document size must not exceed 100 KB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateDocumentRequest withDocument(Document document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * The name of a terminology list file to add to the translation job. This file provides source terms and the
     * desired translation for each term. A terminology list can contain a maximum of 256 terms. You can use one custom
     * terminology resource in your translation request.
     * </p>
     * <p>
     * Use the <a>ListTerminologies</a> operation to get the available terminology lists.
     * </p>
     * <p>
     * For more information about custom terminology lists, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html">Custom terminology</a>.
     * </p>
     * 
     * @return The name of a terminology list file to add to the translation job. This file provides source terms and
     *         the desired translation for each term. A terminology list can contain a maximum of 256 terms. You can use
     *         one custom terminology resource in your translation request.</p>
     *         <p>
     *         Use the <a>ListTerminologies</a> operation to get the available terminology lists.
     *         </p>
     *         <p>
     *         For more information about custom terminology lists, see <a
     *         href="https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html">Custom
     *         terminology</a>.
     */

    public java.util.List<String> getTerminologyNames() {
        return terminologyNames;
    }

    /**
     * <p>
     * The name of a terminology list file to add to the translation job. This file provides source terms and the
     * desired translation for each term. A terminology list can contain a maximum of 256 terms. You can use one custom
     * terminology resource in your translation request.
     * </p>
     * <p>
     * Use the <a>ListTerminologies</a> operation to get the available terminology lists.
     * </p>
     * <p>
     * For more information about custom terminology lists, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html">Custom terminology</a>.
     * </p>
     * 
     * @param terminologyNames
     *        The name of a terminology list file to add to the translation job. This file provides source terms and the
     *        desired translation for each term. A terminology list can contain a maximum of 256 terms. You can use one
     *        custom terminology resource in your translation request.</p>
     *        <p>
     *        Use the <a>ListTerminologies</a> operation to get the available terminology lists.
     *        </p>
     *        <p>
     *        For more information about custom terminology lists, see <a
     *        href="https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html">Custom terminology</a>.
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
     * The name of a terminology list file to add to the translation job. This file provides source terms and the
     * desired translation for each term. A terminology list can contain a maximum of 256 terms. You can use one custom
     * terminology resource in your translation request.
     * </p>
     * <p>
     * Use the <a>ListTerminologies</a> operation to get the available terminology lists.
     * </p>
     * <p>
     * For more information about custom terminology lists, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html">Custom terminology</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerminologyNames(java.util.Collection)} or {@link #withTerminologyNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param terminologyNames
     *        The name of a terminology list file to add to the translation job. This file provides source terms and the
     *        desired translation for each term. A terminology list can contain a maximum of 256 terms. You can use one
     *        custom terminology resource in your translation request.</p>
     *        <p>
     *        Use the <a>ListTerminologies</a> operation to get the available terminology lists.
     *        </p>
     *        <p>
     *        For more information about custom terminology lists, see <a
     *        href="https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html">Custom terminology</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateDocumentRequest withTerminologyNames(String... terminologyNames) {
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
     * The name of a terminology list file to add to the translation job. This file provides source terms and the
     * desired translation for each term. A terminology list can contain a maximum of 256 terms. You can use one custom
     * terminology resource in your translation request.
     * </p>
     * <p>
     * Use the <a>ListTerminologies</a> operation to get the available terminology lists.
     * </p>
     * <p>
     * For more information about custom terminology lists, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html">Custom terminology</a>.
     * </p>
     * 
     * @param terminologyNames
     *        The name of a terminology list file to add to the translation job. This file provides source terms and the
     *        desired translation for each term. A terminology list can contain a maximum of 256 terms. You can use one
     *        custom terminology resource in your translation request.</p>
     *        <p>
     *        Use the <a>ListTerminologies</a> operation to get the available terminology lists.
     *        </p>
     *        <p>
     *        For more information about custom terminology lists, see <a
     *        href="https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html">Custom terminology</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateDocumentRequest withTerminologyNames(java.util.Collection<String> terminologyNames) {
        setTerminologyNames(terminologyNames);
        return this;
    }

    /**
     * <p>
     * The language code for the language of the source text. For a list of supported language codes, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in the
     * <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html">Amazon Comprehend</a> to
     * determine the source language.
     * </p>
     * <note>
     * <p>
     * If you specify <code>auto</code>, you must send the <code>TranslateDocument</code> request in a region that
     * supports Amazon Comprehend. Otherwise, the request returns an error indicating that autodetect is not supported.
     * </p>
     * </note>
     * 
     * @param sourceLanguageCode
     *        The language code for the language of the source text. For a list of supported language codes, see <a
     *        href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.</p>
     *        <p>
     *        To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in
     *        the <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call <a
     *        href="https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html">Amazon Comprehend</a> to
     *        determine the source language.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify <code>auto</code>, you must send the <code>TranslateDocument</code> request in a region
     *        that supports Amazon Comprehend. Otherwise, the request returns an error indicating that autodetect is not
     *        supported.
     *        </p>
     */

    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the source text. For a list of supported language codes, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in the
     * <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html">Amazon Comprehend</a> to
     * determine the source language.
     * </p>
     * <note>
     * <p>
     * If you specify <code>auto</code>, you must send the <code>TranslateDocument</code> request in a region that
     * supports Amazon Comprehend. Otherwise, the request returns an error indicating that autodetect is not supported.
     * </p>
     * </note>
     * 
     * @return The language code for the language of the source text. For a list of supported language codes, see <a
     *         href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported
     *         languages</a>.</p>
     *         <p>
     *         To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in
     *         the <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call
     *         <a href="https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html">Amazon Comprehend</a>
     *         to determine the source language.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify <code>auto</code>, you must send the <code>TranslateDocument</code> request in a region
     *         that supports Amazon Comprehend. Otherwise, the request returns an error indicating that autodetect is
     *         not supported.
     *         </p>
     */

    public String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the source text. For a list of supported language codes, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in the
     * <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html">Amazon Comprehend</a> to
     * determine the source language.
     * </p>
     * <note>
     * <p>
     * If you specify <code>auto</code>, you must send the <code>TranslateDocument</code> request in a region that
     * supports Amazon Comprehend. Otherwise, the request returns an error indicating that autodetect is not supported.
     * </p>
     * </note>
     * 
     * @param sourceLanguageCode
     *        The language code for the language of the source text. For a list of supported language codes, see <a
     *        href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.</p>
     *        <p>
     *        To have Amazon Translate determine the source language of your text, you can specify <code>auto</code> in
     *        the <code>SourceLanguageCode</code> field. If you specify <code>auto</code>, Amazon Translate will call <a
     *        href="https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html">Amazon Comprehend</a> to
     *        determine the source language.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify <code>auto</code>, you must send the <code>TranslateDocument</code> request in a region
     *        that supports Amazon Comprehend. Otherwise, the request returns an error indicating that autodetect is not
     *        supported.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateDocumentRequest withSourceLanguageCode(String sourceLanguageCode) {
        setSourceLanguageCode(sourceLanguageCode);
        return this;
    }

    /**
     * <p>
     * The language code requested for the translated document. For a list of supported language codes, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param targetLanguageCode
     *        The language code requested for the translated document. For a list of supported language codes, see <a
     *        href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.
     */

    public void setTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * <p>
     * The language code requested for the translated document. For a list of supported language codes, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.
     * </p>
     * 
     * @return The language code requested for the translated document. For a list of supported language codes, see <a
     *         href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.
     */

    public String getTargetLanguageCode() {
        return this.targetLanguageCode;
    }

    /**
     * <p>
     * The language code requested for the translated document. For a list of supported language codes, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param targetLanguageCode
     *        The language code requested for the translated document. For a list of supported language codes, see <a
     *        href="https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html">Supported languages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateDocumentRequest withTargetLanguageCode(String targetLanguageCode) {
        setTargetLanguageCode(targetLanguageCode);
        return this;
    }

    /**
     * <p>
     * Settings to configure your translation output. You can configure the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Brevity: not supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * Formality: sets the formality level of the output text.
     * </p>
     * </li>
     * <li>
     * <p>
     * Profanity: masks profane words and phrases in your translation output.
     * </p>
     * </li>
     * </ul>
     * 
     * @param settings
     *        Settings to configure your translation output. You can configure the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Brevity: not supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Formality: sets the formality level of the output text.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Profanity: masks profane words and phrases in your translation output.
     *        </p>
     *        </li>
     */

    public void setSettings(TranslationSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Settings to configure your translation output. You can configure the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Brevity: not supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * Formality: sets the formality level of the output text.
     * </p>
     * </li>
     * <li>
     * <p>
     * Profanity: masks profane words and phrases in your translation output.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Settings to configure your translation output. You can configure the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Brevity: not supported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Formality: sets the formality level of the output text.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Profanity: masks profane words and phrases in your translation output.
     *         </p>
     *         </li>
     */

    public TranslationSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Settings to configure your translation output. You can configure the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Brevity: not supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * Formality: sets the formality level of the output text.
     * </p>
     * </li>
     * <li>
     * <p>
     * Profanity: masks profane words and phrases in your translation output.
     * </p>
     * </li>
     * </ul>
     * 
     * @param settings
     *        Settings to configure your translation output. You can configure the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Brevity: not supported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Formality: sets the formality level of the output text.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Profanity: masks profane words and phrases in your translation output.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateDocumentRequest withSettings(TranslationSettings settings) {
        setSettings(settings);
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
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument()).append(",");
        if (getTerminologyNames() != null)
            sb.append("TerminologyNames: ").append(getTerminologyNames()).append(",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: ").append(getSourceLanguageCode()).append(",");
        if (getTargetLanguageCode() != null)
            sb.append("TargetLanguageCode: ").append(getTargetLanguageCode()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranslateDocumentRequest == false)
            return false;
        TranslateDocumentRequest other = (TranslateDocumentRequest) obj;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
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
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getTerminologyNames() == null) ? 0 : getTerminologyNames().hashCode());
        hashCode = prime * hashCode + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTargetLanguageCode() == null) ? 0 : getTargetLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public TranslateDocumentRequest clone() {
        return (TranslateDocumentRequest) super.clone();
    }

}
