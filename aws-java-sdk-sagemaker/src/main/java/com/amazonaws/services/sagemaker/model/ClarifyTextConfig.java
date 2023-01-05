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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A parameter used to configure the SageMaker Clarify explainer to treat text features as text so that explanations are
 * provided for individual units of text. Required only for natural language processing (NLP) explainability.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ClarifyTextConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClarifyTextConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the language of the text features in <a
     * href=" https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639-1</a> or <a
     * href="https://en.wikipedia.org/wiki/ISO_639-3">ISO 639-3</a> code of a supported language.
     * </p>
     * <note>
     * <p>
     * For a mix of multiple languages, use code <code>'xx'</code>.
     * </p>
     * </note>
     */
    private String language;
    /**
     * <p>
     * The unit of granularity for the analysis of text features. For example, if the unit is <code>'token'</code>, then
     * each token (like a word in English) of the text is treated as a feature. SHAP values are computed for each
     * unit/feature.
     * </p>
     */
    private String granularity;

    /**
     * <p>
     * Specifies the language of the text features in <a
     * href=" https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639-1</a> or <a
     * href="https://en.wikipedia.org/wiki/ISO_639-3">ISO 639-3</a> code of a supported language.
     * </p>
     * <note>
     * <p>
     * For a mix of multiple languages, use code <code>'xx'</code>.
     * </p>
     * </note>
     * 
     * @param language
     *        Specifies the language of the text features in <a
     *        href=" https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639-1</a> or <a
     *        href="https://en.wikipedia.org/wiki/ISO_639-3">ISO 639-3</a> code of a supported language. </p> <note>
     *        <p>
     *        For a mix of multiple languages, use code <code>'xx'</code>.
     *        </p>
     * @see ClarifyTextLanguage
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * Specifies the language of the text features in <a
     * href=" https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639-1</a> or <a
     * href="https://en.wikipedia.org/wiki/ISO_639-3">ISO 639-3</a> code of a supported language.
     * </p>
     * <note>
     * <p>
     * For a mix of multiple languages, use code <code>'xx'</code>.
     * </p>
     * </note>
     * 
     * @return Specifies the language of the text features in <a
     *         href=" https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639-1</a> or <a
     *         href="https://en.wikipedia.org/wiki/ISO_639-3">ISO 639-3</a> code of a supported language. </p> <note>
     *         <p>
     *         For a mix of multiple languages, use code <code>'xx'</code>.
     *         </p>
     * @see ClarifyTextLanguage
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * Specifies the language of the text features in <a
     * href=" https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639-1</a> or <a
     * href="https://en.wikipedia.org/wiki/ISO_639-3">ISO 639-3</a> code of a supported language.
     * </p>
     * <note>
     * <p>
     * For a mix of multiple languages, use code <code>'xx'</code>.
     * </p>
     * </note>
     * 
     * @param language
     *        Specifies the language of the text features in <a
     *        href=" https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639-1</a> or <a
     *        href="https://en.wikipedia.org/wiki/ISO_639-3">ISO 639-3</a> code of a supported language. </p> <note>
     *        <p>
     *        For a mix of multiple languages, use code <code>'xx'</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClarifyTextLanguage
     */

    public ClarifyTextConfig withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * Specifies the language of the text features in <a
     * href=" https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639-1</a> or <a
     * href="https://en.wikipedia.org/wiki/ISO_639-3">ISO 639-3</a> code of a supported language.
     * </p>
     * <note>
     * <p>
     * For a mix of multiple languages, use code <code>'xx'</code>.
     * </p>
     * </note>
     * 
     * @param language
     *        Specifies the language of the text features in <a
     *        href=" https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639-1</a> or <a
     *        href="https://en.wikipedia.org/wiki/ISO_639-3">ISO 639-3</a> code of a supported language. </p> <note>
     *        <p>
     *        For a mix of multiple languages, use code <code>'xx'</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClarifyTextLanguage
     */

    public ClarifyTextConfig withLanguage(ClarifyTextLanguage language) {
        this.language = language.toString();
        return this;
    }

    /**
     * <p>
     * The unit of granularity for the analysis of text features. For example, if the unit is <code>'token'</code>, then
     * each token (like a word in English) of the text is treated as a feature. SHAP values are computed for each
     * unit/feature.
     * </p>
     * 
     * @param granularity
     *        The unit of granularity for the analysis of text features. For example, if the unit is
     *        <code>'token'</code>, then each token (like a word in English) of the text is treated as a feature. SHAP
     *        values are computed for each unit/feature.
     * @see ClarifyTextGranularity
     */

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * The unit of granularity for the analysis of text features. For example, if the unit is <code>'token'</code>, then
     * each token (like a word in English) of the text is treated as a feature. SHAP values are computed for each
     * unit/feature.
     * </p>
     * 
     * @return The unit of granularity for the analysis of text features. For example, if the unit is
     *         <code>'token'</code>, then each token (like a word in English) of the text is treated as a feature. SHAP
     *         values are computed for each unit/feature.
     * @see ClarifyTextGranularity
     */

    public String getGranularity() {
        return this.granularity;
    }

    /**
     * <p>
     * The unit of granularity for the analysis of text features. For example, if the unit is <code>'token'</code>, then
     * each token (like a word in English) of the text is treated as a feature. SHAP values are computed for each
     * unit/feature.
     * </p>
     * 
     * @param granularity
     *        The unit of granularity for the analysis of text features. For example, if the unit is
     *        <code>'token'</code>, then each token (like a word in English) of the text is treated as a feature. SHAP
     *        values are computed for each unit/feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClarifyTextGranularity
     */

    public ClarifyTextConfig withGranularity(String granularity) {
        setGranularity(granularity);
        return this;
    }

    /**
     * <p>
     * The unit of granularity for the analysis of text features. For example, if the unit is <code>'token'</code>, then
     * each token (like a word in English) of the text is treated as a feature. SHAP values are computed for each
     * unit/feature.
     * </p>
     * 
     * @param granularity
     *        The unit of granularity for the analysis of text features. For example, if the unit is
     *        <code>'token'</code>, then each token (like a word in English) of the text is treated as a feature. SHAP
     *        values are computed for each unit/feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClarifyTextGranularity
     */

    public ClarifyTextConfig withGranularity(ClarifyTextGranularity granularity) {
        this.granularity = granularity.toString();
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
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getGranularity() != null)
            sb.append("Granularity: ").append(getGranularity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClarifyTextConfig == false)
            return false;
        ClarifyTextConfig other = (ClarifyTextConfig) obj;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        return hashCode;
    }

    @Override
    public ClarifyTextConfig clone() {
        try {
            return (ClarifyTextConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ClarifyTextConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
