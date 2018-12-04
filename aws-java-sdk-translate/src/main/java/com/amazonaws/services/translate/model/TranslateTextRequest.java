/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The text to translate.
     * </p>
     */
    private String text;
    /**
     * <p>
     * One of the supported language codes for the source text. If the <code>TargetLanguageCode</code> is not "en", the
     * <code>SourceLanguageCode</code> must be "en".
     * </p>
     */
    private String sourceLanguageCode;
    /**
     * <p>
     * One of the supported language codes for the target text. If the <code>SourceLanguageCode</code> is not "en", the
     * <code>TargetLanguageCode</code> must be "en".
     * </p>
     */
    private String targetLanguageCode;

    /**
     * <p>
     * The text to translate.
     * </p>
     * 
     * @param text
     *        The text to translate.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text to translate.
     * </p>
     * 
     * @return The text to translate.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text to translate.
     * </p>
     * 
     * @param text
     *        The text to translate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextRequest withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * One of the supported language codes for the source text. If the <code>TargetLanguageCode</code> is not "en", the
     * <code>SourceLanguageCode</code> must be "en".
     * </p>
     * 
     * @param sourceLanguageCode
     *        One of the supported language codes for the source text. If the <code>TargetLanguageCode</code> is not
     *        "en", the <code>SourceLanguageCode</code> must be "en".
     */

    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * One of the supported language codes for the source text. If the <code>TargetLanguageCode</code> is not "en", the
     * <code>SourceLanguageCode</code> must be "en".
     * </p>
     * 
     * @return One of the supported language codes for the source text. If the <code>TargetLanguageCode</code> is not
     *         "en", the <code>SourceLanguageCode</code> must be "en".
     */

    public String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /**
     * <p>
     * One of the supported language codes for the source text. If the <code>TargetLanguageCode</code> is not "en", the
     * <code>SourceLanguageCode</code> must be "en".
     * </p>
     * 
     * @param sourceLanguageCode
     *        One of the supported language codes for the source text. If the <code>TargetLanguageCode</code> is not
     *        "en", the <code>SourceLanguageCode</code> must be "en".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextRequest withSourceLanguageCode(String sourceLanguageCode) {
        setSourceLanguageCode(sourceLanguageCode);
        return this;
    }

    /**
     * <p>
     * One of the supported language codes for the target text. If the <code>SourceLanguageCode</code> is not "en", the
     * <code>TargetLanguageCode</code> must be "en".
     * </p>
     * 
     * @param targetLanguageCode
     *        One of the supported language codes for the target text. If the <code>SourceLanguageCode</code> is not
     *        "en", the <code>TargetLanguageCode</code> must be "en".
     */

    public void setTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * <p>
     * One of the supported language codes for the target text. If the <code>SourceLanguageCode</code> is not "en", the
     * <code>TargetLanguageCode</code> must be "en".
     * </p>
     * 
     * @return One of the supported language codes for the target text. If the <code>SourceLanguageCode</code> is not
     *         "en", the <code>TargetLanguageCode</code> must be "en".
     */

    public String getTargetLanguageCode() {
        return this.targetLanguageCode;
    }

    /**
     * <p>
     * One of the supported language codes for the target text. If the <code>SourceLanguageCode</code> is not "en", the
     * <code>TargetLanguageCode</code> must be "en".
     * </p>
     * 
     * @param targetLanguageCode
     *        One of the supported language codes for the target text. If the <code>SourceLanguageCode</code> is not
     *        "en", the <code>TargetLanguageCode</code> must be "en".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslateTextRequest withTargetLanguageCode(String targetLanguageCode) {
        setTargetLanguageCode(targetLanguageCode);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        hashCode = prime * hashCode + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTargetLanguageCode() == null) ? 0 : getTargetLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public TranslateTextRequest clone() {
        return (TranslateTextRequest) super.clone();
    }

}
