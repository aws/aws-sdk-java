/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ContainsPiiEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainsPiiEntitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Creates a new document classification request to analyze a single document in real-time, returning personally
     * identifiable information (PII) entity labels.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The language of the input documents.
     * </p>
     */
    private String languageCode;

    /**
     * <p>
     * Creates a new document classification request to analyze a single document in real-time, returning personally
     * identifiable information (PII) entity labels.
     * </p>
     * 
     * @param text
     *        Creates a new document classification request to analyze a single document in real-time, returning
     *        personally identifiable information (PII) entity labels.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * Creates a new document classification request to analyze a single document in real-time, returning personally
     * identifiable information (PII) entity labels.
     * </p>
     * 
     * @return Creates a new document classification request to analyze a single document in real-time, returning
     *         personally identifiable information (PII) entity labels.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * Creates a new document classification request to analyze a single document in real-time, returning personally
     * identifiable information (PII) entity labels.
     * </p>
     * 
     * @param text
     *        Creates a new document classification request to analyze a single document in real-time, returning
     *        personally identifiable information (PII) entity labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainsPiiEntitiesRequest withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * 
     * @return The language of the input documents.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public ContainsPiiEntitiesRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language of the input documents.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public ContainsPiiEntitiesRequest withLanguageCode(LanguageCode languageCode) {
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
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
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

        if (obj instanceof ContainsPiiEntitiesRequest == false)
            return false;
        ContainsPiiEntitiesRequest other = (ContainsPiiEntitiesRequest) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
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

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public ContainsPiiEntitiesRequest clone() {
        return (ContainsPiiEntitiesRequest) super.clone();
    }

}
