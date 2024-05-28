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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectToxicContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectToxicContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of up to 10 text strings. Each string has a maximum size of 1 KB, and the maximum size of the list is 10
     * KB.
     * </p>
     */
    private java.util.List<TextSegment> textSegments;
    /**
     * <p>
     * The language of the input text. Currently, English is the only supported language.
     * </p>
     */
    private String languageCode;

    /**
     * <p>
     * A list of up to 10 text strings. Each string has a maximum size of 1 KB, and the maximum size of the list is 10
     * KB.
     * </p>
     * 
     * @return A list of up to 10 text strings. Each string has a maximum size of 1 KB, and the maximum size of the list
     *         is 10 KB.
     */

    public java.util.List<TextSegment> getTextSegments() {
        return textSegments;
    }

    /**
     * <p>
     * A list of up to 10 text strings. Each string has a maximum size of 1 KB, and the maximum size of the list is 10
     * KB.
     * </p>
     * 
     * @param textSegments
     *        A list of up to 10 text strings. Each string has a maximum size of 1 KB, and the maximum size of the list
     *        is 10 KB.
     */

    public void setTextSegments(java.util.Collection<TextSegment> textSegments) {
        if (textSegments == null) {
            this.textSegments = null;
            return;
        }

        this.textSegments = new java.util.ArrayList<TextSegment>(textSegments);
    }

    /**
     * <p>
     * A list of up to 10 text strings. Each string has a maximum size of 1 KB, and the maximum size of the list is 10
     * KB.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextSegments(java.util.Collection)} or {@link #withTextSegments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param textSegments
     *        A list of up to 10 text strings. Each string has a maximum size of 1 KB, and the maximum size of the list
     *        is 10 KB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectToxicContentRequest withTextSegments(TextSegment... textSegments) {
        if (this.textSegments == null) {
            setTextSegments(new java.util.ArrayList<TextSegment>(textSegments.length));
        }
        for (TextSegment ele : textSegments) {
            this.textSegments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 10 text strings. Each string has a maximum size of 1 KB, and the maximum size of the list is 10
     * KB.
     * </p>
     * 
     * @param textSegments
     *        A list of up to 10 text strings. Each string has a maximum size of 1 KB, and the maximum size of the list
     *        is 10 KB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectToxicContentRequest withTextSegments(java.util.Collection<TextSegment> textSegments) {
        setTextSegments(textSegments);
        return this;
    }

    /**
     * <p>
     * The language of the input text. Currently, English is the only supported language.
     * </p>
     * 
     * @param languageCode
     *        The language of the input text. Currently, English is the only supported language.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input text. Currently, English is the only supported language.
     * </p>
     * 
     * @return The language of the input text. Currently, English is the only supported language.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language of the input text. Currently, English is the only supported language.
     * </p>
     * 
     * @param languageCode
     *        The language of the input text. Currently, English is the only supported language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public DetectToxicContentRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language of the input text. Currently, English is the only supported language.
     * </p>
     * 
     * @param languageCode
     *        The language of the input text. Currently, English is the only supported language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public DetectToxicContentRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
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
        if (getTextSegments() != null)
            sb.append("TextSegments: ").append("***Sensitive Data Redacted***").append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectToxicContentRequest == false)
            return false;
        DetectToxicContentRequest other = (DetectToxicContentRequest) obj;
        if (other.getTextSegments() == null ^ this.getTextSegments() == null)
            return false;
        if (other.getTextSegments() != null && other.getTextSegments().equals(this.getTextSegments()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextSegments() == null) ? 0 : getTextSegments().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public DetectToxicContentRequest clone() {
        return (DetectToxicContentRequest) super.clone();
    }

}
