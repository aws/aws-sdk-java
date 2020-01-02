/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/InferRxNorm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferRxNormRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The input text used for analysis. The input for InferRxNorm is a string from 1 to 10000 characters.
     * </p>
     */
    private String text;

    /**
     * <p>
     * The input text used for analysis. The input for InferRxNorm is a string from 1 to 10000 characters.
     * </p>
     * 
     * @param text
     *        The input text used for analysis. The input for InferRxNorm is a string from 1 to 10000 characters.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The input text used for analysis. The input for InferRxNorm is a string from 1 to 10000 characters.
     * </p>
     * 
     * @return The input text used for analysis. The input for InferRxNorm is a string from 1 to 10000 characters.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The input text used for analysis. The input for InferRxNorm is a string from 1 to 10000 characters.
     * </p>
     * 
     * @param text
     *        The input text used for analysis. The input for InferRxNorm is a string from 1 to 10000 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferRxNormRequest withText(String text) {
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

        if (obj instanceof InferRxNormRequest == false)
            return false;
        InferRxNormRequest other = (InferRxNormRequest) obj;
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
    public InferRxNormRequest clone() {
        return (InferRxNormRequest) super.clone();
    }

}
