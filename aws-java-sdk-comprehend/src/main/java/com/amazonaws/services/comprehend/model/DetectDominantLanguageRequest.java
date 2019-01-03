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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectDominantLanguage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectDominantLanguageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A UTF-8 text string. Each string should contain at least 20 characters and must contain fewer that 5,000 bytes of
     * UTF-8 encoded characters.
     * </p>
     */
    private String text;

    /**
     * <p>
     * A UTF-8 text string. Each string should contain at least 20 characters and must contain fewer that 5,000 bytes of
     * UTF-8 encoded characters.
     * </p>
     * 
     * @param text
     *        A UTF-8 text string. Each string should contain at least 20 characters and must contain fewer that 5,000
     *        bytes of UTF-8 encoded characters.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * A UTF-8 text string. Each string should contain at least 20 characters and must contain fewer that 5,000 bytes of
     * UTF-8 encoded characters.
     * </p>
     * 
     * @return A UTF-8 text string. Each string should contain at least 20 characters and must contain fewer that 5,000
     *         bytes of UTF-8 encoded characters.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * A UTF-8 text string. Each string should contain at least 20 characters and must contain fewer that 5,000 bytes of
     * UTF-8 encoded characters.
     * </p>
     * 
     * @param text
     *        A UTF-8 text string. Each string should contain at least 20 characters and must contain fewer that 5,000
     *        bytes of UTF-8 encoded characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectDominantLanguageRequest withText(String text) {
        setText(text);
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
            sb.append("Text: ").append(getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectDominantLanguageRequest == false)
            return false;
        DetectDominantLanguageRequest other = (DetectDominantLanguageRequest) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public DetectDominantLanguageRequest clone() {
        return (DetectDominantLanguageRequest) super.clone();
    }

}
